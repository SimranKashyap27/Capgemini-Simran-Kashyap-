import java.util.Scanner;

class TaxAmount{
    public double calculateTaxAmount(int ctc){
    	double slab = 0;
    	if(ctc<=180000) {
    		slab = 0;  //A
    	}else if(ctc >=180001 && ctc <= 300000){
    		slab = 0.1;  //B
    	}else if(ctc>=300001 && ctc<=500000) {
    		slab = 0.2; //C
    	}else if(ctc>=500001 && ctc<=1000000) {
    		slab = 0.3; //C
    	}
    	//calculate tax here
    	double tax = ctc*slab;
    	
    	return tax;
    }
}
public class Assignment1Q5 {
    public static void main(String args[]) {
    	System.out.println("Enter the ctc: ");
    	Scanner scan = new Scanner(System.in);
    	int ctc = scan.nextInt();
    	TaxAmount tax = new TaxAmount();
    	System.out.println(tax.calculateTaxAmount(ctc));
    	scan.close();
   }
}
