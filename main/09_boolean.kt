fun main(){
    val PinjamDuluSeratus = 100
    val GueCumaAdaLimaPuluh = 50
    val Output1 = PinjamDuluSeratus < GueCumaAdaLimaPuluh
    val Output2 = PinjamDuluSeratus > GueCumaAdaLimaPuluh
    
    val Output = PinjamDuluSeratus == GueCumaAdaLimaPuluh
    println(Output)

    println(Output1 && Output2)
    println(100 > 50 && 100 == 100)
}