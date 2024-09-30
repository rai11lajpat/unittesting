package com.example.unittesting.Repository;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MemberRepoTest {

    
    @Autowired
    private MemberRepo memberRepo;

    @Test
    void testFindAll() {
        Boolean result =memberRepo.existsById(2);

        assertThat(result).isTrue();
    }
}
