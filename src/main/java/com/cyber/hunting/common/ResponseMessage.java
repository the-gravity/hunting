package com.cyber.hunting.common;

import com.cyber.hunting.common.exception.CustomException;
import com.cyber.hunting.common.exception.CustomExceptionType;

import java.util.List;

public class ResponseMessage {
    private int code;
    private String message;
    private Object data;

    public ResponseMessage(){}

    public static ResponseMessage success(){
        ResponseMessage responseMessage = new ResponseMessage();
        responseMessage.setCode(200);
        responseMessage.setMessage("请求响应成功");
        return responseMessage;
    }

    public static ResponseMessage success(Object object){
        ResponseMessage responseMessage = new ResponseMessage();
        responseMessage.setCode(200);
        responseMessage.setMessage("请求响应成功");
        responseMessage.setData(object);
        return responseMessage;
    }


    public static ResponseMessage success(Object object, String message){
        ResponseMessage responseMessage = new ResponseMessage();
        responseMessage.setCode(200);
        responseMessage.setMessage(message);
        responseMessage.setData(object);
        return responseMessage;
    }

    public static ResponseMessage error(CustomException exception){
        ResponseMessage responseMessage = new ResponseMessage();
        responseMessage.setCode(exception.getCode());
        if(exception.getCode() == CustomExceptionType.INPUT_ERROR.getCode()){
            responseMessage.setMessage(exception.getMessage());
        }else if (exception.getCode() == CustomExceptionType.SYSTEM_ERROR.getCode()){
            responseMessage.setMessage(exception.getMessage());
        }
        return responseMessage;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
