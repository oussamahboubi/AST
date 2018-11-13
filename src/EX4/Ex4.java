package EX4;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		double pie = 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Input number of diameter : ");
		double x = sc.nextInt();
		System.out.print("Input number of digits : ");
		int nbr = sc.nextInt();
		long mult = (long) Math.pow(10, nbr);
		double r = x/2; //Radius
		System.out.println("Circumference without precision = "+Math.PI*2*r);
		System.out.println("Area without precision = "+Math.PI*r*r);
		double z, y, d;
		int total = 1, circle = 1;
		do { 
			// We should compute number of points in the circle and in the square 
			z = Math.random()*(r-1)+1; 
			y = Math.random()*(r-1)+1;
			d = Math.sqrt(z*z+y*y);
			if(d<r)
				circle++;
			total++;
		}while(total!=10000);
		
		//Ratio = pi*r^2 / 4*r^2 = pi / 4
		//Pie = 4 * number of points in the circle / total (4 * ratio)
		pie = (double) 4 * ((double)circle/(double)total);
		long c = (long)(pie*mult);
		double pie_prec = (double)c/mult;
		System.out.println("Pie = "+pie_prec);
		System.out.println("Circumference with precision = "+pie_prec*2*r);
		System.out.println("Area with precision = "+pie_prec*r*r);
		
	}

}
