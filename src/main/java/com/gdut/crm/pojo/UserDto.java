package com.gdut.crm.pojo;


import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import java.util.Date;
import java.util.List;

/**
 * (User)表dto
 *
 * @author leen
 * @since 2023-12-04 16:04:15
 */
@Data
public class UserDto {
    private String id;

    private String loginAct;

    private String name;

    private String loginPwd;

    private String email;

    private String expireTime;

    private String lockState;

    private Long deptId;

    private String allowIps;
}