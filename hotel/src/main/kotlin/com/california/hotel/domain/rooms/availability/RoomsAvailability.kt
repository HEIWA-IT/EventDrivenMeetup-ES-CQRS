package com.california.hotel.domain.rooms.availability

fun projectAvailableRooms(roomsAdded: List<RoomAdded>) =
        roomsAdded.map { it.roomNumber }

fun projectAvailableRoom(roomsAdded: List<RoomAdded>, roomNumber: Int) =
        projectAvailableRooms(roomsAdded).contains(roomNumber)