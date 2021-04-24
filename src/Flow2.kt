fun main(){
    println(isEven(45))
    var product = Product("Rice",25.5,30,"Groceries")
    var product2 = Product("Bathing Soap",10.5,15,"Hygiene")
    var product3 = Product("Car",1000.00,250000,"Vehicle")
    product.items()
    product2.items()
    product3.items()
    println(fruit("tomato"))
    println(studentNames(arrayOf("Kaitlyn","Janine","Valary","Jane","Eve","Eunice")))

}
fun isEven(number:Int):Boolean{
    if(number%2 == 0){
        return true
    }
    else {
        return false
    }
}


data class Product(var name:String,var weight:Double,var price:Int,var category:String){

    fun items(){
        when (category){
            "Groceries" -> println(mutableListOf(name,weight,price,category))
            "Hygiene" -> println(mutableListOf(name,weight,price,category))
            else -> println(mutableListOf(name,weight,price,category))
        }
    }
}

fun fruit (fruitName:String):String{
    var nameOfFruit = " "
    for (names in fruitName){
        if(fruitName.indexOf(names)%2== 0){
            nameOfFruit += names
        }
    }
    return nameOfFruit
}
fun studentNames (names:Array<String>):MutableList<String>{
    var nameList = mutableListOf<String>()
    for (name in names){
        if (name.length%2 == 0){
            nameList.add(name)
        }
    }
    return nameList
}

