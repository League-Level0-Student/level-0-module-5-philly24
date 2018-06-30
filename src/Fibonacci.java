
public class Fibonacci {
public static void main(String[] args) {

int num[] = new int[13];
num[0] = 0;
num[1] = 1;
System.out.print(num[0]+", "+num[1]+", " );
	for (int i = 2; i < 13; i++) {
	
		num[i] = num[i-1]+ num[i-2];
		
		if (i==12) {
		System.out.print(num[i]);
	
		

	}else {
		System.out.print(num[i]+", ");
	}	
	
	}
	
}

}




