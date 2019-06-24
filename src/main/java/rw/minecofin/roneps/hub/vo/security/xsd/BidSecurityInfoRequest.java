/**
 * BidSecurityInfoRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package rw.minecofin.roneps.hub.vo.security.xsd;

public class BidSecurityInfoRequest  implements java.io.Serializable {
    private rw.minecofin.roneps.hub.vo.security.xsd.BidSecurityInfo bidSecurityInfo;

    private java.lang.String id;

    private rw.minecofin.roneps.hub.vo.security.xsd.IssueBankInfo issueBankInfo;

    private java.lang.String password;

    private rw.minecofin.roneps.hub.vo.security.xsd.SupplierInfo supplierInfo;

    private rw.minecofin.roneps.hub.vo.security.xsd.TenderNotificationInfo tenderNotificationInfo;

    public BidSecurityInfoRequest() {
    }

    public BidSecurityInfoRequest(
           rw.minecofin.roneps.hub.vo.security.xsd.BidSecurityInfo bidSecurityInfo,
           java.lang.String id,
           rw.minecofin.roneps.hub.vo.security.xsd.IssueBankInfo issueBankInfo,
           java.lang.String password,
           rw.minecofin.roneps.hub.vo.security.xsd.SupplierInfo supplierInfo,
           rw.minecofin.roneps.hub.vo.security.xsd.TenderNotificationInfo tenderNotificationInfo) {
           this.bidSecurityInfo = bidSecurityInfo;
           this.id = id;
           this.issueBankInfo = issueBankInfo;
           this.password = password;
           this.supplierInfo = supplierInfo;
           this.tenderNotificationInfo = tenderNotificationInfo;
    }


    /**
     * Gets the bidSecurityInfo value for this BidSecurityInfoRequest.
     * 
     * @return bidSecurityInfo
     */
    public rw.minecofin.roneps.hub.vo.security.xsd.BidSecurityInfo getBidSecurityInfo() {
        return bidSecurityInfo;
    }


    /**
     * Sets the bidSecurityInfo value for this BidSecurityInfoRequest.
     * 
     * @param bidSecurityInfo
     */
    public void setBidSecurityInfo(rw.minecofin.roneps.hub.vo.security.xsd.BidSecurityInfo bidSecurityInfo) {
        this.bidSecurityInfo = bidSecurityInfo;
    }


    /**
     * Gets the id value for this BidSecurityInfoRequest.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this BidSecurityInfoRequest.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the issueBankInfo value for this BidSecurityInfoRequest.
     * 
     * @return issueBankInfo
     */
    public rw.minecofin.roneps.hub.vo.security.xsd.IssueBankInfo getIssueBankInfo() {
        return issueBankInfo;
    }


    /**
     * Sets the issueBankInfo value for this BidSecurityInfoRequest.
     * 
     * @param issueBankInfo
     */
    public void setIssueBankInfo(rw.minecofin.roneps.hub.vo.security.xsd.IssueBankInfo issueBankInfo) {
        this.issueBankInfo = issueBankInfo;
    }


    /**
     * Gets the password value for this BidSecurityInfoRequest.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this BidSecurityInfoRequest.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the supplierInfo value for this BidSecurityInfoRequest.
     * 
     * @return supplierInfo
     */
    public rw.minecofin.roneps.hub.vo.security.xsd.SupplierInfo getSupplierInfo() {
        return supplierInfo;
    }


    /**
     * Sets the supplierInfo value for this BidSecurityInfoRequest.
     * 
     * @param supplierInfo
     */
    public void setSupplierInfo(rw.minecofin.roneps.hub.vo.security.xsd.SupplierInfo supplierInfo) {
        this.supplierInfo = supplierInfo;
    }


    /**
     * Gets the tenderNotificationInfo value for this BidSecurityInfoRequest.
     * 
     * @return tenderNotificationInfo
     */
    public rw.minecofin.roneps.hub.vo.security.xsd.TenderNotificationInfo getTenderNotificationInfo() {
        return tenderNotificationInfo;
    }


    /**
     * Sets the tenderNotificationInfo value for this BidSecurityInfoRequest.
     * 
     * @param tenderNotificationInfo
     */
    public void setTenderNotificationInfo(rw.minecofin.roneps.hub.vo.security.xsd.TenderNotificationInfo tenderNotificationInfo) {
        this.tenderNotificationInfo = tenderNotificationInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BidSecurityInfoRequest)) return false;
        BidSecurityInfoRequest other = (BidSecurityInfoRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bidSecurityInfo==null && other.getBidSecurityInfo()==null) || 
             (this.bidSecurityInfo!=null &&
              this.bidSecurityInfo.equals(other.getBidSecurityInfo()))) &&
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
            ((this.tenderNotificationInfo==null && other.getTenderNotificationInfo()==null) || 
             (this.tenderNotificationInfo!=null &&
              this.tenderNotificationInfo.equals(other.getTenderNotificationInfo())));
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
        if (getBidSecurityInfo() != null) {
            _hashCode += getBidSecurityInfo().hashCode();
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
        if (getTenderNotificationInfo() != null) {
            _hashCode += getTenderNotificationInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BidSecurityInfoRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "BidSecurityInfoRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bidSecurityInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "bidSecurityInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "BidSecurityInfo"));
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
        elemField.setFieldName("tenderNotificationInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "tenderNotificationInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "TenderNotificationInfo"));
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
