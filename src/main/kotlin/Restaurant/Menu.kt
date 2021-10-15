package Restaurant

abstract class Menu(val id: Int, val sectionName: String){
}

class FirstCourse(): Menu(1,"FirstCourse"){

}

class SecondCourse(): Menu(5,"SecondCourse"){

}

class Drink(): Menu(10,"Drink"){

}

class Alcohol(): Menu(15,"Alcohol"){

}

class Dessert(): Menu(20,"Dessert"){

}