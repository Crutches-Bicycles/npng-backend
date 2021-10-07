package com.crutchesbicycles.npngbackend.dto;

import com.crutchesbicycles.npngbackend.domain.User;
import lombok.Data;

@Data
public class UserDto extends BaseDto {

    private String firstName;

    private String lastName;

    private String patronymic;

    private String email;

    private String readTicket;

    public UserDto(User user) {
        super(user);
        this.firstName = user.getFirstName();
        this.lastName = user.getLastName();
        this.patronymic = user.getPatronymic();
        this.email = user.getEmail();
        this.readTicket = user.getReadTicket();
    }
}
