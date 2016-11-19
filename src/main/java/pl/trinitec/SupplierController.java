package pl.trinitec;

import jdk.nashorn.internal.objects.annotations.Constructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by AN-KOP on 2016-11-19.
 */
@Controller
public class SupplierController {

    @GetMapping("/supplier")
    public String displaySupplier( Model model) {
        model.addAttribute("name", supplierRepository.count());
        return "supplier";
    }

    @GetMapping("/supplierForm")
    public String displaySupplierForm(Model model) {
        model.addAttribute("supplierForm",new SupplierForm());
        return "supplierForm";
    }

    @PostMapping("/supplier")
    public void addSupplier(@ModelAttribute SupplierForm supplier, HttpServletResponse response) throws IOException {
        supplierRepository.save(new Supplier(supplier.getName(), supplier.getZipCode()));
        response.sendRedirect("/supplierForm");
    }

    @Autowired
    private SupplierRepository supplierRepository;

}
