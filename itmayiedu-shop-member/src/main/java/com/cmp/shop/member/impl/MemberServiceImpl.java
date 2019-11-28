package com.cmp.shop.member.impl;

import com.cmp.shop.api.member.service.MemberService;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @CLassName MemberServiceImpl
 * @Description: TODO
 * @Author: shenhao
 * @date: 2019/11/28 15:44
 * @Version 1.0
 */
@RestController
public class MemberServiceImpl implements MemberService {
	@Override
	public Map<String, Object> testRest() {
		Map<String, Object> result = new HashMap<>();
		result.put("errorCode", "200");
		result.put("errorMsg", "success");
		return result;
	}
}
