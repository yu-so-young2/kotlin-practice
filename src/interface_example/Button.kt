package interface_example

    /**
     * 코틀린에서는 클래스 이름 뒤에 콜론(:)을 붙이고 인터페이스와 클래스 이름을 적는 것으로 클래스 확장과 인터페이스 구현을 모두 처리한다.
     * 자바와 마찬가지로, 인터페이스는 다중 상속 가능, 클래스는 다중 상속 불가
     */
class Button : Clickable, Focusable {
    override fun click() = println("I was clicked!")

    // 다중 상속에서 중복된 상위 메소드는 하위 클래스에서 반드시 구현되어야 함
    override fun showOff() {
        println("I am button!")
    }
}