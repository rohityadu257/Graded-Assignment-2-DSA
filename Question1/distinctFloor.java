package com.greatlearning.assignment;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;


	class MyComparator implements Comparator<Object>
	{
		public int compare(Object obj1,Object obj2)
		{
			Integer i1 =(Integer)obj1;
			Integer i2 =(Integer)obj2;
			return i2.compareTo(i1);
		}
	}

public class distinctFloor {
	
	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Floors");
		int n = sc.nextInt();
		int max =n;
		int i;
		Queue<Integer> queue = new PriorityQueue<Integer>(new MyComparator());
		
		int Floor[] = new int[n];
		for (i=0;i<n;i++)
		{
			System.out.println("Enter the Floor Size given on the day :" + (i+1));
			Floor[i] = sc.nextInt();
		}
		System.out.println("The Order of construction is as follows");
		for(i=0;i<n;i++)
		{
			queue.add(Floor[i]);
			System.out.println("Day :" +(i+1));
			while(!queue.isEmpty() && queue.peek() == max)
			{
				Object removed =queue.remove();
				System.out.print(removed + " ");
				max--;
				}
			System.out.println();
		}
		sc.close();	
	}
	

}
