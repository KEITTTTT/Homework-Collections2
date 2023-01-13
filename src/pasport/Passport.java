package pasport;

import java.time.LocalDate;
import java.util.Objects;

public class Passport {
    private final int number;
    private final String firstNme;
    private final String middleName;
    private final String lastName;
    private final LocalDate localDate;

    public Passport(int number, String firstNme, String middleName, String lastName, LocalDate localDate) {
        this.number = number;
        this.firstNme = firstNme;
        this.middleName = middleName;
        this.lastName = lastName;
        this.localDate = localDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return number == passport.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    public int getNumber() {
        return number;
    }

    public String getFirstNme() {
        return firstNme;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    @Override
    public String toString() {
        return " Номер паспорта " + number +
                ", Имя ='" + firstNme + '\'' +
                ", Отчество ='" + middleName + '\'' +
                ", Фамилия ='" + lastName + '\'' +
                ", Дата рождения =" + localDate +
                '}';
    }
}
