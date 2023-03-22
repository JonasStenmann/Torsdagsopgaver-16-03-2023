package Opgave1;

import java.util.ArrayList;
public class Main {

    public static ArrayList<Customer> customers = new ArrayList<>();
    public static void main(String[] args){

        customers.add(new Customer ("Jonas", "Jørgensen", "JonasJ"));
        customers.add(new Customer ("Mikkel", "Hansen", "MikkelH"));
        customers.add(new Customer ("Noah", "Rasmussen", "NoahR"));
        customers.add(new Customer ("Albert", "Iversen", "AlbertI"));
        customers.add(new Customer ("Hannibal", "Larsen", "HannibalL"));
        customers.add(new Customer ("Bo", "Hansen", "BoH"));

        printCustomers();
    }
        public static void printCustomers(){
            for(Customer c: customers){
                System.out.println(c);
            }
        }

}
