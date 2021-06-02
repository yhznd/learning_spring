package com.yunushaznedar.springtraining.landon.roomwebapp.service;

import com.yunushaznedar.springtraining.landon.roomwebapp.data.StaffRepository;
import com.yunushaznedar.springtraining.landon.roomwebapp.models.Staff;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StaffService
{
    private final StaffRepository staffRepo;

    public StaffService(StaffRepository staffRepository)
    {
        this.staffRepo=staffRepository;
    }

    public List<Staff> getAllStaffs()
    {
        return staffRepo.findAll();
    }
}
