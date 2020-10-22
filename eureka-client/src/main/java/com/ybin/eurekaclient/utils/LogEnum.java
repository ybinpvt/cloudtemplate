package com.ybin.eurekaclient.utils;

/**
 * @author ybin
 * @version 1.0
 * @date 2020/10/22 9:40
 * @description:本地日志枚举
 */

public enum LogEnum {
    BUSINESS("business"),
    PLATFORM("platform"),
    DB("db"),
    EXCEPTION("exception"),;

    private String category;

    LogEnum(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
