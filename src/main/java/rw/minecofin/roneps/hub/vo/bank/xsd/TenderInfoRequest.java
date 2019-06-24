/**
 * TenderInfoRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package rw.minecofin.roneps.hub.vo.bank.xsd;

public class TenderInfoRequest  implements java.io.Serializable {
    private java.lang.String id;

    private java.lang.String password;

    private java.lang.String tenderRefName;

    private java.lang.String tenderRefNumber;

    public TenderInfoRequest() {
    }

    public TenderInfoRequest(
           java.lang.String id,
           java.lang.String password,
           java.lang.String tenderRefName,
           java.lang.String tenderRefNumber) {
           this.id = id;
           this.password = password;
           this.tenderRefName = tenderRefName;
           this.tenderRefNumber = tenderRefNumber;
    }


    /**
     * Gets the id value for this TenderInfoRequest.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this TenderInfoRequest.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the password value for this TenderInfoRequest.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this TenderInfoRequest.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the tenderRefName value for this TenderInfoRequest.
     * 
     * @return tenderRefName
     */
    public java.lang.String getTenderRefName() {
        return tenderRefName;
    }


    /**
     * Sets the tenderRefName value for this TenderInfoRequest.
     * 
     * @param tenderRefName
     */
    public void setTenderRefName(java.lang.String tenderRefName) {
        this.tenderRefName = tenderRefName;
    }


    /**
     * Gets the tenderRefNumber value for this TenderInfoRequest.
     * 
     * @return tenderRefNumber
     */
    public java.lang.String getTenderRefNumber() {
        return tenderRefNumber;
    }


    /**
     * Sets the tenderRefNumber value for this TenderInfoRequest.
     * 
     * @param tenderRefNumber
     */
    public void setTenderRefNumber(java.lang.String tenderRefNumber) {
        this.tenderRefNumber = tenderRefNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TenderInfoRequest)) return false;
        TenderInfoRequest other = (TenderInfoRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.tenderRefName==null && other.getTenderRefName()==null) || 
             (this.tenderRefName!=null &&
              this.tenderRefName.equals(other.getTenderRefName()))) &&
            ((this.tenderRefNumber==null && other.getTenderRefNumber()==null) || 
             (this.tenderRefNumber!=null &&
              this.tenderRefNumber.equals(other.getTenderRefNumber())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getTenderRefName() != null) {
            _hashCode += getTenderRefName().hashCode();
        }
        if (getTenderRefNumber() != null) {
            _hashCode += getTenderRefNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TenderInfoRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://bank.vo.hub.roneps.minecofin.rw/xsd", "TenderInfoRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bank.vo.hub.roneps.minecofin.rw/xsd", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bank.vo.hub.roneps.minecofin.rw/xsd", "password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tenderRefName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bank.vo.hub.roneps.minecofin.rw/xsd", "tenderRefName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tenderRefNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bank.vo.hub.roneps.minecofin.rw/xsd", "tenderRefNumber"));
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
