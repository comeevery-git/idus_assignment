package com.idus.assignment.service;

import com.idus.assignment.domain.Member;
import com.idus.assignment.repository.MemberRepostiry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    @Autowired
    MemberRepostiry memberRepostiry;

    public Member findById(String email) {
        return memberRepostiry.findById(email).orElse(null);
    }

}
