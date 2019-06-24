/**
 * PerformanceSecurityInfoRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package rw.minecofin.roneps.hub.vo.security.xsd;

public class PerformanceSecurityInfoRequest  implements java.io.Serializable {
    private rw.minecofin.roneps.hub.vo.security.xsd.ContractInfo contractInfo;

    private java.lang.String id;

    private rw.minecofin.roneps.hub.vo.security.xsd.IssueBankInfo issueBankInfo;

    private java.lang.String password;

    private rw.minecofin.roneps.hub.vo.security.xsd.PerformanceSecurityInfo performanceSecurityInfo;

    public PerformanceSecurityInfoRequest() {
    }

    public PerformanceSecurityInfoRequest(
           rw.minecofin.roneps.hub.vo.security.xsd.ContractInfo contractInfo,
           java.lang.String id,
           rw.minecofin.roneps.hub.vo.security.xsd.IssueBankInfo issueBankInfo,
           java.lang.String password,
           rw.minecofin.roneps.hub.vo.security.xsd.PerformanceSecurityInfo performanceSecurityInfo) {
           this.contractInfo = contractInfo;
           this.id = id;
           this.issueBankInfo = issueBankInfo;
           this.password = password;
           this.performanceSecurityInfo = performanceSecurityInfo;
    }


    /**
     * Gets the contractInfo value for this PerformanceSecurityInfoRequest.
     * 
     * @return contractInfo
     */
    public rw.minecofin.roneps.hub.vo.security.xsd.ContractInfo getContractInfo() {
        return contractInfo;
    }


    /**
     * Sets the contractInfo value for this PerformanceSecurityInfoRequest.
     * 
     * @param contractInfo
     */
    public void setContractInfo(rw.minecofin.roneps.hub.vo.security.xsd.ContractInfo contractInfo) {
        this.contractInfo = contractInfo;
    }


    /**
     * Gets the id value for this PerformanceSecurityInfoRequest.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this PerformanceSecurityInfoRequest.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the issueBankInfo value for this PerformanceSecurityInfoRequest.
     * 
     * @return issueBankInfo
     */
    public rw.minecofin.roneps.hub.vo.security.xsd.IssueBankInfo getIssueBankInfo() {
        return issueBankInfo;
    }


    /**
     * Sets the issueBankInfo value for this PerformanceSecurityInfoRequest.
     * 
     * @param issueBankInfo
     */
    public void setIssueBankInfo(rw.minecofin.roneps.hub.vo.security.xsd.IssueBankInfo issueBankInfo) {
        this.issueBankInfo = issueBankInfo;
    }


    /**
     * Gets the password value for this PerformanceSecurityInfoRequest.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this PerformanceSecurityInfoRequest.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the performanceSecurityInfo value for this PerformanceSecurityInfoRequest.
     * 
     * @return performanceSecurityInfo
     */
    public rw.minecofin.roneps.hub.vo.security.xsd.PerformanceSecurityInfo getPerformanceSecurityInfo() {
        return performanceSecurityInfo;
    }


    /**
     * Sets the performanceSecurityInfo value for this PerformanceSecurityInfoRequest.
     * 
     * @param performanceSecurityInfo
     */
    public void setPerformanceSecurityInfo(rw.minecofin.roneps.hub.vo.security.xsd.PerformanceSecurityInfo performanceSecurityInfo) {
        this.performanceSecurityInfo = performanceSecurityInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PerformanceSecurityInfoRequest)) return false;
        PerformanceSecurityInfoRequest other = (PerformanceSecurityInfoRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.contractInfo==null && other.getContractInfo()==null) || 
             (this.contractInfo!=null &&
              this.contractInfo.equals(other.getContractInfo()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.issueBankInfo==null && other.getIssueBankInfo()==null) || 
             (this.issueBankInfo!=null &&
              this.issueBankInfo.equals(other.getIssueBankInfo()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.performanceSecurityInfo==null && other.getPerformanceSecurityInfo()==null) || 
             (this.performanceSecurityInfo!=null &&
              this.performanceSecurityInfo.equals(other.getPerformanceSecurityInfo())));
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
        if (getContractInfo() != null) {
            _hashCode += getContractInfo().hashCode();
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
        if (getPerformanceSecurityInfo() != null) {
            _hashCode += getPerformanceSecurityInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PerformanceSecurityInfoRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "PerformanceSecurityInfoRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "contractInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "ContractInfo"));
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
        elemField.setFieldName("performanceSecurityInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "performanceSecurityInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "PerformanceSecurityInfo"));
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
