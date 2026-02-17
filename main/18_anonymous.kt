// v1 sih agak gj :v
// nanti di fix

fun Sipalinganonimous(Input:String, Landak:(String) -> String): String {
    val output = Landak(Input)
    return "Hai Sipaling $output"
}

val anonymousUser = fun(Input:String): String{
    if (Input == ""){
        return "LahKosong"
    } else {
        return Input.uppercase()
    }
}

fun main(){
    println(Sipalinganonimous("tersembunyi",{Input:String -> Input.uppercase()}))
    println(Sipalinganonimous("",anonymousUser))
}