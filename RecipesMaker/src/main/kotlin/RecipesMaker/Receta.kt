package RecipesMaker

class Receta() {

    var ingredients = ""

    @JvmName("setIngredients1")
    fun setIngredients(entrada:String){
        this.ingredients = entrada
    }

    override fun toString():String{
        return ingredients
    }
}