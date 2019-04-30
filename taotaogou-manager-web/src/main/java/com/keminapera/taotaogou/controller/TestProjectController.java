package com.keminapera.taotaogou.controller;

import com.keminapera.taotaogou.service.TestProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * web层测试工程实现类
 *
 * @author KeminaPera
 */

@Controller
public class TestProjectController {
    @Autowired
    private TestProjectService testProjectService;

    @RequestMapping("/test/getDate")
    @ResponseBody
    public String getDate(){
        System.out.println("方法被执行了...");
        return testProjectService.getDate();
    }
}
