package com.idus.assignment.domain;

import io.swagger.annotations.ApiModelProperty;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class Member {
    @Id
    @Column(length = 100, nullable = false)
    @ApiModelProperty(value="이메일", required = true)
    String email;

    @Column(length = 20, nullable = false)
    @ApiModelProperty(value="이름", required = true)
    String name;

    @Column(length = 30, nullable = false)
    @ApiModelProperty(value="별명", required = true)
    String nickName;

    @Size(min = 10)
    @Column(nullable = false)
    @ApiModelProperty(value="비밀번호", required = true)
    String password;

    @Column(length = 20, nullable = false)
    @ApiModelProperty(value="전화번호", required = true)
    String mobile;

    @Column(length = 2)
    @ApiModelProperty(value="성별")
    String gender;

}