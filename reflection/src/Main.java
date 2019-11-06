import java.lang.reflect.Field;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException {
        User user = new User(1, "vasya");
        Class<? extends User> userClass = user.getClass();
//        System.out.println(Arrays.toString(userClass.getConstructors()));
        Field[] declaredFields = userClass.getDeclaredFields();
        for (Field field : declaredFields) {
            field.setAccessible(true);
            System.out.println(field);
            System.out.println(field.get(user));
        }
        System.out.println("-------------");
        System.out.println(user.getName());
        System.out.println(user);
        Field name = userClass.getDeclaredField("name");
        name.setAccessible(true);
        name.set(user,"");
        System.out.println(user.getName());
        System.out.println(user);

        handler(user);
    }

    public static void handler(User user) throws IllegalAccessException {
        Class<? extends User> aClass = user.getClass();
        Field[] fields = aClass.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            if (field.isAnnotationPresent(Marker.class)) {
                if(field.getType().toString().equals("class java.lang.String")){
                    String valueOfFieldName = (String)field.get(user);
                    if(valueOfFieldName.isEmpty() || valueOfFieldName == null){
                        Marker annotation = field.getAnnotation(Marker.class);
                        System.out.println(annotation.message());
                    }else{
                        System.out.println("OK");
                    }
                }

            }
        }
    }
}
