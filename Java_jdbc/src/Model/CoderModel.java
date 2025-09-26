package Model;

import Database.CRUD;
import Database.ConfigDB;
import Entity.Coder;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CoderModel implements CRUD {


    @Override
    public Object insert(Object obj) {
        // Abrir conexion
        Connection objConnection = ConfigDB.openConnection();

        // convertir objeto abstracto en coder
        Coder objCoder = (Coder) obj;

        try{
            String sql = "INSERT INTO coder (name, age , clan) VALUES (?,?,?)";

            // Preparar el statement para ingresar los datos, ademas agregar el return generated keys para que devuelva el id generado por la bd
            PreparedStatement objPrepare = objConnection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            // Asignar el valor a los ? ? ?
            objPrepare.setString(1, objCoder.getName());
            objPrepare.setInt(2, objCoder.getAge());
            objPrepare.setString(3, objCoder.getClan());

            // Ejecutar la query
            objPrepare.execute();
            // obtener resultado con los id generados
            ResultSet objRest = objPrepare.getGeneratedKeys();

            while (objRest.next()){
                objCoder.setId(objRest.getInt(1));
            }
            JOptionPane.showMessageDialog(null, "coder was succesfully added");


        }catch (Exception error){
            JOptionPane.showMessageDialog(null, error.getMessage());
        }


        ConfigDB.closeConnection();
        // retornamos el coder creado (mira que la funcion tiene que retornar un coder por eso hay que hacer el return)
        return objCoder;
    }

    @Override
    public List<Object> findAll() {
        // para guardar los coders de la bd
        List<Object> listCoders = new ArrayList<>();
        // generadando la conexion a la bd
        Connection objConnection = ConfigDB.openConnection();
        try {
            // hacemos la sentencia sql
            String sql = "SELECT * FROM coder";
            // Usamos el preparedStatemend que me permite hacer la consulta
            PreparedStatement objPrepare = objConnection.prepareStatement(sql);
            // Ejecutamos el query y lo guardamos en una variable
            ResultSet objResult = objPrepare.executeQuery();

            while (objResult.next()){
                // crear coder para poder agregarlo a lista
                Coder objCoder = new Coder();
                objCoder.setId(objResult.getInt("id"));
                objCoder.setName(objResult.getString("name"));
                objCoder.setAge(objResult.getInt("age"));
                objCoder.setClan(objResult.getString("clan"));
                // Lo agregamos cada coder a la lista de coders
                listCoders.add(objCoder);
            }

        }catch (Exception error){
            JOptionPane.showMessageDialog(null, error.getMessage());
        }
        ConfigDB.closeConnection();


        return listCoders;
    }

    @Override
    public boolean update(Object obj) {
        // Hacer la conexion con la bd
        Connection objConnection = ConfigDB.openConnection();
        // Convertir el objeto generico en un coder
        Coder objCoder = (Coder) obj;

        boolean isUpdated = false;

        try{
            String sql = "UPDATE coder SET name = ?, age = ?, clan = ? where id = ?";
            PreparedStatement objPrepare = objConnection.prepareStatement(sql);

            //Asignar el valor a los parametros de la query
            objPrepare.setString(1, objCoder.getName());
            objPrepare.setInt(2, objCoder.getAge());
            objPrepare.setString(3, objCoder.getClan());
            objPrepare.setInt(4, objCoder.getId());

            // Guardamos el resultado de la bd para verificar si si hubo modificaciones en las columnas
            int result = objPrepare.executeUpdate();

            //Si hubo mas de una columna modificada significa que fue exitoso
            if (result > 0){
                isUpdated= true;
                JOptionPane.showMessageDialog(null, "the coder was updated");
            }
        }catch (Exception error){
            JOptionPane.showMessageDialog(null, error.getMessage());
        }

        ConfigDB.closeConnection();
        // retornamos la varibale previamente definida para saber si fue true o false la actualizacion del coder
        return isUpdated;
    }

    @Override
    public boolean delete(Object obj) {
        // Convertir el objeto en un coder
        Coder objCoder = (Coder) obj;

        Connection objConnection = ConfigDB.openConnection();
        boolean isDeleted = false;

        try {
            String sql = "DELETE FROM coder WHERE id = ?";
            PreparedStatement objPrepare = objConnection.prepareStatement(sql);

            // Paso el id del coder que nos pasaroon por parametros para eliminarlo
            objPrepare.setInt(1, objCoder.getId());

            // Obtengo cuantas columunas fueron afectadas
            int result = objPrepare.executeUpdate();

            // si mas de una columna fue modificada (eliminada) eso significa que fue eliminado
            if(result > 0){
                isDeleted = true;
                JOptionPane.showMessageDialog(null, "coder deleted succesfully");
            }

        }catch (SQLException error){
            JOptionPane.showMessageDialog(null, error.getMessage());
        }

        //Cerrar la conexion
        ConfigDB.closeConnection();

        return isDeleted;
    }

    public Coder findById(int id){
        // Iniciamos la conexion
        Connection objConnection = ConfigDB.openConnection();
        // Empezamos con el coder null
        Coder objCoder = null;

        try {
            // Hacemos la sentencia que necesitamos
            String sql = "SELECT * FROM coder where id = ?;";
            // preparemos el statement y le pasamos la consulta
            PreparedStatement objPrepare = objConnection.prepareStatement(sql);
            objPrepare.setInt(1, id);
            // ejecutamos la query y guardamos el resultado
            ResultSet objResult = objPrepare.executeQuery();

            // verificamos si hay resultados y empezamos a llenar nuestro coder para retornarlo
            if(objResult.next()){
                objCoder = new Coder();
                objCoder.setId(objResult.getInt("id"));
                objCoder.setName(objResult.getString("name"));
                objCoder.setAge(objResult.getInt("age"));
                objCoder.setClan(objResult.getString("clan"));
            }
        } catch (Exception error){
            JOptionPane.showMessageDialog(null, error.getMessage());
        }

        ConfigDB.closeConnection();
        return objCoder;
    }
}
