package kotlin_example.chapter2.a;

import java.util.List;

record Person2(String name,
               Integer age) {
    public static void main(String[] args) {
        var persons2 = List.of(new Person2("A", null), new Person2("T", 5));
        var oldest = persons2.stream()
                .max((p1, p2) -> {
                    if (p1.age() != null && p2.age() != null) {
                        return p1.age().compareTo(p2.age());
                    }
                    return Integer.MIN_VALUE;
                }).get();
        System.out.println("The oldest person is " + oldest);
    }
}
