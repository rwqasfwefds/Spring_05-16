package com.example.myservice.service;

import com.example.myservice.dao.Dept4Dao;
import com.example.myservice.model.Dept4;
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
public class Dept4ServiceImpl implements Dept4Service{
    @Autowired
    Dept4Dao dept4Dao;

    //    select 문을 실행하는 서비스
    @Override
    public List<Dept4> selectAll() {
        return dept4Dao.selectAll();
    }

    @Override
    public void insertMember(Dept4 dept4) {
//        DB에 insert문 실행하는 부분
        dept4Dao.insert(dept4);
    }
}
