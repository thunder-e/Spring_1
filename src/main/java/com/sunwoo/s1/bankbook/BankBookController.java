package com.sunwoo.s1.bankbook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BankBookController {
	
	@Autowired
	private BankBookService bankBookService;
	
	//상품 리스트
	@RequestMapping(value="/bankbook/bankbookList")
	public void bankbookList() throws Exception{
		List<BankBookDTO> ar = bankBookService.getList();
	}
	//상품 등록
	@RequestMapping(value="/bankbook/bankbookAdd")
	public void bankbookAdd() throws Exception{
			
	}//-> 폼으로 이동
	
	@RequestMapping(value="/bankbook/bankbookAdd", method = RequestMethod.POST)
	public ModelAndView bankbookAdd(BankBookDTO bankBookDTO, ModelAndView modelAndView) throws Exception{
		
//		modelAndView.setViewName("bankbook/bankbookAdd");
//		modelAndView.addObject("dto", bankBookDTO);
		return modelAndView;
	}//-> 파라미터 받아서 db에 연결
	
	//상품 상세
	@RequestMapping(value="/bankbook/bankbookSelect")
	public ModelAndView bankbookSelect(ModelAndView modelAndView) throws Exception {
		
		return modelAndView;
	}
	
	//상품 수정
	@RequestMapping(value="/bankbook/bankbookUpdate")
	public void bankbookUpdate() throws Exception {
		
	}
	
	@RequestMapping(value="/bankbook/bankbookUpdate", method = RequestMethod.POST)
	public ModelAndView bankbookUpdate(BankBookDTO bankBookDTO, ModelAndView modelAndView) throws Exception {
		
		modelAndView.setViewName("bankbook/bankbookUpdate");
		modelAndView.addObject("dto", bankBookDTO);
		return modelAndView;
	}
	
	
	//상품 삭제
	@RequestMapping(value="/bankbook/bankbookDelete")
	public ModelAndView bankbookDelete(ModelAndView modelAndView) throws Exception {
		
		return modelAndView;
	}
	
	
	
	
	
	
	
	
	
}
