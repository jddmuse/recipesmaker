package RecipesMaker

class RecipesMaker {
    private var recetas = "Guardadas:\n"
    private val menu = """
        Selecciona la opción deseada:
        1. Hacer una receta.
        2. Ver mis recetas.
        3. Salir.
    """.trimIndent()

    fun ejecutarPrograma() {
        println(menu)
        var response = readLine() ?: "0"
        when (response) {
            "1" -> hacerReceta()
            "2" -> verRecetas()
            else -> "Adios"
        }
    }

    private fun verRecetas(){
        println(recetas)
        ejecutarPrograma()
    }

    private fun hacerReceta(){
        val menu = """
            Seleccione los ingredientes:
            1. Verduras
            2. Frutas
            3. Lacteos
            4. <- Terminar Receta
        """.trimIndent()
        println(menu)
        var response = readLine() ?: "0"
        when(response) {
            "1" -> verduras()
            "2" -> frutas()
            "3" -> lacteos()
            "4" -> {
                recetas += "\n"
                ejecutarPrograma()
            }
        }
    }

    private fun verduras() {

        val menu = """
            1. Cebolla
            2. Tomate
            3. Pimenton
            4. Papa
            5. <- Atras
        """.trimIndent()
        println(menu)
        var response:String? = "nada" ?: "0"
        while(response.toString()!="5") {
            response = readLine()
            when (response) {
                "1" -> recetas += "-Cebolla"
                "2" -> recetas += "-Tomate"
                "3" -> recetas += "-Pimenton"
                "4" -> recetas += "-Papa"
                "5" -> break
                else -> println("Seleccione una opcion")
            }
        }
        hacerReceta()
    }

    private fun frutas() {

        val menu = """
            1. Fresa
            2. Plátano
            3. Uvas
            4. Manzana
            5. <- Atras
        """.trimIndent()
        println(menu)
        var response:String? = "nada" ?: "0"
        while(response.toString()!="5") {
            response = readLine()
            when (response) {
                "1" -> recetas += "-fresa"
                "2" -> recetas += "-Plátano"
                "3" -> recetas += "-Uvas"
                "4" -> recetas += "-Manzana"
                "5" -> break
                else -> println("Seleccione una opcion")
            }
        }
        hacerReceta()
    }

    private fun lacteos() {

        val menu = """
            1. yogurt
            2. Leche entera
            3. leche Deslactosada
            4. Kumix
            5. <- Atras
        """.trimIndent()
        println(menu)
        var response:String? = "nada" ?: "0"
        while(response.toString()!="5") {
            response = readLine()
            when (response) {
                "1" -> recetas += "-yogurt"
                "2" -> recetas += "-Leche entera"
                "3" -> recetas += "-leche Deslactosada"
                "4" -> recetas += "-Kumix"
                "5" -> break
                else -> println("Seleccione una opcion")
            }
        }
        hacerReceta()
    }
}