package com.yunushaznedar.springtraining.landon.roomwebapp.data;

import com.yunushaznedar.springtraining.landon.roomwebapp.models.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room,Long> {
}
