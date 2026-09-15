package com.vdidev.atm.study.service

import com.vdidev.atm.study.model.AtmStatDto
import org.springframework.stereotype.Component

@Component
class AtmStatService {
    fun handleStat(atmStatDto: AtmStatDto) {
        println(atmStatDto.toString())
    }
}