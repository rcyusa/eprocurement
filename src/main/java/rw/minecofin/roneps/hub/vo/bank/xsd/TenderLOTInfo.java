/**
 * TenderLOTInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package rw.minecofin.roneps.hub.vo.bank.xsd;

public class TenderLOTInfo  implements java.io.Serializable {
    private java.lang.String amount;

    private java.lang.String tenderLotDesc;

    private java.lang.String tenderLotName;

    private java.lang.String tenderLotNumber;

    private java.lang.String unit;

    public TenderLOTInfo() {
    }

    public TenderLOTInfo(
           java.lang.String amount,
           java.lang.String tenderLotDesc,
           java.lang.String tenderLotName,
           java.lang.String tenderLotNumber,
           java.lang.String unit) {
           this.amount = amount;
           this.tenderLotDesc = tenderLotDesc;
           this.tenderLotName = tenderLotName;
           this.tenderLotNumber = tenderLotNumber;
           this.unit = unit;
    }


    /**
     * Gets the amount value for this TenderLOTInfo.
     * 
     * @return amount
     */
    public java.lang.String getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this TenderLOTInfo.
     * 
     * @param amount
     */
    public void setAmount(java.lang.String amount) {
        this.amount = amount;
    }


    /**
     * Gets the tenderLotDesc value for this TenderLOTInfo.
     * 
     * @return tenderLotDesc
     */
    public java.lang.String getTenderLotDesc() {
        return tenderLotDesc;
    }


    /**
     * Sets the tenderLotDesc value for this TenderLOTInfo.
     * 
     * @param tenderLotDesc
     */
    public void setTenderLotDesc(java.lang.String tenderLotDesc) {
        this.tenderLotDesc = tenderLotDesc;
    }


    /**
     * Gets the tenderLotName value for this TenderLOTInfo.
     * 
     * @return tenderLotName
     */
    public java.lang.String getTenderLotName() {
        return tenderLotName;
    }


    /**
     * Sets the tenderLotName value for this TenderLOTInfo.
     * 
     * @param tenderLotName
     */
    public void setTenderLotName(java.lang.String tenderLotName) {
        this.tenderLotName = tenderLotName;
    }


    /**
     * Gets the tenderLotNumber value for this TenderLOTInfo.
     * 
     * @return tenderLotNumber
     */
    public java.lang.String getTenderLotNumber() {
        return tenderLotNumber;
    }


    /**
     * Sets the tenderLotNumber value for this TenderLOTInfo.
     * 
     * @param tenderLotNumber
     */
    public void setTenderLotNumber(java.lang.String tenderLotNumber) {
        this.tenderLotNumber = tenderLotNumber;
    }


    /**
     * Gets the unit value for this TenderLOTInfo.
     * 
     * @return unit
     */
    public java.lang.String getUnit() {
        return unit;
    }


    /**
     * Sets the unit value for this TenderLOTInfo.
     * 
     * @param unit
     */
    public void setUnit(java.lang.String unit) {
        this.unit = unit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TenderLOTInfo)) return false;
        TenderLOTInfo other = (TenderLOTInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.tenderLotDesc==null && other.getTenderLotDesc()==null) || 
             (this.tenderLotDesc!=null &&
              this.tenderLotDesc.equals(other.getTenderLotDesc()))) &&
            ((this.tenderLotName==null && other.getTenderLotName()==null) || 
             (this.tenderLotName!=null &&
              this.tenderLotName.equals(other.getTenderLotName()))) &&
            ((this.tenderLotNumber==null && other.getTenderLotNumber()==null) || 
             (this.tenderLotNumber!=null &&
              this.tenderLotNumber.equals(other.getTenderLotNumber()))) &&
            ((this.unit==null && other.getUnit()==null) || 
             (this.unit!=null &&
              this.unit.equals(other.getUnit())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getTenderLotDesc() != null) {
            _hashCode += getTenderLotDesc().hashCode();
        }
        if (getTenderLotName() != null) {
            _hashCode += getTenderLotName().hashCode();
        }
        if (getTenderLotNumber() != null) {
            _hashCode += getTenderLotNumber().hashCode();
        }
        if (getUnit() != null) {
            _hashCode += getUnit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TenderLOTInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://bank.vo.hub.roneps.minecofin.rw/xsd", "TenderLOTInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bank.vo.hub.roneps.minecofin.rw/xsd", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tenderLotDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bank.vo.hub.roneps.minecofin.rw/xsd", "tenderLotDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tenderLotName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bank.vo.hub.roneps.minecofin.rw/xsd", "tenderLotName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tenderLotNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bank.vo.hub.roneps.minecofin.rw/xsd", "tenderLotNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bank.vo.hub.roneps.minecofin.rw/xsd", "unit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
