package com.paymentservice.payment_service.service;

import com.paymentservice.payment_service.dto.PaymentDto;
import com.paymentservice.payment_service.mapper.PaymentConversion;
import com.paymentservice.payment_service.model.Payment;
import com.paymentservice.payment_service.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceimpl implements PaymentService{

    @Autowired
    private PaymentRepository paymentRepository;

    @Autowired
    private PaymentConversion paymentConversion;

    @Override
    public PaymentDto createPayment(PaymentDto paymentDto) {
       // Convert DTO to entity
        Payment payment=paymentConversion.toEntity(paymentDto);

        Payment paymentNew=paymentRepository.save(payment);

        // Convert the saved entity back to DTO
        PaymentDto paymentDtoNew=paymentConversion.toDto(paymentNew);
        return paymentDtoNew;
    }
}
