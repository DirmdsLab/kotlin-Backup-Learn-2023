fun main(){
    // while normal
    var Output = 1
    while (Output <= 10){
        println("Turu Ke : $Output")
        Output++
    }

    println("\n")

    // do while
    Output = -1
    // do while
    do{
        println("Turu ke : $Output")
    } while(Output > 0)

    println("\n")

    // break and continue
    Output = 0
    while(true){
        Output++
        if(Output == 5){
            continue
        }
        println("Output ke : $Output")
        if(Output == 10){
            break
        }
    }
}