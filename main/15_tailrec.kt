// versi print

tailrec fun printNum(Input:Int){
    println("Bilangan ke : $Input")
    if(Input > 0){
        printNum(Input - 1)
    }
}

// versi faktorial
tailrec fun factorial(Input:Int, Hasil:Int = 1): Int{
    return when(Input) {
        1 -> Hasil
        else -> factorial(Input - 1, Input * Hasil)
    }
}


fun main(){
    printNum(10)
    println(factorial(5))
}