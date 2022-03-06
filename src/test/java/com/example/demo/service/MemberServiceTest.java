package com.example.demo.service;

import com.example.demo.constant.Role;
import com.example.demo.dto.MemberFormDto;
import com.example.demo.entity.Member;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.TestPropertySource;

import javax.transaction.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
@TestPropertySource(locations = "classpath:application-test.properties")
class MemberServiceTest {

    @Autowired
    MemberService memberService;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Test
    public Member createMember() {
        MemberFormDto memberFormDto = new MemberFormDto();
        memberFormDto.setAddress("대구");
        memberFormDto.setEmail("ㅇㅇ@naver.com");
        memberFormDto.setName("dgw");
        memberFormDto.setPassword("1234");
        return Member.createMember(memberFormDto, passwordEncoder);
    }
    @Test
    @DisplayName("회원가입 테스트")
    public void saveMemberTest(){
        Member member = createMember();
        Member savedMamer = memberService.saveMember(member);

        assertEquals(member.getEmail(),savedMamer.getEmail());
        assertEquals(member.getAddress(), savedMamer.getAddress());
        assertEquals(member.getId(), savedMamer.getId());
        assertEquals(member.getName(), savedMamer.getName());
        assertEquals(member.getRole(), savedMamer.getRole());
    }
}