package by.gsu.laba3;

import java.io.*;

public class Serializator {

    public static final String FILE_NAME = "Users.txt";
    ObjectOutputStream os = null;

    public static void serialization(User[] users){

        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(FILE_NAME));
            for (int i = 0; i < users.length; i ++){
                os.writeObject(users[i]);
            }
        }catch (FileNotFoundException ex){
            System.err.println("File is not found: " + ex);
        }catch (NotSerializableException ex){
            System.err.println("Class is not serializable: " + ex);
        }catch (IOException ioe){
            System.err.println(ioe);
        }
    }

    public static void deserialization(int size, String fileName){

        User[] u = new User[size];

        try {
            ObjectInputStream is = new ObjectInputStream(new FileInputStream(fileName));

            for (int i = 0; i < size; i ++){
                u[i] = (User) is.readObject();
            }

        }catch (FileNotFoundException | NotSerializableException |ClassNotFoundException ex){
            ex.printStackTrace();
        }catch (IOException ioe) {
            System.err.println(ioe);
        }

        for (int i = 0; i < size; i ++){
            System.out.println(u[i]);
        }
    }
}
