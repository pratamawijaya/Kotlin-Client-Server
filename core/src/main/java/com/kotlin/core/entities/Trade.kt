package com.kotlin.core.entities


data class Trade(
        val trade_id: Long = 0,
        val rate: Double = 0.0,
        val amount: Double = 0.0,
        val trade_date: String = "",
        val trade_type: String = ""
)