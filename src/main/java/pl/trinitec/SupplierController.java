package pl.trinitec;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created by AN-KOP on 2016-11-19.
 */
@Controller
public class SupplierController {

    @GetMapping("/supplier")
    public String displaySupplier(@RequestParam(value = "name") String supplier, Model model) {
        model.addAttribute("name", supplier);
        return "supplier";
    }

    @GetMapping("/supplierForm")
    public String displaySupplierForm(Model model) {
        model.addAttribute("supplierForm",new SupplierForm());
        return "supplierForm";
    }

    @PostMapping("/supplier")
    public String addSupplier(@ModelAttribute SupplierForm supplier) {
        return "";
    }
}
