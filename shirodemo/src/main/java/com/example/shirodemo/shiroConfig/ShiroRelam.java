package com.example.shirodemo.shiroConfig;

import com.example.shirodemo.common.exception.user.UserPasswordNotMatchException;
import com.example.shirodemo.entity.User;
import com.example.shirodemo.service.UserService;
import com.example.shirodemo.utils.MyMD5;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;

/**\
 * shiro 认证/授权 管理器
 * @Method
 * @PACKAGE_NAME com.example.shirodemo.shiroConfig
 * @Auther player
 * @Date 2018/7/24
 * @Version 1.0
 */
public class ShiroRelam extends AuthorizingRealm{
    public Logger logger = LoggerFactory.getLogger(ShiroRelam.class);
    @Resource
    private UserService userService ;
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        //用户权限配置
        logger.info("************* 用户权限配置 **********");
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        return info;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        //验证用户登录信息
        String password = null;
        User user = null;
        String username = null;
        try {
            UsernamePasswordToken token = (UsernamePasswordToken)authenticationToken;
            username = token.getUsername();
            password = "";

            if(token.getPassword() != null){
                password = new String(token.getPassword());
            }

            user = userService.selectUserByUserName(username);

            if(user != null ){
                if(!user.getPassword().equals(MyMD5.enCription(password,user.getSalt()))){
                    logger.error("密码不匹配！");
                    throw new UserPasswordNotMatchException();
                }
            }else{
                throw new UserPasswordNotMatchException();
            }
        } catch (UserPasswordNotMatchException e) {
            throw new IncorrectCredentialsException(e.getMessage(), e);
        } catch (Exception e){
            logger.error("对用户[" + username + "]进行登录验证..验证未通过{}", e.getMessage());
            throw new AuthenticationException(e.getMessage(), e);
        }
        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(user, password, getName());
        return info;
    }
}
