package com.example.myservice.service;

import com.example.myservice.model.Emp;

import java.util.List;

/**
 * packageName : com.example.myservice.service
 * fileName : EmpService
 * author : ds
 * date : 2022-05-13
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-13         ds          최초 생성
 */
public interface EmpService {
    public List<Emp> selectAll();

    void insertMember(Emp emp);
}