/**
 * CreditLineFacilityInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package rw.minecofin.roneps.hub.vo.security.xsd;

public class CreditLineFacilityInfo  implements java.io.Serializable {
    private java.lang.String accountNumber;

    private java.lang.String amount;

    private java.lang.String amountCharacter;

    private java.lang.String creditLineNumber;

    private java.lang.String fromDate;

    private java.lang.String toDate;

    private java.lang.String unit;

    public CreditLineFacilityInfo() {
    }

    public CreditLineFacilityInfo(
           java.lang.String accountNumber,
           java.lang.String amount,
           java.lang.String amountCharacter,
           java.lang.String creditLineNumber,
           java.lang.String fromDate,
           java.lang.String toDate,
           java.lang.String unit) {
           this.accountNumber = accountNumber;
           this.amount = amount;
           this.amountCharacter = amountCharacter;
           this.creditLineNumber = creditLineNumber;
           this.fromDate = fromDate;
           this.toDate = toDate;
           this.unit = unit;
    }


    /**
     * Gets the accountNumber value for this CreditLineFacilityInfo.
     * 
     * @return accountNumber
     */
    public java.lang.String getAccountNumber() {
        return accountNumber;
    }


    /**
     * Sets the accountNumber value for this CreditLineFacilityInfo.
     * 
     * @param accountNumber
     */
    public void setAccountNumber(java.lang.String accountNumber) {
        this.accountNumber = accountNumber;
    }


    /**
     * Gets the amount value for this CreditLineFacilityInfo.
     * 
     * @return amount
     */
    public java.lang.String getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this CreditLineFacilityInfo.
     * 
     * @param amount
     */
    public void setAmount(java.lang.String amount) {
        this.amount = amount;
    }


    /**
     * Gets the amountCharacter value for this CreditLineFacilityInfo.
     * 
     * @return amountCharacter
     */
    public java.lang.String getAmountCharacter() {
        return amountCharacter;
    }


    /**
     * Sets the amountCharacter value for this CreditLineFacilityInfo.
     * 
     * @param amountCharacter
     */
    public void setAmountCharacter(java.lang.String amountCharacter) {
        this.amountCharacter = amountCharacter;
    }


    /**
     * Gets the creditLineNumber value for this CreditLineFacilityInfo.
     * 
     * @return creditLineNumber
     */
    public java.lang.String getCreditLineNumber() {
        return creditLineNumber;
    }


    /**
     * Sets the creditLineNumber value for this CreditLineFacilityInfo.
     * 
     * @param creditLineNumber
     */
    public void setCreditLineNumber(java.lang.String creditLineNumber) {
        this.creditLineNumber = creditLineNumber;
    }


    /**
     * Gets the fromDate value for this CreditLineFacilityInfo.
     * 
     * @return fromDate
     */
    public java.lang.String getFromDate() {
        return fromDate;
    }


    /**
     * Sets the fromDate value for this CreditLineFacilityInfo.
     * 
     * @param fromDate
     */
    public void setFromDate(java.lang.String fromDate) {
        this.fromDate = fromDate;
    }


    /**
     * Gets the toDate value for this CreditLineFacilityInfo.
     * 
     * @return toDate
     */
    public java.lang.String getToDate() {
        return toDate;
    }


    /**
     * Sets the toDate value for this CreditLineFacilityInfo.
     * 
     * @param toDate
     */
    public void setToDate(java.lang.String toDate) {
        this.toDate = toDate;
    }


    /**
     * Gets the unit value for this CreditLineFacilityInfo.
     * 
     * @return unit
     */
    public java.lang.String getUnit() {
        return unit;
    }


    /**
     * Sets the unit value for this CreditLineFacilityInfo.
     * 
     * @param unit
     */
    public void setUnit(java.lang.String unit) {
        this.unit = unit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreditLineFacilityInfo)) return false;
        CreditLineFacilityInfo other = (CreditLineFacilityInfo) obj;
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
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.amountCharacter==null && other.getAmountCharacter()==null) || 
             (this.amountCharacter!=null &&
              this.amountCharacter.equals(other.getAmountCharacter()))) &&
            ((this.creditLineNumber==null && other.getCreditLineNumber()==null) || 
             (this.creditLineNumber!=null &&
              this.creditLineNumber.equals(other.getCreditLineNumber()))) &&
            ((this.fromDate==null && other.getFromDate()==null) || 
             (this.fromDate!=null &&
              this.fromDate.equals(other.getFromDate()))) &&
            ((this.toDate==null && other.getToDate()==null) || 
             (this.toDate!=null &&
              this.toDate.equals(other.getToDate()))) &&
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
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getAmountCharacter() != null) {
            _hashCode += getAmountCharacter().hashCode();
        }
        if (getCreditLineNumber() != null) {
            _hashCode += getCreditLineNumber().hashCode();
        }
        if (getFromDate() != null) {
            _hashCode += getFromDate().hashCode();
        }
        if (getToDate() != null) {
            _hashCode += getToDate().hashCode();
        }
        if (getUnit() != null) {
            _hashCode += getUnit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreditLineFacilityInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "CreditLineFacilityInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "accountNumber"));
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
        elemField.setFieldName("creditLineNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "creditLineNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "fromDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "toDate"));
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
