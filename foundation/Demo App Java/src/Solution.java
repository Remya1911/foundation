import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.dummy.emp.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Solution {
	
	public static void main(String[] args) throws IOException {
		SessionFactory sf = new Configuration().configure("hybernet.cfg.xml").buildSessionFactory();
		Session session = sf.openSession();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int i=0;
		while(i<3){
			i++;
		session.beginTransaction();
		
		
		System.out.print("Enter name : ");
		String name = bf.readLine();
		System.out.print("Enter email : ");
		String email = bf.readLine();
		System.out.print("Enter phone : ");
		long phone = Long.valueOf(bf.readLine());
		
		
		Employee employee = new Employee(name, email, phone);
		
		System.out.println("name : " + employee.getName());
		System.out.println("email : " + employee.getEmail());
		System.out.println("phone : " + employee.getPhone());
		session.save(employee);
		session.getTransaction().commit();}
		session.close();
	}

}
