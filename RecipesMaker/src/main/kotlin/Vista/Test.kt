import Modelo.Modelo
import Modelo.Movie
import Modelo.Shoe

fun main(args: Array<String>) {

 /*   val m = Modelo()
    m.ejecutarPrograma() */

    val mv = Movie("coco", "Pixar", 120)

    val s = Shoe("jordan", "Suave", 1231,"Prada")
    s.size = 33
    println("talla: ${s.size}")
    println("Shoe{\n${s.toString()}\n}")


}

