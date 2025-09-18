package org.example.ie.setu.types

fun main(){
    println("Hello World !")
    println("Working with Variables and Types")

    println("doubleNumber value is: " + doubleNumber + ", and the type is: " + doubleNumber.javaClass)
    println("floatNumber value is:  " + floatNumber + ", and the type is: " + floatNumber.javaClass)
    println("longNumber value is:   " + longNumber + ", and the type is: " + longNumber.javaClass)
    println("intNumber value is:    " + intNumber + ", and the type is: " + intNumber.javaClass)
    println("shortNumber value is:  " + shortNumber + ", and the type is: " + shortNumber.javaClass)
    println("byteNumber value is:   " + byteNumber + ", and the type is: " + byteNumber.javaClass)

    println("\nUsing underscores to make values more readable:")
    println("\t" + oneMillion + " - the type is: " + oneMillion.javaClass)
    println("\t" + threeThousand + " - the type is: " + threeThousand.javaClass)
    println("\t" + creditCardNumber + " - the type is: " + creditCardNumber.javaClass)

    println("aChar: " + aChar + " - the type is: " + aChar.javaClass)
    println("bChar: " + bChar + " - the type is: " + bChar.javaClass)

    println("aFlag: " + aFlag + " - the type is: " + aFlag.javaClass)
    println("bFlag: " + bFlag + " - the type is: " + bFlag.javaClass)


}
val doubleNumber = 1200.45
val floatNumber = 700.78f
val longNumber = 98765432L
val intNumber = 123456
val shortNumber = 345
val byteNumber = 127


val oneMillion = 1_000_000
val threeThousand = 3_000
val creditCardNumber = 1234_4321_5678_8765


val byteNum: Byte = 10              //static type check: OK
val intNum: Int = byteNum.toInt()   //explicit conversion: OK

val floatNum: Float = byteNum.toFloat()
val doubleNum: Double = intNum.toDouble()

//characters in kotlin
val aChar = 'a'			//type inference
val bChar: Char = 'b'   //explicitly defining the type

//booleans in kotlin
val aFlag = true
val bFlag: Boolean = false
