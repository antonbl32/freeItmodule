package DAO;

import model.MyBook;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class BookDAO {
    public MyBook findById(int id){
        return HibernateUtil.getSessionFactory().openSession().get(MyBook.class,id);
    }
    public void save(MyBook myBook){
        Session session=HibernateUtil.getSessionFactory().openSession();
        Transaction tr1=session.beginTransaction();
        session.save(myBook);
        tr1.commit();
        session.close();
    }
    public List<MyBook> findAll(){
        List<MyBook> myBooks=(List<MyBook>) HibernateUtil.getSessionFactory().openSession().createQuery("From MyBook").list();
            return myBooks;
    }

}
