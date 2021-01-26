package Vista

fun main(args: Array<String>) {
    val numbers = listOf(3,9,8,10,5,12)
    val num = numbers.filter{it % 2 == 0}
    println(num)

    val words = listOf("Oasis","Hola", "Holanda", "Objeto")
    val txt = words.filter { it.startsWith('O') }
    println("\n$txt")
}