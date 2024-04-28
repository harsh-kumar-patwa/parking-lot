package models;

import jdk.incubator.vector.VectorOperators;

public class Gate extends BaseModel{
    public int getGateNumber() {
        return gateNumber;
    }

    public void setGateNumber(int gateNumber) {
        this.gateNumber = gateNumber;
    }

    public GateType getGateStatus() {
        return gateStatus;
    }

    public void setGateStatus(GateType gateStatus) {
        this.gateStatus = gateStatus;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public GateType getGateType() {
        return gateType;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }

    private int gateNumber;
    private GateType gateStatus;
    private Operator operator;
    private GateType gateType;
}
