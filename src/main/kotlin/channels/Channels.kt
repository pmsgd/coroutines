package channels

import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    val channel = Channel<Int>(10)

    launch {
        for (x in 1..5) {
            channel.send(x * x)
        }
        channel.close()
    }

    for (y in channel) {
        println(y)
    }
    println("Done!")
}
