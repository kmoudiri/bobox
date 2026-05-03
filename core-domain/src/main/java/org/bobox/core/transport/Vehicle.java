package org.bobox.core.transport;

import lombok.Data;

import java.util.UUID;

@Data
public class Vehicle {
    private UUID uuid;
    private String registrationNumber;
}
