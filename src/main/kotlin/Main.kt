import kotlinx.coroutines.*

suspend fun main() = coroutineScope {
    launch { doWork() }
    launch{ doWork1() }
    launch { doWork2()}
    Unit
}
suspend fun doWork() {
    for (i in 0..3) {
        delay(1000)
        print("tik-tik ")
    }
    println("zzzzzzzzzz")

}
suspend fun doWork1() {for (i in 0..5) {
    delay(1010)
    print("tic-tac ")
}
    println("zzzzzzzzzz")
}
suspend fun doWork2() {for (i in 0..8) {
    delay(1020)
    println("tak-tak ")
}
    println("zzzzzzzzzz")
}