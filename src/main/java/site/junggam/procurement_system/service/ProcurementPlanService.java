package site.junggam.procurement_system.service;

import site.junggam.procurement_system.dto.ProcurementPlanDTO;
import site.junggam.procurement_system.dto.TemMaterialDTO;
import site.junggam.procurement_system.entity.ProcurementPlan;
import site.junggam.procurement_system.entity.TemMaterial;

public interface ProcurementPlanService {


    //이하 엔티티랑 디티오처리

    //DTO->Entity
    default ProcurementPlan dtotoEntity(ProcurementPlanDTO dto){
        ProcurementPlan procurementPlan
                = ProcurementPlan.builder()
                    .procurementPlanCode(dto.getProcurementPlanCode())
                    .procurementPlanQuantity(dto.getProcurementPlanQuantity())
                    .procurementPlantRegDate(dto.getProcurementPlantRegDate())
                    .procurementPlanDeadLine(dto.getProcurementPlanDeadLine())
                    .temMaterial(TemMaterial.builder().materialCode(dto.getTemMaterialDTO().getMaterialCode()).build())
                    .build();
        return procurementPlan;
    }
    //Entity->DTO
    default ProcurementPlanDTO entitytoDTO(ProcurementPlan entity){
        ProcurementPlanDTO procurementPlanDTO
                = ProcurementPlanDTO.builder()
                .procurementPlanCode(entity.getProcurementPlanCode())
                .procurementPlanQuantity(entity.getProcurementPlanQuantity())
                .procurementPlanDeadLine(entity.getProcurementPlanDeadLine())
                .procurementPlantRegDate(entity.getProcurementPlantRegDate())
                .temMaterialDTO(TemMaterialDTO.builder()
                        .materialCode(entity.getTemMaterial().getMaterialCode())
                        .materialName(entity.getTemMaterial().getMaterialName())
                        .materialStand(entity.getTemMaterial().getMaterialStand())
                        .materialTexture(entity.getTemMaterial().getMaterialTexture())
                        .materialDrawFile(entity.getTemMaterial().getMaterialDrawFile())
                        .materialEtcFile(entity.getTemMaterial().getMaterialEtcFile())
                        .materialRegDate(entity.getTemMaterial().getMaterialRegDate())
                        .materialModDate(entity.getTemMaterial().getMaterialModDate())
                        .materialSafeQuantity(entity.getTemMaterial().getMaterialSafeQuantity())
                        .build())
                .build();
        return procurementPlanDTO;
    }
}
