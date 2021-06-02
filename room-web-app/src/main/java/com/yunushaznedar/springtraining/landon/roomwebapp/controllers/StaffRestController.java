package com.yunushaznedar.springtraining.landon.roomwebapp.controllers;

import com.yunushaznedar.springtraining.landon.roomwebapp.models.Staff;
import com.yunushaznedar.springtraining.landon.roomwebapp.service.StaffService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/staffs")
public class StaffRestController
{
    private final StaffService staffService;

    public StaffRestController(StaffService staffService)
    {
        this.staffService=staffService;
    }

    @GetMapping
    public List<Staff> staffList()
    {
        return  staffService.getAllStaffs();
    }
}
