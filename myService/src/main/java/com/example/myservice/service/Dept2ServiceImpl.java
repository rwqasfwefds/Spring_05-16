package com.example.myservice.service;

import com.example.myservice.dao.Dept2Dao;
import com.example.myservice.model.Dept2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * packageName : com.example.myservice.service
 * fileName : Dept2ServiceImpl
 * author : ds
 * date : 2022-05-13
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-13         ds          최초 생성
 */
@Service
public class Dept2ServiceImpl implements Dept2Service{

    @Autowired
    Dept2Dao dept2Dao;

    //    select 문을 실행하는 서비스
    @Override
    public List<Dept2> selectAll() {
        return dept2Dao.selectAll();
    }

    @Override
    public void insertMember(Dept2 dept2) {
//        DB에 insert문 실행하는 부분
        dept2Dao.insert(dept2);
    }
}
