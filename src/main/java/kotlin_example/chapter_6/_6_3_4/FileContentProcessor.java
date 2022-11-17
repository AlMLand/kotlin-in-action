package kotlin_example.chapter_6._6_3_4;

import java.io.File;
import java.util.List;

public interface FileContentProcessor {
    void processContent(File path, byte[] content, List<String> lines);
}
