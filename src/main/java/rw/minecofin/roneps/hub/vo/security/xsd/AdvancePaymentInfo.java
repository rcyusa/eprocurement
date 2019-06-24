/**
 * AdvancePaymentInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package rw.minecofin.roneps.hub.vo.security.xsd;

public class AdvancePaymentInfo  implements java.io.Serializable {
    private java.lang.String accountNumber;

    private java.lang.String address;

    private java.lang.String amount;

    private java.lang.String amountCharacter;

    private java.lang.String expireDate;

    private java.lang.String guaranteeNumber;

    private java.lang.String issueDate;

    private java.lang.String name;

    private java.lang.String position;

    private java.lang.String startDate;

    private java.lang.String status;

    private java.lang.String unit;

    public AdvancePaymentInfo() {
    }

    public AdvancePaymentInfo(
           java.lang.String accountNumber,
           java.lang.String address,
           java.lang.String amount,
           java.lang.String amountCharacter,
           java.lang.String expireDate,
           java.lang.String guaranteeNumber,
           java.lang.String issueDate,
           java.lang.String name,
           java.lang.String position,
           java.lang.String startDate,
           java.lang.String status,
           java.lang.String unit) {
           this.accountNumber = accountNumber;
           this.address = address;
           this.amount = amount;
           this.amountCharacter = amountCharacter;
           this.expireDate = expireDate;
           this.guaranteeNumber = guaranteeNumber;
           this.issueDate = issueDate;
           this.name = name;
           this.position = position;
           this.startDate = startDate;
           this.status = status;
           this.unit = unit;
    }


    /**
     * Gets the accountNumber value for this AdvancePaymentInfo.
     * 
     * @return accountNumber
     */
    public java.lang.String getAccountNumber() {
        return accountNumber;
    }


    /**
     * Sets the accountNumber value for this AdvancePaymentInfo.
     * 
     * @param accountNumber
     */
    public void setAccountNumber(java.lang.String accountNumber) {
        this.accountNumber = accountNumber;
    }


    /**
     * Gets the address value for this AdvancePaymentInfo.
     * 
     * @return address
     */
    public java.lang.String getAddress() {
        return address;
    }


    /**
     * Sets the address value for this AdvancePaymentInfo.
     * 
     * @param address
     */
    public void setAddress(java.lang.String address) {
        this.address = address;
    }


    /**
     * Gets the amount value for this AdvancePaymentInfo.
     * 
     * @return amount
     */
    public java.lang.String getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this AdvancePaymentInfo.
     * 
     * @param amount
     */
    public void setAmount(java.lang.String amount) {
        this.amount = amount;
    }


    /**
     * Gets the amountCharacter value for this AdvancePaymentInfo.
     * 
     * @return amountCharacter
     */
    public java.lang.String getAmountCharacter() {
        return amountCharacter;
    }


    /**
     * Sets the amountCharacter value for this AdvancePaymentInfo.
     * 
     * @param amountCharacter
     */
    public void setAmountCharacter(java.lang.String amountCharacter) {
        this.amountCharacter = amountCharacter;
    }


    /**
     * Gets the expireDate value for this AdvancePaymentInfo.
     * 
     * @return expireDate
     */
    public java.lang.String getExpireDate() {
        return expireDate;
    }


    /**
     * Sets the expireDate value for this AdvancePaymentInfo.
     * 
     * @param expireDate
     */
    public void setExpireDate(java.lang.String expireDate) {
        this.expireDate = expireDate;
    }


    /**
     * Gets the guaranteeNumber value for this AdvancePaymentInfo.
     * 
     * @return guaranteeNumber
     */
    public java.lang.String getGuaranteeNumber() {
        return guaranteeNumber;
    }


    /**
     * Sets the guaranteeNumber value for this AdvancePaymentInfo.
     * 
     * @param guaranteeNumber
     */
    public void setGuaranteeNumber(java.lang.String guaranteeNumber) {
        this.guaranteeNumber = guaranteeNumber;
    }


    /**
     * Gets the issueDate value for this AdvancePaymentInfo.
     * 
     * @return issueDate
     */
    public java.lang.String getIssueDate() {
        return issueDate;
    }


    /**
     * Sets the issueDate value for this AdvancePaymentInfo.
     * 
     * @param issueDate
     */
    public void setIssueDate(java.lang.String issueDate) {
        this.issueDate = issueDate;
    }


    /**
     * Gets the name value for this AdvancePaymentInfo.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this AdvancePaymentInfo.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the position value for this AdvancePaymentInfo.
     * 
     * @return position
     */
    public java.lang.String getPosition() {
        return position;
    }


    /**
     * Sets the position value for this AdvancePaymentInfo.
     * 
     * @param position
     */
    public void setPosition(java.lang.String position) {
        this.position = position;
    }


    /**
     * Gets the startDate value for this AdvancePaymentInfo.
     * 
     * @return startDate
     */
    public java.lang.String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this AdvancePaymentInfo.
     * 
     * @param startDate
     */
    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the status value for this AdvancePaymentInfo.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this AdvancePaymentInfo.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the unit value for this AdvancePaymentInfo.
     * 
     * @return unit
     */
    public java.lang.String getUnit() {
        return unit;
    }


    /**
     * Sets the unit value for this AdvancePaymentInfo.
     * 
     * @param unit
     */
    public void setUnit(java.lang.String unit) {
        this.unit = unit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdvancePaymentInfo)) return false;
        AdvancePaymentInfo other = (AdvancePaymentInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accountNumber==null && other.getAccountNumber()==null) || 
             (this.accountNumber!=null &&
              this.accountNumber.equals(other.getAccountNumber()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.amountCharacter==null && other.getAmountCharacter()==null) || 
             (this.amountCharacter!=null &&
              this.amountCharacter.equals(other.getAmountCharacter()))) &&
            ((this.expireDate==null && other.getExpireDate()==null) || 
             (this.expireDate!=null &&
              this.expireDate.equals(other.getExpireDate()))) &&
            ((this.guaranteeNumber==null && other.getGuaranteeNumber()==null) || 
             (this.guaranteeNumber!=null &&
              this.guaranteeNumber.equals(other.getGuaranteeNumber()))) &&
            ((this.issueDate==null && other.getIssueDate()==null) || 
             (this.issueDate!=null &&
              this.issueDate.equals(other.getIssueDate()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.position==null && other.getPosition()==null) || 
             (this.position!=null &&
              this.position.equals(other.getPosition()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.unit==null && other.getUnit()==null) || 
             (this.unit!=null &&
              this.unit.equals(other.getUnit())));
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
        if (getAccountNumber() != null) {
            _hashCode += getAccountNumber().hashCode();
        }
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getAmountCharacter() != null) {
            _hashCode += getAmountCharacter().hashCode();
        }
        if (getExpireDate() != null) {
            _hashCode += getExpireDate().hashCode();
        }
        if (getGuaranteeNumber() != null) {
            _hashCode += getGuaranteeNumber().hashCode();
        }
        if (getIssueDate() != null) {
            _hashCode += getIssueDate().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getPosition() != null) {
            _hashCode += getPosition().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getUnit() != null) {
            _hashCode += getUnit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdvancePaymentInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "AdvancePaymentInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "accountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountCharacter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "amountCharacter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expireDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "expireDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("guaranteeNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "guaranteeNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "issueDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("position");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "position"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "unit"));
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
