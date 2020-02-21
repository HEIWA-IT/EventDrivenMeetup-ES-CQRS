package com.california.hotel.domain.rooms.availability

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class RoomAvailabilityTest {
    @Test
    fun `should return a list of available rooms`() {
        val roomsAdded = listOf(RoomAdded(2),
                RoomAdded(35),
                RoomAdded(113))

        val availableRooms = projectAvailableRooms(roomsAdded)

        val expectedAvailableRooms = listOf(2, 35, 113);
        Assertions.assertThat(availableRooms).isEqualTo(expectedAvailableRooms)
    }

    @Test
    fun `should tell if a selected room is available`() {
        val roomsAdded = listOf(RoomAdded(2),
                RoomAdded(35),
                RoomAdded(113))

        val roomAvailability = projectRoomAvailability(roomsAdded, 35)
        Assertions.assertThat(roomAvailability).isTrue()
    }
}

