package com.odin.frigg.com.odin.frigg.web.common;

import org.springframework.beans.factory.annotation.Autowired;

import com.odin.frigg.beanregister.Dict;

public class BaseController {
	@Autowired
	private Dict dict;

	public final String getValue(String key) {
		return dict.getValue(key);
	}

}
