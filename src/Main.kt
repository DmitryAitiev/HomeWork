import ex_1.*


fun main() {

    val mobiles by lazy { generateMobile(5)}
    mobiles.forEach { println(it) }

    val chargingMobiles = filterMobile(mobiles, MobileState.Charging)
    println("\nЗаряжаются:")
    chargingMobiles.forEach { println(it) }

    println("\nЗапущенные приложения:")
    val workingApps = mobiles.getAppName()
    workingApps.forEach {
        println(it)
    }


    //Ошибка будет часто выводить из-за функции generateState(), можно уменьшить вероятность вывода ошибки,
    //немного изменив её
}