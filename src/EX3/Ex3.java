package EX3;

public class Ex3 {

	public static void main(String[] args) {
		
		for(int i = 0; i<101; i++) {
			//F1
			System.out.println("2*"+i+" = "+2*i);
			//F2
			System.out.println(""+i+"^1/2 = "+Math.pow(i,(1.0/2)));
			//F3
			System.out.println("10^"+i+" = "+Math.pow(10, i));
			//F4
			System.out.println(""+i+"^3 = "+Math.pow(i, 3));
			//F5
			if(i!=0)
				System.out.println("2^1/"+i+" = "+Math.pow(2, (1.0/i)));
			//F6
			System.out.println("e^"+i+" = "+Math.exp(i));
		}

	}

}
