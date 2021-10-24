package ru.geekbrains.homeworks.lesson1.task1;

public class Person {

    String firstName;
    String lastName;
    String middleName;
    String country;
    String address;
    String phone;
    int age;
    String gender;

    public static class Builder {

        private Person newPerson;

        public Builder() {
            this.newPerson = new Person();
        }

        public Builder withFirstName(String firstName) {
            newPerson.firstName = firstName;
            return this;
        }

        public Builder withLastName(String lastName) {
            newPerson.lastName = lastName;
            return this;
        }

        public Builder withMiddleName(String middleName) {
            newPerson.middleName = middleName;
            return this;
        }

        public Builder withCountry(String country) {
            newPerson.country = country;
            return this;
        }

        public Builder withAddress(String address) {
            newPerson.address = address;
            return this;
        }

        public Builder withPhone(String phone) {
            newPerson.phone = phone;
            return this;
        }

        public Builder withAge(int age) {
            newPerson.age = age;
            return this;
        }

        public Builder withGender(String gender) {
            newPerson.gender = gender;
            return this;
        }

        public Person build() {
            return newPerson;
        }
    }
}
