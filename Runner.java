package by.gsu.laba3;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        boolean c = true;

        System.out.println("Enter date today ...");
        System.out.println("For example: 10 2 2017");

       Date date = new Date(in.nextInt(), in.nextInt(), in.nextInt());

       while (c) {

           System.out.println("Choose:   " + '\n' + " 1: Create users." + '\n' + " 2: Deserialization." + '\n' + " 3: Exit.");

           switch (in.nextInt()) {

               case 1:
                   System.out.println("How many users?");
                   CreaterOfUsers.creater(date.getTotalDate());
                   break;

               case 2:
                   Serializator.deserialization(CreaterOfUsers.getQuantityUsers(), Serializator.FILE_NAME);
                   break;

               case 3:
                   c = false;
                   break;
           }
       }
    }
}
