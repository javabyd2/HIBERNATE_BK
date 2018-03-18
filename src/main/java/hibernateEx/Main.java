package hibernateEx;

import hibernateEx.entity.BookEntity;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;
import java.util.Scanner;

public class Main {

    private static final SessionFactory sessionFactory;

    static{
        try{
            Configuration configuration = new Configuration();
            configuration.configure();
            sessionFactory = configuration.buildSessionFactory();
        } catch(Throwable e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static Session getSession() throws HibernateException{
        return sessionFactory.openSession();
    }

    public static void main(String[] args) {
//        //dodawanie rekordow
//        Session session = getSession();
//        session.beginTransaction();
//
//        BookEntity book;
//
//        for (int i = 0; i < 5; i++) {
//            book = new BookEntity();
//
//            book.setAuthor("Jan");
//            book.setTitle("Title");
//            book.setIsbn("123" + i);
//
//            session.save(book);
//        }
//
//        session.getTransaction().commit();
//        session.close();
//        //koniec dodawania

        //pobieranie rekordow
        Session session = getSession();

        List<BookEntity> books = session.createCriteria(BookEntity.class).list();

        for (BookEntity book : books) {
            System.out.println(book);
        }
        //koniec pobierania

//        //pobieranie rekordow 2
//        Session session = getSession();
//
//        List<BookEntity> books = session.createQuery("FROM " + BookEntity.class.getName()).list();
//
//        for (BookEntity book : books) {
//            System.out.println(book);
//        }
//        //koniec pobierania

    }
}
