package kotlin_example.chapter3.c;

import java.util.Collection;
import java.util.stream.Collectors;

public class SameInJava {

    public <T extends Number> String getMyJavaSeparator(Collection<T> collection, String separator) {
        return collection.stream().map(String::valueOf).collect(Collectors.joining(separator));
    }

    public <T extends Number> String getMyJavaSeparator(Collection<T> collection, String separator,
                                                        String prefix, String postfix) {
        return collection.stream().map(String::valueOf).collect(Collectors.joining(separator, prefix, postfix));
    }

}
