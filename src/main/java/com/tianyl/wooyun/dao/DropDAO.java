package com.tianyl.wooyun.dao;

import com.tianyl.core.ioc.annotation.Component;
import com.tianyl.core.orm.JdbcUtil;
import com.tianyl.core.orm.Page;
import com.tianyl.wooyun.model.Drop;

@Component
public class DropDAO {

	public Page<Drop> findPage(Page<Drop> page) {
		return JdbcUtil.queryPage("select * from drops", page, Drop.class);
	}

}
