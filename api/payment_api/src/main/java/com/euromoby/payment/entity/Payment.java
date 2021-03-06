package com.euromoby.payment.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@Table("payments")
public class Payment {
    public static final String STATE_PENDING = "pending";

    @Id
    private UUID id;
    private UUID merchantId;
    private String state;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
