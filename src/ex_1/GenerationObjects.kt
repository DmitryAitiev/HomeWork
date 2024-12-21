package ex_1

fun generateMobile(count: Int): List<Mobile> {
    return buildList {
        for (i in 0 until count) {
            when ((0..2).random()) {
                0 -> add(Samsung("S20", generateState()))
                1 -> add(Xiaomi("Redmi 4 Pro", generateState()))
                2 -> add(OnePlus("12 Pro", generateState()))
            }
        }
    }
}

fun generateState(): MobileState {
    return when ((0..3).random()) {
        0 -> MobileState.Charging
        1 -> MobileState.AirMode
        2 -> MobileState.UsingApp(App.values().random())
        else -> throw IllegalStateException("Absence of state")
    }
}

