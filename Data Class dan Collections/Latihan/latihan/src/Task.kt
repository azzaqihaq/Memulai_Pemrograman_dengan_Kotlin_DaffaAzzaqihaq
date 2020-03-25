fun main() {

    // TODO 1
    val user = mapOf<String , String>("type" to "Motorcycle","maxSpeed" to "230Km/s","maxTank" to "10Ltr")

    // TODO 2
    val type = user.getValue("type")
    val maxSpeed = user.getValue("maxSpeed")
    val maxTank = user.getValue("maxTank")

    // TODO 3
    println("Vehicle")
    println("Type: $type")
    println("Maximal Speed: $maxSpeed")
    println("Maximal Tank: $maxTank")

}