package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    
    @GetMapping("/")
    public String index() {
        return "uploadForm";
    }
    
}
