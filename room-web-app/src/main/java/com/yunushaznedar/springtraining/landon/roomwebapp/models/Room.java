package com.yunushaznedar.springtraining.landon.roomwebapp.models;

import javax.persistence.*;

@Entity
@Table(name = "ROOM")
public class Room
{
    @Id
    @Column(name = "ROOM_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "NAME")
    private String roomName;

    @Column(name = "ROOM_NUMBER")
    private String roomNumber;

    @Column(name = "BED_INFO")
    private String roomInfo;

    public Room() {
    }

    public Room(long id, String roomName, String roomNumber, String roomInfo) {
        this.id = id;
        this.roomName = roomName;
        this.roomNumber = roomNumber;
        this.roomInfo = roomInfo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomInfo() {
        return roomInfo;
    }

    public void setRoomInfo(String roomInfo) {
        this.roomInfo = roomInfo;
    }
}
