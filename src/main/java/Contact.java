public class Contact {
    private String name;
    private String phone;

    // Constructor
    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for phone
    public String getPhone() {
        return phone;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Setter for phone
    public void setPhone(String phone) {
        this.phone = phone;
    }
}