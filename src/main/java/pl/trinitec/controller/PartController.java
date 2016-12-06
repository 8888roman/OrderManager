package pl.trinitec.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import pl.trinitec.domain.Part;

import pl.trinitec.domain.PartOrder;
import pl.trinitec.domain.Supplier;
import pl.trinitec.form.PartForm;

import pl.trinitec.repository.PartOrderRepository;
import pl.trinitec.repository.PartRepository;
import pl.trinitec.repository.SupplierRepository;


import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by AN-KOP on 2016-11-19.
 */
@Controller
public class PartController {

    @Autowired
    private PartRepository partRepository;
    @Autowired
    private SupplierRepository supplierRepository;
    @Autowired
    private PartOrderRepository partOrderRepository;

    @RequestMapping(value="/addpart", method=RequestMethod.GET)
    public String addpart(PartForm partForm, Model model) {
        model.addAttribute("suppliers",supplierRepository.findAll());
        return "addpart";
    }


    @RequestMapping(value = "/addpart", method = RequestMethod.POST)
    public String addNewPart(@Valid PartForm partForm, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "addpart";
        }
       Supplier supplier = supplierRepository.findOne(partForm.getSupplierId());
        PartOrder partOrder = partOrderRepository.findOne(partForm.getSupplierId());
        partRepository.save(new Part(
                                     partForm.getName(),
                                     partForm.getCatalogueNumber(),
                                     partForm.getDescription(),
                                     partForm.getUnit(),
                                     partForm.getQuantity(),
                                     partForm.getPricePerUnit(),
                                     partForm.getExchangeRate(),
                                     partForm.getNettoValue(),
                                     partForm.getDiscount(),
                                     partForm.getPartTotalValue()

                                        ) );
//                model.addAttribute("parts", partRepository.findAll());    nic nie robi!!!!
        return "redirect:partlist";
    }

    @RequestMapping(value = "/partlist", method = RequestMethod.GET)
    public String showAllParts(Model model) {
        model.addAttribute("parts", partRepository.findAll());
        return "partlist";
    }

    @Configuration
    @EnableWebMvc
    public class WebConfig extends WebMvcConfigurerAdapter {

        @Override
        public void addResourceHandlers(ResourceHandlerRegistry registry) {
            registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
        }
    }



}
