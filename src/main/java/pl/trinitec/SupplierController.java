package pl.trinitec;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by AN-KOP on 2016-11-19.
 */
@Controller
public class SupplierController {

    @RequestMapping("/supplier")
    public String displaySupplier (@RequestParam(value="name") String supplier, Model model){
        model.addAttribute("name",supplier );
        return "supplier";
    }

}
