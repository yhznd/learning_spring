package com.yunushaznedar.springtraining.landon.roomwebapp.roomwebapp.controllers;


import com.yunushaznedar.springtraining.landon.roomwebapp.roomwebapp.models.Room;
import com.yunushaznedar.springtraining.landon.roomwebapp.roomwebapp.service.RoomService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/rooms")
public class RoomRestController
{
    private final RoomService roomService;

    public RoomRestController(RoomService roomService)
    {
        this.roomService=roomService;
    }

    @GetMapping
    public List<Room> roomList()
    {
        return roomService.getAllRooms();
    }
}
