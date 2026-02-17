fun main(){
    // range 1
    val PinjamDuluSeratus = 1..100
    println(PinjamDuluSeratus)
    println(PinjamDuluSeratus.count()) // cek jumlah range
    println(PinjamDuluSeratus.contains(50)) // cek adakah seratus :v
    println(PinjamDuluSeratus.first)
    println(PinjamDuluSeratus.last)

    // range 2
    val TestKelipatan = 100 downTo 1 step 5
    println(TestKelipatan)
    println(TestKelipatan.count()) // cek jumlah range
    println(TestKelipatan.contains(50)) // cek adakah seratus :v
    println(TestKelipatan.first)
    println(TestKelipatan.last)

    // gitulah
}