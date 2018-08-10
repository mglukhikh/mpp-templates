package test

expect fun testMe()

fun hello() {
    println("Hello, world!")
    testMe()
    println("Testing finished!")
}

