package com.example.myservice.service;

import com.example.myservice.model.Dept2;

import java.util.List;

/**
 * packageName : com.example.myservice.service
 * fileName : Dept2Service
 * author : ds
 * date : 2022-05-13
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-13         ds          최초 생성
 */
public interface Dept2Service {
        public List<Dept2> selectAll(); // 부서 정보 select하는 서비스

        //    insert의 Dao와 연결 된 서비스 메소드
        void insertMember(Dept2 dept2);
}
