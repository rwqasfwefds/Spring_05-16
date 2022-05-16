package com.example.myservice.service;

import com.example.myservice.model.Dept3;

import java.util.List;

/**
 * packageName : com.example.myservice.service
 * fileName : Dept3Service
 * author : ds
 * date : 2022-05-13
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-13         ds          최초 생성
 */
public interface Dept3Service {
    public List<Dept3> selectAll(); // 부서 정보 select하는 서비스

    //    insert의 Dao와 연결 된 서비스 메소드
    void insertMember(Dept3 dept3);
}
