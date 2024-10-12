package com.sheep.sheepmall.model.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import java.util.Date;

/**
 * @Author: sheep
 * @Date: 2024/10/12/23:56
 * @Description:
 */

@Data
public class UserToken {

    private long id;

    private String token;

    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm")
    private Date updateTime;

    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm")
    private Date expireTime;

}
