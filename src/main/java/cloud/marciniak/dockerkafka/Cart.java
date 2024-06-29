package cloud.marciniak.dockerkafka;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<String> products = new ArrayList<>();

    public List<String> getProducts() {
        return products;
    }

    public void setProducts(final List<String> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "products=" + products +
                '}';
    }
}
