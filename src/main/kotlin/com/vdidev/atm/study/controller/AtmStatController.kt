package com.vdidev.atm.study.controller

import com.vdidev.atm.study.model.AtmStatDto
import com.vdidev.atm.study.service.AtmStatService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/atm_stat")
class AtmStatController(
    private val atmStatService: AtmStatService
) {
    @PostMapping
    fun handleStat(atmStatDto: AtmStatDto): ResponseEntity<Nothing> {
        atmStatService.handleStat(atmStatDto)
        return ResponseEntity.noContent().build()
    }
}