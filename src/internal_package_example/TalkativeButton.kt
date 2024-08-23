package internal_package_example

import interface_example.Focusable

internal open class TalkativeButton : Focusable {
    private fun yell() = println("Hey!")
    protected fun whisper() = println("Let's talk!")
}

// 오류 발생: public 멤버가 자신의 internal 수신 타입인 TalkativeButton을 노출함
//fun TalkativeButton.giveSpeech() {
//    yell() // 오류 발생: yell()은 Talkative의 private 멤버이므로 접근할 수 없음
//    whisper() // 오류 발생: whisper는 Talkative의 protected 멤버이므로 접근할 수 없음
//}

/**
 * public 함수인 giveSpeech 안에서 그보다 가시성이 더 낮은 internal 타입인 클래스에 접근하지 못함.
 * 자바에서는 같은 패키지 안에서 protected 멤버에 접근할 수 있지만, 코들린에서는 그렇지 않다는 점에서 자바와 코틀린의 protected가 다르다.
 */