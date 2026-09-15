package com.vdidev.atm.study

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AtmHostApplication

fun main(args: Array<String>) {
    runApplication<AtmHostApplication>(*args)
}
