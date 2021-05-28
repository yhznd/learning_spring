package com.yunushaznedar.springtraining.landon.roomwebapp.roomwebapp.controllers;

import com.yunushaznedar.springtraining.landon.roomwebapp.roomwebapp.models.Staff;
import com.yunushaznedar.springtraining.landon.roomwebapp.roomwebapp.service.RoomService;
import com.yunushaznedar.springtraining.landon.roomwebapp.roomwebapp.service.StaffService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/staffs")
public class StaffController
{
    private final StaffService staffService;

    public StaffController(StaffService staffService)
    {
        this.staffService=staffService;
    }

    @GetMapping
    public String getStaffs(Model model)
    {
        model.addAttribute("staffs",staffService.getAllStaffs());
        return "staffs";
    }

}
