package com.example.shirodemo.shiroConfig;

import org.apache.shiro.codec.Base64;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.CookieRememberMeManager;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.apache.shiro.web.servlet.SimpleCookie;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;

/**
 * @Method
 * @PACKAGE_NAME com.example.shirodemo.shiroConfig
 * @Auther player
 * @Date 2018/7/24
 * @Version 1.0
 */
@Configuration
public class ShiroConfig {
    public Logger logger = LoggerFactory.getLogger(ShiroConfig.class);

    @Value("${shiro.loginUrl}")
    private String loginUrl;
    @Value("${shiro.unauthorizedUrl}")
    private String unauthorizedUrl;
    @Value("${shiro.cookie.domain}")
    private String domain;
    @Value("${shiro.cookie.path}")
    private String path;
    @Value("${shiro.cookie.httpOnly}")
    private Boolean httpOnly;
    @Value("${shiro.cookie.maxAge}")
    private Integer maxAge;

    public ShiroConfig() {
    }

    @Bean
    public ShiroFilterFactoryBean shiroFilterFactoryBean(SecurityManager securityManager){
        logger.info(" *** shiroConfig 加载配置  {}",loginUrl);
        ShiroFilterFactoryBean sffb = new ShiroFilterFactoryBean();
        // Shiro的核心安全接口,这个属性是必须的
        sffb.setSecurityManager(securityManager);
        // 身份认证失败，则跳转到登录页面的配置
        sffb.setLoginUrl(loginUrl);
        // 权限认证失败，则跳转到指定页面
        sffb.setUnauthorizedUrl(unauthorizedUrl);
        // Shiro连接约束配置，即过滤链的定义
        LinkedHashMap<String,String> filterChainDefinitionMap = new LinkedHashMap<String,String>();
        // 对静态资源设置匿名访问
        filterChainDefinitionMap.put("/static/**","anon");
        /*filterChainDefinitionMap.put("/favicon.ico**", "anon");
        filterChainDefinitionMap.put("/ruoyi.png**", "anon");
        filterChainDefinitionMap.put("/css/**", "anon");
        filterChainDefinitionMap.put("/docs/**", "anon");
        filterChainDefinitionMap.put("/fonts/**", "anon");
        filterChainDefinitionMap.put("/img/**", "anon");
        filterChainDefinitionMap.put("/ajax/**", "anon");
        filterChainDefinitionMap.put("/js/**", "anon");*/
        // 退出 logout地址，shiro去清除session
        filterChainDefinitionMap.put("/logout", "logout");
        // 不需要拦截的访问
        filterChainDefinitionMap.put("/login", "anon");
        // 系统权限列表
        // filterChainDefinitionMap.putAll(SpringUtils.getBean(IMenuService.class).selectPermsAll());

        // 所有请求需要认证
        filterChainDefinitionMap.put("/**", "user");
        sffb.setFilterChainDefinitionMap(filterChainDefinitionMap);
        return sffb;
    }

    /**
     * 认证器配置
     * @return
     */
    @Bean
    public ShiroRelam shiroRelam(){
        ShiroRelam shiroRelam = new ShiroRelam();
        return shiroRelam;
    }

    /**
     * 加密配置方式
     * @return
     */
    /*@Bean
    public HashedCredentialsMatcher hashedCredentialsMatcher(){
        HashedCredentialsMatcher hcm = new HashedCredentialsMatcher();
        hcm.setHashAlgorithmName("md5");
        hcm.setHashIterations(2);
        return  hcm;
    }*/

    /**
     * 安全管理器
     * @return
     */
    @Bean
    public SecurityManager securityManager(){
        DefaultWebSecurityManager dwm = new DefaultWebSecurityManager();
        dwm.setRealm(shiroRelam());
        return dwm;
    }

    /**
     * cookie 属性设置
     * @return
     */
    @Bean
    public SimpleCookie rememberMeCookie(){
        SimpleCookie cookie = new SimpleCookie("rememberMe");
        cookie.setDomain(domain);
        cookie.setPath(path);
        cookie.setHttpOnly(httpOnly);
        cookie.setMaxAge(maxAge * 24 * 60 * 60);
        return cookie;
    }

    /**
     * 记住我 管理器
     * @return
     */
    @Bean
    public CookieRememberMeManager rememberMeManager(){
        CookieRememberMeManager rememberMe = new CookieRememberMeManager();
        rememberMe.setCookie(rememberMeCookie());
        rememberMe.setCipherKey(Base64.decode("fCq+/xW488hMTCD+cmJ3aQ=="));
        return  rememberMe;
    }

    /**
     * 开启Shiro注解通知器
     */
    @Bean
    public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor(
            @Qualifier("securityManager") SecurityManager securityManager)
    {
        AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor = new AuthorizationAttributeSourceAdvisor();
        authorizationAttributeSourceAdvisor.setSecurityManager(securityManager);
        return authorizationAttributeSourceAdvisor;
    }
}
