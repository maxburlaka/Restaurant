package Restaurant

abstract class Personal(val id: Int,val sex: String, val position: String, val first_name: String, val second_name: String){

}

class Director(): Personal(1,"Men","Director","Max", "Burlaka"){

}

class Administrator(): Personal(2,"Woman","Administrator","Ann", "Burla"){

}

class Bartender(): Personal(3,"Men","Bartender","Alexandr", "Protsenko"){

}

class Cook(): Personal(4,"Men","Cook","Aleksey", "Filimonov"){

}

class Waiter(): Personal(5,"Men","Waiter","Yuriy", "Hoi"){

}