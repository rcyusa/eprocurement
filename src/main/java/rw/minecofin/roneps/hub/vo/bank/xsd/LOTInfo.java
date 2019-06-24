/**
 * LOTInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package rw.minecofin.roneps.hub.vo.bank.xsd;

public class LOTInfo  implements java.io.Serializable {
    private java.lang.String lotAmount;

    private java.lang.String lotName;

    private java.lang.String lotNumber;

    public LOTInfo() {
    }

    public LOTInfo(
           java.lang.String lotAmount,
           java.lang.String lotName,
           java.lang.String lotNumber) {
           this.lotAmount = lotAmount;
           this.lotName = lotName;
           this.lotNumber = lotNumber;
    }


    /**
     * Gets the lotAmount value for this LOTInfo.
     * 
     * @return lotAmount
     */
    public java.lang.String getLotAmount() {
        return lotAmount;
    }


    /**
     * Sets the lotAmount value for this LOTInfo.
     * 
     * @param lotAmount
     */
    public void setLotAmount(java.lang.String lotAmount) {
        this.lotAmount = lotAmount;
    }


    /**
     * Gets the lotName value for this LOTInfo.
     * 
     * @return lotName
     */
    public java.lang.String getLotName() {
        return lotName;
    }


    /**
     * Sets the lotName value for this LOTInfo.
     * 
     * @param lotName
     */
    public void setLotName(java.lang.String lotName) {
        this.lotName = lotName;
    }


    /**
     * Gets the lotNumber value for this LOTInfo.
     * 
     * @return lotNumber
     */
    public java.lang.String getLotNumber() {
        return lotNumber;
    }


    /**
     * Sets the lotNumber value for this LOTInfo.
     * 
     * @param lotNumber
     */
    public void setLotNumber(java.lang.String lotNumber) {
        this.lotNumber = lotNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LOTInfo)) return false;
        LOTInfo other = (LOTInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.lotAmount==null && other.getLotAmount()==null) || 
             (this.lotAmount!=null &&
              this.lotAmount.equals(other.getLotAmount()))) &&
            ((this.lotName==null && other.getLotName()==null) || 
             (this.lotName!=null &&
              this.lotName.equals(other.getLotName()))) &&
            ((this.lotNumber==null && other.getLotNumber()==null) || 
             (this.lotNumber!=null &&
              this.lotNumber.equals(other.getLotNumber())));
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
        if (getLotAmount() != null) {
            _hashCode += getLotAmount().hashCode();
        }
        if (getLotName() != null) {
            _hashCode += getLotName().hashCode();
        }
        if (getLotNumber() != null) {
            _hashCode += getLotNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LOTInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://bank.vo.hub.roneps.minecofin.rw/xsd", "LOTInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lotAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bank.vo.hub.roneps.minecofin.rw/xsd", "lotAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lotName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bank.vo.hub.roneps.minecofin.rw/xsd", "lotName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lotNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bank.vo.hub.roneps.minecofin.rw/xsd", "lotNumber"));
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
