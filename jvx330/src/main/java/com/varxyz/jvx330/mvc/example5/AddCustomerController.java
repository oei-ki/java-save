package com.varxyz.jvx330.mvc.example5;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("example5.addCustomerController")
@RequestMapping("/example5/add_customer")
public class AddCustomerController {

	@GetMapping
	public String addCustomerForm(Model model) {
		model.addAttribute("customer", new CustomerCommand());
		return "example5/add_customer";
	}
	
	@ModelAttribute("emailProviderList")
	public List<EmailProvider> getEmailProviderList() {
		List<EmailProvider> list = new ArrayList<EmailProvider>();
		list.add(new EmailProvider("Google", "gmail.com")); //itemValue="emailHost" itemLabel="emailCode 값이 달라서 두개의 커맨드를 만든거임
		list.add(new EmailProvider("NAVER", "naver.com"));
		list.add(new EmailProvider("Daum", "kakao.com"));
		
		return list;
	}
	
//	@ModelAttribute("phoneProvederList")
//	public List<PhoneProvider> getPhoneProviderList() {
//		List<PhoneProvider> list = new ArrayList<PhoneProvider>();
//		list.add(new PhoneProvider("010"));
//		list.add(new PhoneProvider("011"));
//		list.add(new PhoneProvider("053"));
//		list.add(new PhoneProvider("016"));
//		
//		return list;
//	} 밑에처럼 하면 됨.. 이코드 틀림..
	
	@ModelAttribute("phoneProvederList")
	public List<String> getPhoneProviderList() {
		List<String> list = new ArrayList<String>();
		list.add("010");
		list.add("011");
		list.add("053");
		list.add("016");
		
		return list;
	}  //도메인이 중요하다는게 뭔말..패키지 도메인 생각해 (ex account, cutomer 같은..기본적인)
	
	@PostMapping
	public String addCustomer(@ModelAttribute("customer") CustomerCommand customer, Model model) {
		//db처리 했다고 가정?
		//...
		//customer = customerService.addCustomer(customer);
		
		String email = customer.getEmail1()+"@"+customer.getEmail2();
		String phone = customer.getPhone1()+"-"+customer.getPhone2()+"-"
		+customer.getPhone3();
		
		customer.setEmail(email);
		customer.setPhone(phone);
		
		model.addAttribute("customer",customer);
		return "example5/success_add_customer";
	}
}
