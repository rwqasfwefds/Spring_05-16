package com.example.myservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * packageName : com.example.myservice.model
 * fileName : Emp
 * author : ds
 * date : 2022-05-13
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-13         ds          최초 생성
 */
@Setter
@Getter
public class Emp {
    private int eno;
    @JsonProperty(value = "ename")
    private String ename;
    @JsonProperty(value = "job")
    private String job;
    @JsonProperty(value = "manager")
    private int manager;
    @JsonProperty(value = "hiredate")
    private String hiredate;
    @JsonProperty(value = "salary")
    private int salary;
    @JsonProperty(value = "commission")
    private int commission;
    @JsonProperty(value = "dno")
    private int dno;
}
