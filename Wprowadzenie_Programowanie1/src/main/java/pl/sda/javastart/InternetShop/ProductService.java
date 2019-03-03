package pl.sda.javastart.InternetShop;

import java.util.*;

public class ProductService {
    private List<Product> products = new ArrayList<>();

    public void showListOfProducts() {
        products.stream()
                .map(Product::view)
                .forEach(System.out::println);
    }

    public Optional<Product> getById(Long id) {
        return products.stream()
                .filter(product -> product.getId().equals(id))
                .findAny();  // dlaczego to się kończy findAny?? bo chyba daje odpowiedź czy jest czy nie takie id, wynik jest w Optionalu
    }

    public void addAll(Product... products) {
        this.products.addAll(Arrays.asList(products));//wykonaliśmy na liscie products metodę addAll z interfejsu List to nie jest ta nasza metoda oczywiście
    }//jeśli powyżej nie użyjemy this to Inetlij nie domyślij się o co nam chodzi
}
