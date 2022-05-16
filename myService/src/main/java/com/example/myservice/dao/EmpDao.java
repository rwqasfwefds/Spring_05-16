package com.example.myservice.dao;

import com.example.myservice.model.Emp;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * packageName : com.example.myservice.dao
 * fileName : EmpDao
 * author : ds
 * date : 2022-05-13
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-13         ds          최초 생성
 */
@Mapper
public interface EmpDao {
    List<Emp> selectAll();

    void insert(Emp emp);
}