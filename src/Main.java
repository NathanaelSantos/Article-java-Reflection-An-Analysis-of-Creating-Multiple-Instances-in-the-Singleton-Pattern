import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        LogManager instance = LogManager.getInstance();
        LogManager instance2 = LogManager.getInstance();

        Constructor<LogManager> declaredConstructor = LogManager.class.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);

        LogManager logManager1 = declaredConstructor.newInstance();
        LogManager logManager2 = declaredConstructor.newInstance();

        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());

        System.out.println(logManager1);
        System.out.println(logManager2);
    }
}