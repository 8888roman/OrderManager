package pl.trinitec.controller;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import pl.trinitec.domain.Supplier;
import pl.trinitec.form.SupplierForm;
import pl.trinitec.repository.SupplierRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.validation.Valid;
/**
 * Created by AN-KOP on 2016-11-19.
 */
@Controller
public class SupplierController{

    @Autowired
    private SupplierRepository supplierRepository;


    @RequestMapping(value="/", method=RequestMethod.GET)
    public String index(SupplierForm supplierForm) {
        return "index";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String addNewSupplier(@Valid SupplierForm supplierForm, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "index";
        }
        supplierRepository.save(new Supplier(supplierForm.getName(),
                                             supplierForm.getName2(),
                                             supplierForm.getTaxIdNumber(),
                                             supplierForm.getAddress(),
                                             supplierForm.getZipCode(),
                                             supplierForm.getCity(),
                                             supplierForm.getCountry(),
                                             supplierForm.getContactPerson(),
                                             supplierForm.getEmail(),
                                             supplierForm.getPhoneNumber()));
        model.addAttribute("suppliers", supplierRepository.findAll());
        return "redirect:result";
    }

    @RequestMapping(value = "/result", method = RequestMethod.GET)
    public String showAllSuppliers(Model model) {
        model.addAttribute("suppliers", supplierRepository.findAll());
        return "result";
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
