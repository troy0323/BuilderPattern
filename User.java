package BuilderPattern;
public class User {

    protected final String firstName;
    protected final String lastName;
    protected final String email;
    protected final String address;
    protected final String phone;
    protected final int age;

    // Make the constructor private to enforce usage of Builder
    private User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.address = builder.address;
        this.phone = builder.phoneNum;
        this.age = builder.age;
    }

    protected static class UserBuilder {
        private String firstName;
        private String lastName;
        private String email;
        private String address;
        private String phoneNum;
        private int age;

        public UserBuilder email(String email){
            this.email = email;
            return this;
        }

        public UserBuilder firstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        public UserBuilder lastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public UserBuilder age(int age){
            this.age = age;
            return this;
        }

        // Methods for optional fields, returning the Builder for chaining
        public UserBuilder Address(String address) {
            this.address = address;
            return this;
        }

        public UserBuilder PhoneNum(String phone) {
            this.phoneNum = phone;
            return this;
        }

        public UserBuilder withAge(int age) {
            this.age = age;
            return this;
        }

        // Build method to create the User object
        public User build() {
            return new User(this);
        }
    }
}
