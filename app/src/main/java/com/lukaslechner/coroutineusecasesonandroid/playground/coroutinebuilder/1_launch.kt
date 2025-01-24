package com.lukaslechner.coroutineusecasesonandroid.playground.coroutinebuilder

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

//
fun main() = runBlocking<Unit> {
        launch {
            delay(1000)
            println("printed from within coroutine")
        }

    println("Main ends 2")
}