/**
 * IssueBankInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package rw.minecofin.roneps.hub.vo.security.xsd;

public class IssueBankInfo  implements java.io.Serializable {
    private java.lang.String bankBranchName;

    private java.lang.String bankName;

    private java.lang.String bankTINNumber;

    private java.lang.String branchAddress;

    private java.lang.String branchManagerName;

    private java.lang.String comment;

    private java.lang.String email;

    private java.lang.String faxNumber;

    private java.lang.String securityRepresentiveName;

    private java.lang.String telNumber;

    public IssueBankInfo() {
    }

    public IssueBankInfo(
           java.lang.String bankBranchName,
           java.lang.String bankName,
           java.lang.String bankTINNumber,
           java.lang.String branchAddress,
           java.lang.String branchManagerName,
           java.lang.String comment,
           java.lang.String email,
           java.lang.String faxNumber,
           java.lang.String securityRepresentiveName,
           java.lang.String telNumber) {
           this.bankBranchName = bankBranchName;
           this.bankName = bankName;
           this.bankTINNumber = bankTINNumber;
           this.branchAddress = branchAddress;
           this.branchManagerName = branchManagerName;
           this.comment = comment;
           this.email = email;
           this.faxNumber = faxNumber;
           this.securityRepresentiveName = securityRepresentiveName;
           this.telNumber = telNumber;
    }


    /**
     * Gets the bankBranchName value for this IssueBankInfo.
     * 
     * @return bankBranchName
     */
    public java.lang.String getBankBranchName() {
        return bankBranchName;
    }


    /**
     * Sets the bankBranchName value for this IssueBankInfo.
     * 
     * @param bankBranchName
     */
    public void setBankBranchName(java.lang.String bankBranchName) {
        this.bankBranchName = bankBranchName;
    }


    /**
     * Gets the bankName value for this IssueBankInfo.
     * 
     * @return bankName
     */
    public java.lang.String getBankName() {
        return bankName;
    }


    /**
     * Sets the bankName value for this IssueBankInfo.
     * 
     * @param bankName
     */
    public void setBankName(java.lang.String bankName) {
        this.bankName = bankName;
    }


    /**
     * Gets the bankTINNumber value for this IssueBankInfo.
     * 
     * @return bankTINNumber
     */
    public java.lang.String getBankTINNumber() {
        return bankTINNumber;
    }


    /**
     * Sets the bankTINNumber value for this IssueBankInfo.
     * 
     * @param bankTINNumber
     */
    public void setBankTINNumber(java.lang.String bankTINNumber) {
        this.bankTINNumber = bankTINNumber;
    }


    /**
     * Gets the branchAddress value for this IssueBankInfo.
     * 
     * @return branchAddress
     */
    public java.lang.String getBranchAddress() {
        return branchAddress;
    }


    /**
     * Sets the branchAddress value for this IssueBankInfo.
     * 
     * @param branchAddress
     */
    public void setBranchAddress(java.lang.String branchAddress) {
        this.branchAddress = branchAddress;
    }


    /**
     * Gets the branchManagerName value for this IssueBankInfo.
     * 
     * @return branchManagerName
     */
    public java.lang.String getBranchManagerName() {
        return branchManagerName;
    }


    /**
     * Sets the branchManagerName value for this IssueBankInfo.
     * 
     * @param branchManagerName
     */
    public void setBranchManagerName(java.lang.String branchManagerName) {
        this.branchManagerName = branchManagerName;
    }


    /**
     * Gets the comment value for this IssueBankInfo.
     * 
     * @return comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this IssueBankInfo.
     * 
     * @param comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }


    /**
     * Gets the email value for this IssueBankInfo.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this IssueBankInfo.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the faxNumber value for this IssueBankInfo.
     * 
     * @return faxNumber
     */
    public java.lang.String getFaxNumber() {
        return faxNumber;
    }


    /**
     * Sets the faxNumber value for this IssueBankInfo.
     * 
     * @param faxNumber
     */
    public void setFaxNumber(java.lang.String faxNumber) {
        this.faxNumber = faxNumber;
    }


    /**
     * Gets the securityRepresentiveName value for this IssueBankInfo.
     * 
     * @return securityRepresentiveName
     */
    public java.lang.String getSecurityRepresentiveName() {
        return securityRepresentiveName;
    }


    /**
     * Sets the securityRepresentiveName value for this IssueBankInfo.
     * 
     * @param securityRepresentiveName
     */
    public void setSecurityRepresentiveName(java.lang.String securityRepresentiveName) {
        this.securityRepresentiveName = securityRepresentiveName;
    }


    /**
     * Gets the telNumber value for this IssueBankInfo.
     * 
     * @return telNumber
     */
    public java.lang.String getTelNumber() {
        return telNumber;
    }


    /**
     * Sets the telNumber value for this IssueBankInfo.
     * 
     * @param telNumber
     */
    public void setTelNumber(java.lang.String telNumber) {
        this.telNumber = telNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IssueBankInfo)) return false;
        IssueBankInfo other = (IssueBankInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bankBranchName==null && other.getBankBranchName()==null) || 
             (this.bankBranchName!=null &&
              this.bankBranchName.equals(other.getBankBranchName()))) &&
            ((this.bankName==null && other.getBankName()==null) || 
             (this.bankName!=null &&
              this.bankName.equals(other.getBankName()))) &&
            ((this.bankTINNumber==null && other.getBankTINNumber()==null) || 
             (this.bankTINNumber!=null &&
              this.bankTINNumber.equals(other.getBankTINNumber()))) &&
            ((this.branchAddress==null && other.getBranchAddress()==null) || 
             (this.branchAddress!=null &&
              this.branchAddress.equals(other.getBranchAddress()))) &&
            ((this.branchManagerName==null && other.getBranchManagerName()==null) || 
             (this.branchManagerName!=null &&
              this.branchManagerName.equals(other.getBranchManagerName()))) &&
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.faxNumber==null && other.getFaxNumber()==null) || 
             (this.faxNumber!=null &&
              this.faxNumber.equals(other.getFaxNumber()))) &&
            ((this.securityRepresentiveName==null && other.getSecurityRepresentiveName()==null) || 
             (this.securityRepresentiveName!=null &&
              this.securityRepresentiveName.equals(other.getSecurityRepresentiveName()))) &&
            ((this.telNumber==null && other.getTelNumber()==null) || 
             (this.telNumber!=null &&
              this.telNumber.equals(other.getTelNumber())));
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
        if (getBankBranchName() != null) {
            _hashCode += getBankBranchName().hashCode();
        }
        if (getBankName() != null) {
            _hashCode += getBankName().hashCode();
        }
        if (getBankTINNumber() != null) {
            _hashCode += getBankTINNumber().hashCode();
        }
        if (getBranchAddress() != null) {
            _hashCode += getBranchAddress().hashCode();
        }
        if (getBranchManagerName() != null) {
            _hashCode += getBranchManagerName().hashCode();
        }
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getFaxNumber() != null) {
            _hashCode += getFaxNumber().hashCode();
        }
        if (getSecurityRepresentiveName() != null) {
            _hashCode += getSecurityRepresentiveName().hashCode();
        }
        if (getTelNumber() != null) {
            _hashCode += getTelNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IssueBankInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "IssueBankInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankBranchName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "bankBranchName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "bankName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankTINNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "bankTINNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("branchAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "branchAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("branchManagerName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "branchManagerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "comment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faxNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "faxNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("securityRepresentiveName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "securityRepresentiveName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "telNumber"));
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
