package com.california.hotel.domain.rooms.availability

import com.california.hotel.domain.rooms.booking.RoomBooked
import com.california.hotel.domain.rooms.cleaning.CleaningRoomSchedule
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import java.time.LocalDate

class CleaningScheduleTest {

    private val arrivalDate = LocalDate.of(2020, 1, 1)
    private val secondOfJanuary = LocalDate.of(2020, 1, 2)
    private val thirdOfJanuary = LocalDate.of(2020, 1, 3)
    private val leavingDate = LocalDate.of(2020, 1, 4)

    @Test
    fun `Should return schedule room cleaning day` () {
        val roomBooked = RoomBooked(3, arrivalDate, leavingDate)

        val cleaningSchedule = projectionRoomCleaningSchedule(roomBooked)

        val cleaningRoomScheduleExpected = CleaningRoomSchedule(3, listOf(arrivalDate, secondOfJanuary, thirdOfJanuary))

        Assertions.assertThat(cleaningSchedule).isEqualTo(cleaningRoomScheduleExpected)
    }

    private fun projectionRoomCleaningSchedule(roomBooked: RoomBooked): CleaningRoomSchedule {
        val dates = generateSequence(roomBooked.arrivalDate) { it.plusDays(1) }
                .takeWhile { it < roomBooked.leavingDate }
                .toList()

        return CleaningRoomSchedule(roomBooked.roomNumber, dates)
    }

}