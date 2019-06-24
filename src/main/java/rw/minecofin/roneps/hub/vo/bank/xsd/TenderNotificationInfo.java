/**
 * TenderNotificationInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package rw.minecofin.roneps.hub.vo.bank.xsd;

public class TenderNotificationInfo  implements java.io.Serializable {
    private java.lang.String PECode;

    private java.lang.String PEName;

    private java.lang.String deadLineDate;

    private java.lang.String onOff;

    private java.lang.String openDate;

    private java.lang.String publicDate;

    private java.lang.String receiveDate;

    private rw.minecofin.roneps.hub.vo.bank.xsd.TenderLOTInfo[] tenderLOTInfo;

    private java.lang.String tenderMethod;

    private java.lang.String tenderRefName;

    private java.lang.String tenderRefNumber;

    private java.lang.String tenderType;

    public TenderNotificationInfo() {
    }

    public TenderNotificationInfo(
           java.lang.String PECode,
           java.lang.String PEName,
           java.lang.String deadLineDate,
           java.lang.String onOff,
           java.lang.String openDate,
           java.lang.String publicDate,
           java.lang.String receiveDate,
           rw.minecofin.roneps.hub.vo.bank.xsd.TenderLOTInfo[] tenderLOTInfo,
           java.lang.String tenderMethod,
           java.lang.String tenderRefName,
           java.lang.String tenderRefNumber,
           java.lang.String tenderType) {
           this.PECode = PECode;
           this.PEName = PEName;
           this.deadLineDate = deadLineDate;
           this.onOff = onOff;
           this.openDate = openDate;
           this.publicDate = publicDate;
           this.receiveDate = receiveDate;
           this.tenderLOTInfo = tenderLOTInfo;
           this.tenderMethod = tenderMethod;
           this.tenderRefName = tenderRefName;
           this.tenderRefNumber = tenderRefNumber;
           this.tenderType = tenderType;
    }


    /**
     * Gets the PECode value for this TenderNotificationInfo.
     * 
     * @return PECode
     */
    public java.lang.String getPECode() {
        return PECode;
    }


    /**
     * Sets the PECode value for this TenderNotificationInfo.
     * 
     * @param PECode
     */
    public void setPECode(java.lang.String PECode) {
        this.PECode = PECode;
    }


    /**
     * Gets the PEName value for this TenderNotificationInfo.
     * 
     * @return PEName
     */
    public java.lang.String getPEName() {
        return PEName;
    }


    /**
     * Sets the PEName value for this TenderNotificationInfo.
     * 
     * @param PEName
     */
    public void setPEName(java.lang.String PEName) {
        this.PEName = PEName;
    }


    /**
     * Gets the deadLineDate value for this TenderNotificationInfo.
     * 
     * @return deadLineDate
     */
    public java.lang.String getDeadLineDate() {
        return deadLineDate;
    }


    /**
     * Sets the deadLineDate value for this TenderNotificationInfo.
     * 
     * @param deadLineDate
     */
    public void setDeadLineDate(java.lang.String deadLineDate) {
        this.deadLineDate = deadLineDate;
    }


    /**
     * Gets the onOff value for this TenderNotificationInfo.
     * 
     * @return onOff
     */
    public java.lang.String getOnOff() {
        return onOff;
    }


    /**
     * Sets the onOff value for this TenderNotificationInfo.
     * 
     * @param onOff
     */
    public void setOnOff(java.lang.String onOff) {
        this.onOff = onOff;
    }


    /**
     * Gets the openDate value for this TenderNotificationInfo.
     * 
     * @return openDate
     */
    public java.lang.String getOpenDate() {
        return openDate;
    }


    /**
     * Sets the openDate value for this TenderNotificationInfo.
     * 
     * @param openDate
     */
    public void setOpenDate(java.lang.String openDate) {
        this.openDate = openDate;
    }


    /**
     * Gets the publicDate value for this TenderNotificationInfo.
     * 
     * @return publicDate
     */
    public java.lang.String getPublicDate() {
        return publicDate;
    }


    /**
     * Sets the publicDate value for this TenderNotificationInfo.
     * 
     * @param publicDate
     */
    public void setPublicDate(java.lang.String publicDate) {
        this.publicDate = publicDate;
    }


    /**
     * Gets the receiveDate value for this TenderNotificationInfo.
     * 
     * @return receiveDate
     */
    public java.lang.String getReceiveDate() {
        return receiveDate;
    }


    /**
     * Sets the receiveDate value for this TenderNotificationInfo.
     * 
     * @param receiveDate
     */
    public void setReceiveDate(java.lang.String receiveDate) {
        this.receiveDate = receiveDate;
    }


    /**
     * Gets the tenderLOTInfo value for this TenderNotificationInfo.
     * 
     * @return tenderLOTInfo
     */
    public rw.minecofin.roneps.hub.vo.bank.xsd.TenderLOTInfo[] getTenderLOTInfo() {
        return tenderLOTInfo;
    }


    /**
     * Sets the tenderLOTInfo value for this TenderNotificationInfo.
     * 
     * @param tenderLOTInfo
     */
    public void setTenderLOTInfo(rw.minecofin.roneps.hub.vo.bank.xsd.TenderLOTInfo[] tenderLOTInfo) {
        this.tenderLOTInfo = tenderLOTInfo;
    }

    public rw.minecofin.roneps.hub.vo.bank.xsd.TenderLOTInfo getTenderLOTInfo(int i) {
        return this.tenderLOTInfo[i];
    }

    public void setTenderLOTInfo(int i, rw.minecofin.roneps.hub.vo.bank.xsd.TenderLOTInfo _value) {
        this.tenderLOTInfo[i] = _value;
    }


    /**
     * Gets the tenderMethod value for this TenderNotificationInfo.
     * 
     * @return tenderMethod
     */
    public java.lang.String getTenderMethod() {
        return tenderMethod;
    }


    /**
     * Sets the tenderMethod value for this TenderNotificationInfo.
     * 
     * @param tenderMethod
     */
    public void setTenderMethod(java.lang.String tenderMethod) {
        this.tenderMethod = tenderMethod;
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


    /**
     * Gets the tenderType value for this TenderNotificationInfo.
     * 
     * @return tenderType
     */
    public java.lang.String getTenderType() {
        return tenderType;
    }


    /**
     * Sets the tenderType value for this TenderNotificationInfo.
     * 
     * @param tenderType
     */
    public void setTenderType(java.lang.String tenderType) {
        this.tenderType = tenderType;
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
            ((this.PECode==null && other.getPECode()==null) || 
             (this.PECode!=null &&
              this.PECode.equals(other.getPECode()))) &&
            ((this.PEName==null && other.getPEName()==null) || 
             (this.PEName!=null &&
              this.PEName.equals(other.getPEName()))) &&
            ((this.deadLineDate==null && other.getDeadLineDate()==null) || 
             (this.deadLineDate!=null &&
              this.deadLineDate.equals(other.getDeadLineDate()))) &&
            ((this.onOff==null && other.getOnOff()==null) || 
             (this.onOff!=null &&
              this.onOff.equals(other.getOnOff()))) &&
            ((this.openDate==null && other.getOpenDate()==null) || 
             (this.openDate!=null &&
              this.openDate.equals(other.getOpenDate()))) &&
            ((this.publicDate==null && other.getPublicDate()==null) || 
             (this.publicDate!=null &&
              this.publicDate.equals(other.getPublicDate()))) &&
            ((this.receiveDate==null && other.getReceiveDate()==null) || 
             (this.receiveDate!=null &&
              this.receiveDate.equals(other.getReceiveDate()))) &&
            ((this.tenderLOTInfo==null && other.getTenderLOTInfo()==null) || 
             (this.tenderLOTInfo!=null &&
              java.util.Arrays.equals(this.tenderLOTInfo, other.getTenderLOTInfo()))) &&
            ((this.tenderMethod==null && other.getTenderMethod()==null) || 
             (this.tenderMethod!=null &&
              this.tenderMethod.equals(other.getTenderMethod()))) &&
            ((this.tenderRefName==null && other.getTenderRefName()==null) || 
             (this.tenderRefName!=null &&
              this.tenderRefName.equals(other.getTenderRefName()))) &&
            ((this.tenderRefNumber==null && other.getTenderRefNumber()==null) || 
             (this.tenderRefNumber!=null &&
              this.tenderRefNumber.equals(other.getTenderRefNumber()))) &&
            ((this.tenderType==null && other.getTenderType()==null) || 
             (this.tenderType!=null &&
              this.tenderType.equals(other.getTenderType())));
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
        if (getPECode() != null) {
            _hashCode += getPECode().hashCode();
        }
        if (getPEName() != null) {
            _hashCode += getPEName().hashCode();
        }
        if (getDeadLineDate() != null) {
            _hashCode += getDeadLineDate().hashCode();
        }
        if (getOnOff() != null) {
            _hashCode += getOnOff().hashCode();
        }
        if (getOpenDate() != null) {
            _hashCode += getOpenDate().hashCode();
        }
        if (getPublicDate() != null) {
            _hashCode += getPublicDate().hashCode();
        }
        if (getReceiveDate() != null) {
            _hashCode += getReceiveDate().hashCode();
        }
        if (getTenderLOTInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTenderLOTInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTenderLOTInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTenderMethod() != null) {
            _hashCode += getTenderMethod().hashCode();
        }
        if (getTenderRefName() != null) {
            _hashCode += getTenderRefName().hashCode();
        }
        if (getTenderRefNumber() != null) {
            _hashCode += getTenderRefNumber().hashCode();
        }
        if (getTenderType() != null) {
            _hashCode += getTenderType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TenderNotificationInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://bank.vo.hub.roneps.minecofin.rw/xsd", "TenderNotificationInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PECode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bank.vo.hub.roneps.minecofin.rw/xsd", "PECode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PEName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bank.vo.hub.roneps.minecofin.rw/xsd", "PEName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deadLineDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bank.vo.hub.roneps.minecofin.rw/xsd", "deadLineDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onOff");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bank.vo.hub.roneps.minecofin.rw/xsd", "onOff"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("openDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bank.vo.hub.roneps.minecofin.rw/xsd", "openDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publicDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bank.vo.hub.roneps.minecofin.rw/xsd", "publicDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bank.vo.hub.roneps.minecofin.rw/xsd", "receiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tenderLOTInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bank.vo.hub.roneps.minecofin.rw/xsd", "tenderLOTInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bank.vo.hub.roneps.minecofin.rw/xsd", "TenderLOTInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tenderMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bank.vo.hub.roneps.minecofin.rw/xsd", "tenderMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tenderRefName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bank.vo.hub.roneps.minecofin.rw/xsd", "tenderRefName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tenderRefNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bank.vo.hub.roneps.minecofin.rw/xsd", "tenderRefNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tenderType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bank.vo.hub.roneps.minecofin.rw/xsd", "tenderType"));
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
