package com.gl.javafsd.paymoney;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of transaction array");
		int size=sc.nextInt();
		System.out.println("enter the values of array");
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the total no of targets that needs to be achieved");
		int noOfTargets=sc.nextInt();
				for(int i=0;i<noOfTargets;i++) {
					System.out.println("enter the value of target");
					int target=sc.nextInt();
					TargetDeterminator obj=new TargetDeterminator(arr,target);
					obj.determine();
				}
	}

}
