package assignment;

import java.util.Iterator;
import java.util.Scanner;

public class problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int n=sc.nextInt();
		int arr1[]=new int[n];
		int result[]=new int[10];
		System.out.print("Enter the array elements : ");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i]=sc.nextInt();
		}
		for(int i=1;i<=9;i++) {
			int count=0;
			for(int j=0;j<arr1.length;j++) {
				
				if(arr1[j]%i ==0) {
					count++;
				}
				
			}
			result[i]=count;
		}
		System.out.print("Result : {");
		
		for (int i = 1; i <=9; i++) {
			System.out.print(i +":"+ result[i]+" ");
		}
		System.out.print("}");
	}
	

}
