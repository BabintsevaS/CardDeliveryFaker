package ru.netology.delivery.data;

import com.github.javafaker.Faker;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


public class DataGenerator {


    private DataGenerator() {
    }

    public static String generateDate(int shift) {
        LocalDate meetingDate = LocalDate.now().plusDays(shift);
        String date = meetingDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        return date;
    }

    public static String generateCity() {
        Faker faker = new Faker(new Locale("ru"));
        String city = faker.address().city();
        return city;
    }

    public static String generateName() {
        Faker faker = new Faker(new Locale("ru"));
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String name = firstName + ' ' + lastName;
        return name;
    }

    public static String generatePhone() {
        Faker faker = new Faker(new Locale("ru"));
        String phone = faker.phoneNumber().cellPhone();
        return phone;
    }

}
