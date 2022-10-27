package com.example.TestJPA;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class TestJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestJpaApplication.class, args);

//		SortedMap<String,Personne> map = new TreeMap<String,Personne>();
//
		Personne p1= new Personne(15,"omar");
		Personne p2= new Personne(12,"omar2");
		Personne p3= new Personne(20,"omar3");
		Personne p4= new Personne(0,"omar4");
//
//		map.put(p1.name,p1);
//		map.put(p2.name,p2);
//		map.put(p3.name,p3);
//		map.put(p4.name,p4);
//
//		System.out.println("--- keySet ---");
//		Set<String> keys = map.keySet();
//
//		for (String key : keys) {
//			System.out.println(key + " --> " + map.get(key));
//		}




//		Map<Integer,Personne> map=new HashMap<>();
//		map.put(p1.age,p1);
//		map.put(p2.age,p2);
//		map.put(p3.age,p3);
//		map.put(p4.age,p4);
//
//		TreeMap<Integer,Personne> sorted =new TreeMap<>(map);
//		Set<Integer> keys=sorted.keySet();
//		for(int key:keys){
//			System.out.println(sorted.get(key));
//		}
//		System.out.println(sorted);

      List<Personne> list=new ArrayList<>();
	  list.add(p1);
	  list.add(p2);
	  for(Personne element:list){
		  System.out.println(element);
	  }


	  TreeSet<Integer> set =new TreeSet<>();

	  set.add(5);
	  set.add(1);
	  set.add(20);
	  set.add(3);

	  for(int element : set){
		  System.out.println(element);
	  }

	}

}
