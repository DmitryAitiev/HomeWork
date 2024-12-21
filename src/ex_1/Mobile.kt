package ex_1

abstract class Mobile(open val model: String) {
    abstract val state: MobileState
}