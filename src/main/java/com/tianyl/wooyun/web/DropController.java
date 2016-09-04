package com.tianyl.wooyun.web;

import com.tianyl.core.ioc.annotation.Autowired;
import com.tianyl.core.mvc.annotation.Controller;
import com.tianyl.core.orm.Page;
import com.tianyl.wooyun.model.Drop;
import com.tianyl.wooyun.service.DropService;

@Controller("drop")
public class DropController {

	@Autowired
	private DropService dropService;

	public Object find(Integer pageNum, Integer pageSize) {
		Page<Drop> page = new Page<Drop>();
		page.setPageNum(pageNum);
		page.setPageSize(pageSize);
		page = dropService.findPage(page);
		return page;
	}

	public Object del(Integer id) {
		dropService.delete(id);
		return "ok";
	}
}
