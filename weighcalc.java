import java.util.Scanner;
public class weighCalc{

    public void kgtogram(double weigh){
        double totalgram = Math.round(weigh*1000*100.0)/100.0;
        int weighinkg = (int)(totalgram/1000);

        double weighingram =totalgram%1000;
        String formatted = String.format("%.2f", weighingram);
        
        if(weighinkg >= 1){
            System.out.println(weighinkg+" kg "+formatted+"gram");
        }
        else{
            System.out.println(formatted+" gram");
        }
    }
    public static void main(String [] args){
        System.out.print("Enter the rate per kg: ");
        try (Scanner sc = new Scanner(System.in)){
            
            double rate = sc.nextDouble();
            while(rate <= 0.0){
                System.out.print("Rate must be positve! Enter rate per kg: ");
                rate = sc.nextDouble();
            }
            
            System.out.print("Enter the amount: ");
            double amount = sc.nextDouble();
            while(amount<0.0){
                System.out.print("Amount must be greater than zero! Enter the correct amount.");
                amount = sc.nextDouble();
            }
            
            double weigh = amount/rate;
            weighCalc d = new weighCalc();
            d.kgtogram(weigh);
        } catch (Exception e) {
            System.out.println("Invalid values");
        }
    }
}