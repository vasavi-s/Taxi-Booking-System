/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taxi.booking;
/**
 *
 * @author vasavi
 */
import java.util.*;
public class Taxi {
    static int id=0,nooftaxi=4;
    int t1=0,t2=0,t3=0,t4=0;
    ArrayList<Character> points = new ArrayList<>();
    HashMap<Integer, Character> taxis=new HashMap();
    ArrayList<Integer> earnings=new ArrayList<>();
    ArrayList<Customer> taxi1=new ArrayList<>();
    ArrayList<Customer> taxi2=new ArrayList<>();
    ArrayList<Customer> taxi3=new ArrayList<>();
    ArrayList<Customer> taxi4=new ArrayList<>();

    Taxi(){
        points.add('A');
        points.add('B');
        points.add('C');
        points.add('D');
        points.add('E');
        points.add('F');
        
        taxis.put(1,points.get(0));
        taxis.put(2,points.get(0));
        taxis.put(3,points.get(0));
        taxis.put(4,points.get(0));
    }
    
    int bookId;
    void booking(){
        Customer c=new Customer();
        c.enterdetails();
        int temp=taxis.get(1);
        if(taxis.get(id)==points.get(id) && (taxis.get(temp) == points.get(id))){
            if(t1<=t2 || t1<=t3 || t1<=t4){
                taxis.put(id,(c.drop));
                earning(c);
                taxi1.add(c);
                bookId=c.customerId;
            }
            else if(t2<=t3 || t2<=t4){
                taxis.put(id,(c.drop));
                earning(c);
                taxi2.add(c);
                bookId=c.customerId;
            }
            else if(t3<=t4){
                taxis.put(id,(c.drop));
                earning(c);
                taxi3.add(c);
                bookId=c.customerId;
            }
            else{
                taxis.put(id,(c.drop));
                earning(c);
                taxi4.add(c);
                bookId=c.customerId;
            }
        }
        
//            taxis.put(id,(c.drop));
//            earning(c);
//            details.add(c);
//x`x`//            System.out.println("Taxi is alloted");
        
    }
    void earning(Customer c){
        int distance=Math.abs((c.drop-'A') - (c.pickup-'A'));
        int total= ((distance*15)-5)*10 + 100;
        earnings.add(total);
        c.setEarning(total);
    }
    void detail(){
        if(taxi1.isEmpty()!=true){
        for (Customer c : taxi1) {
        System.out.println("Booking id: "+bookId+"\nCustomer id: " + c.getCustomerId() +
                "\nPickup point : " + c.getPickup() +
                "\nDrop point : " + c.getDrop() +
                "\nAmount : " + c.getEarning()+
                "\n----------------------");
    }
        }
        if(taxi2.isEmpty()!=true){

        for (Customer c : taxi2) {
        System.out.println("Booking id: "+bookId+"\nCustomer id: " + c.getCustomerId() +
                "\nPickup point : " + c.getPickup() +
                "\nDrop point : " + c.getDrop() +
                "\nAmount : " + c.getEarning()+
                "\n----------------------");
    }
        }
        if(taxi3.isEmpty()!=true){
        for (Customer c : taxi3) {
        System.out.println("Booking id: "+bookId+"\nCustomer id: " + c.getCustomerId() +
                "\nPickup point : " + c.getPickup() +
                "\nDrop point : " + c.getDrop() +
                "\nAmount : " + c.getEarning()+
                "\n----------------------");
    }}
    if(taxi4.isEmpty()!=true){
        for (Customer c : taxi4) {
        System.out.println("Booking id: "+bookId+"\nCustomer id: " + c.getCustomerId() +
                "\nPickup point : " + c.getPickup() +
                "\nDrop point : " + c.getDrop() +
                "\nAmount : " + c.getEarning()+
                "\n----------------------");
    }
    }
        
    }
}
