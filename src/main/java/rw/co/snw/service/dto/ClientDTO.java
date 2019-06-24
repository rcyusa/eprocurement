package rw.co.snw.service.dto;
import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the Client entity.
 */
public class ClientDTO implements Serializable {

    private Long id;

    private String clientName;

    private String clientTINNumber;

    private String clientAddress;

    private String clientPoBox;

    private String clientCellPhoneNumber;

    private String clientTelNumber;

    private String clientEmailAddress;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientTINNumber() {
        return clientTINNumber;
    }

    public void setClientTINNumber(String clientTINNumber) {
        this.clientTINNumber = clientTINNumber;
    }

    public String getClientAddress() {
        return clientAddress;
    }

    public void setClientAddress(String clientAddress) {
        this.clientAddress = clientAddress;
    }

    public String getClientPoBox() {
        return clientPoBox;
    }

    public void setClientPoBox(String clientPoBox) {
        this.clientPoBox = clientPoBox;
    }

    public String getClientCellPhoneNumber() {
        return clientCellPhoneNumber;
    }

    public void setClientCellPhoneNumber(String clientCellPhoneNumber) {
        this.clientCellPhoneNumber = clientCellPhoneNumber;
    }

    public String getClientTelNumber() {
        return clientTelNumber;
    }

    public void setClientTelNumber(String clientTelNumber) {
        this.clientTelNumber = clientTelNumber;
    }

    public String getClientEmailAddress() {
        return clientEmailAddress;
    }

    public void setClientEmailAddress(String clientEmailAddress) {
        this.clientEmailAddress = clientEmailAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ClientDTO clientDTO = (ClientDTO) o;
        if (clientDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), clientDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "ClientDTO{" +
            "id=" + getId() +
            ", clientName='" + getClientName() + "'" +
            ", clientTINNumber='" + getClientTINNumber() + "'" +
            ", clientAddress='" + getClientAddress() + "'" +
            ", clientPoBox='" + getClientPoBox() + "'" +
            ", clientCellPhoneNumber='" + getClientCellPhoneNumber() + "'" +
            ", clientTelNumber='" + getClientTelNumber() + "'" +
            ", clientEmailAddress='" + getClientEmailAddress() + "'" +
            "}";
    }
}
