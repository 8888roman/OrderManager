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
import pl.trinitec.domain.Supplier;
import pl.trinitec.form.PartForm;
import pl.trinitec.form.SupplierForm;
import pl.trinitec.repository.PartRepository;
import pl.trinitec.repository.SupplierRepository;

import javax.validation.Valid;

/**
 * Created by AN-KOP on 2016-11-19.
 */
@Controller
public class PartController {

    @Autowired
    private PartRepository partRepository;


    @RequestMapping(value="/addpart", method=RequestMethod.GET)
    public String addpart(PartForm partForm) {
        return "addpart";
    }


    @RequestMapping(value = "/addpart", method = RequestMethod.POST)
    public String addNewPart(@Valid PartForm partForm, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "addpart";
        }
        partRepository.save(new Part(partForm.getName(),
                                         partForm.getCatalogueNumber(),
                                         partForm.getPartType(),
                                         partForm.getProducer()));
        model.addAttribute("parts", partRepository.findAll());
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
