public class StaticSingleton {
    private static StaticSingleton instance;

    static {
        try {
            instance = new StaticSingleton();
        } catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    private StaticSingleton(){}

    public static StaticSingleton getInstance() {
        return instance;
    }
}
