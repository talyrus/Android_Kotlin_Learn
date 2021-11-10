package study.talyrus.myrecyclerview

sealed interface People{
    //интерфейс вместо класса потому что нужно наследование более чем в одном случае (множественное наследование)
    open class Human(
        open val name: String,
        open val age: Int
    )

    data class Man(
        override val name: String,
        override val age: Int,
        val phoneNumber:String
    ):Human(name, age), People

    data class Woman(
        override val name: String,
        override val age: Int,
        val email:String
    ):Human(name,age), People
}
