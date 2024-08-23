package nested_class_example

import java.io.Serializable

interface State : Serializable

interface View {
    fun getCurrentState() : State
    fun restoreState(state: State) {} // 리턴 타입이 없는 이유는 리턴 타입이 Unit 이기 때문이다. Unit은 자바의 void와 유사한 개념이다.
}