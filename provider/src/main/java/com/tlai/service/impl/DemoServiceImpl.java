package com.tlai.service.impl;

import com.service.DemoService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @ Author     ：SamLai
 * @ Date       ：Created in 2019-02-21 14:47
 * @ Description：
 */
//@Service(version = "1.0.0")
@Service
public class DemoServiceImpl implements DemoService {


    @Override
    public String sayHello(String name) {
        System.err.println("name   -----> " + name);
        return "Hello " + name;
    }


}
