const val NamaFile = "Variabel"
const val Version = 12 

fun main(){

    // langsung detec auto
    var Judul = "Kimi No Turu"
    val Studio = "TuruLab"
    println("Judul  : $Judul\nStudio : $Studio\n")

    // null tidak di sarankan katanya
    var Penonton: String? = null
    println("Penonton : $Penonton")
    println("Panjang  : ${Penonton?.length}")

    Penonton = "Kaum Mendang Mending"
    println("Penonton : $Penonton")
    println("Panjang  : ${Penonton.length}\n")

    println("Nama File : $NamaFile")
    println("Version   : $Version")
}