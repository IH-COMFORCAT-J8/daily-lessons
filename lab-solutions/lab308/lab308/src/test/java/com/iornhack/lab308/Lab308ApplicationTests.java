package com.iornhack.lab308;

import com.iornhack.lab308.Repositories.AssociationRepository;
import com.iornhack.lab308.Repositories.ChapterRepository;
import com.iornhack.lab308.Repositories.MemberRepository;
import com.iornhack.lab308.Models.Association;
import com.iornhack.lab308.Models.Chapter;
import com.iornhack.lab308.Models.Member;
import com.iornhack.lab308.Models.Status;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@SpringBootTest
class Lab308ApplicationTests {

	@Autowired
	AssociationRepository associationRepository;
	@Autowired
	ChapterRepository chapterRepository;
	@Autowired
	MemberRepository memberRepository;

	Association association;
	Chapter chapter;
	Member member;

	@BeforeEach
	void setUp(){
		association = associationRepository.save(new Association());
		chapter = chapterRepository.save(new Chapter("Chapter 1", null, "District 1", association));
		member = memberRepository.save(new Member("Alejandro", Status.ACTIVE, LocalDate.now(), chapter));
		chapter.setPresident(member);
		chapterRepository.save(chapter);

	}

	@AfterEach
	void tearDown(){
		//chapterRepository.deleteAll();
	}

	@Test
	void contextLoads() {
		Chapter chapterTest = chapterRepository.findById(chapter.getId()).get();
		Assertions.assertEquals("Alejandro", chapterTest.getPresident().getName());
	}

}
