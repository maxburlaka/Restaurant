package Restaurant

abstract class Restaurant(val number_of_halls: Int, val size: Int, val  number_of_tables: Int) {

}
class Hall1(): Restaurant(1,200,25){

}

class Hall2(): Restaurant(2,150,20){

}

class Hall3(): Restaurant(3,120,10){

}