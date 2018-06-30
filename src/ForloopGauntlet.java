
public class ForloopGauntlet {
public static void main(String[] args) {
	//1.
	for (int i = 0; i < 101; i++) {
		System.out.println(i);
	}
	//2.
	for (int i = 100; i >= 0; i--) {
		System.out.println(i);
	}
	//3.
	for (int i = 2; i <= 100 ; i++) {
		if (i%2==0) {
		System.out.println(i);	
		}
		
	}
	//4.
	for (int i = 1; i <= 99 ; i++) {
		if (i%2!=0) {
			System.out.println(i);
		}
	
	}
		//5.
		for (int i = 1; i <= 500; i++) {
			if (i%2==0) {
				System.out.println(i+" is even");
			}
			else {
				System.out.println(i+" is odd");
			}
		}
		//6.
	for (int i = 0; i <= 777; i++) {
		if (i%7==0) {
			System.out.println(i);
		}
	}
	// 7.
	int year = 1878;
	for (int i = 1; i <= 140; i++) {
		year++;
		System.out.println("In "+year+" I was "+i +" years old."  );
	}
}
}

