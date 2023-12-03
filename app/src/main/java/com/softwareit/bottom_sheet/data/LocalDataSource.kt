package com.softwareit.bottom_sheet.data

import com.softwareit.bottom_sheet.model.Station
import com.softwareit.bottom_sheet.R

object LocalDataSource {
    val stationList = listOf(
        Station(
            id = 1,
            image = R.drawable.ic_station_1,
            name = "ChargePoint Station 1",
            location = "Street Pulo 25",
            city = "Amsterdam, Netherlands",
            availablePorts = 8
        ),
        Station(
            id = 2,
            image = R.drawable.ic_station_2,
            name = "ChargePoint Station 2",
            location = "Street SRNA 74",
            city = "Amsterdam, Netherlands",
            availablePorts = 2
        ),
        Station(
            id = 3,
            image = R.drawable.ic_station_3,
            name = "ChargePoint Station 3",
            location = "Street Adas 123 123",
            city = "Amsterdam, Netherlands",
            availablePorts = 5
        )
    )
}