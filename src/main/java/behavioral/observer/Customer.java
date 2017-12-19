package behavioral.observer;

import java.util.Observable;
import java.util.Observer;

public final class Customer implements Observer {

    private String email;

    Customer(String email) {
        this.email = email;
    }

    public void update(Observable o, Object arg) {
        sendMail(email, "Product" + toString() + " avaialble again in our webshop!");
    }

    private void sendMail(String email, String title) {}
}
