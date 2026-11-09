package com.hmall.user.domain.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
@ApiModel(description = "登录表单实体")
public class LoginFormDTO {
    @ApiModelProperty(value = "用户名", required = true)
    @NotBlank(message = "用户名不能为空")
    private String username;
    @NotBlank(message = "密码不能为空")
    @ApiModelProperty(value = "用户名", required = true)
    private String password;
    @ApiModelProperty(value = "是否记住我", required = false)
    private Boolean rememberMe = false;
}
