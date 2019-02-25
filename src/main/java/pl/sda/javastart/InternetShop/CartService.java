package pl.sda.javastart.InternetShop;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CartService {

    private Map<Long, Cart> carts = new HashMap<>();
    private Map<Long, List<Cart>> oldCarts = new HashMap<>();

    public void addProduct(Product product) {
        Cart currentCart = getCart();//najpierw tworzymy koszyk
        currentCart.addProduct(product);//dodajemy znaleziony i wybrany produkt do koszyka
        addCartToMap(currentCart);// i ten koszyk dodajemy do kolekcji koszyków
    }

    public void removeProduct(Product product){
        Cart currentCart = getCart();
        currentCart.removeProduct(product);
        addCartToMap(currentCart);
    }

    public Set<CartProduct> getCartProducts(){ // jak to działa
        return getCart().getCartProducts();
    }

    public Cart getCart() {
        return carts.getOrDefault(MainShop.user.getId(), new Cart(MainShop.user));// to dla danego usera tworzy koszyk chyba???
    }

    private void addCartToMap(Cart newCart){
        carts.put(MainShop.user.getId(),newCart);
    } // co to robi??
}
