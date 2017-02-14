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
		// ��һ�� ����hibernate���������ļ�
		// ��src�����ҵ�������hibernate��cfg.xml
		// ��hibernate�����װ����
		//Configuration cfg = new Configuration();
		//cfg.configure();
		// �ڶ��� ����SessionFactory����
		// ��ȡhibernate���������ļ����ݣ�����sessionFactory
		// �ڹ����У�����ӳ���ϵ�����������ݿ�����ѱ���
		//SessionFactory sessionFactory = cfg.buildSessionFactory();
		SessionFactory sessionFactory=HibernateUtils.getSessionFactory();
		// ������ ʹ��SeesionFactory����session����
		// ������
		Session session = sessionFactory.openSession();
		// ���Ĳ� ��������
		Transaction tx = session.beginTransaction();
		// ���岽 д�����߼�CRUD����
		// ��ӵĹ���
		User user = new User();
		user.setUsername("666");
		user.setPassword("1234456");
		session.save(user);
		// ������ �ύ����
		tx.commit();
		// ���߲� �ر���Դ
		session.close();
		sessionFactory.close();
	}
}
