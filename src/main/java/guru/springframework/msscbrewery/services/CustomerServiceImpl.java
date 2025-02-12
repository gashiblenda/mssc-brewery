package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Slf4j
@Service

public class CustomerServiceImpl implements CustomerService{
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder()
                .customerId(customerId)
                .customerName("Filan Fisteku")
                .build();
    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customer) {
        return CustomerDto.builder()
                .customerId(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customer) {
        log.debug("Updating a Customer");
        //TO DO: implementation
    }

    @Override
    public void deleteById(UUID customerId) {
        log.debug("Deleting a Customer");
    }


}
