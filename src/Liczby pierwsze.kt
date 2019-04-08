
/////functions////////////////////////////////////////////////////////////////////////////////////
fun readNumbers(counRead: Int, arrayToCheck: IntArray){//pobiera liczby do sprawdzeniea
    for (i in 0..(counRead-1)){
        //numbersToCheck.add(readLine().toString().toInt())
        arrayToCheck[i]= readLine().toString().toInt()
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

fun checkAllNumbers(arrayToCheck: IntArray){//przelatuje i sprawdza wszystkie liczby czy są pierwsze

    for(i:Int in arrayToCheck){//for-each
        println(isItPrimeNumber(i))
    }
}
////variables///////////////////////////////////////////////////////////////////////////////////////
//val numbersToCheck:ArrayList<Int> = arrayListOf<Int>()


fun main(args: Array<String>){

    val howManyTest = readLine().toString().toInt()
    var numbersToCheck = IntArray(howManyTest)
    //println( howManyTest)

    readNumbers(howManyTest, numbersToCheck)
    checkAllNumbers(numbersToCheck)
}