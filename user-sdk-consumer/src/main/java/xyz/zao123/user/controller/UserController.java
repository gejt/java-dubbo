package xyz.zao123.user.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.zao123.user.service.export.UserExportService;

/**
 * @author gejt
 */
@RestController
public class UserController {

    @Reference
    private UserExportService userExportService;

    @GetMapping("/user/sayHello")
    public String sayHello(){
        return userExportService.sayHello("lucky");
    }
}
