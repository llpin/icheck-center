package center.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by linlipin on 17/3/20.
 */
@Controller
public class TestCtrl {


    @RequestMapping("/")
    @ResponseBody
    public  String helloWord(){
        return "hello word";
    }
}
