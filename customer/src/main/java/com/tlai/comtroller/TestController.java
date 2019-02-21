package com.tlai.comtroller;

import com.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ Author     ：SamLai
 * @ Date       ：Created in 2019-02-21 15:07
 * @ Description：
 */
@RestController
public class TestController {

    @Autowired
    private DemoService demoService;

    @RequestMapping(value = "/dubbo", method = RequestMethod.GET)
    public String test() {
        String msg = demoService.sayHello("  ~~~~      Mr.samlai   ~~  hahah~~");
        return msg;
    }
}
