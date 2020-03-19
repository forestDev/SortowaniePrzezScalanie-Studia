
import java.util.List;
import java.util.ArrayList;
import forestDevPackage.Car;
import forestDevPackage.MyMergeSortAlgorithm;
import java.util.Scanner;

public class MergeSort {

    public static void main(String[] args) {

        int i;
        List<Car> cars = new ArrayList<>();
        Scanner scan = new Scanner(System.in);  
        
        System.out.println("Sortowanie listy pojazdow wedlug: ");
        System.out.println("0-Pojemnosci silnika");
        System.out.println("1-Marki");
        System.out.println("2-Koloru");

        int indexSort = scan.nextInt();
        scan.close();

        cars.add(new Car(2.5, 3, 1));   // Car(poj.silnika, indexMarki[0-4], indexKoloru [0-5])
        cars.add(new Car(1.2, 4, 2));   
        cars.add(new Car(2.8, 1, 3));
        cars.add(new Car(3.2, 1, 5));
        cars.add(new Car(3.2, 3, 1));
        cars.add(new Car(1.2, 4, 2));
        cars.add(new Car(2.8, 2, 3));
        cars.add(new Car(2.2, 4, 5));
        cars.add(new Car(1.8, 4, 1));
        cars.add(new Car(1.2, 4, 2));
        cars.add(new Car(2.8, 3, 5));
        cars.add(new Car(3.2, 2, 4));

        System.out.println(cars.size());
        
        double tab[][] = new double[cars.size()][cars.size()];

        System.out.println(cars.size());
        for(int a = 0; a < cars.size(); a++){
                tab[a][0] = cars.get(a).getYear();
                tab[a][1] = cars.get(a).getModelIndex();
                tab[a][2] = cars.get(a).getColorIndex();
        } 
        MyMergeSortAlgorithm sort = new MyMergeSortAlgorithm(tab, indexSort);
        int val = sort.getN();
        double[][] tablica = tab;
        
        
        System.out.println(tablica.length);

        System.out.println(tablica.length);
        System.out.println(tablica[0][0]);
        System.out.println(tablica[0][1]);
        System.out.println(tablica[0][2]);
        
        

        String[] colors = {
            "czerwony", // 0
            "czarny",  // 1
            "fioletowy", // 2
            "granatowy", // 3
            "niebieski" ,// 4 
            "zielony" // 5
        };
        String[] carModels = {
            "Audi",  //0
            "BMW", //1
            "Citroen",  //2
            "Opel",  //3
            "Peugeot",  //4
        };
        String[] sortMethod = {
            "pojemnosci silnika", //0
            "marki auta",   //1
            "koloru auta" ,   //2
        };
        System.out.println("Zbior wszystkich aut:");
        for (i = 0; i < val; i++) {
                System.out.println("Model: " + carModels[(int)tablica[i][1]] + ", kolor: " + colors[(int)tablica[i][2]] + ", pojemnosc silnika: " + tablica[i][0]);
        }

        sort.firstSort(0, val-1); 

        System.out.println("\n\nZbior wszystkich posortowanych aut wzgledem " + sortMethod[indexSort] +":\n");
        for (i = 0; i < val; i++) {
                System.out.println("Model: " + carModels[(int)tablica[i][1]] + ", kolor: " + colors[(int)tablica[i][2]] + ", pojemnosc silnika: " + tablica[i][0]);
        }
        System.out.println();

    }

}


