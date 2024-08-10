package site.junggam.procurement_system.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import site.junggam.procurement_system.dto.*;
import site.junggam.procurement_system.entity.*;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PurchaseOrderMapper {
    PurchaseOrderMapper INSTANCE = Mappers.getMapper(PurchaseOrderMapper.class);

    @Mapping(source = "procurementPlan", target = "procurementPlanDTO")
    PurchaseOrderDTO toDTO(PurchaseOrder purchaseOrder);

    List<PurchaseOrderDTO> toDTOs(List<PurchaseOrder> purchaseOrderList);

    @Mapping(source = "temMaterial", target = "temMaterialDTO")
    ProcurementPlanDTO toDTO(ProcurementPlan procurementPlan);

    @Mapping(source = "contract", target = "contractDTO")
    TemMaterialDTO toDTO(TemMaterial temMaterial);

    @Mapping(source = "purchaser", target = "purchaserDTO")
    ContractDTO toDTO(Contract contract);

    PurchaserDTO toDTO(PurchaserDTO purchaserDTO);

    List<InspectionPlanDTO> toInspectionPlanDTOs(List<InspectionPlan> inspectionPlanList);

    @Mapping(source = "inspectionPlanDeliveryProgress", target = "inspectionPlanDeliveryProgress")
    @Mapping(source = "inspectionPlanStatus", target = "inspectionPlanStatus")
    @Mapping(target = "purchaseOrder", ignore = true)
    InspectionPlanDTO toInspectionPlanDTO(InspectionPlan inspectionPlan);

//    @Mapping(source = "procurementPlanDTO.procurementPlanCode", target = "procurementPlan.procurementPlanCode")
    @Mapping(target = "purchaseOrderStatus",defaultValue = "PENDING")
    PurchaseOrder toEntity(PurchaseOrderDTO purchaseOrderDTO);
//
//    @Mapping(source = "temMaterialDTO.materialCode", target = "temMaterial.materialCode")
    ProcurementPlan toEntity(ProcurementPlanDTO procurementPlanDTO);
//
//    @Mapping(source = "contractDTO.contractCode", target = "contract.contractCode")
//    TemMaterial toEntity(TemMaterialDTO temMaterialDTO);
//
//    @Mapping(source = "purchaserDTO.purchaserCode", target = "purchaser.purchaserCode")
//    Contract toEntity(ContractDTO contractDTO);
//
//    Purchaser toEntity(PurchaserDTO purchaserDTO);
}
