fun main(){
    // topik anime

    // bilangan bulat
    println("Bilangan Bulat")
    // bagian byte
    var BilanganPendek: Byte = 50
    println("Byte   : " + BilanganPendek)
    // bagian int
    var Eps: Int = 100_000
    println("int    : " + Eps)
    // float
    var BilanganShort: Short = 200
    println("short  : " + BilanganShort)
    // long
    var BilanganPanjang: Long = 1_000_000_000L
    println("long   : " + BilanganPanjang)

    // bilangan desimal
    println("\nBilangan Desimal")
    // float
    var BilanganFloat: Float = 9.5F
    println("float  : " + BilanganFloat)
    // double
    var BilagnanDouble: Double = 95.5
    println("double : " + BilagnanDouble)

    // beda tipe hex,bin normal
    println("\nbeda tipe hex,bin dan normal")
    var Normal: Int = 15
    println("Normal : " + Normal)
    var Hex: Int = 0xfe123e
    println("Hex    : " + Hex)
    var Bin: Int = 0b101
    println("Bin    : " + Bin)

    // convert bilangan
    println("\nBagian convert")
    var Int1: Int = 20
    var Tobyte: Byte = Int1.toByte()
    println("Hasil  : " + Tobyte)

    // char
    println("\nBagian Char")
    var Char1: Char = 'T'
    var Char2: Char = 'u'
    var Char3: Char = 'r'
    var Char4: Char = 'u'
    print(Char1)
    print(Char2)
    print(Char3)
    print(Char4)

    // boolean
    println("\n\nBoolean")
    var Truuwe: Boolean = true 
    var Falsee: Boolean = false 
    println(Truuwe)
    println(Falsee)

    
}