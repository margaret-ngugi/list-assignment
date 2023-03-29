fun main() {
    //Q1.
    println()
    println(vehicleObject(listOf()))


}
//Q1.
fun createNamesList(names:String):Int{
    val namesList = listOf("Agnes","Linda","Mary","John","Faith","Mercy","Joan","Marion","Daniel","Diana")
    val  evenNames = names.filterIndexed { index, name -> index %2==0  }
    return evenNames.length

}
//Q2.
fun peopleHeight(names: String,height:Int):Int{
    val people = listOf("Mary",40.0,"John",30.5,"Agnes",35.0,"Faith",42.0)

    return height

}
//Q3.
data class person(var names: String,var  age:Int,var height: Int,var  weight:Int)
fun personObjects(){
    val person1 = person("Agnes", 23, 2, 40)
    val person2 = person("Linda", 24, 3, 65)
    val person3 = person("John", 25, 2, 55)
    val personList = listOf(person1, person2, person3)
    val sorted = personList.sortedByDescending { person -> person.age }

}
//4.
fun people (){
val person1 = person("Agnes",23,2,40)
val person2 = person("Linda",24,3,65)
val person3 = person("John",25,2,55)
val personList = listOf(person1,person2,person3)
}




//Q5.
data class vehicle(var registration:String,var mileage:Int)
fun vehicleObject(vehicle: List<vehicle>):Int{
var x = vehicle("KWSCF",42)
    var w = vehicle("KWCFT",60)
    var z = vehicle("Kwerd",80)
    var allVehicles = listOf(x,w,z)
    var avg=0
    vehicle.forEach { car ->
        car.mileage
        avg += car.mileage
    }
        var totalAvg=vehicle.count()
        return totalAvg
    }












