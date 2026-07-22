import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
public class weighcalc{

    public void kgtogram(double weigh){
        int weighinkg = (int)weigh;
        double weighingram =(weigh-weighinkg)*1000;

        BigDecimal bd = new BigDecimal(Double.toString(weighingram));
        bd = bd.setScale(2,RoundingMode.HALF_UP);
        double result = bd.doubleValue();

        if(weigh >= 1){
            System.out.println(weighinkg+" kg "+result+"gram");
        }
        else{
            System.out.println(result+" gram");
        }
    }
    public static void main(String [] args){
        System.out.print("Enter the rate per kg: ");
        try (Scanner sc = new Scanner(System.in)){
            
            double rate = sc.nextDouble();
            
            System.out.print("Enter the amount: ");
            int amount = sc.nextInt();
            
            double weigh = amount/rate;
            weighcalc d = new weighcalc();
            d.kgtogram(weigh);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}