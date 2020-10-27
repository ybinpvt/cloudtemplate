package com.ybin.casserver;

import org.apache.shiro.crypto.hash.ConfigurableHashService;
import org.apache.shiro.crypto.hash.DefaultHashService;
import org.apache.shiro.crypto.hash.HashRequest;
import org.apache.shiro.util.ByteSource;
import org.junit.jupiter.api.Test;

/**
 * @author ybin
 * @version 1.0
 * @date 2020/10/27 10:31
 * @description:
 */

public class PasswordSaltTest {
    private String staticSalt = ".";
    private String algorithmName = "MD5";
    private String encodedPassword = "123456";
    private String dynaSalt = "test";

    @Test
    public void test() throws Exception {
        ConfigurableHashService hashService = new DefaultHashService();
        hashService.setPrivateSalt(ByteSource.Util.bytes(this.staticSalt));
        hashService.setHashAlgorithmName(this.algorithmName);
        hashService.setHashIterations(2);
        HashRequest request = new HashRequest.Builder()
                .setSalt(dynaSalt)
                .setSource(encodedPassword)
                .build();
        String res =  hashService.computeHash(request).toHex();
        System.out.println(res);
    }
}
