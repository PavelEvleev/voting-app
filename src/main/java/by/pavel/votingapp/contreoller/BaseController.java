package by.pavel.votingapp.contreoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by pavel on 20.09.18.
 */
@RestController
@RequestMapping(path = "/v1/api")
public class BaseController {

    @GetMapping("/hello")
    public @ResponseBody String index(){
        return "hello";
    }

}
