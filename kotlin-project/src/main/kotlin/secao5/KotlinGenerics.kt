package br.com.moisesdias.secao5


fun main() {

    val maxInt: Int = max(10, 20)
    val maxLong: Long = max(13L, 21L)
    val maxByte: Byte = max((-128).toByte(), (127).toByte())
    val maxString: String = max("Apple", "Banana")

    println("The maximum integer is: $maxInt")
    println("The maximum long is: $maxLong")
    println("The maximum byte is: $maxByte")
    println("The maximum string is: $maxString")
}