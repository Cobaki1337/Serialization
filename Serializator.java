package by.gsu.laba3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializator {

    public static final String FILE_NAME = "Users.txt";

    public static void serialization(User[] users){

        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(FILE_NAME));
            for (int i = 0; i < users.length; i ++){
                os.writeObject(users[i]);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public static void deserialization(int size, String fileName){

        User[] u = new User[size];

        try {
            ObjectInputStream is = new ObjectInputStream(new FileInputStream(fileName));

            for (int i = 0; i < size; i ++){
                u[i] = (User) is.readObject();
            }

        }catch (Exception ex){
            ex.printStackTrace();
        }

        for (int i = 0; i < size; i ++){
            System.out.println(u[i]);
        }
    }
}
