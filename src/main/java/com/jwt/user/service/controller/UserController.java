package com.jwt.user.service.controller;


import com.jwt.user.service.VO.ResponseTemplateVO;
import com.jwt.user.service.entity.User;
import com.jwt.user.service.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user) {
        log.info("Inside saveUser method of the UserController");
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") String userId) {
        log.info("Inside getUserWithDepartment method of the UserController");
        return userService.getUserWithDepartment(userId);
    }
}
