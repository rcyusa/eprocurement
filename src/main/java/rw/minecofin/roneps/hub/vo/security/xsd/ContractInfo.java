/**
 * ContractInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package rw.minecofin.roneps.hub.vo.security.xsd;

public class ContractInfo  implements java.io.Serializable {
    private java.lang.String address;

    private java.lang.String cellPhoneNumber;

    private java.lang.String contractDate;

    private java.lang.String contractName;

    private java.lang.String contractNumber;

    private java.lang.String contractSerialNumber;

    private java.lang.String eMailAddress;

    private rw.minecofin.roneps.hub.vo.security.xsd.LOTInfo[] lotInfo;

    private java.lang.String pEName;

    private java.lang.String pETINNumber;

    private java.lang.String supplierName;

    private java.lang.String supplierTINNumber;

    private java.lang.String tenderRefName;

    private java.lang.String tenderRefNumber;

    public ContractInfo() {
    }

    public ContractInfo(
           java.lang.String address,
           java.lang.String cellPhoneNumber,
           java.lang.String contractDate,
           java.lang.String contractName,
           java.lang.String contractNumber,
           java.lang.String contractSerialNumber,
           java.lang.String eMailAddress,
           rw.minecofin.roneps.hub.vo.security.xsd.LOTInfo[] lotInfo,
           java.lang.String pEName,
           java.lang.String pETINNumber,
           java.lang.String supplierName,
           java.lang.String supplierTINNumber,
           java.lang.String tenderRefName,
           java.lang.String tenderRefNumber) {
           this.address = address;
           this.cellPhoneNumber = cellPhoneNumber;
           this.contractDate = contractDate;
           this.contractName = contractName;
           this.contractNumber = contractNumber;
           this.contractSerialNumber = contractSerialNumber;
           this.eMailAddress = eMailAddress;
           this.lotInfo = lotInfo;
           this.pEName = pEName;
           this.pETINNumber = pETINNumber;
           this.supplierName = supplierName;
           this.supplierTINNumber = supplierTINNumber;
           this.tenderRefName = tenderRefName;
           this.tenderRefNumber = tenderRefNumber;
    }


    /**
     * Gets the address value for this ContractInfo.
     * 
     * @return address
     */
    public java.lang.String getAddress() {
        return address;
    }


    /**
     * Sets the address value for this ContractInfo.
     * 
     * @param address
     */
    public void setAddress(java.lang.String address) {
        this.address = address;
    }


    /**
     * Gets the cellPhoneNumber value for this ContractInfo.
     * 
     * @return cellPhoneNumber
     */
    public java.lang.String getCellPhoneNumber() {
        return cellPhoneNumber;
    }


    /**
     * Sets the cellPhoneNumber value for this ContractInfo.
     * 
     * @param cellPhoneNumber
     */
    public void setCellPhoneNumber(java.lang.String cellPhoneNumber) {
        this.cellPhoneNumber = cellPhoneNumber;
    }


    /**
     * Gets the contractDate value for this ContractInfo.
     * 
     * @return contractDate
     */
    public java.lang.String getContractDate() {
        return contractDate;
    }


    /**
     * Sets the contractDate value for this ContractInfo.
     * 
     * @param contractDate
     */
    public void setContractDate(java.lang.String contractDate) {
        this.contractDate = contractDate;
    }


    /**
     * Gets the contractName value for this ContractInfo.
     * 
     * @return contractName
     */
    public java.lang.String getContractName() {
        return contractName;
    }


    /**
     * Sets the contractName value for this ContractInfo.
     * 
     * @param contractName
     */
    public void setContractName(java.lang.String contractName) {
        this.contractName = contractName;
    }


    /**
     * Gets the contractNumber value for this ContractInfo.
     * 
     * @return contractNumber
     */
    public java.lang.String getContractNumber() {
        return contractNumber;
    }


    /**
     * Sets the contractNumber value for this ContractInfo.
     * 
     * @param contractNumber
     */
    public void setContractNumber(java.lang.String contractNumber) {
        this.contractNumber = contractNumber;
    }


    /**
     * Gets the contractSerialNumber value for this ContractInfo.
     * 
     * @return contractSerialNumber
     */
    public java.lang.String getContractSerialNumber() {
        return contractSerialNumber;
    }


    /**
     * Sets the contractSerialNumber value for this ContractInfo.
     * 
     * @param contractSerialNumber
     */
    public void setContractSerialNumber(java.lang.String contractSerialNumber) {
        this.contractSerialNumber = contractSerialNumber;
    }


    /**
     * Gets the eMailAddress value for this ContractInfo.
     * 
     * @return eMailAddress
     */
    public java.lang.String getEMailAddress() {
        return eMailAddress;
    }


    /**
     * Sets the eMailAddress value for this ContractInfo.
     * 
     * @param eMailAddress
     */
    public void setEMailAddress(java.lang.String eMailAddress) {
        this.eMailAddress = eMailAddress;
    }


    /**
     * Gets the lotInfo value for this ContractInfo.
     * 
     * @return lotInfo
     */
    public rw.minecofin.roneps.hub.vo.security.xsd.LOTInfo[] getLotInfo() {
        return lotInfo;
    }


    /**
     * Sets the lotInfo value for this ContractInfo.
     * 
     * @param lotInfo
     */
    public void setLotInfo(rw.minecofin.roneps.hub.vo.security.xsd.LOTInfo[] lotInfo) {
        this.lotInfo = lotInfo;
    }

    public rw.minecofin.roneps.hub.vo.security.xsd.LOTInfo getLotInfo(int i) {
        return this.lotInfo[i];
    }

    public void setLotInfo(int i, rw.minecofin.roneps.hub.vo.security.xsd.LOTInfo _value) {
        this.lotInfo[i] = _value;
    }


    /**
     * Gets the pEName value for this ContractInfo.
     * 
     * @return pEName
     */
    public java.lang.String getPEName() {
        return pEName;
    }


    /**
     * Sets the pEName value for this ContractInfo.
     * 
     * @param pEName
     */
    public void setPEName(java.lang.String pEName) {
        this.pEName = pEName;
    }


    /**
     * Gets the pETINNumber value for this ContractInfo.
     * 
     * @return pETINNumber
     */
    public java.lang.String getPETINNumber() {
        return pETINNumber;
    }


    /**
     * Sets the pETINNumber value for this ContractInfo.
     * 
     * @param pETINNumber
     */
    public void setPETINNumber(java.lang.String pETINNumber) {
        this.pETINNumber = pETINNumber;
    }


    /**
     * Gets the supplierName value for this ContractInfo.
     * 
     * @return supplierName
     */
    public java.lang.String getSupplierName() {
        return supplierName;
    }


    /**
     * Sets the supplierName value for this ContractInfo.
     * 
     * @param supplierName
     */
    public void setSupplierName(java.lang.String supplierName) {
        this.supplierName = supplierName;
    }


    /**
     * Gets the supplierTINNumber value for this ContractInfo.
     * 
     * @return supplierTINNumber
     */
    public java.lang.String getSupplierTINNumber() {
        return supplierTINNumber;
    }


    /**
     * Sets the supplierTINNumber value for this ContractInfo.
     * 
     * @param supplierTINNumber
     */
    public void setSupplierTINNumber(java.lang.String supplierTINNumber) {
        this.supplierTINNumber = supplierTINNumber;
    }


    /**
     * Gets the tenderRefName value for this ContractInfo.
     * 
     * @return tenderRefName
     */
    public java.lang.String getTenderRefName() {
        return tenderRefName;
    }


    /**
     * Sets the tenderRefName value for this ContractInfo.
     * 
     * @param tenderRefName
     */
    public void setTenderRefName(java.lang.String tenderRefName) {
        this.tenderRefName = tenderRefName;
    }


    /**
     * Gets the tenderRefNumber value for this ContractInfo.
     * 
     * @return tenderRefNumber
     */
    public java.lang.String getTenderRefNumber() {
        return tenderRefNumber;
    }


    /**
     * Sets the tenderRefNumber value for this ContractInfo.
     * 
     * @param tenderRefNumber
     */
    public void setTenderRefNumber(java.lang.String tenderRefNumber) {
        this.tenderRefNumber = tenderRefNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContractInfo)) return false;
        ContractInfo other = (ContractInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.cellPhoneNumber==null && other.getCellPhoneNumber()==null) || 
             (this.cellPhoneNumber!=null &&
              this.cellPhoneNumber.equals(other.getCellPhoneNumber()))) &&
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
            ((this.eMailAddress==null && other.getEMailAddress()==null) || 
             (this.eMailAddress!=null &&
              this.eMailAddress.equals(other.getEMailAddress()))) &&
            ((this.lotInfo==null && other.getLotInfo()==null) || 
             (this.lotInfo!=null &&
              java.util.Arrays.equals(this.lotInfo, other.getLotInfo()))) &&
            ((this.pEName==null && other.getPEName()==null) || 
             (this.pEName!=null &&
              this.pEName.equals(other.getPEName()))) &&
            ((this.pETINNumber==null && other.getPETINNumber()==null) || 
             (this.pETINNumber!=null &&
              this.pETINNumber.equals(other.getPETINNumber()))) &&
            ((this.supplierName==null && other.getSupplierName()==null) || 
             (this.supplierName!=null &&
              this.supplierName.equals(other.getSupplierName()))) &&
            ((this.supplierTINNumber==null && other.getSupplierTINNumber()==null) || 
             (this.supplierTINNumber!=null &&
              this.supplierTINNumber.equals(other.getSupplierTINNumber()))) &&
            ((this.tenderRefName==null && other.getTenderRefName()==null) || 
             (this.tenderRefName!=null &&
              this.tenderRefName.equals(other.getTenderRefName()))) &&
            ((this.tenderRefNumber==null && other.getTenderRefNumber()==null) || 
             (this.tenderRefNumber!=null &&
              this.tenderRefNumber.equals(other.getTenderRefNumber())));
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
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getCellPhoneNumber() != null) {
            _hashCode += getCellPhoneNumber().hashCode();
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
        if (getEMailAddress() != null) {
            _hashCode += getEMailAddress().hashCode();
        }
        if (getLotInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLotInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLotInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPEName() != null) {
            _hashCode += getPEName().hashCode();
        }
        if (getPETINNumber() != null) {
            _hashCode += getPETINNumber().hashCode();
        }
        if (getSupplierName() != null) {
            _hashCode += getSupplierName().hashCode();
        }
        if (getSupplierTINNumber() != null) {
            _hashCode += getSupplierTINNumber().hashCode();
        }
        if (getTenderRefName() != null) {
            _hashCode += getTenderRefName().hashCode();
        }
        if (getTenderRefNumber() != null) {
            _hashCode += getTenderRefNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ContractInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "ContractInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cellPhoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "cellPhoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("EMailAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "eMailAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lotInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "lotInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "LOTInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PEName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "pEName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PETINNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "pETINNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supplierName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "supplierName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supplierTINNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "supplierTINNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tenderRefName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "tenderRefName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tenderRefNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.vo.hub.roneps.minecofin.rw/xsd", "tenderRefNumber"));
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
