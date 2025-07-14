package clean_code;

class User {
    private String name;
    private String email;

    // Adding unnecessary fields for potential future requirements
    private String phoneNumber;
    private String address;
    private String socialMediaProfile;

    public User(String name, String email) {
        this.name = name;
        this.email = email;

        // Future requirements for the phone and address not yet needed
        this.phoneNumber = "";
        this.address = "";
        this.socialMediaProfile = "";
    }

    public String getDisplayName() {
        return name + " (" + email + ")";
    }
}

public class yagniPrinciple {

}
