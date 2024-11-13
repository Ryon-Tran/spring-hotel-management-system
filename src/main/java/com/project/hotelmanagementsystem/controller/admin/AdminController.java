package com.project.hotelmanagementsystem.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @GetMapping("")
    public String home() {
        return "admin/pages/dash_board";
    }
    @GetMapping("/rooms")
    public String rooms() {
        return "admin/pages/rooms";
    }
    @GetMapping("/bookings")
    public String bookings() {
        return "admin/pages/bookings";
    }
    @GetMapping("/staffs")
    public String staffs() {
        return "admin/pages/staffs";
    }
    @GetMapping("/guests")
    public String guests() {
        return "admin/pages/guests";
    }
    @GetMapping("/services")
    public String services() {
        return "admin/pages/services";
    }
    @GetMapping("/settings")
    public String settings() {
        return "admin/pages/settings";
    }
}
