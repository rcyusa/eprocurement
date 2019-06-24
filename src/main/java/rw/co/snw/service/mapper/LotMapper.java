package rw.co.snw.service.mapper;

import rw.co.snw.domain.*;
import rw.co.snw.service.dto.LotDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity Lot and its DTO LotDTO.
 */
@Mapper(componentModel = "spring", uses = {TenderMapper.class, ContractMapper.class})
public interface LotMapper extends EntityMapper<LotDTO, Lot> {

    @Mapping(source = "tender.id", target = "tenderId")
    @Mapping(source = "contract.id", target = "contractId")
    LotDTO toDto(Lot lot);

    @Mapping(source = "tenderId", target = "tender")
    @Mapping(source = "contractId", target = "contract")
    Lot toEntity(LotDTO lotDTO);

    default Lot fromId(Long id) {
        if (id == null) {
            return null;
        }
        Lot lot = new Lot();
        lot.setId(id);
        return lot;
    }
}
