
// Functions

private fun myFunction(name: String) {
    println("hello, $name")
}


fun main() {

    // Nullability

    val instagramBio: String? = "growth"
    if (instagramBio != null) {
        println(instagramBio.uppercase())
    }
    println(instagramBio?.uppercase()) // Only calls if not null


    myFunction("Jay")
    println("Hello World!")

    // Variables

    val firstName = "Rahul" // val: read-only
    var weight = 160 // var: read and write
    val myVariable: Boolean = true

    // I am a comment!

    // Operators

    val s1 = "Call me"
    val s2 = " maybe"
    val combined = s1 + s2
    println(combined)

    val n1 = 9
    val n2 = 4
    val result = n1 + n2
    println(result)

    // Strings

    val myString = "KOTLIN"
    println(myString[0])
    println(myString[1])
    println(myString.isEmpty())
    println(myString.length)
    println(myString.substring(2, 4))
    println("The string is $myString")

    // Conditionals

    val examScore = 55
    if (examScore > 70) {
        println("You passed!")
    } else {
        println("You failed!")
    }

    // Collections

    val name1 = "Ali"
    val name2 = "Maya"
    val name3 = "Chen"
//    val names = listOf("Ali", "Maya", "Chen")
    // Note: By default, lists are immutable

    val names = mutableListOf<String>("Ali", "Maya", "Chen")
//    println(names[2])
//    names.add("Dmytro")
//    names.add(80) // compile error since list is String typed

    // For Loops

    for (name in names) {
        println(name)
    }
// All numbers including last
    for (i in 1..5) {
        println(i)
    }
// All numbers excluding last
    for (i in 1 until 5) {
        println(i)
    }




}