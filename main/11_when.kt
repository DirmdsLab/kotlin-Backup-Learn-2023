fun main(){

    // ada bagian 1
    val Input1 = 2
    when(Input1){
        // cara 1
        12 -> println("Nilai Adalah 12")
        // cara 2
        13 -> {
            println("Baris 1")
            println("Baris 2")
        }
        // cara 3
        1,2,3,4,5 -> println("Masuk kategori penganguran profesonal")
        // cara memberi else
        else -> println("kagak ada yang sama")
    }

    // bagian 2

    val Ratting = "Z"
    val ListRatting = arrayOf("S","A","B","C","D")
    when(Ratting){
        in ListRatting -> println("Masuk tier")
        !in ListRatting -> println("Kagak Masuk tier")
    }

    // // bagian 3
    // val Output = "Turu"
    // when(Output){
    //     is String -> println("Dia String")
    //     !is String -> println("Dia bukan String")
    // } // agak keliru

    // bagian 4
    val Output = 3
    when {
        Output == 5 -> println("Nilai adalah 5")
        Output == 4 -> println("Nilai adalah 4")
        else -> println("Kagak ada nilai di list")
    }
}