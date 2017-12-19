package behavioral.observer;

import java.util.Observable;

final class Product extends Observable {

    private String name;

    private boolean inStock;

    Product(String name, boolean inStock) {
        this.name = name;
        this.inStock = inStock;
    }

    final boolean isInStock() {
        return inStock;
    }

    final void setInStock(boolean inStock) {
        this.inStock = inStock;
        if(isInStock()) super.notifyObservers("Product is available again in our web shop!");
    }

}
