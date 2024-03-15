fun main(args: Array<String>) {
    var car = Car("Toyota", "Prado", "KDD 123F", 0)
   println(car.make)
    car.start()
    println(car.speed)
    car.accelerate(accelerate=40)
    println(car.speed)
    car.accelerate(accelerate = 80)
    car.decelerate(decelerate = 20)
    println(car.speed)
    car.hoot()
    println(car.speed)
    car.stop()
    println(car.speed)

    var myBook= Book("Tell me lies", "Teresa Driscoll", 354)
    println(myBook.author)
    println(myBook.pages)
    println(myBook.tittle)
    var car2 = Car("Subaru", "outback","KDF 345Y",0)


}
class Car(val make:String, var model: String, var registration: String, var speed: Int) {
    fun start() {
        println("chogioongooo vrooom")

    }

    fun accelerate(accelerate: Int): Int {
        speed += accelerate
        return speed

    }

    fun decelerate(decelerate: Int): Int {
        speed -= decelerate
        return speed
    }

    fun hoot() {
        println("prariropararirooo")
    }

    fun stop() {
        speed = 0                  //the two are the same
        decelerate(speed)
    }
}
    data class Book(
        var tittle:String,
        var author:String,
        var  pages: Int
    )
    data class AgeStats(
        var minAge: Int,
        var maxAge: Int,
        var average: Double,
        var total: Int
    )
    fun calaculateAgeStart(ages:Array<Int>):AgeStats{
        val min = ages.minOrNull()!!
        var max = ages.maxOrNull()!!
        var avg = ages.average()
        var total = ages.sum()
        var result = AgeStats(min, max, avg, total)
        return result


    }

