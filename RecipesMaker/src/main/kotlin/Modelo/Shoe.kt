package Modelo

class Shoe(name:String, description:String, sku:Int, var mark:String):
    Product(name,description,sku), ICroudActions { //Data class

    var size = 34
        set(value) {
            if(value>=34)
                field = value
            else
                field = 34
        }
    var colour = "white"

    override fun read():String{ //POLIMORFISMO: cambiar el codigo de read() de la clase product
        return "\nfunciona"
    }

    override fun update():String{
        return ""
    }

    override fun create():String{
        return ""
    }

    override fun toString(): String {
        return super.toString()
    }

}