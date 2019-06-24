package rw.co.snw.service.mapper;

import rw.co.snw.domain.*;
import rw.co.snw.service.dto.PolicyDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity Policy and its DTO PolicyDTO.
 */
@Mapper(componentModel = "spring", uses = {LotMapper.class, ClientMapper.class, UserExtraMapper.class})
public interface PolicyMapper extends EntityMapper<PolicyDTO, Policy> {

    @Mapping(source = "lotOnPolicy.id", target = "lotOnPolicyId")
    @Mapping(source = "client.id", target = "clientId")
    @Mapping(source = "userExtra.id", target = "userExtraId")
    PolicyDTO toDto(Policy policy);

    @Mapping(source = "lotOnPolicyId", target = "lotOnPolicy")
    @Mapping(source = "clientId", target = "client")
    @Mapping(source = "userExtraId", target = "userExtra")
    Policy toEntity(PolicyDTO policyDTO);

    default Policy fromId(Long id) {
        if (id == null) {
            return null;
        }
        Policy policy = new Policy();
        policy.setId(id);
        return policy;
    }
}
