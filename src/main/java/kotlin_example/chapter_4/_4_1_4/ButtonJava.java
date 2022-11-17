package kotlin_example.chapter_4._4_1_4;

import org.jetbrains.annotations.NotNull;

public class ButtonJava implements View {
    @NotNull
    @Override
    public State getCurrentState() {
        return new ButtonJavaState();
    }

    @Override
    public void restoreState(@NotNull State state) { /*...*/ }

    public static class ButtonJavaState implements State {

    }
}
