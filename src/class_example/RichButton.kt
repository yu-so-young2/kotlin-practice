package class_example

import interface_example.Clickable

/**
 * 코틀린의 클래스와 메소드는 기본적으로 final이다.
 * 어떤 클래스의 상속을 허용하려면 클래스 앞에 open 을 붙여야 한다.
 * 오버라이드를 허용하고 싶은 메소드나 프로퍼티의 앞에도 open 을 붙여야 한다.
 */
open class RichButton : Clickable { // 이 클래스는 열려 있다. 다른 클래스가 이 클래스를 상속할 수 있다.

    fun disable() {} // 이 함수는 final이다. 하위 클래스가 이 메소드를 오버라이드 할 수 없다.

    open fun animate() {} // 이 함수는 열려 있다. 하위 클래스에서 이 메소드를 오버라이드해도 된다.

    override fun click() {} // 이 함수는 (상위 클래스에서 선언된) 열려 있는 메소드를 오버라이드한다. 오버라이드한 메소드는 기본적으로 열려있다.

    // 'final'이 없는 'override' 메소드나 프로퍼티는 기본적으로 open 상태이다.
    // 상위 클래스의 메소드를 오버라이딩한 후, 해당 메서드를 하위 클래스에서 오버라이딩할 수 없도록 하려면 final을 붙여준다.
//    final override fun click() {}
}