package com.adventurear.sportinderservice.controller;

import com.adventurear.sportinderservice.dto.LoginRequest;
import com.adventurear.sportinderservice.model.test.TestEntity;
import com.adventurear.sportinderservice.model.user.User;
import com.adventurear.sportinderservice.service.LoginService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;

import java.util.List;

@RestController
@RequestMapping("api/v1/login")
@AllArgsConstructor
public class LoginController {

    private final LoginService loginService;

    @PostMapping()
    public ResponseEntity<User> postTestEntity(@RequestBody LoginRequest request) {
        User user = loginService.getUser(request);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @ExceptionHandler({HttpClientErrorException.class})
    public ResponseEntity<String> handleException(HttpClientErrorException e) {
        return new ResponseEntity<>("", HttpStatus.valueOf(e.getRawStatusCode()));
    }

}
