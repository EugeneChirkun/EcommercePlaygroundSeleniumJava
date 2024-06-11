package model;

import com.github.javafaker.Faker;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Locale;
import java.util.Random;

@Data
@Getter
@Setter
@ToString
public class User {
    Faker faker = new Faker(new Locale("en-US"));
    Random random = new Random();

    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String password = "Test123!";

    public User() {
        this.firstName = faker.name().firstName();
        this.lastName = faker.name().lastName();
        this.email = faker.number().numberBetween(1000, 9999) + faker.internet().safeEmailAddress();
        this.phoneNumber = faker.number().numberBetween(100, 999) + "-" + faker.number().numberBetween(100, 999) + "-" + faker.number().numberBetween(100, 999);
    }
}
