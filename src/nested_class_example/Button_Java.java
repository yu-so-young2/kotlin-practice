package nested_class_example;

import org.jetbrains.annotations.NotNull;

public class Button_Java implements View {
    @NotNull
    @Override
    public State getCurrentState() {
        return new ButtonState();
    }

    @Override
    public void restoreState(@NotNull State state) {
        View.super.restoreState(state);
    }

    // 자바에서는 외부 클래스 인스턴스 없이도 내부 클래스를 사용하기 위하여 내부 클래스가 정적으로 선언되어야 함
    // 이 예제의 ButtonState 클래스는 바깥쪽 Button 클래스에 대한 참조를 묵시적으로 포함한다. 그 참조로 인해 ButtonState를 직렬화 할 수 없다.
    // Button을 직렬화 할 수 없으므로 버튼에 대한 참조가 ButtonState의 직렬화를 방해한다.
    public class ButtonState implements State {}
}
