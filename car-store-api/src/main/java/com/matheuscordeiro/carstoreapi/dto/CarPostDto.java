package com.matheuscordeiro.carstoreapi.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Builder;

import java.math.BigDecimal;

@JsonInclude
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@Builder
public record CarPostDto(String model, String brand, BigDecimal price, String description, String engineVersion,
                         String city, Long ownerId, String ownerName, String ownerType, String contact, String createdDate) {
}
