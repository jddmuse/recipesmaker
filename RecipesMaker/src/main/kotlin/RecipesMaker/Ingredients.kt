package RecipesMaker

class Ingredients {
    val verduras = listOf<String>("Cebolla", "Tomate", "Pimenton", "Papa", "Ajo", "Zanahoria")
    val frutas = listOf<String>("Banano","Fresa","Mango","Uva")
    val lacteos = listOf<String>("Leche","Kumix","Queso","Yogurt")
    val carnes = listOf<String>("Lentejas","Arroz","frijoles","Garbanzo")

    fun verduras():String{
        var receta = ""
        var menu = ""
        var num = 1
        for(i in verduras){
            menu += "$num. $i\n"
            num++
        }
        menu += "${num++}. <-Atrás"
        println(menu)
        var response:String? = "hola"
        do {
            response = readLine()
            when (response) {
                "1" -> receta += "-${verduras[0]}"
                "2" -> receta += "-${verduras[1]}"
                "3" -> receta += "-${verduras[2]}"
                "4" -> receta += "-${verduras[3]}"
                "5" -> receta += "-${verduras[4]}"
                "6" -> receta += "-${verduras[5]}"
                else -> break
            }
        } while(response!="7")
        return receta
    }

    fun frutas():String{
        var receta = ""
        var menu = ""
        var num = 1
        for(i in frutas){
            menu += "$num. $i\n"
            num++
        }
        menu += "${num++}. <-Atrás"
        println(menu)
        var response:String? = "hola"
        do {
            response = readLine()
            when (response) {
                "1" -> receta += "-${frutas[0]}"
                "2" -> receta += "-${frutas[1]}"
                "3" -> receta += "-${frutas[2]}"
                "4" -> receta += "-${frutas[3]}"
                else -> break
            }
        } while(response!="7")
        return receta
    }

    fun lacteos():String{
        var receta = ""
        var menu = ""
        var num = 1
        for(i in lacteos){
            menu += "$num. $i\n"
            num++
        }
        menu += "${num++}. <-Atrás"
        println(menu)
        var response:String? = "hola"
        do {
            response = readLine()
            when (response) {
                "1" -> receta += "-${lacteos[0]}"
                "2" -> receta += "-${lacteos[1]}"
                "3" -> receta += "-${lacteos[2]}"
                "4" -> receta += "-${lacteos[3]}"
                else -> break
            }
        } while(response!="7")
        return receta
    }

    fun carnes():String{
        var receta = ""
        var menu = ""
        var num = 1
        for(i in carnes){
            menu += "$num. $i\n"
            num++
        }
        menu += "${num++}. <-Atrás"
        println(menu)
        var response:String? = "hola"
        do {
            response = readLine()
            when (response) {
                "1" -> receta += "-${carnes[0]}"
                "2" -> receta += "-${carnes[1]}"
                "3" -> receta += "-${carnes[2]}"
                "4" -> receta += "-${carnes[3]}"
                else -> break
            }
        } while(response!="7")
        return receta
    }
}