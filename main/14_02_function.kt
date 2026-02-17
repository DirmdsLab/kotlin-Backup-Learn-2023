// pahami aja :)
// part 1
fun String.PrintIni(): Unit = println("Print : $this")

// part 2
infix fun String.to(Type:String): String {
    if(Type == "UP"){
        return this.uppercase()
    } else {
        return this.lowercase()
    }
}

// part 3
fun NumOut(Input:Int): Int {
    return if (Input < 5){
        5
    } else {
        10
    }
}

fun NumOUt2(Input:Int): Int {
    return when(Input){
        5 -> 50
        4 -> 40
        else -> 0
    }
}

// rekursif

fun factorial(Input:Int): Int {
    return when(Input){
        1 -> 1
        else -> Input * factorial(Input - 1)
    } 
}

fun main(){
    // part 1
    val SayaAdalahRobot = "MendingTuru"
    SayaAdalahRobot.PrintIni()
    "Saya Adalah Robot".PrintIni()

    // part 2
    var Output = "MendingTuru" to "UP"
    println(Output)
    
    // part 3
    var Num = NumOut(99)
    println(Num)

    var Num2 = NumOUt2(1)
    println(Num2)

    // part 4 local function
    fun OrangLokal(){
        println("Gw orang lokal")
    }
    OrangLokal()

    // faktorial
    println(factorial(5))

} 