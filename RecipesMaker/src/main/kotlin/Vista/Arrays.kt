package Vista

fun main(args: Array<String>) {
 /*   val countries : Array<String> = arrayOf("India", "Colombia", "España", "Francia")
    val numbers : IntArray = intArrayOf(7,4,2,3,6,8,2,2,4,9)

    var promedio = 0
    for(i in numbers){
        promedio += i
    }
    promedio /= numbers.size
    println("promedio = $promedio")

    var arrayObject : Array<Int> = arrayOf(1,2,3)
    var intPrimitive = arrayObject.toIntArray()
    val sum = arrayObject.sum()
    println("Suma: $sum")
    arrayObject = arrayObject.plus(9)
    arrayObject = arrayObject.reversedArray()
    arrayObject.reverse()

    //promedio usando funciones
    var arrayObject : Array<Int> = arrayOf(1,2,3,4,5)
    var intPrimitive = arrayObject.toIntArray()
    println("Promedio: ${average(intPrimitive)}")

    var x = 5
    println("¿x es igual a 5? ${x==5}")
    var mensaje = "el valor de x es $x"
    x++
    println("${mensaje.replace("es", "fue")}, x es igual a $x") */

    println("${evaluate('>')} 1")
}
fun evaluate(character:Char='=', number:Int=2):String{
    return "$number es $character"
}

fun average(numbers:IntArray):Int{
    var suma = 0
    for(i in numbers){
        suma+=i
    }
    return suma/numbers.size
}