fun main(){
    // anggap aja fps :v
    // val LagDikitNgakNgaruh = 165
    // val LagDikitNgakNgaruh = 55 
    // val LagDikitNgakNgaruh = 35 
    // val LagDikitNgakNgaruh = 24 
    val LagDikitNgakNgaruh = 8 

    val Fps = LagDikitNgakNgaruh // cuma untuk mempersingkat ketika di if

    if (Fps >= 60){
        println("Fix Device Gaming")
    } else if (Fps >= 45){
        println("Mayan lah")
    } else if (Fps >= 30){
        println("Asal Bisa main lancar udah bagus")
    } else if (Fps >= 24){
        println("Dah Bang jangan di paksain")
    } else {
        println("Lag Dikit ngak ngaruh :v")
    }
    // gitu lah kira kira
}