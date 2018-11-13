package EX1;

import java.util.Scanner;

public class Ex1 {
	
	int[] t;
	int n = 0, s = 0, p = 1, avg = 0, var = 0, smlv = 0, lrgv = 0;
	
	public Ex1() {
		input();
		sum();
		product();
		average();
		variance();
		larg_small_value();
		print();
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input an integer between 1 & 100 : ");
		n = sc.nextInt();
		while(n>100 || n<1) {
			System.out.println("Out of range Please input an integer between 1 & 100 : ");
			n = sc.nextInt();
		}
		t = new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("T["+i+"] = ");
			t[i] = sc.nextInt();
		}
	}
	
	public void sum() {
		for(int i=0; i<n; i++) {
			s+=t[i];
		}
	}
	
	public void product() {
		for(int i=0; i<n; i++) {
			p*=t[i];
		}
	}
	
	public void average() {
		avg = (int) (s/n);
	}
	
	public void variance() {
		int sm = 0;
		for(int i = 0; i<n; i++) {
			sm+=Math.pow((t[i]-avg),2.0);	
		}
		var = (int) (sm/(n-1));
	}
	
	public void larg_small_value() {
		smlv = lrgv = t[0];
		for(int i = 1; i<n; i++) {
			if(lrgv < t[i])
				lrgv = t[i];
			if(smlv > t[i])
				smlv = t[i];
		}
	}
	
	public void print() {
		System.out.print("T = [");
		for(int i = 0; i<n-1; i++) 
			System.out.print(""+t[i]+", ");
		System.out.println(""+t[n-1]+"]");
		System.out.println("Sum = "+s);
		System.out.println("Product = "+p);
		System.out.println("Average = "+avg);
		System.out.println("Variance = "+var);
		System.out.println("Largest_value = "+lrgv);
		System.out.println("Smallest_value = "+smlv);
	}
	
	public static void main(String[] args) {
		new Ex1();
	}

}
