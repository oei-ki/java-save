package com.varxyz.jvx330.mvc.example6;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/example6/add_account")
public class AddAccountCotroller {

	@GetMapping
	public String addAccountForm(Model model) {
		model.addAttribute("account", new AccountCommand());
		return "example6/add_account";
	}
	
	@ModelAttribute("accTypeProvider")
	public List<AccTypeProvider> getAccountTypeProviderList() {
		List<AccTypeProvider> list = new ArrayList<AccTypeProvider>();
		list.add(new AccTypeProvider("SavingAccount",'S'));
		list.add(new AccTypeProvider("CheckingAccount",'C'));
		
		return list;
	}
	
	@PostMapping
	public String addAccount(@ModelAttribute("account") AccountCommand account, Model model) {
		
		
		model.addAttribute("account",account);
		return "example6/success_add_account";
	}
}
