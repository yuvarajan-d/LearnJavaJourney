package array;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
//		int[] arr=new int[10];
//		for(int i=0;i<arr.length;i++) {
//			System.out.println("Enter your data limit is 10: "+i);
//			arr[i]=sc.nextInt();
//					
//		}
//		for(int display:arr) {
//			System.out.println("Data: "+display);
//		}
//		
//		String[] products=new String[10];
//		for(int i=0;i<products.length;i++) {
//			System.out.println("Enter "+i+" product: ");
//			products[i]=sc.nextLine();
//		}
//		for(String product:products) {
//			System.out.println("Arrivals: "+product);
//		}
		
		//--------------------------------------------------------------------------------------
		
//		// Two Dimensional Array
//		System.out.println("Enter your row size: ");
//		int row=sc.nextInt();
//		System.out.println("Enter your col size: ");
//		int col=sc.nextInt();
//		int data[][] = new int[row][col];
//		
//		for(int i=0;i<row;i++) {
//			for(int j=0;j<col;j++) {
//				System.out.println("Index: Row: "+i+" Column: "+j);
//				data[i][j]=sc.nextInt();
//			}
//		}
//		
//		for(int i=0;i<row;i++) {
//			for(int j=0;j<col;j++) {
//				System.out.println("Index: Row: "+i+" Column: "+j+" = "+data[i][j]);
//			}
//		}
		
		//------------------------------------------------------------------------------------------
		
		
		//jagged array
//		int[][] value=new int[3][];
//		
////		value[0]=new int[2];
////		value[1]=new int[3];
////		value[2]=new int[1];
//		
//		for(int i=0;i<value.length;i++) {
//			System.out.println("Row: "+(i+1));
//			int colsize=sc.nextInt();
//			value[i]=new int[colsize];
//		}
//		
//		for(int i=0;i<value.length;i++) {
//			for(int j=0;j<value[i].length;j++) {
//				System.out.println("Row: "+i+"Col: "+j);
//				value[i][j]=sc.nextInt();
//			}
//		}
//		
//		for(int[] jagged:value) {
//			for(int d:jagged) {
//				System.out.print(d+" ");
//			}
//			System.out.println();
//		}
		
		
//		String[][] products=new String[2][];
//		
//		for(int i=0;i<products.length;i++) {
//			System.out.println("Row: "+(i+1));
//			int colsizes=sc.nextInt();
//			products[i]=new String[colsizes];
//		}
//		
//		for(int i=0;i<products.length;i++) {
//			for(int j=0;j<products[i].length;j++) {
//				System.out.println("Row: "+i+" Col: "+j);
//				products[i][j]=sc.next();
//			}
//		}
//		
//		for(String[] jagged:products) {
//			for(String p:jagged) {
//				System.out.print(p+" ");
//			}
//			System.out.println();
//		}
//		
		//---------------------------------------------------------------------------------------------
		
		// Three Dimensional Array
		
		System.out.println("Enter the No. of block: ");
		int block=sc.nextInt();
		System.out.println("Enter row: ");
		int row=sc.nextInt();
		System.out.println("Enter col: ");
		int col=sc.nextInt();
		int[][][] arr=new int[block][row][col];
//		System.out.println(arr[0][0].length);
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("Block: "+i+" Row: "+j+" Col: "+k);
					arr[i][j][k]=sc.nextInt();
				}
				
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("Block: "+i+" Row: "+j+" Col: "+k+" = "+arr[i][j][k]);
				}
				
			}
		}
		
		
		
		sc.close();
	}

}
