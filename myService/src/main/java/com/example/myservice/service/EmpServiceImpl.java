package com.example.myservice.service;

import com.example.myservice.dao.EmpDao;
import com.example.myservice.model.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * packageName : com.example.myservice.service
 * fileName : EmpServiceImpl
 * author : ds
 * date : 2022-05-13
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-13         ds          최초 생성
 */
@Service
public class EmpServiceImpl implements EmpService{
    @Autowired
    EmpDao empDao;

    @Override
        public List<Emp> selectAll(){
            return empDao.selectAll();
        }

    @Override
    public void insertMember(Emp emp) {
        empDao.insert(emp);
    }
}

