expect val x: Int

expect fun foo(arg: Int): Int

fun use() {
    val y = x
    println(y)
    val z = foo(y)
    println(z)
}