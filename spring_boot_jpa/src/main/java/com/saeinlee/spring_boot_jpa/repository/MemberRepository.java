package com.saeinlee.spring_boot_jpa.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.saeinlee.spring_boot_jpa.dto.Member;

@Repository
public interface MemberRepository extends CrudRepository<Member, Long>{
	List<Member> findByUsername(String username);
}