package com.cmp.shop.common.utils;

import java.util.List;
import java.util.Map;

/**
 * @CLassName ListUtils
 * @Description: TODO
 * @Author: shenhao
 * @date: 2019/11/28 16:12
 * @Version 1.0
 */
public class ListUtils {
	//判断list集合是否为空
	public List<?> emptyList(List<?> list){
		if(list==null||list.size()<=0){
			return null;
		}
		return list;
	}

	//判断map集合是否为空
	public Map<?,?> emptyMap(Map<?,?> map){
		if(map==null||map.size()<=0){
			return null;
		}
		return map;
	}
}
