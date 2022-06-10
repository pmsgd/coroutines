package contexts

import kotlinx.coroutines.newSingleThreadContext
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext

fun log(msg: String) = println("[${Thread.currentThread().name}] $msg")

fun main() {
    val ctx1 = newSingleThreadContext("Ctx1")
    val ctx2 = newSingleThreadContext("Ctx2")

    runBlocking(ctx1) {
        log("Started in ctx1")
        withContext(ctx2) {
            log("Working in ctx2")
        }
        log("Back to ctx1")
    }
}