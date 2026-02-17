// bagian 1
val lambda_pertama:(String,String) -> String = { Input1:String, Input2:String ->
    val output = "Hai $Input1 $Input2"
    output
}
// bagian 2
val lambda_kedua:(String) -> String = {
    "Hai $it"
}

// bagian 3
fun fungsi(Input:String): String {
    val output = "Hai $Input"
    return  output
}

val lambda_ketiga:(String) -> String = ::fungsi

fun main(){
    // bagian 1
    val test_lambda = lambda_pertama("Lord","Turu")
    println(test_lambda)

    // bagian 2
    val test_lambda_dua = lambda_kedua("Turu")
    println(test_lambda_dua)

    // bagian 3
    val test_lambda_ketiga = lambda_ketiga("Turuuu")
    println(test_lambda_ketiga)
}