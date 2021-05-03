package com.pik.hotpoll.payloads;


import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import lombok.Builder;
import lombok.Data;

@Data
//@NoArgsConstructor
//@AllArgsConstructor
@Builder(builderClassName = "LoginRequestBuilder")
@JsonDeserialize(builder = LoginRequest.LoginRequestBuilder.class)
public class LoginRequest {
    private String username;
    private String password;

    @JsonPOJOBuilder(withPrefix = "")
    public static class LoginRequestBuilder {

    }
}