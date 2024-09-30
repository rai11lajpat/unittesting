package com.example.unittesting.Servise;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.unittesting.Entity.Member;
import com.example.unittesting.Repository.MemberRepo;

@Service
public class MemberServise {


    @Autowired
    private MemberRepo memberRepo;

    public Iterable<Member> getAll() {
        return this.memberRepo.findAll();
        
    }

}
