package Modelo

class Modelo {
    private var recetas = "guardadas: "
    private val menu = """
        Selecciona la opción deseada:
        1. Hacer una receta.
        2. Ver mis recetas.
        3. Salir.
    """.trimIndent()


    constructor(){

    }

    fun ejecutarPrograma() {
        println(menu)
        var response:String? = readLine() ?: "0"
        when(response){
            "1" -> hacerReceta()
            "2" -> verRecetas()
            else -> println("Que tenga buen día")
        }
    }

    private fun verRecetas(){
        println(recetas)
        ejecutarPrograma()
    }

    private fun hacerReceta() {
        recetas+="\n{Ingredientes"
        val menu = """
            Seleccione los ingredientes:
            1. agua
            2. harina
            3. vegetales
            4. carnes
            5. aceite
            6. terminar
        """.trimIndent()
        var response:String? = "nada" ?: "0"
        println(menu)

        while(response.toString()!="6"){
            response = readLine()
            when(response){
                "1" -> recetas+=", agua"
                "2" -> recetas+=", harina"
                "3" -> recetas+=", vegetales"
                "4" -> recetas+=", carnes"
                "5" -> recetas+=", aceite"
                "6" -> recetas += "}"
                else -> recetas += "}"
            }
        }
        println("Receta guardada con exito")
        ejecutarPrograma()
    }

}