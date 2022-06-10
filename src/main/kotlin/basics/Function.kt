package basics

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    launch {
        doFunction()
    }
    println("Hello")
}

suspend fun doFunction() {
    delay(1000L)
    println("World!")
}
