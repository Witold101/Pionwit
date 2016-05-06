
import by.poland.pionwit.HibernateUtil;
import by.poland.pionwit.db.user.User;
import org.hibernate.Session;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//        Session session = null;
//        session = HibernateUtil.getSessionFactory().openSession();
//        session.beginTransaction();

        // Add new Status object
//        Statuses status = new Statuses();
//        status.setName("admin");
//        status.setOpis("Выссший статус");
//
//        session.saveOrUpdate(status);
//

//        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
//        session.beginTransaction();
//        ArrayList<Statuses> result = (ArrayList<Statuses>) session.createQuery("from Statuses").list();
//        session.getTransaction().commit();
//        session.close();

        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        ArrayList<User> result = (ArrayList<User>) session.createQuery("from User").list();
        for (User rez : result) {
            System.out.println(rez.getStatuses().getName());
        }
        session.getTransaction().commit();
       // session.close();

        ApplicationContext context = new ClassPathXmlApplicationContext("application_context.xml");
    }
}