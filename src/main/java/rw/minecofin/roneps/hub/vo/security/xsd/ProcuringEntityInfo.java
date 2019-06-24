/**
 * ProcuringEntityInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package rw.minecofin.roneps.hub.vo.security.xsd;

public class ProcuringEntityInfo  implements java.io.Serializable {
    private java.lang.String addressPE;

    private java.lang.String chargerNameInPE;

    private java.lang.String pEName;

    private java.lang.String pETINNumber;

    public ProcuringEntityInfo() {
    }

    public ProcuringEntityInfo(
           java.lang.String addressPE,
           java.lang.String chargerNameInPE,
           java.lang.String pEName,
           java.lang.String pETINNumber) {
           this.addressPE = addressPE;
           this.chargerNameInPE = chargerNameInPE;
           this.pEName = pEName;
           this.pETINNumber = pETINNumber;
    }


    /**
     * Gets the addressPE value for this ProcuringEntityInfo.
     * 
     * @return addressPE
     */
    public java.lang.String getAddressPE() {
        return addressPE;
    }


    /**
     * Sets the addressPE value for this ProcuringEntityInfo.
     * 
     * @param addressPE
     */
    public void setAddressPE(java.lang.String addressPE) {
        this.addressPE = addressPE;
    }


    /**
     * Gets the chargerNameInPE value for this ProcuringEntityInfo.
     * 
     * @return chargerNameInPE
     */
    public java.lang.String getChargerNameInPE() {
        return chargerNameInPE;
    }


    /**
     * Sets the chargerNameInPE value for this ProcuringEntityInfo.
     * 
     * @param chargerNameInPE
     */
    public void setChargerNameInPE(java.lang.String chargerNameInPE) {
        this.chargerNameInPE = chargerNameInPE;
    }


    /**
     * Gets the pEName value for this ProcuringEntityInfo.
     * 
     * @return pEName
     */
    public java.lang.String getPEName() {
        return pEName;
    }


    /**
     * Sets the pEName value for this ProcuringEntityInfo.
     * 
     * @param pEName
     */
    public void setPEName(java.lang.String pEName) {
        this.pEName = pEName;
    }


    /**
     * Gets the pETINNumber value for this ProcuringEntityInfo.
     * 
     * @return pETINNumber
     */
    public java.lang.String getPETINNumber() {
        return pETINNumber;
    }


    /**
     * Sets the pETINNumber value for this ProcuringEntityInfo.
     * 
     * @param pETINNumber
     */
    public void setPETINNumber(java.lang.String pETINNumber) {
        this.pETINNumber = pETINNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProcuringEntityInfo)) return false;
        ProcuringEntityInfo other = (ProcuringEntityInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.addressPE==null && other.getAddressPE()==null) || 
             (this.addressPE!=null &&
              this.addressPE.equals(other.getAddressPE()))) &&
            ((this.chargerNameInPE==null && other.getChargerNameInPE()==null) || 
             (this.chargerNameInPE!=null &&
              this.chargerNameInPE.equals(other.getChargerNameInPE()))) &&
            ((this.pEName==null && other.getPEName()==null) || 
             (this.pEName!=null &&
              this.pEName.equals(other.getPEName()))) &&
            ((this.pETINNumber==null && other.getPETINNumber()==null) || 
             (this.pETINNumber!=null &&
              this.pETINNumber.equals(other.getPETINNumber())));
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
        if (getAddressPE() != null) {
            _hashCode += getAddressPE().hashCode();
        }
        if (getChargerNameInPE() != null) {
            _hashCode += getChargerNameInPE().hashCode();
        }
        if (getPEName() != null) {
            _hashCode += getPEName().hashCode();
        }
        if (getPETINNumber() != null) {
            _hashCode += getPETINNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProcuringEntityInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "ProcuringEntityInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressPE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "addressPE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargerNameInPE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "chargerNameInPE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PEName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "pEName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PETINNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "pETINNumber"));
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
