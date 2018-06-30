import javax.swing.JOptionPane;

public class Primeornot {
public static void main(String[] args) {







	
		boolean isPrime=true;
	String answer=JOptionPane.showInputDialog("prime or not prime");
	int num = Integer.parseInt(answer);{
	for (int i = 2; i < num; i++) {
		if (num%i==0) {
	
	System.out.println("prime "+num);
	break;
	
	
	}
		
			
	}
	}

}
}



