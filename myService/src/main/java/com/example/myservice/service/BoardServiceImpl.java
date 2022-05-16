package com.example.myservice.service;

import com.example.myservice.dao.BoardDao;
import com.example.myservice.dao.MemberDao;
import com.example.myservice.model.Board;
import com.example.myservice.model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * packageName : com.example.myservice.service
 * fileName : BoardServiceImpl
 * author : ds
 * date : 2022-05-16
 * description : 업무 로직을 짜는 클래스(dao 여러개가 조합 될 수 있음)
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-16         ds          최초 생성
 */
// @Service : Service 컴포넌트가 되어서 스프링에 객체로 등록 됨(@Component의 자식 격임)
//    왜 객체로 등록이 되냐면 @ComponentScan는 컴포넌트들을 자동으로 검색해서 스프링에 등록해주는 어노테이션인데
//    얘가 검색하는 대상은 @Component, @Service, @Repository들이 대상임
@Service
public class BoardServiceImpl implements BoardService{

    @Autowired
    BoardDao boardDao;

//    select 문을 실행하는 서비스
    @Override
    public List<Board> selectAll() {
        return boardDao.selectAll();
    }

    @Override
    public void insertMember(Board board) {
//        DB에 insert문 실행하는 부분
        boardDao.insert(board);
    }
}
// @Autowired
// Service에서 memberDao객체를 사용하고 싶음
// Member member; 이렇게만 하면 객체 정의임
// Member member = new Member(); 이렇게 해야 객체를 생성하는거임
// @Autowired는 객체 정의하는 부분위에 달아주면 스프링에서 자동으로 생성해줌 ㅇㅋ?
// 그래서 컴포넌트가 스프링에 등록이 되어 있어야 @Autowired를 사용 할 수 있고 생성도 해줄 수 있는거임
// @Autowired는 내부적으로 setter생성자로 돌고있음(의존성 주입 DI)
// 예)
// void setMemberDao(MemberDao memberdao){
//  this.memberdao = memberdao;
// }
// 위와 같이 이렇게 만드는데 memberdao <- 여기에 미리 컴포넌트로 등록된 객체를 그 새끼에 맞게 밀어넣는거임
// 이걸 자동으로 해줌 ㅇㅋ? 개 꿀 + 강제로 의존성 주입을 하게금 만들어 주기 위해서 이게 생김
// 저렇게 안 하면 생성자를 직접 생성 할 수도 있잖아 Member member = new Member(); 이런식으로
// 근데 이렇게 하면 의존성, 결합도 개 씝 떡상해서 안 좋으니깐 스프링에서 알아서 해주는거임
