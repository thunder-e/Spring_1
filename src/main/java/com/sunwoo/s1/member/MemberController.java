package com.sunwoo.s1.member;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	//memberJoin	//	/member/memberJoin GET
	@RequestMapping(value = "/member/memberJoin")
	public String memberJoin() {
		return "member/memberJoin";
	}
	
	
	//memberJoin2 	//	/member/memberJoin POST
	@RequestMapping(value = "/member/memberJoin", method = RequestMethod.POST)
	public void memberJoin(MemberDTO memberDTO) throws Exception{
		
		int result = memberService.memberJoin(memberDTO);
		
		System.out.println(result);
	}
	
	
	
	
	
	
	
	//memberJoin print 	// 	/member/memberLogin
	@RequestMapping(value = "/member/memberLogin")
	public String memberLogin() {
		//String name = request.getParameter("name");
		//int age = Integer.parseInt(request.getParameter("age"));
		//System.out.println(name);
		//System.out.println(age);
		System.out.println("선우야 밥은 먹었냐~~~~~~~~~~");
		//	/Web-INF/views/member/memberLogin.jsp 
		return "member/memberLogin";
		//이 문자열을 DispatcherServlet(servlet-context.xml에 있는)에서 받아서 
	}
	//memberLogin2 print
	@RequestMapping(value="/member/memberLogin", method = RequestMethod.POST)
	public String memberLogin(HttpServletRequest request) throws Exception {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setId(id);
		memberDTO.setPw(pw);
		memberDTO = memberService.memberLogin(memberDTO);
		System.out.println(memberDTO);
		request.setAttribute("dto", memberDTO);
		return "member/memberPage";
	}
	
	
	

}
