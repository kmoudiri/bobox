package org.bobox.core.shipment;

import lombok.Data;
import org.bobox.core.units.Dimensions;
import org.bobox.core.units.PackageType;
import org.bobox.core.units.Weight;

@Data
public class Package {
    private PackageType packageType;
    private Dimensions dimensions;
    private Weight weight;
}
