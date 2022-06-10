package contexts

import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    launch(Dispatchers.Default + CoroutineName("test")) {
        println(
            "I'm working in thread ${Thread.currentThread().name} " +
                    "with coroutine name ${coroutineContext.get(CoroutineName)?.name}"
        )
    }
    println("Main thread is ${Thread.currentThread().name}")
}
