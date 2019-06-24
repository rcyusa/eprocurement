package rw.co.snw.service.mapper;

import rw.co.snw.domain.*;
import rw.co.snw.service.dto.UserExtraDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity UserExtra and its DTO UserExtraDTO.
 */
@Mapper(componentModel = "spring", uses = {BranchMapper.class, UserMapper.class})
public interface UserExtraMapper extends EntityMapper<UserExtraDTO, UserExtra> {

    @Mapping(source = "branch.id", target = "branchId")
    @Mapping(source = "user.id", target = "userId")
    UserExtraDTO toDto(UserExtra userExtra);

    @Mapping(source = "branchId", target = "branch")
    @Mapping(source = "userId", target = "user")
    @Mapping(target = "policyByUsers", ignore = true)
    UserExtra toEntity(UserExtraDTO userExtraDTO);

    default UserExtra fromId(Long id) {
        if (id == null) {
            return null;
        }
        UserExtra userExtra = new UserExtra();
        userExtra.setId(id);
        return userExtra;
    }
}
