package com.tianyl.wooyun.dao;

import com.tianyl.core.ioc.annotation.Component;
import com.tianyl.core.orm.JdbcUtil;
import com.tianyl.core.orm.Page;
import com.tianyl.wooyun.model.Bug;

@Component
public class BugDAO {

	public Page<Bug> findPage(Page<Bug> page) {
		return JdbcUtil.queryPage("select * from bugs", page, Bug.class);
	}

}
