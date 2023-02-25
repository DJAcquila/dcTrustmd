package org.hyperledger.fabric.trustmd.data;

import org.hyperledger.fabric.contract.annotation.DataType;
import org.hyperledger.fabric.contract.annotation.Property;

@DataType
public class Trust {
    @Property
    private String trustDecision;

    @Property
    private String degreeOfBelief;

    public Trust(final String trustDecision, final String degreeOfBelief) {
        this.trustDecision = trustDecision;
        this.degreeOfBelief = degreeOfBelief;
    }

    public String getTrustDecision() {
        return trustDecision;
    }

    public void setTrustDecision(final String trustDecision) {
        this.trustDecision = trustDecision;
    }

    public String getDegreeOfBelief() {
        return degreeOfBelief;
    }

    public void setDegreeOfBelief(final String degreeOfBelief) {
        this.degreeOfBelief = degreeOfBelief;
    }
}
