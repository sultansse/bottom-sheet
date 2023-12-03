package com.softwareit.bottom_sheet.model

data class Station(
    val id: Int,
    val image: Int,
    val name: String,
    val location: String,
    val city: String,
    val availablePorts: Int,
)
