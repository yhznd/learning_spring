package com.yunushaznedar.springtraining.landon.roomwebapp.service;

import com.yunushaznedar.springtraining.landon.roomwebapp.models.Room;
import com.yunushaznedar.springtraining.landon.roomwebapp.data.RoomRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService
{
    private final RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository)
    {
        this.roomRepository=roomRepository;
    }

    public List<Room> getAllRooms()
    {
        return roomRepository.findAll();
    }
}
