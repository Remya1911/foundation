package org.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.dummy.emp1.Bank;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Solution {

	public static void main(String[] args) throws IOException {
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sf.openSession();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int i = 0;
		while (i < 3) {
			i++;
			session.beginTransaction();

			System.out.print("Enter account number : ");
			int acc_no = Integer.valueOf(bf.readLine());
			System.out.print("Enter name : ");
			String name = bf.readLine();
			System.out.print("Enter mailid : ");
			String email = bf.readLine();
			System.out.print("Enter phone : ");
			long phone = Long.valueOf(bf.readLine());
			System.out.print("Enter city : ");
			String city = bf.readLine();

			Bank bank = new Bank(acc_no, name, email, phone, city);

			System.out.println("email : " + bank.getAcc_no());
			System.out.println("name : " + bank.getName());
			System.out.println("phone : " + bank.getEmail());
			System.out.println("phone : " + bank.getPhone());
			System.out.println("phone : " + bank.getCity());
			session.save(bank);
			session.getTransaction().commit();
		}
		session.close();
	}

}
