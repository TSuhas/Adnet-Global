package Practise;

public class addition {

	public static void main(String[] args) {
		int a= 100+50;
		int b= 200+40;
		int c = a+b;
		System.out.println(c);
		if( a!=b) {
			System.out.println("a and b are different");
		}
		else {
			System.out.println(" a and b are same");
			
			
			
		}
		String x="10";
		String y= "20";
		String z= x+y;
		System.out.println(z);
		
		
		
		char cr = 'A';
		switch(cr) {
		case  'A': {
			System.out.println("Today is Monday");
			break;
		}
		case 'B':{
		System.out.println("Today is Tuesday");	
		break;
		}
		case 'C' :{
			System.out.println("Today is wedenesday");
			break;
		}
		case 'D' :{
			System.out.println("today is Thursday");
			break;
		}
		case 'E': {
			System.out.println("Today is Friday");
			break;
		}
		case 'F': {
			System.out.println("Today is saturday");
			break;
			
		}
		case 'G' : {
			System.out.println("Today is sunday");
			break;
			
		}
		default :{
			System.out.println("Wrong input");
			break;
		}
		}
		
		int marks = 55;
		if(marks>= 66) {
			System.out.println("You are in afirst class");
		}
		else if (marks>=50) {
			System.out.println("You are in second class");
		}
		else if (marks>=35) {
			System.out.println("You are pass");
		}
		else {
			System.out.println("You are fail");
		}
		
		
		
		
		
		
		for(int i=0; i<=100; i=i+1) {
			System.out.print(i+" " );
			
		}
		for(int s= 1; s<=5; s++) {
			
			System.out.print("Yes");
			System.out.println();
		}
		// printing array 
		int[][] num= {{1,2,3}, {5,6,7}, {3,5,7}, {5,7,9}};
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num[i].length; j++) {
				System.out.print(num[i][j]+" ");
			}
			System.out.println();
		}
		
		//print array using string
		String[][] name= {{"suhas", "nikhil", "shital"}, {"shahid", "akbar", "roshan"}};
		for(int i=0; i<name.length; i++) {
			for(int j=0; j<name[i].length; j++) {
				System.out.print(name[i][j]+" ");
			}
			System.out.println();
		}
		
		
			
		
		
		}
	}
	
	
	
	

