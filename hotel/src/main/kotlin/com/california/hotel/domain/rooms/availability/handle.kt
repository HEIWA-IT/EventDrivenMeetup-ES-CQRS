package com.california.hotel.domain.rooms.availability

fun decide(addRoom: AddRoom): RoomAdded {
    return RoomAdded(addRoom.roomNumber)
}