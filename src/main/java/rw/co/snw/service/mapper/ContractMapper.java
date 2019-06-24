package rw.co.snw.service.mapper;

import rw.co.snw.domain.*;
import rw.co.snw.service.dto.ContractDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity Contract and its DTO ContractDTO.
 */
@Mapper(componentModel = "spring", uses = {})
public interface ContractMapper extends EntityMapper<ContractDTO, Contract> {


    @Mapping(target = "lotByContracts", ignore = true)
    Contract toEntity(ContractDTO contractDTO);

    default Contract fromId(Long id) {
        if (id == null) {
            return null;
        }
        Contract contract = new Contract();
        contract.setId(id);
        return contract;
    }
}
