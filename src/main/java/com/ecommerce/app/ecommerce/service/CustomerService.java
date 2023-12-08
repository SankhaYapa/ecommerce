package com.ecommerce.app.ecommerce.service;

import com.ecommerce.app.ecommerce.dto.request.RequestCustomerDto;
import com.ecommerce.app.ecommerce.dto.response.ResponseCustomerDto;

import java.util.List;

public interface CustomerService  {
    public void createCustomer(RequestCustomerDto dto);
    public ResponseCustomerDto getCustomer(long id);
    public void deleteCustomer(long id);
    public void updateCustomer(long id,RequestCustomerDto dto);
    public List<ResponseCustomerDto> getAllCustomer(String searchText, int page, int size);

}
