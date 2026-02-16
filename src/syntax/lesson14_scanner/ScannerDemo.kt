package syntax.lesson14_scanner

import java.util.Scanner

fun main() {

    val scanner: Scanner = Scanner(System.`in`);


    print("Enter your name: ")
    val name = scanner.nextLine()
    println("Your name is $name")

    print("Enter your age: ")
    val age = scanner.nextInt()
    println("You are $age old")

    print("Enter your name by kotlin method: ")
    val nameByKotlin = readLine()
    println("Name by kotlin method: $nameByKotlin")

    print("Enter your age by kotlin method: ")
    val ageByKotlin = readln().toIntOrNull() ?: 0
    println("Age by kotlin method: $ageByKotlin")





}