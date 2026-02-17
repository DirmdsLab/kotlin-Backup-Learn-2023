// kacau dikit lanjut part 2 :v

// bagian 1
fun pinjamDuluSeratu(){
    println("Pinjam Dulu Seratus")
}

// bagian 2
fun printDataAnime(Judul:String, Eps:Int){
    println("Judul : $Judul")
    println("Eps   : $Eps")
}

// bagian 3
fun printDataAnimeDefault(Judul:String = "Kagak ada", Eps:Int? = null){
    println("Judul : $Judul")
    println("Eps   : $Eps")
}

// bagian 4
fun printDataAnimeV2(Judul:String, Eps:Int, Studio:String): Unit { // buat defaultnya tidak mengembalikan data
    println("Judul  : $Judul")
    println("Eps    : $Eps")
    println("Studio : $Studio")
}
// sama kek void di cpp

// bagian 5 return
fun penjumlahan(X:Int,Y:Int): Int {
    return X + Y
}

fun Pembagian(X:Int,Y:Int): Int {
    if(Y == 0){
        return 0
    } else {
        return X / Y
    }
}


// bagian 6
fun kuadrat(Input:Int): Int = Input * Input
fun PrintAngka(Input:Int): Unit = println("Hasilnya : $Input")

// bagian 7 masukin aja ke logika :v
fun apaIni(Name:String,Eps:String,vararg Hmph:Int){
    println("Nama : $Name")
    println("Eps  : $Eps")
    var Total = 0
    for (i in Hmph) {
        Total += i
    }
    println("Hasil : $Total")
}



fun main(){
    // bagian 1
    pinjamDuluSeratu()
    pinjamDuluSeratu()
    pinjamDuluSeratu()

    // judul anime
    printDataAnime("Kimi no turu",24)
    printDataAnime("no turu no life",13)

    // bagian 3
    printDataAnimeDefault()

    // bagian 4
    printDataAnimeV2(
        Studio = "DirmdsLab",
        Judul = "No Turu No Life",
        Eps = 23
    )

    // tambah tambah dan bagi bagi yeee :v
    val Total = penjumlahan(10,5)
    println(Total)

    println("Bagi 25 dibagi 5 = ${Pembagian(25,5)}")

    // bagian 6
    PrintAngka(kuadrat(5))

    // bagian 7
    apaIni("LordTuru","14",10,10,10,10,10)
}

// bisa di pahami lah
// kacau dikit ngak ngaruh :v