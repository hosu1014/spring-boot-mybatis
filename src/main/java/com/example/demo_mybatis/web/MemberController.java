package com.example.demo_mybatis.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo_mybatis.Dao.MemberDao;
import com.example.demo_mybatis.Entity.Member;

@Controller
@RequestMapping("/member")
public class MemberController {

	@Autowired
	private MemberDao memberDao;
	
	@RequestMapping("{memberId}/viewMember.do")
	public String searchMember(@PathVariable String memberId, Model model) {
		Member member = memberDao.serarchMember(memberId);
		model.addAttribute("member", member);
		return "member/viewMember";
	}
}
