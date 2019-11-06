import entity.Car;
import entity.Passport;
import entity.User;
import entity.Wash;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("aaa");
        EntityManager manager = factory.createEntityManager();
        manager.getTransaction().begin();

//        User sofiia = User.builder().name("Sofiia").build();
//        manager.persist(sofiia);
//        User oleh = User.builder().name("Oleh").build();
//        manager.persist(oleh);

//        User user = manager.find(User.class, 1);
//        System.out.println(user);

//        TypedQuery<User> query = manager.createQuery("select u from User u", User.class);
//        List<User> userList = query.getResultList();
//        for (User user : userList) {
//            System.out.println(user);
//        }

//        Passport passport = Passport.builder().serialNumber("123").build();
//        manager.persist(passport);
//        User user = manager.find(User.class, 1);
//        passport.setUser(user);

//        Passport passport = Passport.builder().serialNumber("456").build();
//        manager.persist(passport);
//        passport.setUser(manager.find(User.class, 2));

//        TypedQuery<User> query = manager.createQuery("select u from User u left join  fetch " +
//                "u.passport", User.class);
//        List<User> resultList = query.getResultList();
//        for (User user : resultList) {
//            System.out.println(user + " " + user.getPassport());
//        }

//        User user = manager.find(User.class, 1);
//        Car car1 = Car.builder().model("suba").build();
//        Car car2 = Car.builder().model("tuba").build();
//        manager.persist(car1);
//        manager.persist(car2);
//        car1.setUser(user);
//        car2.setUser(user);

//        Wash wash1 = Wash.builder().title("Mr.Propper").build();
//        Wash wash2 = Wash.builder().title("Mr.Cleaner").build();
//        manager.persist(wash1);
//        manager.persist(wash2);

//        Wash wash = manager.find(Wash.class, 1);
//        List<Car> cars = manager.createQuery("from Car c", Car.class).getResultList();
//        wash.setCars(cars);

//        List<User> users = manager.createQuery("select distinct u from User u left join " +
//                "fetch u.passport left join fetch u.cars", User.class).getResultList();
//        for (User user : users) {
//            System.out.println(user);
//        }

//        manager.remove(manager.find(User.class, 1));

        manager.getTransaction().commit();
        manager.close();
        factory.close();
    }
}
