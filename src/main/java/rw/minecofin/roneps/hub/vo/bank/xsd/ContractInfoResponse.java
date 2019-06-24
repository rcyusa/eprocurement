/**
 * ContractInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package rw.minecofin.roneps.hub.vo.bank.xsd;

public class ContractInfoResponse  implements java.io.Serializable {
    private rw.minecofin.roneps.hub.vo.bank.xsd.ContractInfo[] contractInfo;

    private java.lang.String resultCode;

    private java.lang.String resultMessage;

    public ContractInfoResponse() {
    }

    public ContractInfoResponse(
           rw.minecofin.roneps.hub.vo.bank.xsd.ContractInfo[] contractInfo,
           java.lang.String resultCode,
           java.lang.String resultMessage) {
           this.contractInfo = contractInfo;
           this.resultCode = resultCode;
           this.resultMessage = resultMessage;
    }


    /**
     * Gets the contractInfo value for this ContractInfoResponse.
     * 
     * @return contractInfo
     */
    public rw.minecofin.roneps.hub.vo.bank.xsd.ContractInfo[] getContractInfo() {
        return contractInfo;
    }


    /**
     * Sets the contractInfo value for this ContractInfoResponse.
     * 
     * @param contractInfo
     */
    public void setContractInfo(rw.minecofin.roneps.hub.vo.bank.xsd.ContractInfo[] contractInfo) {
        this.contractInfo = contractInfo;
    }

    public rw.minecofin.roneps.hub.vo.bank.xsd.ContractInfo getContractInfo(int i) {
        return this.contractInfo[i];
    }

    public void setContractInfo(int i, rw.minecofin.roneps.hub.vo.bank.xsd.ContractInfo _value) {
        this.contractInfo[i] = _value;
    }


    /**
     * Gets the resultCode value for this ContractInfoResponse.
     * 
     * @return resultCode
     */
    public java.lang.String getResultCode() {
        return resultCode;
    }


    /**
     * Sets the resultCode value for this ContractInfoResponse.
     * 
     * @param resultCode
     */
    public void setResultCode(java.lang.String resultCode) {
        this.resultCode = resultCode;
    }


    /**
     * Gets the resultMessage value for this ContractInfoResponse.
     * 
     * @return resultMessage
     */
    public java.lang.String getResultMessage() {
        return resultMessage;
    }


    /**
     * Sets the resultMessage value for this ContractInfoResponse.
     * 
     * @param resultMessage
     */
    public void setResultMessage(java.lang.String resultMessage) {
        this.resultMessage = resultMessage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContractInfoResponse)) return false;
        ContractInfoResponse other = (ContractInfoResponse) obj;
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
              java.util.Arrays.equals(this.contractInfo, other.getContractInfo()))) &&
            ((this.resultCode==null && other.getResultCode()==null) || 
             (this.resultCode!=null &&
              this.resultCode.equals(other.getResultCode()))) &&
            ((this.resultMessage==null && other.getResultMessage()==null) || 
             (this.resultMessage!=null &&
              this.resultMessage.equals(other.getResultMessage())));
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
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContractInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getContractInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getResultCode() != null) {
            _hashCode += getResultCode().hashCode();
        }
        if (getResultMessage() != null) {
            _hashCode += getResultMessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ContractInfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://bank.vo.hub.roneps.minecofin.rw/xsd", "ContractInfoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bank.vo.hub.roneps.minecofin.rw/xsd", "contractInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bank.vo.hub.roneps.minecofin.rw/xsd", "ContractInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bank.vo.hub.roneps.minecofin.rw/xsd", "resultCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bank.vo.hub.roneps.minecofin.rw/xsd", "resultMessage"));
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
