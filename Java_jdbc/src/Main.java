import Controller.CoderController;
import Database.ConfigDB;

import javax.swing.*;
import java.sql.Connection;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            // aqui en el main solo llamamos al controller para pedir los datos
        String option = "";
        do {
            option = JOptionPane.showInputDialog("""
                    1. create coder
                    2. get all coders
                    3. delete coder
                    4. update coder
                    """);
            switch (option){
                case "1":
                    CoderController.create();
                    break;
                case "2":
                    CoderController.getAll();
                    break;
                case "3":
                    CoderController.delete();
                    break;
                case "4":
                    CoderController.update();
                    break;
            }
        }while (!option.equals("5"));


    }
}