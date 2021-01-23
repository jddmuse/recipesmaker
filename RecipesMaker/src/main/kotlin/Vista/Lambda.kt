package Vista

fun main(args: Array<String>){

    var result = calculadora(3,2,5, ::sumar)
    println("Resultado: $result")

}

fun calculadora(a:Int, b:Int, c:Int, operacion:(Int, Int, Int) -> Int ): Int {
    return operacion(a,b,c)
}

fun sumar(a:Int, b:Int, c:Int) = a+b+c
fun restar(a:Int, b:Int, c:Int) = a-b-c
fun multiplicar(a:Int, b:Int, c:Int) = a*b*c
