package com.lukaslechner.coroutineusecasesonandroid.playground.coroutinebuilder

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main() {
        GlobalScope.launch {
        delay(1000)
            println("printed from within coroutine")
        }
}