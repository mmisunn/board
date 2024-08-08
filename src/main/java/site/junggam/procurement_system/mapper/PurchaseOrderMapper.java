package site.junggam.procurement_system.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import site.junggam.procurement_system.dto.ProcurementPlanDTO;
import site.junggam.procurement_system.dto.PurchaseOrderDTO;
import site.junggam.procurement_system.dto.TemMaterialDTO;
import site.junggam.procurement_system.entity.ProcurementPlan;
import site.junggam.procurement_system.entity.PurchaseOrder;
import site.junggam.procurement_system.entity.TemMaterial;

@Mapper(componentModel = "spring")
public interface PurchaseOrderMapper {
    PurchaseOrderMapper INSTANCE = Mappers.getMapper(PurchaseOrderMapper.class);

    @Mapping(source = "procurementPlan", target = "procurementPlanDTO")
    PurchaseOrderDTO toDTO(PurchaseOrder purchaseOrder);

    @Mapping(source = "temMaterial", target = "temMaterialDTO")
    ProcurementPlanDTO toDTO(ProcurementPlan procurementPlan);

    TemMaterialDTO toDTO(TemMaterial temMaterial);

    @Mapping(source = "procurementPlanDTO.procurementPlanCode", target = "procurementPlan.procurementPlanCode")
    PurchaseOrder toEntity(PurchaseOrderDTO purchaseOrderDTO);

    @Mapping(source = "temMaterialDTO.materialCode", target = "temMaterial.materialCode")
    ProcurementPlan toEntity(ProcurementPlanDTO procurementPlanDTO);

    TemMaterial toEntity(TemMaterialDTO temMaterialDTO);
}
