package com.ecommerce.app.ecommerce.dto.response;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//@ToString
@Data
public class ResponseCustomerDto {
    private long id;
    private  String name;
    private String address;
    private String contact;
    private double salary;

}
