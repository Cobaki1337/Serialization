package by.gsu.laba3;

import java.io.Serializable;

public class User implements Serializable {

    private String login;
    private Sex sex;
    private Date dateLastIn;
    private int countMess;
    private int action;
    private transient String password;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = Sex.valueOf(sex);
    }

    public Date getDateLastIn() {
        return dateLastIn;
    }

    public void setDateLastIn(Date dateLastIn) {
        this.dateLastIn = dateLastIn;
    }

    public int getCountMess() {
        return countMess;
    }

    public void setCountMess(int countMess) {
        this.countMess = countMess;
    }

    public int getAction() {
        return action;
    }

    public void setAction(int dateCoef, int quantityOfMess) throws InvalidDataInputException {
        if (dateCoef + quantityOfMess < 0){
            throw new InvalidDataInputException("Error in Action !");
        }
        this.action = dateCoef + quantityOfMess;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", sex=" + sex +
                ", dateLastIn=" + dateLastIn +
                ", countMess=" + countMess +
                ", action=" + action +
                ", password='" + password + '\'' +
                '}';
    }
}
