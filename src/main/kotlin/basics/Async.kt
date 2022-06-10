package basics

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    val result = async {
        delay(1000L)
        "World!"
    }
    println("Hello ${result.await()}")
}
