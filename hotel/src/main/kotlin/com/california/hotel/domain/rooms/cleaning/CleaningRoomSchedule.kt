package com.california.hotel.domain.rooms.cleaning

import java.time.LocalDate

data class CleaningRoomSchedule(val roomNumber:Int, val cleaningSchedules: List<LocalDate>) {

}
