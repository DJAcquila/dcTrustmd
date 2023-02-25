package org.hyperledger.fabric.trustmd.data;

import com.owlike.genson.Genson;
import org.hyperledger.fabric.contract.annotation.DataType;
import org.hyperledger.fabric.contract.annotation.Property;

@DataType()
public class TrustAsset {

    private final static Genson genson = new Genson();

    @Property
    private Origin origin;

    @Property
    private String evaluatedNodeId;

    @Property
    private Trust trust;

    public TrustAsset(final String mecHostId,
                      final String evaluatedNodeId, final String trustDecision,
                      final String degreeOfBelief, final String clusterId) {
        this.origin = new Origin(mecHostId, clusterId);
        this.trust = new Trust(trustDecision, degreeOfBelief);
        this.evaluatedNodeId = evaluatedNodeId;
    }

    public TrustAsset() {

    }

    /**
    * FUNC : Serialize the Class and its Data.
    *
    * @return class : String | Serilaized Class of the Tag.
     */
    public String toJSONString() {
        return genson.serialize(this).toString();
    }

    /**
     * FUNC : Deserialize a string and create an instance of a NEW Tag
     *
     * @param json : String | JSON string to be Deserialized.
     * @return asset : Tag | Newly created object of the Tag.
     */
    public static TrustAsset fromJSONString(String json) {
        return genson.deserialize(json, TrustAsset.class);
    }


    public Origin getOrigin() {
        return origin;
    }

    public void setOrigin(final Origin origin) {
        this.origin = origin;
    }

    public Trust getTrust() {
        return trust;
    }

    public void setTrust(final Trust trust) {
        this.trust = trust;
    }

    public String getEvaluatedNodeId() {
        return evaluatedNodeId;
    }

    public void setEvaluatedNodeId(final String evaluatedNodeId) {
        this.evaluatedNodeId = evaluatedNodeId;
    }

}