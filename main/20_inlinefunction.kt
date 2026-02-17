inline fun inLineFunction(Input1:() -> String): String {
    return "Hai ${Input1()}"
}

inline fun inLineFunction2(Input1:() -> String,
                           noinline Input2:() -> String): String{
    return "Hai ${Input1()} ${Input2()}"
}

fun main(){
    println(inLineFunction ({ "Turu" }))
    println(inLineFunction2({"Lord"},{"Turu"}))
}

// kalau dikit kagak efek bet tapi kalau loop banyak
// baru kerasa beratnya karena membuat obj mulu