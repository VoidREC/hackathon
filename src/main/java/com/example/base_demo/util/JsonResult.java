package com.example.base_demo.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class JsonResult {

    /**
     * 响应业务状态
     */
    private Integer status;

    /**
     * 响应消息
     */
    private String message;

    /**
     * 响应中的数据
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Object data;

    public static JsonResult ok(Object data){
        return new JsonResult(data);
    }

    public static JsonResult ok(String message){
        return new JsonResult(message);
    }

    private JsonResult(Object data) {
        this.status = 0;
        this.message = "成功";
        this.data = data;
    }
}
