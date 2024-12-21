package ex_1

sealed class MobileState {

    object Charging : MobileState() {
        override fun toString(): String = "Заряжается"
    }

    object AirMode : MobileState() {
        override fun toString(): String = "В режиме полета"
    }

    data class UsingApp(val app: App) : MobileState() {
        override fun toString(): String = "Используется приложение $app"
    }
}
