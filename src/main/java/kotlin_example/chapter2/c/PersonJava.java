package kotlin_example.chapter2.c;

public class PersonJava implements SharedI {
    private final String name;
    private boolean isMarried;

    public PersonJava(String name, boolean isMarried) {
        this.name = name;
        this.isMarried = isMarried;
    }

    @Override
    public String getFullInfo() {
        return "fullInfoJava";
    }

    public String getName() {
        return name;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

    @Override
    public String toString() {
        return "PersonJava{" +
                "name='" + name + '\'' +
                ", isMarried=" + isMarried +
                '}';
    }
}
