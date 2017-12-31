package main;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Employee;

public class App {

	public static void main(String[] args) {
    
		Configuration config =new Configuration();
		
		config.configure("hibernate.cfg.xml");
		
	SessionFactory factory=config.buildSessionFactory();
	Session session =factory.openSession();
	Transaction tx=session.beginTransaction();
	Scanner sc=new Scanner(System.in);
	
	
	
	
	Employee emp= new Employee();
	//System.out.println("please enter the id");
	//emp.setId(sc.nextInt());
	System.out.println("please enter the firstname of employee");
	emp.setFirstname(sc.next());
	System.out.println("pleaes enter the lastname of employee");
	emp.setLastname(sc.next());
	
	session.save(emp);
	
//Object o=	session.get(Employee.class, 1);
  //   Employee emp=(Employee)o;
    //emp.setFirstname("Mass_Madhu");
	//System.out.println("EmployeefirstName is:"+emp.getFirstname()+" "+"Employe lastName is:"+emp.getLastname());
	tx.commit();
	System.out.println("success");
	
	session.close();
	factory.close();
		
		
	}

}
