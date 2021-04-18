package com.company.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.company.model.Company;

@RestController
//@RequestMapping("/companies")
public class CompanyController {

	@PostMapping(value="/createCompany")
	public String createCompany( @RequestHeader("Authorization") String authorization,@RequestHeader("Role") String role,  @RequestBody Company company) {
		return role;

		
	}

}
