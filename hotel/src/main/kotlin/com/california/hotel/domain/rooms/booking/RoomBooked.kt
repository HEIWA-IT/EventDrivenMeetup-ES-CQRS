package com.california.hotel.domain.rooms.booking

import java.time.LocalDate

data class RoomBooked(val roomNumber: Int, val arrivalDate: LocalDate, val leavingDate: LocalDate) {

}
