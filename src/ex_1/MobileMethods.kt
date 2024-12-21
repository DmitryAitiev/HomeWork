package ex_1

fun filterMobile(mobiles: List<Mobile>, state: MobileState): List<Mobile> {
    return mobiles.filter { it.state == state }
}

fun List<Mobile>.getAppName(): Set<String> =
    this.mapNotNull { (it.state as? MobileState.UsingApp)?.app?.name }.toSet()