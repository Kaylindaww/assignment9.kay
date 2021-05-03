fun main(){
    println(Name(listOf("akullu","kay","linda","ivan","mark","florence", "julie", "desire","janice","harriet")))

    var heights=listOf(34.3f,20.3f,50.5f,10.5f)
    var sumAvgHeight=avgHeight(heights)
    println(sumAvgHeight.sum)
    println(sumAvgHeight.average)


    var human= mutableListOf(
        Persons("akullu",19,78.0f,60),
        Persons("kay",29,67.0f,45),
        Persons("linda",23,59.0f,50),
        Persons("desire",16,69.0f,70),
    )
    var descendingAge= human.sortedByDescending{persons->persons.age}
    println(descendingAge)


    addPeople()

    var subaru= listOf(
        Cars("UG0009",200.4),
        Cars("UD111K",100.0),
        Cars("UK984G",550.0),
    )
    var averageMileage=car(subaru)
    println(averageMileage)
}

fun Name(names:List<String>):List<String>{
    return names.filterIndexed { index, name ->index%2==0  }
}

data class ListSumAvg(var sum:Float, var average:Double)
fun avgHeight(height:List<Float>): ListSumAvg{
    var sum =height.sum()
    var average=height.average()
    var sumavgHeight=ListSumAvg(sum, average)
    return sumavgHeight

}
data class Persons(var name:String, var age:Int, var height:Float, var weight:Int)

data class People(var name:String, var age:Int, var height:Float, var weight:Int)
fun addPeople(){
    var person=mutableListOf(
        Persons("akullu",21,50.5f,60),
        Persons("kay",29,67.0f,45),
        Persons("linda",23,59.0f,50),
        Persons("desire",16,69.0f,70)
    )
    var addingList= person.addAll(listOf(
        Persons("Irene",10,70.0f,55),
        Persons("Joseph",70,65.0f,85),
    ))
    println(person)
}
data class Cars(var registrations:String,var mileages:Double)
fun car(vehicles:List<Cars> ):Double {
    var speed = vehicles.sumOf {cars->cars.mileages}
    var average=speed/vehicles.count()

    return average

}













