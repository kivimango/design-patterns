package creational.singleton;

final class StaticInnerClassSingleton {

    private static final class Inner {
        private static final StaticInnerClassSingleton INSTANCE = new StaticInnerClassSingleton();
    }

    public final static StaticInnerClassSingleton getInstance() {
        return Inner.INSTANCE;
    }

    @Override
    protected final Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
