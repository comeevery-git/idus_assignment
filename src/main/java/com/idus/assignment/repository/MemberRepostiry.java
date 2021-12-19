package com.idus.assignment.repository;

import com.idus.assignment.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepostiry extends JpaRepository<Member, String> {


}
