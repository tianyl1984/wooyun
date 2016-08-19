package com.tianyl.wooyun.service;

import com.tianyl.core.ioc.annotation.Autowired;
import com.tianyl.core.ioc.annotation.Service;
import com.tianyl.core.orm.Page;
import com.tianyl.wooyun.dao.DropDAO;
import com.tianyl.wooyun.model.Drop;

@Service
public class DropService {

	@Autowired
	private DropDAO dropDAO;

	public Page<Drop> findPage(Page<Drop> page) {
		return dropDAO.findPage(page);
	}

}
