fun main(){
    // bagian 1
    val DataArray: Array<String> = arrayOf("Kimi no turu","The power of turu","no turu no life")
    for (i in DataArray){
        println(i)
    }

    // bagian 2
    for (i in 0..100){
        println("Mending Turu $i")
    }
    
    // bagian 3
    var TotalData = 0
    for (i in DataArray){
        TotalData++
        print("Data Ke : $TotalData = ")
        println(i)
    }

}