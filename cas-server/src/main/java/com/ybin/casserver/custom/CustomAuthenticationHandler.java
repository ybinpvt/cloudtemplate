package com.ybin.casserver.custom;

import org.apereo.cas.authentication.AuthenticationHandlerExecutionResult;
import org.apereo.cas.authentication.PreventedException;
import org.apereo.cas.authentication.UsernamePasswordCredential;
import org.apereo.cas.authentication.handler.support.AbstractUsernamePasswordAuthenticationHandler;
import org.apereo.cas.authentication.principal.PrincipalFactory;
import org.apereo.cas.services.ServicesManager;

import javax.security.auth.login.AccountNotFoundException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;

/**
 * @author ybin
 * @version 1.0
 * @date 2020/10/27 13:33
 * @description:自定义验证器
 */

public class CustomAuthenticationHandler extends AbstractUsernamePasswordAuthenticationHandler {
    public CustomAuthenticationHandler(String name, ServicesManager servicesManager, PrincipalFactory principalFactory, Integer order) {
        super(name, servicesManager, principalFactory, order);
    }

    @Override
    protected AuthenticationHandlerExecutionResult authenticateUsernamePasswordInternal(UsernamePasswordCredential credential, String originalPassword)
            throws GeneralSecurityException, PreventedException, AccountNotFoundException {
        if("admin".equals(credential.getUsername())){
            return createHandlerResult(credential,
                    this.principalFactory.createPrincipal(credential.getUsername()),
                    new ArrayList<>(0));
        }else{
            throw new AccountNotFoundException("必须是admin用户才允许通过");
        }
    }
}
