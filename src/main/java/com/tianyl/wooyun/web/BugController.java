package com.tianyl.wooyun.web;

import com.tianyl.core.ioc.annotation.Autowired;
import com.tianyl.core.mvc.annotation.Controller;
import com.tianyl.core.orm.Page;
import com.tianyl.wooyun.model.Bug;
import com.tianyl.wooyun.service.BugService;

@Controller("bug")
public class BugController {

	@Autowired
	private BugService bugService;

	public Object find(Integer pageNum, Integer pageSize) {
		Page<Bug> page = new Page<Bug>();
		page.setPageNum(pageNum);
		page.setPageSize(pageSize);
		page = bugService.findPage(page);
		return page;
	}

	public Object del(Integer id) {
		bugService.delete(id);
		return "ok";
	}
}
