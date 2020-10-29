//建立陣列 arrayOf()
fun main(args: Array<String>) {
    val wordArray1 = arrayOf("24/7", "multi-tier", "B-to-B", "dynamic", "pervasive")
    val wordArray2= arrayOf("empowered", "leveraged", "aligned", "targeted")
    val wordArray3 = arrayOf("process", "paradigm", "solution", "portal", "vision")

    val arraySize1 = wordArray1.size
    val arraySize2 = wordArray2.size
    val arraySize3 = wordArray3.size

    // Math.random() 會回傳一個介於 0 和 (最多) 1 之間的亂數
    // 先將它乘以陣列的項目數量，再用 toInt()將結果轉成整數。
    val rand1 = (Math.random() * arraySize1).toInt()
    val rand2 = (Math.random() * arraySize2).toInt()
    val rand3 = (Math.random() * arraySize3).toInt()
    
    // String 模板，若要在String加上變數的值，只要在String裡面加上 $ 即可。
    val phrase = "${wordArray1[rand1]}  ${wordArray2[rand2]}  ${wordArray3[rand3]}"
    println(phrase)
    // 在String裡面計算運算式
    val word = "wordArray is ${if (wordArray1.size > 10) "large" else "small"}"
    println(word)
}