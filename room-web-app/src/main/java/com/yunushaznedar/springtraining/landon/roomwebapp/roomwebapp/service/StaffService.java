package com.yunushaznedar.springtraining.landon.roomwebapp.roomwebapp.service;

import com.yunushaznedar.springtraining.landon.roomwebapp.roomwebapp.models.Staff;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;

@Service
public class StaffService
{
    private static final List<Staff> staffs =new ArrayList<>();

    static {
        staffs.add(new Staff(1,"Yunus","Haznedar","Manager"));
        staffs.add(new Staff(2,"Rohat","Yavuz","Manager"));
        staffs.add(new Staff(3,"Fırat","Kaptan","Security"));
        staffs.add(new Staff(4,"Doğukan","Ören","Security"));
    }

    public List<Staff> getAllStaffs()
    {
        return staffs;
    }
}
