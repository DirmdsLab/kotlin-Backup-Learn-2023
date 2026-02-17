// pahami aja

fun PrintName(Input:String, Tipe:(String) -> String): String {
    val output = Tipe(Input)
    return "Hai Lord $output"
}

fun main(){
    val HurufBesar = {input:String ->
        input.uppercase()
    }
    val HurufKecil = {input:String ->
        input.lowercase()
    }
    val name = PrintName("Rebahan",HurufBesar)
    println(name)
    println(PrintName("Kayang",HurufKecil))

    val output = PrintName("Turu") {Input:String ->
        Input.uppercase()
    }
    println(output)

    println(PrintName("Isekai") {Input:String ->
        Input.lowercase()
    })

}