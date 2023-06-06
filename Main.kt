fun main(args: Array<String>) {

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
