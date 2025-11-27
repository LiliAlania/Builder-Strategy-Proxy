package ua.ucu.edu.apps;

import java.util.List;

// import ua.ucu.edu.apps.User.UserBuilder;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        UserBuilder  userBuilder = new UserBuilder ();
        User user = userBuilder
            .name("User Name")
            .age(10)
            .build();
        User user = User.builder()
            .age(10)
            .name("User Name2")
            .gender(Gender.FEMALE)
            .height(10)
            .weight(10)
            .roles(List.of("Admin", "Superadmin"))
            .role("Supersuperadmin")
            .build();

        // System.out.println(user);
        MailSender mailsender new MailSender();
        mailsender.sendMail(new MailInfo());
        MailInfo mailinfo = new MailInfo(new Client() )

    }
}