package com.sgx.spider.wenshu.vl5x;

public class Number {
    private final static String value = "wens";

    public static String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return getValue();
    }
}