package org.example.User;


public class User {
    private final String firstName;
    private final String lastName;
    private final String email;
    private String address;
    private String code;
    private double salary;
    private User(UserBuilder userBuilder){
        this.firstName=userBuilder.firstName;
        this.lastName=userBuilder.lastName;
        this.address=userBuilder.address;
        this.email=userBuilder.email;
        this.code=userBuilder.code;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getCode() {
        return code;
    }

    public double getSalary() {
        return salary;
    }
    //static inner class used f
    public static class UserBuilder{

        private final String firstName;
        private final String lastName;
        private final String email;
        private String address;
        private String code;
        private double salary;
        //mandatory fields are final and instantiated in constructor
        public UserBuilder(String firstName, String lastName, String email){
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;

        }


        //optional fields instantiated with this methods
        public UserBuilder address(String address){
            this.address=address;
            return this;
        }
        public UserBuilder code(String code){
            this.code=code;
            return this;
        }
        public UserBuilder salary(double salary)
        {
            this.salary=salary;
            return this;
        }
        public User build(){
            //do sth
            return new User(this);
        }
    }

    @Override
    public String toString() {
        return "UserBuilder{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", code='" + code + '\'' +
                ", salary=" + salary +
                '}';
    }
}
