package by.gsu.laba3;

public class InvalidDataInputException extends Exception {
    public InvalidDataInputException() {
    }

    public InvalidDataInputException(String message) {
        super(message);
    }

    public String getExceptionMessage(){
        return "Try again ...";
    }
}
