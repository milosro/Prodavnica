package service;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Model.User;

public class hibernateMetode {
	
	private SessionFactory sf = new Configuration()
								.configure()
								.buildSessionFactory();
	
	
	public boolean ubaciUseraUBazu(String userName, String password){
		
		
		User user = new User();
		user.setUserName(userName);
		user.setPassword(password);
		Session sesija = sf.openSession();
		sesija.beginTransaction();
		
		try {
			sesija.save(user);
			sesija.getTransaction().commit();
			return true;
		} catch (Exception e) {
			
			sesija.getTransaction().rollback();
			return false;
			
		}finally{
			sesija.close();
		}
		
		
	}

}
