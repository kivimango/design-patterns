package creational.singleton;

final class ThreadSafeEagerLoadingSingleton {

    private static final ThreadSafeEagerLoadingSingleton INSTANCE = new ThreadSafeEagerLoadingSingleton();

    public static final ThreadSafeEagerLoadingSingleton getInstance() {
        return INSTANCE;
    }

    @Override
    protected final Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
