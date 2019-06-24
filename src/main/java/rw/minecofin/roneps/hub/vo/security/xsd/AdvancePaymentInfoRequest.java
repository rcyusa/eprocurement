/**
 * AdvancePaymentInfoRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package rw.minecofin.roneps.hub.vo.security.xsd;

public class AdvancePaymentInfoRequest  implements java.io.Serializable {
    private rw.minecofin.roneps.hub.vo.security.xsd.AdvancePaymentInfo advancePaymentInfo;

    private java.lang.String contractDate;

    private java.lang.String contractName;

    private java.lang.String contractNumber;

    private java.lang.String contractSerialNumber;

    private java.lang.String id;

    private rw.minecofin.roneps.hub.vo.security.xsd.IssueBankInfo issueBankInfo;

    private java.lang.String password;

    private rw.minecofin.roneps.hub.vo.security.xsd.ProcuringEntityInfo procuringEnityInfo;

    private rw.minecofin.roneps.hub.vo.security.xsd.SupplierInfo supplierInfo;

    public AdvancePaymentInfoRequest() {
    }

    public AdvancePaymentInfoRequest(
           rw.minecofin.roneps.hub.vo.security.xsd.AdvancePaymentInfo advancePaymentInfo,
           java.lang.String contractDate,
           java.lang.String contractName,
           java.lang.String contractNumber,
           java.lang.String contractSerialNumber,
           java.lang.String id,
           rw.minecofin.roneps.hub.vo.security.xsd.IssueBankInfo issueBankInfo,
           java.lang.String password,
           rw.minecofin.roneps.hub.vo.security.xsd.ProcuringEntityInfo procuringEnityInfo,
           rw.minecofin.roneps.hub.vo.security.xsd.SupplierInfo supplierInfo) {
           this.advancePaymentInfo = advancePaymentInfo;
           this.contractDate = contractDate;
           this.contractName = contractName;
           this.contractNumber = contractNumber;
           this.contractSerialNumber = contractSerialNumber;
           this.id = id;
           this.issueBankInfo = issueBankInfo;
           this.password = password;
           this.procuringEnityInfo = procuringEnityInfo;
           this.supplierInfo = supplierInfo;
    }


    /**
     * Gets the advancePaymentInfo value for this AdvancePaymentInfoRequest.
     * 
     * @return advancePaymentInfo
     */
    public rw.minecofin.roneps.hub.vo.security.xsd.AdvancePaymentInfo getAdvancePaymentInfo() {
        return advancePaymentInfo;
    }


    /**
     * Sets the advancePaymentInfo value for this AdvancePaymentInfoRequest.
     * 
     * @param advancePaymentInfo
     */
    public void setAdvancePaymentInfo(rw.minecofin.roneps.hub.vo.security.xsd.AdvancePaymentInfo advancePaymentInfo) {
        this.advancePaymentInfo = advancePaymentInfo;
    }


    /**
     * Gets the contractDate value for this AdvancePaymentInfoRequest.
     * 
     * @return contractDate
     */
    public java.lang.String getContractDate() {
        return contractDate;
    }


    /**
     * Sets the contractDate value for this AdvancePaymentInfoRequest.
     * 
     * @param contractDate
     */
    public void setContractDate(java.lang.String contractDate) {
        this.contractDate = contractDate;
    }


    /**
     * Gets the contractName value for this AdvancePaymentInfoRequest.
     * 
     * @return contractName
     */
    public java.lang.String getContractName() {
        return contractName;
    }


    /**
     * Sets the contractName value for this AdvancePaymentInfoRequest.
     * 
     * @param contractName
     */
    public void setContractName(java.lang.String contractName) {
        this.contractName = contractName;
    }


    /**
     * Gets the contractNumber value for this AdvancePaymentInfoRequest.
     * 
     * @return contractNumber
     */
    public java.lang.String getContractNumber() {
        return contractNumber;
    }


    /**
     * Sets the contractNumber value for this AdvancePaymentInfoRequest.
     * 
     * @param contractNumber
     */
    public void setContractNumber(java.lang.String contractNumber) {
        this.contractNumber = contractNumber;
    }


    /**
     * Gets the contractSerialNumber value for this AdvancePaymentInfoRequest.
     * 
     * @return contractSerialNumber
     */
    public java.lang.String getContractSerialNumber() {
        return contractSerialNumber;
    }


    /**
     * Sets the contractSerialNumber value for this AdvancePaymentInfoRequest.
     * 
     * @param contractSerialNumber
     */
    public void setContractSerialNumber(java.lang.String contractSerialNumber) {
        this.contractSerialNumber = contractSerialNumber;
    }


    /**
     * Gets the id value for this AdvancePaymentInfoRequest.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this AdvancePaymentInfoRequest.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the issueBankInfo value for this AdvancePaymentInfoRequest.
     * 
     * @return issueBankInfo
     */
    public rw.minecofin.roneps.hub.vo.security.xsd.IssueBankInfo getIssueBankInfo() {
        return issueBankInfo;
    }


    /**
     * Sets the issueBankInfo value for this AdvancePaymentInfoRequest.
     * 
     * @param issueBankInfo
     */
    public void setIssueBankInfo(rw.minecofin.roneps.hub.vo.security.xsd.IssueBankInfo issueBankInfo) {
        this.issueBankInfo = issueBankInfo;
    }


    /**
     * Gets the password value for this AdvancePaymentInfoRequest.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this AdvancePaymentInfoRequest.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the procuringEnityInfo value for this AdvancePaymentInfoRequest.
     * 
     * @return procuringEnityInfo
     */
    public rw.minecofin.roneps.hub.vo.security.xsd.ProcuringEntityInfo getProcuringEnityInfo() {
        return procuringEnityInfo;
    }


    /**
     * Sets the procuringEnityInfo value for this AdvancePaymentInfoRequest.
     * 
     * @param procuringEnityInfo
     */
    public void setProcuringEnityInfo(rw.minecofin.roneps.hub.vo.security.xsd.ProcuringEntityInfo procuringEnityInfo) {
        this.procuringEnityInfo = procuringEnityInfo;
    }


    /**
     * Gets the supplierInfo value for this AdvancePaymentInfoRequest.
     * 
     * @return supplierInfo
     */
    public rw.minecofin.roneps.hub.vo.security.xsd.SupplierInfo getSupplierInfo() {
        return supplierInfo;
    }


    /**
     * Sets the supplierInfo value for this AdvancePaymentInfoRequest.
     * 
     * @param supplierInfo
     */
    public void setSupplierInfo(rw.minecofin.roneps.hub.vo.security.xsd.SupplierInfo supplierInfo) {
        this.supplierInfo = supplierInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdvancePaymentInfoRequest)) return false;
        AdvancePaymentInfoRequest other = (AdvancePaymentInfoRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.advancePaymentInfo==null && other.getAdvancePaymentInfo()==null) || 
             (this.advancePaymentInfo!=null &&
              this.advancePaymentInfo.equals(other.getAdvancePaymentInfo()))) &&
            ((this.contractDate==null && other.getContractDate()==null) || 
             (this.contractDate!=null &&
              this.contractDate.equals(other.getContractDate()))) &&
            ((this.contractName==null && other.getContractName()==null) || 
             (this.contractName!=null &&
              this.contractName.equals(other.getContractName()))) &&
            ((this.contractNumber==null && other.getContractNumber()==null) || 
             (this.contractNumber!=null &&
              this.contractNumber.equals(other.getContractNumber()))) &&
            ((this.contractSerialNumber==null && other.getContractSerialNumber()==null) || 
             (this.contractSerialNumber!=null &&
              this.contractSerialNumber.equals(other.getContractSerialNumber()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.issueBankInfo==null && other.getIssueBankInfo()==null) || 
             (this.issueBankInfo!=null &&
              this.issueBankInfo.equals(other.getIssueBankInfo()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.procuringEnityInfo==null && other.getProcuringEnityInfo()==null) || 
             (this.procuringEnityInfo!=null &&
              this.procuringEnityInfo.equals(other.getProcuringEnityInfo()))) &&
            ((this.supplierInfo==null && other.getSupplierInfo()==null) || 
             (this.supplierInfo!=null &&
              this.supplierInfo.equals(other.getSupplierInfo())));
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
        if (getAdvancePaymentInfo() != null) {
            _hashCode += getAdvancePaymentInfo().hashCode();
        }
        if (getContractDate() != null) {
            _hashCode += getContractDate().hashCode();
        }
        if (getContractName() != null) {
            _hashCode += getContractName().hashCode();
        }
        if (getContractNumber() != null) {
            _hashCode += getContractNumber().hashCode();
        }
        if (getContractSerialNumber() != null) {
            _hashCode += getContractSerialNumber().hashCode();
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
        if (getProcuringEnityInfo() != null) {
            _hashCode += getProcuringEnityInfo().hashCode();
        }
        if (getSupplierInfo() != null) {
            _hashCode += getSupplierInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdvancePaymentInfoRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "AdvancePaymentInfoRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advancePaymentInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "advancePaymentInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "AdvancePaymentInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "contractDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "contractName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "contractNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractSerialNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "contractSerialNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("procuringEnityInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "procuringEnityInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "ProcuringEntityInfo"));
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
