package ex_1

fun filterMobile(mobiles: List<Mobile>, state: MobileState): List<Mobile> {
    return mobiles.filter { it.state == state }
}

fun Mobile.getAppName(): String {
    return if (this.state is MobileState.UsingApp)
        (this.state as MobileState.UsingApp).app.name
    else ""
}