/**
 * Created by Lenovo on 21.5.2017 г..
 */
import com.dao.PersonDao;
import com.daoimpl.PersonDaoImpl;
import com.entities.Person;
import com.util.ConnectionConfiguration;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class App {

    public static void main(String[] args) {
       /* PURVONACHALNO OSUSHTESTVQVANE NA VRUZKA S BAZATA DANNI
        *  Connection connection = null;

        try{
            connection = ConnectionConfiguration.getConnection();
            if(connection != null){
                System.out.println("Connection established!");
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            if(connection != null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        } */

        PersonDaoImpl pdi = new PersonDaoImpl();

        //pdi.createPersonTable(); - zakomentirame go, poneje veche e suzdadena tablicata

        //Person person = new Person("Maria", "Perez");
        //pdi.insert(person); // zakomentirame go, za da ne dobavqme oshte i oshte hora

        //Person person = pdi.selectById(1);
        //System.out.println(person.getId() + ", " + person.getfName() + ", " + person.getlName());

        //pdi.delete(2);

        //Person person = new Person("Gosho", "Peshov");
        //pdi.update(person, 3);

        List<Person> people = pdi.selectAll();
        for(Person p : people){
            System.out.println(p.getId() + ", " + p.getfName() + ", " + p.getlName() + "\n");
        }

    }
}
