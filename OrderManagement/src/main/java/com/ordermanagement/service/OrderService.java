package com.ordermanagement.service;


import com.ordermanagement.mapper.OrderMapper;
import com.ordermanagement.model.dto.response.OrderResponseDTO;
import com.ordermanagement.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository ;
    private final OrderMapper orderMapper ;

}
