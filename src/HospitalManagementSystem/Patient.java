package HospitalManagementSystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Patient {

    private Connection connection;
    private Scanner scanner;

    public Patient(Connection connection, Scanner scanner){
        this.connection=connection;
        this.scanner=scanner;

    }
    public void addPatient() {
        System.out.print("Enter Patient Name: ");
        String name = scanner.next();
        System.out.print("Enter Patient Age: ");
        int age =scanner.nextInt();
        System.out.println("Enter patient Gender:");
        String gender = scanner.next();

        try{
            String query="Insert into patients(name,age,gender) VALUES(?,?,?);
            PreparedStatement preparedStatement=connection.prepareStatement(query);

        }catch(SQLException e){
            e.printStackTrace();

        }



    }



}
