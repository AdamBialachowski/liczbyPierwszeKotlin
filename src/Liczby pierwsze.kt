import java.util.Scanner
import java.io.BufferedReader
import java.io.InputStreamReader

/////functions////////////////////////////////////////////////////////////////////////////////////
fun readNumbers(counRead: Int){//pobiera liczby do sprawdzeniea
    for (i in 1..counRead){
        println("podaj $i liczbę")
        numbersToCheck.add(reader.nextInt())
    }
}

fun isItPrimeNumber(valueToCheck: Int):String{//funkcja sprawdza czy liczba jest pierwsza
    var isItPrime: Int = 0
    if (valueToCheck<2)isItPrime = 1
    else {
        for (i in 2..(valueToCheck - 1)) {
            if (valueToCheck % i == 0) isItPrime = 1
        }
    }
    if (isItPrime==1)return "NIE"
    else return "TAK"
}



fun checkAllNumbers(){//przelatuje i sprawdza wszystkie liczby czy są pierwsze
//    for (i in 0..(numbersToCheck.size-1)){
//        println(isItPrimeNumber(numbersToCheck[i]))
//    }

    for(i:Int in numbersToCheck){//for-each
        println(isItPrimeNumber(i))
    }

}
////variables///////////////////////////////////////////////////////////////////////////////////////
val numbersToCheck:ArrayList<Int> = arrayListOf<Int>()
val reader = Scanner(System.`in`)
//val reader = BufferedReader(InputStreamReader(System.`in`))


fun main(args: Array<String>){
    println("Program sprawdza czy liczby które podasz są liczbami pierwszymi")
    println("Podaj ile liczb chcesz wprowadzić")

    val howManyTest = reader.nextInt()
    println(howManyTest)

    println("wprować $howManyTest liczb")

    readNumbers(howManyTest)
    checkAllNumbers()

}