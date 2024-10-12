package com.sheep.sheepmall.model.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import java.util.Date;

/**
 * @Author: sheep
 * @Date: 2024/10/12/23:31
 * @Description:
 */

@Data
public class User {

    private long id;

    private String account;

    private String nikeName;

    private String passwordMd5;

    private String phone;

    private byte isDeleted;

    private byte isLocked;

    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm")
    private Date createTime;

    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm")
    private Date updateTime;

}
