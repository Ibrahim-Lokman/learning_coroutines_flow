package com.lukaslechner.coroutineusecasesonandroid.playground.coroutinebuilder

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


fun main() = runBlocking<Unit> {
     val job =   launch {
           networkRequest()
         println("result received")
        }

    job.join() // wait for the job to finish
    println("end of runblocking")
}

suspend fun networkRequest() : String {
    delay(500)
    println("network result")
    return "network result"
}