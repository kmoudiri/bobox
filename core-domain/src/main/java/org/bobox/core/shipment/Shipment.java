package org.bobox.core.shipment;

import lombok.Data;

import java.util.Collection;

@Data
public class Shipment {
    private Sender sender;
    private Recipient recipient;
    private Collection<Package> packages;
}
