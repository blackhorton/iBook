package com.ming.web.ibook.push;

import com.ming.web.ibook.push.provider.AuthRequestFilter;
import com.ming.web.ibook.push.provider.GsonProvider;
import com.ming.web.ibook.push.service.AccountService;
import org.glassfish.jersey.server.ResourceConfig;

import java.util.logging.Logger;

/**
 * @author Hortons
 * on 2020/3/4
 */
public class Application extends ResourceConfig {

    public Application() {
        // 注册逻辑处理的包名
        //packages("net.qiujuer.web.italker.push.service");
        packages(AccountService.class.getPackage().getName());

        // 注册我们的全局请求拦截器
        register(AuthRequestFilter.class);

        // 注册Json解析器
        // register(JacksonJsonProvider.class);
        // 替换解析器为Gson
        register(GsonProvider.class);

        // 注册日志打印输出
        register(Logger.class);
    }
}
