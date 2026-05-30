package opg2;

public class Contact {
    private String name;
    private int phoneNumber;

    public Contact(String name, int phoneNumber) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty!");
        }
        /*if (String.valueOf(phoneNumber).length() != 8) {
            throw new IllegalArgumentException("Phone number must be 8 digits!");
        }*/
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    @Override
    public String toString() {
        return  "Contact info: "+ name +
                ", phone number: " + phoneNumber;
    }


}
