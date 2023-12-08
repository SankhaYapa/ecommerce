package com.ecommerce.app.ecommerce.dto.request;

import lombok.*;

@Getter
@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//@ToString
@Data
public class RequestCustomerDto {
    private  String name;
    private String address;
    private String contact;
    private double salary;

}
