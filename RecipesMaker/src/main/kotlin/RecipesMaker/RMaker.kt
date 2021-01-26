package RecipesMaker

class RMaker {
    private val ingredients = Ingredients()
    private var recetas:ArrayList<Receta> = arrayListOf<Receta>()
    private val menu = """
        Selecciona la opción deseada:
        1. Hacer una receta.
        2. Ver mis recetas.
        3. Salir.
    """.trimIndent()

    fun ejecutar(){
        println(menu)
        var response:String? = "nada"
        response = readLine()
        when(response){
            "1" -> hacerReceta("")
            "2" -> verRecetas()
            else -> ""
        }
    }

    fun hacerReceta(entrada:String) {
        var receta = entrada
        val menu = """
            Seleccione los ingredientes:
            1. Verduras
            2. Frutas
            3. Lacteos
            4. <- Terminar Receta
        """.trimIndent()
        println(menu)
        var response:String? = "nada"
        response = readLine()
        when(response) {
            "1" -> {
                receta+=ingredients.verduras()
                hacerReceta(receta)
            }
            "2" -> {
                receta+=ingredients.frutas()
                hacerReceta(receta)
            }
            "3" -> {
                receta+=ingredients.lacteos()
                hacerReceta(receta)
            }
            else -> {
                val r = Receta()
                r.setIngredients(receta)
                recetas.add(r)
                ejecutar()
            }
        }
    }

    fun verRecetas() {
        var creadas = ""
        for (i in recetas){
            creadas += i.toString() + "\n"
        }
        println("$creadas")
        ejecutar()
    }
}