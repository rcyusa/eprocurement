package rw.co.snw.service.mapper;

import rw.co.snw.domain.*;
import rw.co.snw.service.dto.BranchDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity Branch and its DTO BranchDTO.
 */
@Mapper(componentModel = "spring", uses = {})
public interface BranchMapper extends EntityMapper<BranchDTO, Branch> {


    @Mapping(target = "userByBranches", ignore = true)
    Branch toEntity(BranchDTO branchDTO);

    default Branch fromId(Long id) {
        if (id == null) {
            return null;
        }
        Branch branch = new Branch();
        branch.setId(id);
        return branch;
    }
}
