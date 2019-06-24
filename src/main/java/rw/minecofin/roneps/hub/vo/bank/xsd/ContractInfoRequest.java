/**
 * ContractInfoRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package rw.minecofin.roneps.hub.vo.bank.xsd;

public class ContractInfoRequest  implements java.io.Serializable {
    private java.lang.String contractName;

    private java.lang.String contractNumber;

    private java.lang.String contractSerialNumber;

    private java.lang.String id;

    private java.lang.String password;

    public ContractInfoRequest() {
    }

    public ContractInfoRequest(
           java.lang.String contractName,
           java.lang.String contractNumber,
           java.lang.String contractSerialNumber,
           java.lang.String id,
           java.lang.String password) {
           this.contractName = contractName;
           this.contractNumber = contractNumber;
           this.contractSerialNumber = contractSerialNumber;
           this.id = id;
           this.password = password;
    }


    /**
     * Gets the contractName value for this ContractInfoRequest.
     * 
     * @return contractName
     */
    public java.lang.String getContractName() {
        return contractName;
    }


    /**
     * Sets the contractName value for this ContractInfoRequest.
     * 
     * @param contractName
     */
    public void setContractName(java.lang.String contractName) {
        this.contractName = contractName;
    }


    /**
     * Gets the contractNumber value for this ContractInfoRequest.
     * 
     * @return contractNumber
     */
    public java.lang.String getContractNumber() {
        return contractNumber;
    }


    /**
     * Sets the contractNumber value for this ContractInfoRequest.
     * 
     * @param contractNumber
     */
    public void setContractNumber(java.lang.String contractNumber) {
        this.contractNumber = contractNumber;
    }


    /**
     * Gets the contractSerialNumber value for this ContractInfoRequest.
     * 
     * @return contractSerialNumber
     */
    public java.lang.String getContractSerialNumber() {
        return contractSerialNumber;
    }


    /**
     * Sets the contractSerialNumber value for this ContractInfoRequest.
     * 
     * @param contractSerialNumber
     */
    public void setContractSerialNumber(java.lang.String contractSerialNumber) {
        this.contractSerialNumber = contractSerialNumber;
    }


    /**
     * Gets the id value for this ContractInfoRequest.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this ContractInfoRequest.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the password value for this ContractInfoRequest.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this ContractInfoRequest.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContractInfoRequest)) return false;
        ContractInfoRequest other = (ContractInfoRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
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
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword())));
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
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ContractInfoRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://bank.vo.hub.roneps.minecofin.rw/xsd", "ContractInfoRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bank.vo.hub.roneps.minecofin.rw/xsd", "contractName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bank.vo.hub.roneps.minecofin.rw/xsd", "contractNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractSerialNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bank.vo.hub.roneps.minecofin.rw/xsd", "contractSerialNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bank.vo.hub.roneps.minecofin.rw/xsd", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bank.vo.hub.roneps.minecofin.rw/xsd", "password"));
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
