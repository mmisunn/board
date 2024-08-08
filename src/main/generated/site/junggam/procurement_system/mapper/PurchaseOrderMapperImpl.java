package site.junggam.procurement_system.mapper;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import site.junggam.procurement_system.dto.ProcurementPlanDTO;
import site.junggam.procurement_system.dto.PurchaseOrderDTO;
import site.junggam.procurement_system.dto.TemMaterialDTO;
import site.junggam.procurement_system.entity.ProcurementPlan;
import site.junggam.procurement_system.entity.PurchaseOrder;
import site.junggam.procurement_system.entity.TemMaterial;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-08-08T16:55:56+0900",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class PurchaseOrderMapperImpl implements PurchaseOrderMapper {

    @Override
    public PurchaseOrderDTO toDTO(PurchaseOrder purchaseOrder) {
        if ( purchaseOrder == null ) {
            return null;
        }

        PurchaseOrderDTO.PurchaseOrderDTOBuilder purchaseOrderDTO = PurchaseOrderDTO.builder();

        purchaseOrderDTO.procurementPlanDTO( toDTO( purchaseOrder.getProcurementPlan() ) );
        purchaseOrderDTO.purchaseOrderCode( purchaseOrder.getPurchaseOrderCode() );
        purchaseOrderDTO.purchaseOrderDate( purchaseOrder.getPurchaseOrderDate() );
        purchaseOrderDTO.purchaseOrderMemo( purchaseOrder.getPurchaseOrderMemo() );

        return purchaseOrderDTO.build();
    }

    @Override
    public ProcurementPlanDTO toDTO(ProcurementPlan procurementPlan) {
        if ( procurementPlan == null ) {
            return null;
        }

        ProcurementPlanDTO.ProcurementPlanDTOBuilder procurementPlanDTO = ProcurementPlanDTO.builder();

        procurementPlanDTO.temMaterialDTO( toDTO( procurementPlan.getTemMaterial() ) );
        procurementPlanDTO.procurementPlanCode( procurementPlan.getProcurementPlanCode() );
        procurementPlanDTO.procurementPlantRegDate( procurementPlan.getProcurementPlantRegDate() );
        procurementPlanDTO.procurementPlanDeadLine( procurementPlan.getProcurementPlanDeadLine() );
        procurementPlanDTO.procurementPlanQuantity( procurementPlan.getProcurementPlanQuantity() );

        return procurementPlanDTO.build();
    }

    @Override
    public TemMaterialDTO toDTO(TemMaterial temMaterial) {
        if ( temMaterial == null ) {
            return null;
        }

        TemMaterialDTO.TemMaterialDTOBuilder temMaterialDTO = TemMaterialDTO.builder();

        temMaterialDTO.materialCode( temMaterial.getMaterialCode() );
        temMaterialDTO.materialName( temMaterial.getMaterialName() );
        temMaterialDTO.materialStand( temMaterial.getMaterialStand() );
        temMaterialDTO.materialTexture( temMaterial.getMaterialTexture() );
        temMaterialDTO.materialDrawFile( temMaterial.getMaterialDrawFile() );
        temMaterialDTO.materialEtcFile( temMaterial.getMaterialEtcFile() );
        temMaterialDTO.materialRegDate( temMaterial.getMaterialRegDate() );
        temMaterialDTO.materialModDate( temMaterial.getMaterialModDate() );
        temMaterialDTO.materialSafeQuantity( temMaterial.getMaterialSafeQuantity() );

        return temMaterialDTO.build();
    }

    @Override
    public PurchaseOrder toEntity(PurchaseOrderDTO purchaseOrderDTO) {
        if ( purchaseOrderDTO == null ) {
            return null;
        }

        PurchaseOrder.PurchaseOrderBuilder purchaseOrder = PurchaseOrder.builder();

        purchaseOrder.procurementPlan( procurementPlanDTOToProcurementPlan( purchaseOrderDTO.getProcurementPlanDTO() ) );
        purchaseOrder.purchaseOrderCode( purchaseOrderDTO.getPurchaseOrderCode() );
        purchaseOrder.purchaseOrderDate( purchaseOrderDTO.getPurchaseOrderDate() );
        purchaseOrder.purchaseOrderMemo( purchaseOrderDTO.getPurchaseOrderMemo() );

        return purchaseOrder.build();
    }

    @Override
    public ProcurementPlan toEntity(ProcurementPlanDTO procurementPlanDTO) {
        if ( procurementPlanDTO == null ) {
            return null;
        }

        ProcurementPlan.ProcurementPlanBuilder procurementPlan = ProcurementPlan.builder();

        procurementPlan.temMaterial( temMaterialDTOToTemMaterial( procurementPlanDTO.getTemMaterialDTO() ) );
        procurementPlan.procurementPlanCode( procurementPlanDTO.getProcurementPlanCode() );
        procurementPlan.procurementPlantRegDate( procurementPlanDTO.getProcurementPlantRegDate() );
        procurementPlan.procurementPlanDeadLine( procurementPlanDTO.getProcurementPlanDeadLine() );
        procurementPlan.procurementPlanQuantity( procurementPlanDTO.getProcurementPlanQuantity() );

        return procurementPlan.build();
    }

    @Override
    public TemMaterial toEntity(TemMaterialDTO temMaterialDTO) {
        if ( temMaterialDTO == null ) {
            return null;
        }

        TemMaterial.TemMaterialBuilder temMaterial = TemMaterial.builder();

        temMaterial.materialCode( temMaterialDTO.getMaterialCode() );
        temMaterial.materialName( temMaterialDTO.getMaterialName() );
        temMaterial.materialStand( temMaterialDTO.getMaterialStand() );
        temMaterial.materialTexture( temMaterialDTO.getMaterialTexture() );
        temMaterial.materialDrawFile( temMaterialDTO.getMaterialDrawFile() );
        temMaterial.materialEtcFile( temMaterialDTO.getMaterialEtcFile() );
        temMaterial.materialRegDate( temMaterialDTO.getMaterialRegDate() );
        temMaterial.materialModDate( temMaterialDTO.getMaterialModDate() );
        temMaterial.materialSafeQuantity( temMaterialDTO.getMaterialSafeQuantity() );

        return temMaterial.build();
    }

    protected ProcurementPlan procurementPlanDTOToProcurementPlan(ProcurementPlanDTO procurementPlanDTO) {
        if ( procurementPlanDTO == null ) {
            return null;
        }

        ProcurementPlan.ProcurementPlanBuilder procurementPlan = ProcurementPlan.builder();

        procurementPlan.procurementPlanCode( procurementPlanDTO.getProcurementPlanCode() );
        procurementPlan.procurementPlantRegDate( procurementPlanDTO.getProcurementPlantRegDate() );
        procurementPlan.procurementPlanDeadLine( procurementPlanDTO.getProcurementPlanDeadLine() );
        procurementPlan.procurementPlanQuantity( procurementPlanDTO.getProcurementPlanQuantity() );

        return procurementPlan.build();
    }

    protected TemMaterial temMaterialDTOToTemMaterial(TemMaterialDTO temMaterialDTO) {
        if ( temMaterialDTO == null ) {
            return null;
        }

        TemMaterial.TemMaterialBuilder temMaterial = TemMaterial.builder();

        temMaterial.materialCode( temMaterialDTO.getMaterialCode() );
        temMaterial.materialName( temMaterialDTO.getMaterialName() );
        temMaterial.materialStand( temMaterialDTO.getMaterialStand() );
        temMaterial.materialTexture( temMaterialDTO.getMaterialTexture() );
        temMaterial.materialDrawFile( temMaterialDTO.getMaterialDrawFile() );
        temMaterial.materialEtcFile( temMaterialDTO.getMaterialEtcFile() );
        temMaterial.materialRegDate( temMaterialDTO.getMaterialRegDate() );
        temMaterial.materialModDate( temMaterialDTO.getMaterialModDate() );
        temMaterial.materialSafeQuantity( temMaterialDTO.getMaterialSafeQuantity() );

        return temMaterial.build();
    }
}
