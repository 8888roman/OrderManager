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
import pl.trinitec.domain.Address;
import pl.trinitec.domain.Part;
import pl.trinitec.domain.Supplier;
import pl.trinitec.form.AddressForm;
import pl.trinitec.form.PartForm;
import pl.trinitec.repository.AddressRepository;
import pl.trinitec.repository.PartRepository;
import pl.trinitec.repository.SupplierRepository;

import javax.validation.Valid;

/**
 * Created by AN-KOP on 2016-11-19.
 */
@Controller
public class AddressController {

    @Autowired
    private AddressRepository addressRepository;



    @RequestMapping(value="/addaddress", method=RequestMethod.GET)
    public String addaddress(AddressForm addressForm, Model model) {
        model.addAttribute("address",addressRepository.findAll());
        return "addaddress";
    }


    @RequestMapping(value = "/addaddress", method = RequestMethod.POST)
    public String addNewAddress(@Valid AddressForm addressForm, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "addaddress";
        }


        addressRepository.save(new Address( addressForm.getName(),
                                            addressForm.getPlace(),
                                            addressForm.getContact()


                                        ) );

        return "redirect:addresslist";
    }
    @RequestMapping(value = "/addresslist", method = RequestMethod.GET)
    public String showAllAddresses(Model model) {
        model.addAttribute("addresses", addressRepository.findAll());
        return "addresslist";

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
