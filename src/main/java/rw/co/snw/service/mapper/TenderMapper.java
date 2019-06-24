package rw.co.snw.service.mapper;

import rw.co.snw.domain.*;
import rw.co.snw.service.dto.TenderDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity Tender and its DTO TenderDTO.
 */
@Mapper(componentModel = "spring", uses = {})
public interface TenderMapper extends EntityMapper<TenderDTO, Tender> {


    @Mapping(target = "lotByTenders", ignore = true)
    Tender toEntity(TenderDTO tenderDTO);

    default Tender fromId(Long id) {
        if (id == null) {
            return null;
        }
        Tender tender = new Tender();
        tender.setId(id);
        return tender;
    }
}
