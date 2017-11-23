package org.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.grocery.stock.Item;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Solution1 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();// create statement
																										
		Session session = sf.openSession();

		while (true) {
			int ch;
			System.out.println("Enter value:");
			ch = Integer.valueOf(bf.readLine());
			switch (ch) {
			case 1:
				session.beginTransaction();
				int id;
				String name;
				int quantity;
				double price;
				

				System.out.print("Enter Id");
				id = Integer.valueOf(bf.readLine());
				System.out.print("Enter Name");
				name = bf.readLine();
				System.out.print("Enter Quantity");
				quantity = Integer.valueOf(bf.readLine());
				System.out.print("Enter Price");
				price = Double.valueOf(bf.readLine());
				Item item = new Item(id, name, quantity, price);
				session.save(item);
				session.getTransaction().commit();
				//session.close();
			case 2:
				Item item1=session.get(Item.class, 1);
				System.out.println(item1.getId());
				System.out.println(item1.getName());
				System.out.println(item1.getQuantity());
				System.out.println(item1.getPrice());
				break;
			case 3:

				Item item2 = session.get(Item.class,1);
				System.out.println(item2.getId());
				System.out.println(item2.getName());
				System.out.println(item2.getQuantity());
				System.out.println(item2.getPrice());
				session.beginTransaction();
				item2.setName("roja");
				item2.setQuantity(65);
				item2.setPrice(555.005);
				session.update(item2);
				session.getTransaction().commit();
				break;
			case 4:
				System.out.println("Item deleted");
				session.beginTransaction();
				Item item3=new Item();
				item3.setId(2);
				session.delete(item3);
				session.getTransaction().commit();
				break;
				
			case 5:
				Item item4=session.get(Item.class, 0);
				System.out.println("Item does not exist");
				System.out.println(item4.getId());
				System.out.println(item4.getName());
				System.out.println(item4.getQuantity());
				System.out.println(item4.getPrice());
				break;
			case 6:
				System.out.println(Item.getTotalNoOfProducts());
				break;
			case 7:break;
				default:break;
				

			}
		}
	}
}