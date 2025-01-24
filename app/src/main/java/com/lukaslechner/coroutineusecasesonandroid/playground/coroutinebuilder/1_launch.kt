package com.lukaslechner.coroutineusecasesonandroid.playground.coroutinebuilder

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    // run blocking is a coroutine builder that blocks the current thread until the coroutine inside it is finished executing
    runBlocking {
        launch {
            delay(1000)
            println("printed from within coroutine")
        }
    }
    println("Main ends")
}