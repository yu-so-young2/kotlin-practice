package nested_class_example

class Button_Kotlin : View {
    override fun getCurrentState(): State = ButtonState();
    override fun restoreState(state: State) {}

    /**
    * 코틀린 중첩 클래스에 아무런 변경자가 붙지 않으면 자바 static 중첩 클래스와 같다.
     * 이를 내부 클래스로 변경해서 바깥쪽 클래스에 대한 참조를 포함하게 만들고 싶다면 inner 변경자를 붙여야 한다.
     *
     * 또한, 코틀린에서 바깥쪽 클래스 인스턴스를 가르키려면 내부 클래스 inner 안에서 this@Outer라고 써야 한다.
    */
    class ButtonState : State
}