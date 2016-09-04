package com.tianyl.wooyun.service;

import com.tianyl.core.ioc.annotation.Autowired;
import com.tianyl.core.ioc.annotation.Service;
import com.tianyl.core.orm.Page;
import com.tianyl.wooyun.dao.BugDAO;
import com.tianyl.wooyun.model.Bug;

@Service
public class BugService {

	@Autowired
	private BugDAO bugDAO;

	public Page<Bug> findPage(Page<Bug> page) {
		return bugDAO.findPage(page);
	}

	public void delete(Integer id) {
		bugDAO.delete(id);
	}

}
