package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConfigDB {

    public static Connection objConnection = null;

    public static Connection openConnection(){

        try{
            // Le damos las credenciales para nuestra bd
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/jdbc";
            String user = "root";
            String password = "12345";
            // Establecemos la conexion
            objConnection = (Connection) DriverManager.getConnection(url, user, password);
            System.out.println("me conecté exitosamente");

        } catch (ClassNotFoundException error) {
            System.out.println("driver no instalado"+ error.getMessage());
        } catch (SQLException error){
            System.out.println("error al conectar el la base de datos"+ error.getMessage());
        }
        return  objConnection;


    }

    public static void closeConnection(){
        try{
            if (objConnection != null){
                objConnection.close();
                System.out.println("close succesfully");
            }
        }catch (SQLException error){
            System.out.println("Error"+ error.getMessage());
        }
    }
}
