package com.example.shirodemo.Listerner;

import com.example.shirodemo.common.cache.CacheTool;
import com.example.shirodemo.entity.User;
import com.example.shirodemo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @Method
 * @PACKAGE_NAME com.example.shirodemo.Listerner
 * @Auther player
 * @Date 2018/8/9
 * @Version 1.0
 */
@WebListener
public class StartListerner implements ServletContextListener {
    public Logger logger = LoggerFactory.getLogger(StartListerner.class);
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        logger.info(" 初始化 。。。 ");
        ServletContext app = servletContextEvent.getServletContext();
        WebApplicationContext appContext = WebApplicationContextUtils.getWebApplicationContext(app);
        UserService service = (UserService)appContext.getBean("userService");
        User user = service.selectUserByUserName("test");
        logger.info(" 加载缓存机制 "+user.getPassword()+" * "+user.getUsername());

        //使用静态缓存
        CacheTool.newCasheTool().put("user",user);

        User user1 = (User) CacheTool.newCasheTool().get("user");
        logger.info(" == 缓存中数据为： ={}= ",user1.getUsername());

        logger.info(" == 开始移除缓存中的数据 。。。 。。。 == ");
        CacheTool.newCasheTool().remove("user");
        User user2 = (User) CacheTool.newCasheTool().get("user");
        if(user2 != null){
            logger.info(" == 缓存中数据 2 为： ={}= ",user2.getUsername());
        }else{
            logger.info(" == 缓存中数据 2 为： ={}= ",user2);
        }


    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
    }
}
