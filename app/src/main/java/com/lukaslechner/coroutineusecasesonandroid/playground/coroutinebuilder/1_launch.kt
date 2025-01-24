package com.lukaslechner.coroutineusecasesonandroid.playground.coroutinebuilder

import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


fun main() = runBlocking<Unit> {
     val job =   launch(start = CoroutineStart.LAZY) {
           networkRequest()
         println("result received")
        }

    delay(200)
    job.start()
    job.join()
    println("end of runblocking")
}

suspend fun networkRequest() : String {
    delay(500)
    println("network result")
    return "network result"
}