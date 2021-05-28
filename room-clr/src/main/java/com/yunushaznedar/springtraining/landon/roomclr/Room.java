package com.yunushaznedar.springtraining.landon.roomclr;

public class Room
{
    private long id;
    private String roomName;
    private String roomNumber;
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

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", roomName='" + roomName + '\'' +
                ", roomNumber='" + roomNumber + '\'' +
                ", roomInfo='" + roomInfo + '\'' +
                '}';
    }
}
