fun main(args: Array<String>) {
/*
    val personList = listOf(
        Person("Ben", 37, true),
        Person("Martin", 5, true),
        Person("Haggard", 39, false),
        Person("Angel", 25, false),
        Person("David", 66, true)
    )
*/
    val names = listOf("dog","cat")
    println(names.mapIndexed(::Animal))
    println(names.mapIndexed{ id, name ->
        Animal(5,"cobra")
    })

}
fun Person.important() = this.name.startsWith(prefix = "M") && this.age > 20

fun important2(person: Person) =
    person.name.startsWith("S") && person.age > 18


data class Person(
    val name: String,
    val age: Int,
    val male: Boolean)

data class Animal(
    val id: Int,
    val name: String
)
