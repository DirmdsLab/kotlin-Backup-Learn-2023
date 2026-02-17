fun main(){
    // string
    // \n cuma untuk nambah baris
    var Judul: String = "Kimi No Turu"
    var Studio: String = "TuruLab"
    println(Judul)
    println(Studio + "\n") 

    // string di gabung
    var Gabung: String = "Judul : $Judul Studio : $Studio"
    println(Gabung + "\n")

    // string berbaris
    var StringUp: String = """
    >Judul  : No Turu No Life
    >Studio : TuruLab
    >Eps    : 12
    """.trimMargin(">")
    println(StringUp + "\n")

    // ambil panjang string
    println("Panjang String Dari : $Studio Adalah : ${Studio.length}")
}