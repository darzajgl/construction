package zajglic.construction.site.worker;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;
import zajglic.construction.site.HibernateConfiguration;

import java.util.List;

@Component
public class WorkerDao {
    List<Worker> list;

    public void save(Worker worker) {
        Transaction transaction = null;
        try (Session session = HibernateConfiguration.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(worker);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public List<Worker> getWorkers() {
        try (Session session = HibernateConfiguration.getSessionFactory().openSession()) {
            return session.createQuery("FROM  Worker", Worker.class).list();
        }
    }

    public void update(Worker worker) {
        Transaction transaction = null;
        try (Session session = HibernateConfiguration.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.update(worker);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public Worker getWorkerById(Integer worker_id) {
        {
            try (Session session = HibernateConfiguration.getSessionFactory().openSession()) {
                return session.get(Worker.class, worker_id);
            }
        }
    }

    public void delete(Worker workerToDelete) {
        Transaction transaction = null;
        try (Session session = HibernateConfiguration.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.delete(workerToDelete);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
    Worker worker = new Worker(1,"Adam");
}
