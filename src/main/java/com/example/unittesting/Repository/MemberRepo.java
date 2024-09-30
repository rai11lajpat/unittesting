package com.example.unittesting.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.unittesting.Entity.Member;

@Repository
public interface MemberRepo extends CrudRepository<Member,Integer> {
    Iterable<Member> findAll();

}
