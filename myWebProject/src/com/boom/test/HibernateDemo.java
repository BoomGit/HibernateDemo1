package com.boom.test;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import com.boom.user.User;
import com.boom.utils.HibernateUtils;

public class HibernateDemo {

	@Test
	public void testAdd() {
		// 第一步 加载hibernate核心配置文件
		// 到src下面找到名称是hibernate。cfg.xml
		// 在hibernate里面封装对象
		//Configuration cfg = new Configuration();
		//cfg.configure();
		// 第二步 创建SessionFactory对象
		// 读取hibernate核心配置文件内容，创建sessionFactory
		// 在过程中，根据映射关系，在配置数据库里面把表创建
		//SessionFactory sessionFactory = cfg.buildSessionFactory();
		SessionFactory sessionFactory=HibernateUtils.getSessionFactory();
		// 第三步 使用SeesionFactory创建session对象
		// 类似于
		Session session = sessionFactory.openSession();
		// 第四步 开启事务
		Transaction tx = session.beginTransaction();
		// 第五步 写具体逻辑CRUD操作
		// 添加的功能
		User user = new User();
		user.setUsername("666");
		user.setPassword("1234456");
		session.save(user);
		// 第六步 提交事务
		tx.commit();
		// 第七步 关闭资源
		session.close();
		sessionFactory.close();
	}
}
