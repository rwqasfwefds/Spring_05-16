package com.example.myservice.dao;

import com.example.myservice.model.Dept3;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * packageName : com.example.myservice.dao
 * fileName : Dept3Dao
 * author : ds
 * date : 2022-05-13
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-13         ds          최초 생성
 */
@Mapper
public interface Dept3Dao {
    List<Dept3> selectAll(); // 부서 정보를  select 하는 메소드

    void insert(Dept3 dept3); // 부서 정보를 insert 하는 메소드
}
