package com.ybin.shiroredis.config.shiro;

import org.apache.shiro.session.Session;

import java.util.Date;

/**
 * @author ybin
 * @version 1.0
 * @date 2020/11/12 14:00
 * @description: Use ThreadLocal as a temporary storage of Session,
 * so that shiro wouldn't keep read redis several times while a request coming.
 */

public class SessionInMemory {
    private Session session;
    private Date createTime;

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
