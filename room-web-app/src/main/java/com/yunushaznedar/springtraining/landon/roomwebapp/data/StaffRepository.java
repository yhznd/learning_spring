package com.yunushaznedar.springtraining.landon.roomwebapp.data;

import com.yunushaznedar.springtraining.landon.roomwebapp.models.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepository extends JpaRepository<Staff,String> {
}
