package org.hyperledger.fabric.trustmd.data;

import org.hyperledger.fabric.contract.annotation.DataType;
import org.hyperledger.fabric.contract.annotation.Property;

@DataType
public class Origin {
    @Property
    private String clusterId;
    @Property
    private String mecHostId;

    public Origin(final String mecHostId, final String clusterId) {
        this.clusterId = clusterId;
        this.mecHostId = mecHostId;
    }

    public String getMecHostId() {
        return mecHostId;
    }

    public void setMecHostId(final String mecHostId) {
        this.mecHostId = mecHostId;
    }

    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(final String clusterId) {
        this.clusterId = clusterId;
    }
}
