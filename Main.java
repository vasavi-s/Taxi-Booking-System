package taxi.booking;
import java.util.Scanner;
/**
 *
 * @author vasavi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        // TODO code application logic here
        Scanner sc=new Scanner(System.in);            
        Taxi t=new Taxi();
        Customer c=new Customer();
        boolean loop=true;
        while(loop){
            System.out.println("Welcome to taxi booking!");
            System.out.println("1. Taxi Booking");
            System.out.println("2. Taxi Details");
            System.out.println("3. Exit");
            System.out.println("Enter your choice: ");
            int choice=sc.nextInt();
            switch(choice){
            case 1: {
                 t.booking();
                 break;
            }
            case 2:{             
                t.detail();
                break;}
            case 3: {
            loop=false;
            break;}
                    
        }
            
        }
    }    
}
