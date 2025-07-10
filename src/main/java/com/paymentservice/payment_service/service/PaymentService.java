package com.paymentservice.payment_service.service;

import com.paymentservice.payment_service.dto.PaymentDto;


public interface PaymentService {

    PaymentDto createPayment(PaymentDto paymentDto);
}
