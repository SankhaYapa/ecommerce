package com.ecommerce.app.ecommerce.service.impl;

import com.ecommerce.app.ecommerce.dto.request.RequestCustomerDto;
import com.ecommerce.app.ecommerce.dto.response.ResponseCustomerDto;
import com.ecommerce.app.ecommerce.entity.Customer;
import com.ecommerce.app.ecommerce.repo.CustomerRepo;
import com.ecommerce.app.ecommerce.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    public CustomerServiceImpl(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    private  final CustomerRepo customerRepo;
    @Override
    public void createCustomer(RequestCustomerDto dto) {
        Customer customer=new Customer(
                "", dto.getName(), dto.getAddress(), dto.getContact(), dto.getSalary()
        )
        customerRepo.save(customer);
    }

    @Override
    public ResponseCustomerDto getCustomer(long id) {
        return null;
    }

    @Override
    public void deleteCustomer(long id) {

    }

    @Override
    public void updateCustomer(long id, RequestCustomerDto dto) {

    }

    @Override
    public List<ResponseCustomerDto> getAllCustomer(String searchText, int page, int size) {
        return null;
    }
}
