package Opgave2;

import Opgave1.Customer;
import java.io.File;
import java.io.FileNotFoundException


import java.util.ArrayList;

public class Cafe {
    public static ArrayList<String> coffeMenu = new ArrayList<>();
    public void loadMenuData() {
        File file = new File("coffees.txt");
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()){

            nextLine(scanner)
        }

    }catch(FileNotFoundException e){
        System.out.println("File not found. Check path and filename");

    }
}
