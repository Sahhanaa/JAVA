import java.lang.reflect.Field;

public class ReflectionInjector {

    public static void inject(Object obj) throws Exception {

        Field[] fields = obj.getClass().getDeclaredFields();

        for (Field field : fields) {

            if (field.isAnnotationPresent(Inject.class)) {

                String className = field.getType().getName();

                Class<?> cls = Class.forName(className);

                Object dependency = cls.newInstance();

                field.setAccessible(true);

                field.set(obj, dependency);
            }
        }
    }
}