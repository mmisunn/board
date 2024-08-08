package site.junggam.procurement_system.service;

import site.junggam.procurement_system.dto.TemMaterialDTO;
import site.junggam.procurement_system.entity.TemMaterial;

public interface TemMaterialService {
    //이하 엔티티랑 디티오처리

    //DTO->Entity
    default TemMaterial dtotoEntity(TemMaterialDTO dto){
        TemMaterial temMaterial
                = TemMaterial.builder()
                    .materialCode(dto.getMaterialCode())
                    .materialName(dto.getMaterialName())
                    .materialStand(dto.getMaterialStand())
                    .materialTexture(dto.getMaterialTexture())
                    .materialDrawFile(dto.getMaterialDrawFile())
                    .materialEtcFile(dto.getMaterialEtcFile())
                    .materialRegDate(dto.getMaterialRegDate())
                    .materialModDate(dto.getMaterialModDate())
                    .materialSafeQuantity(dto.getMaterialSafeQuantity())
                    .build();
        return temMaterial;
    }

    //Entity->DTO
    default TemMaterialDTO entitytoDto(TemMaterial entity){
        TemMaterialDTO temMaterialDTO
                = TemMaterialDTO.builder()
                    .materialCode(entity.getMaterialCode())
                    .materialName(entity.getMaterialName())
                    .materialStand(entity.getMaterialStand())
                    .materialTexture(entity.getMaterialTexture())
                    .materialDrawFile(entity.getMaterialDrawFile())
                    .materialEtcFile(entity.getMaterialEtcFile())
                    .materialRegDate(entity.getMaterialRegDate())
                    .materialModDate(entity.getMaterialModDate())
                    .materialSafeQuantity(entity.getMaterialSafeQuantity())
                    .build();
        return temMaterialDTO;
    }


}
