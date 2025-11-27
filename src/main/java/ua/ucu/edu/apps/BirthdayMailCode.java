package ua.ucu.edu.apps;

public class BirthdayMailCode implements MailCode{
    @Override
    public String generate() {
        return "Best wishes!";
    }

}
