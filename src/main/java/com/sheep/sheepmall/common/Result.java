package com.sheep.sheepmall.common;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

/**
 * @Author: sheep
 * @Date: 2024/10/12/22:30
 * @Description:
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result<T> implements Serializable{

    @Serial
    private static final long serialVersionUID = 1L;

    private int code;
    private String message;
    private T data;

    public static <T> Result<T> success() {
        return new Result<>(200,"success",null);
    }
    public static <T> Result<T> success(T data) {
        return new Result<>(200,"success",data);
    }
    public static <T> Result<T> fail(String message) {
        return new Result<>(404,message,null);
    }
}
