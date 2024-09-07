package com.demo.vueclitest.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.Date;

//getter setter方法
@Data
//包含所有字段的构造
@AllArgsConstructor
//无参数的构造
@NoArgsConstructor
//生成toString方法 包含所有字段
@ToString
//使访问器方法支持链式调用，这样你可以通过链式语法来设置字段，例如 user.setName("张三").setAge(30)。
@Accessors(chain = true)
public class User {
    private String id;
    private String name;
    private Integer age;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GTM+8")
    private Date bir;
}
