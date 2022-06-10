package flow

import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    val f = flow {
        for (i in 1..3) {
            emit(i)
        }
    }

    f.collect { value -> println("1: ${value}") }
    f.map { value -> value * 2 }.collect { value -> println("2: ${value}") }
    (1..3).asFlow().collect { value -> println("3: ${value}") }
}

