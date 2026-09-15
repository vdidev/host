package com.vdidev.atm.study.model

import java.time.Instant

data class AtmStatDto(
    val atmId: Long,
    val statDate: Instant
)
