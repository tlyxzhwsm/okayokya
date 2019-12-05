package com.okayokya.orderService.utils;

public enum SuccessOrFailure {
    SUCCESS("{\"msg\":\"success\"}"),
    FAILURE("{\"msg\":\"failure\"}");

    public String value;
    SuccessOrFailure(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }


}
