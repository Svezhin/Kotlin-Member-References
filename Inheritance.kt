fun main() {

    val dog = Dog("Efes")
    val cat = Cat("Maya")
    val pokemon = Pokemon("Mew")
    
    dog.eat()
    dog.printEnergy()
    cat.updateColor("gray")
    println(pokemon.claws)
    println(cat.claws)

}
open class Animal(val name:String){

    protected var energy = 0
    open var color = "Black"

    init {
        println("Animal class initializing...")
    }

    fun printEnergy(){
        println("Current $name energy : $energy")
    }
    open fun eat(){
        energy += 1
    }
    open fun run(){
        energy -= 1
    }
}

class Dog(dogName : String): Animal(dogName){
    init {
        println("Dog class initializing...")
    }

    override fun eat() {
        energy +=5
    }

    override fun run() {
        energy -=5
    }
}

open class Cat(dogName : String): Animal(dogName){
    init {
        println("Cat class initializing...")
    }

    open var claws = "Sharp"

    override fun eat() {
        energy +=10
    }

    override fun run() {
        energy -=10
    }
}


class Pokemon(pokemonName : String): Cat(pokemonName){
    init {
        println("Pokemon class initializing...")
    }

    override var claws = "Smooth"

    override fun eat() {
        energy +=8
    }

    override fun run() {
        energy -=8
    }
}

fun Animal.updateColor(color: String) {
    this.color = color

}
