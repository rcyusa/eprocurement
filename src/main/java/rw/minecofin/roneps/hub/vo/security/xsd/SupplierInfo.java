/**
 * SupplierInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package rw.minecofin.roneps.hub.vo.security.xsd;

public class SupplierInfo  implements java.io.Serializable {
    private java.lang.String addressSupplier;

    private java.lang.String supplierName;

    private java.lang.String supplierRepresentiveName;

    private java.lang.String supplierTINNumber;

    public SupplierInfo() {
    }

    public SupplierInfo(
           java.lang.String addressSupplier,
           java.lang.String supplierName,
           java.lang.String supplierRepresentiveName,
           java.lang.String supplierTINNumber) {
           this.addressSupplier = addressSupplier;
           this.supplierName = supplierName;
           this.supplierRepresentiveName = supplierRepresentiveName;
           this.supplierTINNumber = supplierTINNumber;
    }


    /**
     * Gets the addressSupplier value for this SupplierInfo.
     * 
     * @return addressSupplier
     */
    public java.lang.String getAddressSupplier() {
        return addressSupplier;
    }


    /**
     * Sets the addressSupplier value for this SupplierInfo.
     * 
     * @param addressSupplier
     */
    public void setAddressSupplier(java.lang.String addressSupplier) {
        this.addressSupplier = addressSupplier;
    }


    /**
     * Gets the supplierName value for this SupplierInfo.
     * 
     * @return supplierName
     */
    public java.lang.String getSupplierName() {
        return supplierName;
    }


    /**
     * Sets the supplierName value for this SupplierInfo.
     * 
     * @param supplierName
     */
    public void setSupplierName(java.lang.String supplierName) {
        this.supplierName = supplierName;
    }


    /**
     * Gets the supplierRepresentiveName value for this SupplierInfo.
     * 
     * @return supplierRepresentiveName
     */
    public java.lang.String getSupplierRepresentiveName() {
        return supplierRepresentiveName;
    }


    /**
     * Sets the supplierRepresentiveName value for this SupplierInfo.
     * 
     * @param supplierRepresentiveName
     */
    public void setSupplierRepresentiveName(java.lang.String supplierRepresentiveName) {
        this.supplierRepresentiveName = supplierRepresentiveName;
    }


    /**
     * Gets the supplierTINNumber value for this SupplierInfo.
     * 
     * @return supplierTINNumber
     */
    public java.lang.String getSupplierTINNumber() {
        return supplierTINNumber;
    }


    /**
     * Sets the supplierTINNumber value for this SupplierInfo.
     * 
     * @param supplierTINNumber
     */
    public void setSupplierTINNumber(java.lang.String supplierTINNumber) {
        this.supplierTINNumber = supplierTINNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SupplierInfo)) return false;
        SupplierInfo other = (SupplierInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.addressSupplier==null && other.getAddressSupplier()==null) || 
             (this.addressSupplier!=null &&
              this.addressSupplier.equals(other.getAddressSupplier()))) &&
            ((this.supplierName==null && other.getSupplierName()==null) || 
             (this.supplierName!=null &&
              this.supplierName.equals(other.getSupplierName()))) &&
            ((this.supplierRepresentiveName==null && other.getSupplierRepresentiveName()==null) || 
             (this.supplierRepresentiveName!=null &&
              this.supplierRepresentiveName.equals(other.getSupplierRepresentiveName()))) &&
            ((this.supplierTINNumber==null && other.getSupplierTINNumber()==null) || 
             (this.supplierTINNumber!=null &&
              this.supplierTINNumber.equals(other.getSupplierTINNumber())));
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
        if (getAddressSupplier() != null) {
            _hashCode += getAddressSupplier().hashCode();
        }
        if (getSupplierName() != null) {
            _hashCode += getSupplierName().hashCode();
        }
        if (getSupplierRepresentiveName() != null) {
            _hashCode += getSupplierRepresentiveName().hashCode();
        }
        if (getSupplierTINNumber() != null) {
            _hashCode += getSupplierTINNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SupplierInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "SupplierInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressSupplier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "addressSupplier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supplierName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "supplierName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supplierRepresentiveName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "supplierRepresentiveName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supplierTINNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "supplierTINNumber"));
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
