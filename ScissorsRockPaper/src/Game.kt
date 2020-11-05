
fun main (args: Array<String>){
    val options = arrayOf("Scissors", "Rock", "Paper")
    val gameChoice = getGameChoice(options)
    val userChoice = getUserChoice(options)
    printResult(userChoice, gameChoice)

}

fun getGameChoice(optionsParam: Array<String>) =
    optionsParam[(Math.random() * optionsParam.size).toInt()]


//將 options 陣列當成參數傳給getUserChoice，並且讓它回傳使用者的選項(一個String)
fun getUserChoice(optionParam: Array<String>) : String{

    //1.確定使用者不是輸入 null
    //2.檢查使用者的選者是不是屬於 options 陣列
    //3.執行迴圈，直到使用者輸入有效的選項為止
    var isValidChoice = false //是否輸入有效的選擇
    var userChoice = ""
    while (!isValidChoice){  //持續執行迴圈，直到isValidChoice是true
        //要求使用者做出選擇
        println("Please enter one of the following:")
        for (item in optionParam) print(" $item")
        println(".")
        //從輸出視窗讀取使用者的選擇(使用 readLine()函式來讀取使用者的輸入
        //capitalize()將userInput的String改成首字母大寫 userInput = userInput.capitalize()
        val userInput = readLine()?.capitalize()

        // 驗證使用者輸入，確認輸入的不是null，而且是options陣列的選項
        if (userInput != null && userInput in optionParam){
            isValidChoice = true //如果輸入的選項沒有問題，就停止迴圈
            userChoice = userInput
        }
        //如果選擇是有無效的，通知使用者
        if (!isValidChoice) println("You must enter a valid choice.")

    }
    return userChoice
}

fun printResult(userChoice: String, gameChoice: String){
    val result: String
    //判斷結果
    if (userChoice == gameChoice)  result = "Tile!"
    else if ((userChoice == "Rock" && gameChoice == "Scissors") ||
            (userChoice == "Paper" && gameChoice == "Rock") ||
            (userChoice == "Scissors" && gameChoice == "Paper"))
        result = "You win!"
    else result = "You lose!"
    println("You chose $userChoice. I chose $gameChoice. $result")

}

/**
//for 迴圈練習
fun main(){
    var x = 0
    var y = 20
    for (outer in 1 ..3){
        for (inner in 4 downTo 2) {
            //x+=6
            //x--
            //y = x+y
            //y=7

            //x = x + y
            //y = x - 7

            x = y
            y++

            y++
            x +=3
            println("inner $x  $y")
        }
        y -=2
        print("$outer.outer：")
        println(" $x  $y")
    }
    println("=====================")
    println("$x  $y")
}
 */