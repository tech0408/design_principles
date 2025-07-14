package gang_of_four_design_patterns.creational;


class User{

    private String name;
    private int age;
    private String email;

    User(UserBuilder ub){
        this.name=ub.name;
        this.age=ub.age;
        this.email=ub.email;
    }

    public int getAge(){
        return age;
    }
}

class UserBuilder {

    public String name;
    public int age;
    public String email;
    private User user;

    public UserBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public UserBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public UserBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public User build() {
        return new User(this);
    }
}

public class BuilderPattern {
    public static void main(String[] args) {

        User user = new UserBuilder().setAge(30).build();
        System.out.println(user.getAge());
    }
}
