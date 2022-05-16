package com.example.myservice.service;

import com.example.myservice.model.Dept;

import java.util.List;

/**
 * packageName : com.example.myservice.service
 * fileName : DeptService
 * author : ds
 * date : 2022-05-12
 * description : 부서 정보를 조회하는 서비스 (인터페이스)
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-12         ds          최초 생성
 */
public interface DeptService {
//    public List<Dept> selectList(); // 무조건 select문 하나만 쓸 수 있음
      public List<Dept> selectAll(); // 부서 정보 select하는 서비스(좀 더 복잡한 구조로 쓸 수 있음 select문을 2개, 3개... 이렇게)
    
//    insert의 Dao와 연결 된 서비스 메소드
    void insertMember(Dept dept);
    
//    update 서비스 추가
    void updateMember(int dno, Dept updateDept);
}
