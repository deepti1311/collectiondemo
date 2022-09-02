package io.tntra.collectiondemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CollectiondemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CollectiondemoApplication.class, args);

		//creating an empty linkedlist

		Collection<String> list= new LinkedList<String>();


        //add() method
		list.add("nidhi ");
		list.add("ragini ");
		list.add("priyanka ");

		
		System.out.println("\nThe list is: "+list);

        //adding new elements to the end
		list.add("deepti ");
		list.add("mansi ");

		System.out.println("\nthe new list is: "+list);



		//remove a particular element
		list.remove("deepti ");
		System.out.println("\nlist after removing element is: "+list);



		//converting list to an array
		String[] str=list.toArray(new String[0]);

		//iterating over elements of array
        System.out.println("\nlist converted to array : ");
		for (int i=0;i<str.length;i++)
		{
			String data=str[i];


			System.out.print(data);
		}

		




		//creating an empty array list with an initial capacity
		Collection<Integer> list1= new ArrayList<Integer>(5);


		list1.add(12);
		list1.add(167);
		list1.add(123);
		list1.add(121);
		list1.add(182);
	

		for (Integer integer : list1) {
			System.out.println("\nnumber: "+integer);
			
		}

		//creating an empty Arraylist
		Collection<Integer> list2=new ArrayList<Integer>();
        //adding list1 in empty array list2 
		//i.e., appending the collection 
		list2.addAll(list1);


		System.out.println("\nthe new array list is :"+list2);


		//creating an iterater for the list 2
		//using iterater() method

		Iterator<Integer> iter=list2.iterator();


		System.out.println(" \n the iterator values of the list are:");

		while(iter.hasNext()){
			System.out.println(iter.next()+" ");
		}


        //creating object hashset
		Collection<Integer> set= new HashSet<Integer>();

		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);


		System.out.println("\n initial set :"+set);



		//removing a particular element
		set.remove(1);

		System.out.println("\nset after removing element 1 is :"+set);


		//creating another obj of hashset
        //creating a collection set to remove from set1
		Collection<Integer> set2=new HashSet<Integer>();


		set2.add(2);
		set2.add(4);


		System.out.println("\nset2 created is :"+set2);


		//removing all element of set2 from set1

		set.removeAll(set2);

		System.out.println("\nafter removing all the elements of the set2 from set1 :"+set);





		//removing all element
		set.removeAll(set);
		System.out.println("\n removed all element of set "+set);









	}

}
