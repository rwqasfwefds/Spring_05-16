package com.example.myservice.service;

import com.example.myservice.dao.Dept3Dao;
import com.example.myservice.model.Dept3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * packageName : com.example.myservice.service
 * fileName : Dept3ServiceImpl
 * author : ds
 * date : 2022-05-13
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-13         ds          최초 생성
 */
@Service
public class Dept3ServiceImpl implements Dept3Service{
    @Autowired
    Dept3Dao dept3Dao;

    //    select 문을 실행하는 서비스
    @Override
    public List<Dept3> selectAll() {
        return dept3Dao.selectAll();
    }

    @Override
    public void insertMember(Dept3 dept3) {
//        DB에 insert문 실행하는 부분
        dept3Dao.insert(dept3);
    }
}
