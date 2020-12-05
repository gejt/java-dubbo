package xyz.zao123.user.xyz.zao123.user.service.export.impl;

import org.apache.dubbo.config.annotation.Service;
import xyz.zao123.user.service.export.UserExportService;

/**
 * @author gejt
 */
@Service(interfaceClass = UserExportService.class)
public class UserExportServiceImpl implements UserExportService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
