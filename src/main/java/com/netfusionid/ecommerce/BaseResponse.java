package com.netfusionid.ecommerce;

import lombok.Data;

@Data
public class BaseResponse {

    public Boolean status;
    public String message;
    public Object data;

}
