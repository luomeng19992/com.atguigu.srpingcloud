package com.atguigu.springcloud.entities;


public class CommResult<T> {
    private Integer code;
    private String messge;
    private T date;

    public CommResult() {
    }

    public CommResult(Integer code, String messge) {
        this.code = code;
        this.messge = messge;
    }

    public CommResult(Integer code, String messge, T date) {
        this.code = code;
        this.messge = messge;
        this.date = date;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessge() {
        return messge;
    }

    public void setMessge(String messge) {
        this.messge = messge;
    }

    public T getDate() {
        return date;
    }

    public void setDate(T date) {
        this.date = date;
    }
}
