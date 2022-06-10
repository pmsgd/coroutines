package flow

import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    // standard way
    try {
        (1..3).asFlow().collect { value -> println(value) }
    } finally {
        println("Done")
    }

    // declarative catch
    (1..3).asFlow().catch { e -> println("Caught $e") }.collect { value -> println(value) }
}
