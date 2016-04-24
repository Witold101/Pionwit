
import by.poland.pionwit.HibernateUtil;
import by.poland.pionwit.db.user.Statuses;
import org.hibernate.Session;

public class Main {

    public static void main(String[] args) {
        Session session = null;
        session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

//        // Add new Status object
        Statuses status = new Statuses();
        status.setName("admin");
        status.setOpis("Выссший статус");

        session.saveOrUpdate(status);

        session.getTransaction().commit();
       session.close();
    }
}