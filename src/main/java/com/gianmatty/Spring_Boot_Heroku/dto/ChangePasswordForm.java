package com.gianmatty.Spring_Boot_Heroku.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class ChangePasswordForm {

    @NotNull
    private Long id;

    @NotBlank(message="Current Password must not be blank")
    private String currentPassword;

    @NotBlank(message="New Password must not be blank")
    private String newPassword;

    @NotBlank(message="Confirm Password must not be blank")
    private String confirmPassword;

    public ChangePasswordForm() { }

    public ChangePasswordForm(Long id) {this.id = id;}


}
