package HibernateTeste;

import modelo.Usuario;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UsuarioTeste {

    public static void main(String[] args) {

        Usuario usu = new Usuario();
        usu.setId(1);
        usu.setNome("Leandro");
        
        SessionFactory factory = (SessionFactory) new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();
        
        session.save(usu);
        session.getTransaction().commit();
        
        session.close();
    }

}
