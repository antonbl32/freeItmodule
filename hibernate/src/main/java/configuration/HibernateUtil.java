package configuration;

import model.MyBook;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

//singleton
public class HibernateUtil {
    public static SessionFactory sessionFactory;

    private HibernateUtil() {
    }
    public static SessionFactory getSessionFactory(){
        if(sessionFactory==null){
            try{
                Configuration configuration=new Configuration().configure();
                configuration.addAnnotatedClass(MyBook.class);
                StandardServiceRegistryBuilder builder=new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
                sessionFactory=configuration.buildSessionFactory(builder.build());
            }catch (Exception e){
                System.out.println("Ошибочка sql " +e);
            }
        }
        return sessionFactory;
    }
}