package ua.ucu.edu.apps;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

enum Gender {
    MALE, FEMALE
}
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Client {
    private static int counter;
    private int id = counter + 1;
    private String name;
    private int age;
    private Gender gender;
    private String email;
}
