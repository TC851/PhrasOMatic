// Applikation marketing slogans

fun main(args: Array<String>){

    val wordArray1 = arrayOf ("24/7","good life","fun","dynamic","creative")  // 3 Arrays mit Inhalten
    val wordArray2 = arrayOf ("think different","good food","competent","targeted")
    val wordArray3 = arrayOf ("process","free","solution","save money","vision")

    val arraySize1 = wordArray1.size   // die Länge der Arrays durch.size,wird zugewiesen an Variable arraySize
    val arraySize2 = wordArray2.size
    val arraySize3 = wordArray3.size


    val rand1 = (Math.random() * arraySize1).toInt()      // math.random,Methode zum erzeugen einer Zufallszahl
    val rand2 = (Math.random() * arraySize2).toInt()      // durch .toInt wird die Zahl in Integer konvertiert
    val rand3 = (Math.random() * arraySize3).toInt()


    val phrase = "${wordArray1 [rand1]} ${wordArray2 [rand2]} ${wordArray3[rand3]}"
    println(phrase)                                       // String-Template um 3 Wörter auszuwaählen und zu verbinden


}

