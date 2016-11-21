package pl.trinitec;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by AN-KOP on 2016-11-19.
 */
@Controller
public class SupplierController {

    @GetMapping("/supplier")
    public String displaySupplier( Model model) {

        model.addAttribute("supplierList", supplierRepository.count());
        return "supplier";
    }

    @GetMapping("/suppliers")public String showSuppliers ( Model model) {

//        ArrayList<Supplier> suppliers = new ArrayList<>();
//        supplierRepository.findAll();
        model.addAttribute("suppliersList", supplierRepository.findAll() );
        return "suppliers";
    }


    @GetMapping("/supplierForm")
    public String displaySupplierForm(Model model) {
        model.addAttribute("supplierForm",new SupplierForm());
        return "supplierForm";
    }

    @PostMapping("/supplier")
    public void addSupplier(@ModelAttribute SupplierForm supplier, HttpServletResponse response) throws IOException {
        supplierRepository.save(new Supplier(supplier.getName(),
                                             supplier.getName2(),
                                             supplier.getTaxIdNumber(),
                                             supplier.getAddress(),
                                             supplier.getZipCode(),
                                             supplier.getCity(),
                                             supplier.getCountry(),
                                             supplier.getContactPerson(),
                                             supplier.getEmail(),
                                             supplier.getPhoneNumber() ));
        response.sendRedirect("/supplierForm");
    }

    @Autowired
    private SupplierRepository supplierRepository;

}
