fun main(){
    var output = 0

    // punya lambda
    val lambdaVal:() -> Unit = {
        println("Tambah terus")
        output++
    }
    // anonymous
    val sipaling = fun(): Unit{
        println("Tambah Dari Sipaling")
        output++
    }
    fun Biasa(){
        println("Biasa")
        output++
    }
    Biasa()
    sipaling()
    lambdaVal()
    Biasa()
    sipaling()
    lambdaVal()
    // gitulah pahami aja
    println(output)
}