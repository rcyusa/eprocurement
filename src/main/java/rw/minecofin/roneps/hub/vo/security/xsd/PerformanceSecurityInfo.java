/**
 * PerformanceSecurityInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package rw.minecofin.roneps.hub.vo.security.xsd;

public class PerformanceSecurityInfo  implements java.io.Serializable {
    private java.lang.String amount;

    private java.lang.String amountCharacter;

    private java.lang.String expireDate;

    private java.lang.String securityName;

    private java.lang.String securityNumber;

    private java.lang.String startDate;

    private java.lang.String status;

    private java.lang.String unit;

    public PerformanceSecurityInfo() {
    }

    public PerformanceSecurityInfo(
           java.lang.String amount,
           java.lang.String amountCharacter,
           java.lang.String expireDate,
           java.lang.String securityName,
           java.lang.String securityNumber,
           java.lang.String startDate,
           java.lang.String status,
           java.lang.String unit) {
           this.amount = amount;
           this.amountCharacter = amountCharacter;
           this.expireDate = expireDate;
           this.securityName = securityName;
           this.securityNumber = securityNumber;
           this.startDate = startDate;
           this.status = status;
           this.unit = unit;
    }


    /**
     * Gets the amount value for this PerformanceSecurityInfo.
     * 
     * @return amount
     */
    public java.lang.String getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this PerformanceSecurityInfo.
     * 
     * @param amount
     */
    public void setAmount(java.lang.String amount) {
        this.amount = amount;
    }


    /**
     * Gets the amountCharacter value for this PerformanceSecurityInfo.
     * 
     * @return amountCharacter
     */
    public java.lang.String getAmountCharacter() {
        return amountCharacter;
    }


    /**
     * Sets the amountCharacter value for this PerformanceSecurityInfo.
     * 
     * @param amountCharacter
     */
    public void setAmountCharacter(java.lang.String amountCharacter) {
        this.amountCharacter = amountCharacter;
    }


    /**
     * Gets the expireDate value for this PerformanceSecurityInfo.
     * 
     * @return expireDate
     */
    public java.lang.String getExpireDate() {
        return expireDate;
    }


    /**
     * Sets the expireDate value for this PerformanceSecurityInfo.
     * 
     * @param expireDate
     */
    public void setExpireDate(java.lang.String expireDate) {
        this.expireDate = expireDate;
    }


    /**
     * Gets the securityName value for this PerformanceSecurityInfo.
     * 
     * @return securityName
     */
    public java.lang.String getSecurityName() {
        return securityName;
    }


    /**
     * Sets the securityName value for this PerformanceSecurityInfo.
     * 
     * @param securityName
     */
    public void setSecurityName(java.lang.String securityName) {
        this.securityName = securityName;
    }


    /**
     * Gets the securityNumber value for this PerformanceSecurityInfo.
     * 
     * @return securityNumber
     */
    public java.lang.String getSecurityNumber() {
        return securityNumber;
    }


    /**
     * Sets the securityNumber value for this PerformanceSecurityInfo.
     * 
     * @param securityNumber
     */
    public void setSecurityNumber(java.lang.String securityNumber) {
        this.securityNumber = securityNumber;
    }


    /**
     * Gets the startDate value for this PerformanceSecurityInfo.
     * 
     * @return startDate
     */
    public java.lang.String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this PerformanceSecurityInfo.
     * 
     * @param startDate
     */
    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the status value for this PerformanceSecurityInfo.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this PerformanceSecurityInfo.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the unit value for this PerformanceSecurityInfo.
     * 
     * @return unit
     */
    public java.lang.String getUnit() {
        return unit;
    }


    /**
     * Sets the unit value for this PerformanceSecurityInfo.
     * 
     * @param unit
     */
    public void setUnit(java.lang.String unit) {
        this.unit = unit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PerformanceSecurityInfo)) return false;
        PerformanceSecurityInfo other = (PerformanceSecurityInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.amountCharacter==null && other.getAmountCharacter()==null) || 
             (this.amountCharacter!=null &&
              this.amountCharacter.equals(other.getAmountCharacter()))) &&
            ((this.expireDate==null && other.getExpireDate()==null) || 
             (this.expireDate!=null &&
              this.expireDate.equals(other.getExpireDate()))) &&
            ((this.securityName==null && other.getSecurityName()==null) || 
             (this.securityName!=null &&
              this.securityName.equals(other.getSecurityName()))) &&
            ((this.securityNumber==null && other.getSecurityNumber()==null) || 
             (this.securityNumber!=null &&
              this.securityNumber.equals(other.getSecurityNumber()))) &&
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
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getAmountCharacter() != null) {
            _hashCode += getAmountCharacter().hashCode();
        }
        if (getExpireDate() != null) {
            _hashCode += getExpireDate().hashCode();
        }
        if (getSecurityName() != null) {
            _hashCode += getSecurityName().hashCode();
        }
        if (getSecurityNumber() != null) {
            _hashCode += getSecurityNumber().hashCode();
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
        new org.apache.axis.description.TypeDesc(PerformanceSecurityInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "PerformanceSecurityInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("securityName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "securityName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("securityNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "securityNumber"));
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
