/**
 * TenderNotificationInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package rw.minecofin.roneps.hub.vo.security.xsd;

public class TenderNotificationInfo  implements java.io.Serializable {
    private java.lang.String tenderLotName;

    private java.lang.String tenderLotNumber;

    private java.lang.String tenderRefName;

    private java.lang.String tenderRefNumber;

    public TenderNotificationInfo() {
    }

    public TenderNotificationInfo(
           java.lang.String tenderLotName,
           java.lang.String tenderLotNumber,
           java.lang.String tenderRefName,
           java.lang.String tenderRefNumber) {
           this.tenderLotName = tenderLotName;
           this.tenderLotNumber = tenderLotNumber;
           this.tenderRefName = tenderRefName;
           this.tenderRefNumber = tenderRefNumber;
    }


    /**
     * Gets the tenderLotName value for this TenderNotificationInfo.
     * 
     * @return tenderLotName
     */
    public java.lang.String getTenderLotName() {
        return tenderLotName;
    }


    /**
     * Sets the tenderLotName value for this TenderNotificationInfo.
     * 
     * @param tenderLotName
     */
    public void setTenderLotName(java.lang.String tenderLotName) {
        this.tenderLotName = tenderLotName;
    }


    /**
     * Gets the tenderLotNumber value for this TenderNotificationInfo.
     * 
     * @return tenderLotNumber
     */
    public java.lang.String getTenderLotNumber() {
        return tenderLotNumber;
    }


    /**
     * Sets the tenderLotNumber value for this TenderNotificationInfo.
     * 
     * @param tenderLotNumber
     */
    public void setTenderLotNumber(java.lang.String tenderLotNumber) {
        this.tenderLotNumber = tenderLotNumber;
    }


    /**
     * Gets the tenderRefName value for this TenderNotificationInfo.
     * 
     * @return tenderRefName
     */
    public java.lang.String getTenderRefName() {
        return tenderRefName;
    }


    /**
     * Sets the tenderRefName value for this TenderNotificationInfo.
     * 
     * @param tenderRefName
     */
    public void setTenderRefName(java.lang.String tenderRefName) {
        this.tenderRefName = tenderRefName;
    }


    /**
     * Gets the tenderRefNumber value for this TenderNotificationInfo.
     * 
     * @return tenderRefNumber
     */
    public java.lang.String getTenderRefNumber() {
        return tenderRefNumber;
    }


    /**
     * Sets the tenderRefNumber value for this TenderNotificationInfo.
     * 
     * @param tenderRefNumber
     */
    public void setTenderRefNumber(java.lang.String tenderRefNumber) {
        this.tenderRefNumber = tenderRefNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TenderNotificationInfo)) return false;
        TenderNotificationInfo other = (TenderNotificationInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tenderLotName==null && other.getTenderLotName()==null) || 
             (this.tenderLotName!=null &&
              this.tenderLotName.equals(other.getTenderLotName()))) &&
            ((this.tenderLotNumber==null && other.getTenderLotNumber()==null) || 
             (this.tenderLotNumber!=null &&
              this.tenderLotNumber.equals(other.getTenderLotNumber()))) &&
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
        if (getTenderLotName() != null) {
            _hashCode += getTenderLotName().hashCode();
        }
        if (getTenderLotNumber() != null) {
            _hashCode += getTenderLotNumber().hashCode();
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
        new org.apache.axis.description.TypeDesc(TenderNotificationInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "TenderNotificationInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tenderLotName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "tenderLotName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tenderLotNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "tenderLotNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tenderRefName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "tenderRefName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tenderRefNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "tenderRefNumber"));
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
