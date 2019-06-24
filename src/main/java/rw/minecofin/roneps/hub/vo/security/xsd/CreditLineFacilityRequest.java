/**
 * CreditLineFacilityRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package rw.minecofin.roneps.hub.vo.security.xsd;

public class CreditLineFacilityRequest  implements java.io.Serializable {
    private rw.minecofin.roneps.hub.vo.security.xsd.CreditLineFacilityInfo creditLineFacilityInfo;

    private java.lang.String id;

    private rw.minecofin.roneps.hub.vo.security.xsd.IssueBankInfo issueBankInfo;

    private java.lang.String password;

    private rw.minecofin.roneps.hub.vo.security.xsd.SupplierInfo supplierInfo;

    private java.lang.String tenderRefName;

    private java.lang.String tenderRefNumber;

    public CreditLineFacilityRequest() {
    }

    public CreditLineFacilityRequest(
           rw.minecofin.roneps.hub.vo.security.xsd.CreditLineFacilityInfo creditLineFacilityInfo,
           java.lang.String id,
           rw.minecofin.roneps.hub.vo.security.xsd.IssueBankInfo issueBankInfo,
           java.lang.String password,
           rw.minecofin.roneps.hub.vo.security.xsd.SupplierInfo supplierInfo,
           java.lang.String tenderRefName,
           java.lang.String tenderRefNumber) {
           this.creditLineFacilityInfo = creditLineFacilityInfo;
           this.id = id;
           this.issueBankInfo = issueBankInfo;
           this.password = password;
           this.supplierInfo = supplierInfo;
           this.tenderRefName = tenderRefName;
           this.tenderRefNumber = tenderRefNumber;
    }


    /**
     * Gets the creditLineFacilityInfo value for this CreditLineFacilityRequest.
     * 
     * @return creditLineFacilityInfo
     */
    public rw.minecofin.roneps.hub.vo.security.xsd.CreditLineFacilityInfo getCreditLineFacilityInfo() {
        return creditLineFacilityInfo;
    }


    /**
     * Sets the creditLineFacilityInfo value for this CreditLineFacilityRequest.
     * 
     * @param creditLineFacilityInfo
     */
    public void setCreditLineFacilityInfo(rw.minecofin.roneps.hub.vo.security.xsd.CreditLineFacilityInfo creditLineFacilityInfo) {
        this.creditLineFacilityInfo = creditLineFacilityInfo;
    }


    /**
     * Gets the id value for this CreditLineFacilityRequest.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this CreditLineFacilityRequest.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the issueBankInfo value for this CreditLineFacilityRequest.
     * 
     * @return issueBankInfo
     */
    public rw.minecofin.roneps.hub.vo.security.xsd.IssueBankInfo getIssueBankInfo() {
        return issueBankInfo;
    }


    /**
     * Sets the issueBankInfo value for this CreditLineFacilityRequest.
     * 
     * @param issueBankInfo
     */
    public void setIssueBankInfo(rw.minecofin.roneps.hub.vo.security.xsd.IssueBankInfo issueBankInfo) {
        this.issueBankInfo = issueBankInfo;
    }


    /**
     * Gets the password value for this CreditLineFacilityRequest.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this CreditLineFacilityRequest.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the supplierInfo value for this CreditLineFacilityRequest.
     * 
     * @return supplierInfo
     */
    public rw.minecofin.roneps.hub.vo.security.xsd.SupplierInfo getSupplierInfo() {
        return supplierInfo;
    }


    /**
     * Sets the supplierInfo value for this CreditLineFacilityRequest.
     * 
     * @param supplierInfo
     */
    public void setSupplierInfo(rw.minecofin.roneps.hub.vo.security.xsd.SupplierInfo supplierInfo) {
        this.supplierInfo = supplierInfo;
    }


    /**
     * Gets the tenderRefName value for this CreditLineFacilityRequest.
     * 
     * @return tenderRefName
     */
    public java.lang.String getTenderRefName() {
        return tenderRefName;
    }


    /**
     * Sets the tenderRefName value for this CreditLineFacilityRequest.
     * 
     * @param tenderRefName
     */
    public void setTenderRefName(java.lang.String tenderRefName) {
        this.tenderRefName = tenderRefName;
    }


    /**
     * Gets the tenderRefNumber value for this CreditLineFacilityRequest.
     * 
     * @return tenderRefNumber
     */
    public java.lang.String getTenderRefNumber() {
        return tenderRefNumber;
    }


    /**
     * Sets the tenderRefNumber value for this CreditLineFacilityRequest.
     * 
     * @param tenderRefNumber
     */
    public void setTenderRefNumber(java.lang.String tenderRefNumber) {
        this.tenderRefNumber = tenderRefNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreditLineFacilityRequest)) return false;
        CreditLineFacilityRequest other = (CreditLineFacilityRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.creditLineFacilityInfo==null && other.getCreditLineFacilityInfo()==null) || 
             (this.creditLineFacilityInfo!=null &&
              this.creditLineFacilityInfo.equals(other.getCreditLineFacilityInfo()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.issueBankInfo==null && other.getIssueBankInfo()==null) || 
             (this.issueBankInfo!=null &&
              this.issueBankInfo.equals(other.getIssueBankInfo()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.supplierInfo==null && other.getSupplierInfo()==null) || 
             (this.supplierInfo!=null &&
              this.supplierInfo.equals(other.getSupplierInfo()))) &&
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
        if (getCreditLineFacilityInfo() != null) {
            _hashCode += getCreditLineFacilityInfo().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getIssueBankInfo() != null) {
            _hashCode += getIssueBankInfo().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getSupplierInfo() != null) {
            _hashCode += getSupplierInfo().hashCode();
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
        new org.apache.axis.description.TypeDesc(CreditLineFacilityRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "CreditLineFacilityRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditLineFacilityInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "creditLineFacilityInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "CreditLineFacilityInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issueBankInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "issueBankInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "IssueBankInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supplierInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "supplierInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "SupplierInfo"));
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
