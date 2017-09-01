package com.song.respstatus;

public class ResponseHttpStatus {
    //http状态码
    private String code;

    //返回的提示消息
    private String msg;

    //返回的数据
    private Object data;

    public void setCode(String code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public Object getData() {
        return data;
    }
}
