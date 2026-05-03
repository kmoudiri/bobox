package org.bobox.core.transport;

import lombok.Data;

import java.util.List;

@Data
public class ServiceHistory {
    private Vehicle target;
    private List<ServiceItem> items;
}
