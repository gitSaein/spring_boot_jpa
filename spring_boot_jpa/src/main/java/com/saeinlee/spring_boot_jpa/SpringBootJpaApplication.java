package com.saeinlee.spring_boot_jpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.saeinlee.spring_boot_jpa.dto.Member;
import com.saeinlee.spring_boot_jpa.repository.MemberRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class SpringBootJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(MemberRepository memberRepository) {
		return (args) -> {
			memberRepository.save(new Member("saein_1",1));
			memberRepository.save(new Member("saein_2",2));
			memberRepository.save(new Member("saein_3",3));
			memberRepository.save(new Member("saein_4",4));
			memberRepository.save(new Member("saein",5));
			memberRepository.save(new Member("saein_6",6));
			memberRepository.save(new Member("saein_7",7));
			memberRepository.save(new Member("saein",8));
			memberRepository.save(new Member("saein_9",9));
			
			log.info("members found with findAll");
			log.info("---------------------------");
			
			for(Member member: memberRepository.findAll()) {
				log.info("member = {}", member);
			}
			
			log.info("Member found with findByName(\"saein\")");
			log.info("----------------------------");
			memberRepository.findByUsername("saein").forEach(saein -> {
				log.info(saein.toString());
			});
			
		};
		
	}

}
