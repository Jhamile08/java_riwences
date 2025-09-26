package Controller;

import Entity.Coder;
import Model.CoderModel;

import javax.swing.*;

public class CoderController {

    public static void create(){
        // Usamos el modelo
        CoderModel objCoderModel = new CoderModel();

        // Pedir los datos al usuario
        String name = JOptionPane.showInputDialog("Give me a name");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Give an age"));
        String clan = JOptionPane.showInputDialog("Give me a clan");

        // Creamos el coder para asignarle los datos y luego pasarlo a la funcion
        Coder objCoder = new Coder();

        //Vamos llenando con los datos que tenemos (recordemos que el id se lo pone la bd en la logica del model)
        objCoder.setName(name);
        objCoder.setAge(age);
        objCoder.setClan(clan);

        // el insert devuelve un objeto generico y por eso lo casteamos para que sea tipo coder y objCoder quede con un coder y no con un objeto generico
        objCoder = (Coder) objCoderModel.insert(objCoder);

        //Mostramos el coder creado
        JOptionPane.showMessageDialog(null, objCoder.toString());

    }
    public static void getAll(){
        // Llamamos al modelo para acceder a los metodos
        CoderModel coderModel = new CoderModel();

        // Creamos como un titulo para mostrar todos los coders
        String listCoders = "List coders \n";

        // Recorremos todos los coders
        for (Object i : coderModel.findAll()){
            // Convertimos cada objeto a coder(recordemos que el findAll me devulve una lista generica y por eso la tengoo que castear a coder)
            Coder objCoder = (Coder) i;
            // Concatenamos el titulo con los toString de los coders que nos permite ver la info
            listCoders += objCoder.toString() + "\n";
        }
        // ya luego del for la lista debe de tener todos los coders y la mostramos
        JOptionPane.showMessageDialog(null, listCoders);
    }

    public static void delete(){
        // Llamamos al modelo para acceder a los metodos
        CoderModel coderModel = new CoderModel();

        // Llamamos la funcion getall para traer todos los coders antes de pedir el id
        getAll();

        //Pedimos el id del coder que queremos eliminar
        int idDelete = Integer.parseInt(JOptionPane.showInputDialog("enter the coder id"));

        // Le pasamos el id a la funcion findById para encontrar el coder
        Coder objCoder = coderModel.findById(idDelete);

        // Verificamos si el coder existe
        if (objCoder == null){
            JOptionPane.showMessageDialog(null, "coder not found");
        }else{
            int confirm = JOptionPane.showConfirmDialog(null, "Are you sure?");
            if (confirm == 0) coderModel.delete(objCoder);
        }

    }
    public static void update(){
        // Llamamos al modelo para acceder a los metodos
        CoderModel coderModel = new CoderModel();

        // Llamamos la funcion getall para traer todos los coders antes de pedir el id
        getAll();

        //Pedimos el id del coder al usuario
        int idUpdate = Integer.parseInt(JOptionPane.showInputDialog("give me a coder id to delete"));

        // Con el id recibido buscamos el coder
        Coder objCoder = coderModel.findById(idUpdate);
        // condicional para verificar si existe
        if (objCoder == null){
            JOptionPane.showMessageDialog(null, "Coder not found");
        }else{
            // Pedir los nuevos datos al usuario para la modificacion
            objCoder.setName(JOptionPane.showInputDialog("Give a new name", objCoder.getName()));
            objCoder.setAge( Integer.parseInt(JOptionPane.showInputDialog("Give an new age", objCoder.getAge())));
            objCoder.setClan(JOptionPane.showInputDialog("Give me a new clan", objCoder.getClan()));

            // Pasamos el coder con la nueva informacion al metodo update
            coderModel.update(objCoder);

        }
    }
}
