import kotlin.random.Random

fun main() {
    val symbols = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!@#\$%^&*()_+-={}[];:'\"<>,.?/|~`\\"

    val numbers = symbols.take(10)
    val numbersAndLetters = symbols.take(36)
    val numbersAndFullLetters = symbols.take(62)

    print("Input pasword length: ")
    val passwordLength= readLine()?.toInt() ?:0

    print("Password types: \n 1) Only numbers \n 2) numbers and small letters \n 3) numbers, small letters, big letters \n 4) All symbols \n Input the password type: ")
    val passwordType = readLine()?.toInt() ?:0

    print("Input count of iterations: ")
    val count= readLine()?.toInt() ?:0

    print("Result: \n")

    for(iter in 1..count) {
        print("$iter) ")
        for( i in 1..passwordLength ) {
            when {
                passwordType == 1 -> print(numbers.random())
                passwordType == 2 -> print(numbersAndLetters.random())
                passwordType == 3 -> print(numbersAndFullLetters.random())
                passwordType == 4 -> print(symbols.random())
            }
        }
        print("\n")
    }
}