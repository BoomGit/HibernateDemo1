package com.boom.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	static Configuration cfg=null;
	static SessionFactory sessionFactory=null;
	//��̬�����ʵ�֣��ڴ���Ԥ����ʱ��������ֻ����һ�Σ�
	//ע��static��ֻ����static�еĴ���
	static{
	cfg=new Configuration();
	cfg.configure();
	sessionFactory=cfg.buildSessionFactory();
	}
	//�ṩ����sessionFactory
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}
	
	
}
