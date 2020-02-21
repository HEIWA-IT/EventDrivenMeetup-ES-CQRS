package com.california.hotel.domain.rooms.availability

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class RoomAdderTest {
    @Test
    fun `should create room event when a correct room number is given`() {
        val command = AddRoom(113)
        val event = decide(command)
        Assertions.assertThat(event).isEqualTo(RoomAdded(113))
    }
}