package com.cmp.shop.api.member.service;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@RequestMapping("/member")
public interface MemberService {
	@RequestMapping("/testRest")
	public Map<String,Object> testRest();
}
