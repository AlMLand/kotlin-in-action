package kotlin_example.chapter_5._5_1_1.java;

public class Service {
    void actionWithAnonimusClass(final Button button) {
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void obClick(View view) {
                System.out.println("set new on click listener");
            }
        });
    }

    void actionWithLambda(final Button button) {
        button.setOnClickListener(view -> System.out.println("set new on click listener"));
    }
}
