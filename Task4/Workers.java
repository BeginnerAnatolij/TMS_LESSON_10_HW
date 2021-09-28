package Lesson10.Task4;

public final class Workers {
    private final String name;
    private final int age;
    private final String compamy;

    public Workers(String name, int age, String compamy) {
        this.name = name;
        this.age = age;
        this.compamy = compamy;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCompamy() {
        return compamy;
    }
}
