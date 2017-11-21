package creational.singleton;

/**
 *  Restricts the instantiation of a class to one object.
 *  This is useful when exactly one object is needed to coordinate actions across the system.
 *  The concept is sometimes generalized to systems that operate more efficiently when only one object exists,
 *  or that restrict the instantiation to a certain number of objects.
 *
 *  This version uses lazy initialization, where the instance is created when the static method is first invoked.
 *  Warning: This version is NOT THREAD SAFE !.
 *  If the static method might be called from multiple threads simultaneously,
 *  race conditions that could result in the creation of multiple instances of the class.
 *
 *  Examples:
 *  - Database Connector
 *  - Window manager
 *  - Printer queue
 */

public final class Singleton {

    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
