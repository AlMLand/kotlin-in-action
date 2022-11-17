package kotlin_example.chapter_4._4_2_4;

public class UserJava {
    private String name;
    private String address = "unspecified";

    public UserJava(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        System.out.println(String.format("Address was changed for %s\n%s -> %s", this.name, this.address, address));
        this.address = address;
    }
}

class Run {
    public static void main(String[] args) {
        UserJava userJava = new UserJava("E");
        userJava.setAddress("El Straße 1, 11111 Dresden");
    }
}