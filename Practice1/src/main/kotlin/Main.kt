fun main(args: Array<String>) {
    //Zd 1
    val exercises: Int = 15
    var exercisesSolved: Int = 0

        //Zd 2
    val myAge: Int =  19

    //Zd 3
    var myyAge: Double = 19.0
    var otherPersonAge: Double = 30.0
    myyAge =(myAge + otherPersonAge) / 2
    println("Новое значение myAge: $myyAge")

    //Zd 4
    val testNumber = 17
    val evenOdd = testNumber % 2
    println("Значение evenOdd: $evenOdd")
    //% делит константу на 2, оставляя остаток 1

    //Zd 5
    var answer = 0
    answer += 1
    answer += 10
    answer *= 10
    answer = answer shr 3

    println("Конечный результат: $answer")

    //Zd 6
    val aage: Int = 19
    println(aage)
    val age: Int = 30
    println(age)
    // Переменная не изменяется, поэтому её можно объявить как val

    //Zd 7
    val a: Int = 2
    val b: Int = 3
    //1
    val answer1: Int = (a * 100) + b
    println("=$answer1")
    //2
    val answer2: Int = (a * 100) + (b * 100)
    println("=$answer2")
    //3
    val answer3: Int = (a * 100) + (b / 10)
    println("=$answer3")

    //Zd 8
    var primerSoSkobkami: Int = (5 * 3 )- (4 / 2) * 2
println(primerSoSkobkami)

    //Zd 9
    val c: Double = 2.2
    val m: Double = 6.1
    val average: Double = (c + m) / 2
    println("Среднее арифметическое c и m: $average")

    //Zd 10
    val fahrenheit: Double = 77.0
    val celsius: Double = (fahrenheit - 32) / 1.8
    println("температура в градусах цельсия: $celsius")

}