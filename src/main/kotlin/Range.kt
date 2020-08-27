fun main () {
    val rangeint = 1..10 step 2
    rangeint.forEach {
        print("$it")
    }
    if (7 in rangeint) {
        println("value 7 is aveilble")
    }
}