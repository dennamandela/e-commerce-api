package com.netfusionid.ecommerce.response;

import lombok.Data;

@Data
public class Pong {

    public String message;
    public String errorMessage;
    public Boolean databaseConnection;

}
