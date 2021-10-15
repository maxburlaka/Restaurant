package Restaurant

abstract class Ingredients(val id: Int, val nameIngredients: String, val quantity: Int){

}

class Carrot(): Ingredients(1,"Carrot",20){

}

class Potatoes(): Ingredients(2,"Potatoes",48){

}
class Onion(): Ingredients(3,"Onion",13){

}
open class Meat(val idMeat: Int, val meetType: String): Ingredients(4,"Meat",63){

}
class MeetType1():Meat(1,"Pork"){

}

class MeetType2():Meat(2,"Mutton"){

}
class Cabbage(): Ingredients(5,"Cabbage",15){

}