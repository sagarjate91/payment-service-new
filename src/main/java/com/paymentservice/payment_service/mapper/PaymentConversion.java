package com.paymentservice.payment_service.mapper;

import com.paymentservice.payment_service.dto.PaymentDto;
import com.paymentservice.payment_service.model.Payment;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PaymentConversion {
     PaymentDto toDto(Payment payment);
     Payment toEntity(PaymentDto paymentDto);
}
