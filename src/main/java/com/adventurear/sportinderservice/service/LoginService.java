package com.adventurear.sportinderservice.service;

import com.adventurear.sportinderservice.dto.LoginRequest;
import com.adventurear.sportinderservice.model.user.User;
import com.adventurear.sportinderservice.repository.LoginRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class LoginService {
    private final LoginRepository loginRepository;

    public User getUser(LoginRequest loginRequest) {
        return loginRepository.findByUsernameAndPassword(loginRequest.getUsername(), loginRequest.getPassword())
                .orElseThrow(
                        () -> new HttpClientErrorException(HttpStatus.BAD_REQUEST)
                );
    }
}
