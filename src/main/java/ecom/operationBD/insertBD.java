package main.java.ecom.operationBD;

import main.java.ecom.modeltableBD.vendedor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class insertBD{

    public static void main(String [] args){

        SessionFactory factory = new Configuration()
                .configure("hibernate.conf.xml")
                .addAnnotatedClass(vendedor.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
            session.beginTransaction();

            session.getTransaction().commit();

            vendedor nuevoVendedor = new vendedor("Manuel", "Ortiz", 1234,1077865374, 311822171);

            session.save(nuevoVendedor);

            System.out.println("El registro fue almacenado en la base de datos");

        }finally {
            factory.close();
        }

    }
}
