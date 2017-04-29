package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloController {
    
	@RequestMapping(value = { "/test" }, method = RequestMethod.GET)
    public String test() {
        return "uploadForm";
    }
	
	@RequestMapping(value = { "/" }, method = RequestMethod.GET)
    public String index() {
        return "index";
    }
    
}
