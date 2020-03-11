package com.california.hotel.domain.rooms.booking

import java.time.LocalDate

data class BookARoom(val roomNumber: Int,
                     val arrivingDate: LocalDate,
                     val leavingData: LocalDate)


fun handle(bookARoom: BookARoom) =
        RoomBooked(bookARoom.roomNumber, bookARoom.arrivingDate, bookARoom.leavingData)
