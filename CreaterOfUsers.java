package by.gsu.laba3;

import java.util.Scanner;

public class CreaterOfUsers {

    private static int quantityUsers;

    public static int getQuantityUsers() {
        return quantityUsers;
    }

    public static void setQuantityUsers(int quantityUsers) {
        CreaterOfUsers.quantityUsers = quantityUsers;
    }

    public static void creater(int totalDateToday){

        Scanner in = new Scanner(System.in);

        setQuantityUsers(in.nextInt());

        User[] users = new User[quantityUsers];
        Date[] dates = new Date[quantityUsers];

        for (int i = 0; i < users.length; i ++){
            users[i] = new User();

            System.out.println("Enter the login ...");
            users[i].setLogin(in.next());

            System.out.println("Enter the sex ...");
            users[i].setSex(in.next());

            System.out.println("Enter the date ...");
            users[i].setDateLastIn(dates[i] = new Date(in.nextInt(), in.nextInt(), in.nextInt()));

            System.out.println("Enter the quantity of messages ...");
            users[i].setCountMess(in.nextInt());

            System.out.println("Enter the password ...");
            users[i].setPassword(in.next());

            try {
                users[i].setAction(totalDateToday - dates[i].getTotalDate(), users[i].getCountMess());
            }catch (InvalidDataInputException e){
                System.out.println(e);
                System.out.println(e.getExceptionMessage());
                return;
            }
        }

        System.out.println("Serializable or not?" + '\n' + " 1: Yes." + '\n' + " 2: No.");

        switch (in.nextInt()){
            case 1:
                Serializator.serialization(users);
                break;

            case 2:
                break;
        }
    }
}
