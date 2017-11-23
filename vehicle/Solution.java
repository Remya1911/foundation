package org.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.grocery.stock.Item;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.veh.FourWheeler;
import com.veh.TwoWheeler;
import com.veh.Vehicle;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {

		//BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();// create statement
																										
		Session session = sf.openSession();
        Vehicle vehicle = new Vehicle();
        vehicle.setName("car");
        
        TwoWheeler two = new TwoWheeler();
        two.setName("Bike");
        two.setSteeringHandle("Bike Steeering");
        
        FourWheeler four = new FourWheeler();
        four.setName("Porsche");
        four.setSteeringWheel("Porsche Steering Wheel");
        
        session.beginTransaction();
        session.save(vehicle);
        session.save(two);
        session.save(four);
        session.getTransaction().commit();
        session.close();
		sf.close();
		}
}