package com.ecommerce.app.ecommerce.api;

import com.ecommerce.app.ecommerce.dto.request.RequestCustomerDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {
    @PostMapping
    public String createCustomer(@RequestBody RequestCustomerDto customerDto){

        return  customerDto.toString();
    }
    @GetMapping("/{id}")
    public String getCustomer(@PathVariable String id){
        return  id+"";
    }
    @PutMapping(params = "id")
    public String updateCustomer(@RequestParam String id, @RequestBody RequestCustomerDto customerDto){
        return  customerDto.toString();
    }
    @DeleteMapping("/{id}")
    public String deleteCustomer(@PathVariable String id){
        return  id+"";
    }
    @GetMapping(path = "/list",params = {"searchText","page","size"})
    public String getallCustomers(
            @RequestParam String searchText,
            @RequestParam int page,
            @RequestParam int size
    ){
        return  "getCustomers";
    }
}
