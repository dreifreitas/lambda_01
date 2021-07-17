package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.UK);

        Product pdt1 = new Product("Tv", 1200.00);
        Product pdt2 = new Product("Smartphone", 5000.00);
        Product pdt3 = new Product("Notebook", 1500.00);

        List<Product> products = new ArrayList<>();
        products.add(pdt1);
        products.add(pdt2);
        products.add(pdt3);
    
        products.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

        for (Product p : products) {
            System.out.println(p);
        }
    }

}
