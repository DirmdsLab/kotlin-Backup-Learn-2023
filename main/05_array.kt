fun main(){
    // cara buat array
    val Judul: Array<String> = arrayOf("Kimi No Turu","No Turu No Life","The Power Of Turu")
    println(Judul[0])
    println(Judul.get(1))
    println(Judul[2])

    // versi int juga bisa
    val Eps: Array<Int> = arrayOf(12,24,1)
    println(Eps[0])
    println(Eps[1])
    println(Eps[2])

    // get size
    println("Size Dari Judul : ${Judul.size}");

    // test again
    println("Judul Ke 2 : ${Judul.get(1)}") // get member 
    Eps.set(2,13) // set nilai
    println(Eps[2])
    Judul[2] = "Hmph"
    println("Setelah Di Rubah ${Judul[2]}")

    // buat array null
    val Penonton: Array<String?> = arrayOfNulls(5)
    println(Penonton[0])

    // set array null
    Penonton[1] = "Kaum Mendang Mending"
    println("Hasil array null setelah di set : ${Penonton[1]}")
}