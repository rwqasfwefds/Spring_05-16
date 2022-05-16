package com.example.myservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * packageName : com.example.myservice.model
 * fileName : Dept3
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
public class Dept3 {
    private int dno; // 숫자(부서 번호)
    @JsonProperty(value = "dname")
    private String dname; // 문자열(부서 이름)
    @JsonProperty(value = "loc")
    private String loc; // 문자열(지역 이름)

}
