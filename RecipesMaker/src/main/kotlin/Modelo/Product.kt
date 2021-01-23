package Modelo

abstract class Product(var name:String, var description:String, var sku:Int) {

    override fun toString(): String {
        return "Name: $name \nDescription: $description \nSku: $sku"
    }

}