package ex_1

data class Samsung(override val model: String, override val state: MobileState) : Mobile(model)
