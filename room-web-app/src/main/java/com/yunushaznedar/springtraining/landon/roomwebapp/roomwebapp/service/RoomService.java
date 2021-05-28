package com.yunushaznedar.springtraining.landon.roomwebapp.roomwebapp.service;

import com.yunushaznedar.springtraining.landon.roomwebapp.roomwebapp.models.Room;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoomService
{
    private  static final List<Room> rooms =new ArrayList<>();

    static {
        for(int i=0;i<10;i++)
            rooms.add(new Room(i, "Room"+i,"R"+i,"Q"));
    }

    public List<Room> getAllRooms()
    {
        return rooms;
    }
}
