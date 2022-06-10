package concurrency

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import kotlinx.coroutines.withContext

fun main() = runBlocking {
    val mutex = Mutex()

    withContext(Dispatchers.Default) {
        // massiveRun function and counter variable are in SingleThread file
        massiveRun {
            mutex.withLock {
                counter++
            }
        }
    }
    println("Counter = $counter")
}
