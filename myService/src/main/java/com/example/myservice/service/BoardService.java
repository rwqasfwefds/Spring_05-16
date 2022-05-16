package com.example.myservice.service;

import com.example.myservice.model.Board;

import java.util.List;

/**
 * packageName : com.example.myservice.service
 * fileName : BoardService
 * author : ds
 * date : 2022-05-16
 * description : 게시판 정보를 조회하는 서비스 (인터페이스)
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-16         ds          최초 생성
 */
public interface BoardService {
      public List<Board> selectAll();
    
//    insert의 Dao와 연결 된 서비스 메소드
    void insertMember(Board board);
}
