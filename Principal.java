import java.io.*;
import java.util.Random;

public class Principal {

    int random_num(){
        Random num_random = new Random();
        int new_number = num_random.nextInt((5000 - 1) +1);
        return new_number;
    }

    public static void main(String [] args) throws IOException{
        CCSVManage ob = new CCSVManage();
        Principal n = new Principal();
        CSort_algorithms sortAlgorithms = new CSort_algorithms();
        CBusqueda_binaria busquedaBinaria = new CBusqueda_binaria();
        CBruteForce bruteForce = new CBruteForce();
        //bruteForce.bruteForce();

        //Store randoms numbers into file.
        for (int i = 0; i < 5000; i++) {
            ob.writeCSV("test.csv", i, n.random_num());
        }
        int [] sortedArray = ob.readCSV("test.csv", 5000);
        System.out.println("\nArray with random numbers...");
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i] + ", ");
        }

        System.out.println("\nSorting with bubble sort...");
        sortAlgorithms.bubble_sort(sortedArray);
        for (int k = 0; k < sortedArray.length; k++) {
            System.out.print(sortedArray[k] + ", ");
        }

        System.out.println("\nBinary search..." + busquedaBinaria.busqueda_binaria(sortedArray,1178));




    }
}