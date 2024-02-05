/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taxi.booking;
import java.util.Scanner;
/*
 *
 * @author vasavi
 */
public class Customer {
    public
    Scanner sc=new Scanner(System.in);
    static int id=1;
    int customerId,time,earning=0;
    char pickup, drop;
    void enterdetails(){
        customerId=id++;
        System.out.println("Customer ID: "+customerId);
        System.out.println("Pickup point: ");
        pickup=sc.next().charAt(0);
        System.out.println("Drop point: ");
        drop=sc.next().charAt(0);
        System.out.println("Pickup time: ");
        time=sc.nextInt();
    }

    public int getCustomerId() {
        return customerId;
    }

    public int getTime() {
        return time;
    }

    public char getPickup() {
        return pickup;
    }

    public char getDrop() {
        return drop;
    }

    public int getEarning() {
        return earning;
    }

    public void setEarning(int earning) {
        this.earning = earning;
    }    
}
