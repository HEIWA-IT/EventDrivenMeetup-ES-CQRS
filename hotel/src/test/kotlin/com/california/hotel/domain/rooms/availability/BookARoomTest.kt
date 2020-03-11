package com.california.hotel.domain.rooms.availability

import com.california.hotel.domain.rooms.booking.BookARoom
import com.california.hotel.domain.rooms.booking.RoomBooked
import com.california.hotel.domain.rooms.booking.handle
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import java.time.LocalDate

class BookARoomTest {

    private val arrivalDate = LocalDate.of(2020, 1, 1)
    private val leavingDate = LocalDate.of(2020, 1, 4)

    @Test
    fun `should book a room`() {
        val bookARoom = BookARoom(3, arrivalDate, leavingDate)

        val event = handle(bookARoom)

        assertThat(event).isEqualTo(RoomBooked(3, arrivalDate, leavingDate))
    }


}
