package site.junggam.procurement_system.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import site.junggam.procurement_system.dto.ContractDTO;
import site.junggam.procurement_system.dto.ProcurementPlanDTO;
import site.junggam.procurement_system.dto.PurchaseOrderDTO;
import site.junggam.procurement_system.dto.PurchaserDTO;
import site.junggam.procurement_system.dto.TemMaterialDTO;
import site.junggam.procurement_system.entity.Contract;
import site.junggam.procurement_system.entity.ProcurementPlan;
import site.junggam.procurement_system.entity.PurchaseOrder;
import site.junggam.procurement_system.entity.PurchaseOrderStatus;
import site.junggam.procurement_system.entity.Purchaser;
import site.junggam.procurement_system.entity.TemMaterial;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-08-08T20:58:24+0900",
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
        purchaseOrderDTO.purchaseOrderStatus( purchaseOrder.getPurchaseOrderStatus() );

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

        temMaterialDTO.contractDTO( toDTO( temMaterial.getContract() ) );
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
    public ContractDTO toDTO(Contract contract) {
        if ( contract == null ) {
            return null;
        }

        ContractDTO.ContractDTOBuilder contractDTO = ContractDTO.builder();

        contractDTO.purchaserDTO( purchaserToPurchaserDTO( contract.getPurchaser() ) );
        contractDTO.contractCode( contract.getContractCode() );
        contractDTO.contractFile( contract.getContractFile() );
        contractDTO.contractPrice( contract.getContractPrice() );
        contractDTO.contractLeadTime( contract.getContractLeadTime() );

        return contractDTO.build();
    }

    @Override
    public PurchaserDTO toDTO(PurchaserDTO purchaserDTO) {
        if ( purchaserDTO == null ) {
            return null;
        }

        PurchaserDTO.PurchaserDTOBuilder purchaserDTO1 = PurchaserDTO.builder();

        purchaserDTO1.purchaserCode( purchaserDTO.getPurchaserCode() );
        purchaserDTO1.purchaserName( purchaserDTO.getPurchaserName() );
        purchaserDTO1.purchaserAddress( purchaserDTO.getPurchaserAddress() );
        purchaserDTO1.purchaserFax( purchaserDTO.getPurchaserFax() );
        purchaserDTO1.purchaserEmail( purchaserDTO.getPurchaserEmail() );
        purchaserDTO1.purchaserType( purchaserDTO.getPurchaserType() );
        purchaserDTO1.purchaserTel( purchaserDTO.getPurchaserTel() );
        purchaserDTO1.purchaserCategory( purchaserDTO.getPurchaserCategory() );
        purchaserDTO1.purchaserPresident( purchaserDTO.getPurchaserPresident() );
        purchaserDTO1.purchaserManager( purchaserDTO.getPurchaserManager() );
        purchaserDTO1.purchaserManagerTel( purchaserDTO.getPurchaserManagerTel() );
        purchaserDTO1.purchaserManagerEmail( purchaserDTO.getPurchaserManagerEmail() );
        purchaserDTO1.purchaserManagerFax( purchaserDTO.getPurchaserManagerFax() );
        List<ContractDTO> list = purchaserDTO.getContractDTOList();
        if ( list != null ) {
            purchaserDTO1.contractDTOList( new ArrayList<ContractDTO>( list ) );
        }

        return purchaserDTO1.build();
    }

    @Override
    public PurchaseOrder toEntity(PurchaseOrderDTO purchaseOrderDTO) {
        if ( purchaseOrderDTO == null ) {
            return null;
        }

        PurchaseOrder.PurchaseOrderBuilder purchaseOrder = PurchaseOrder.builder();

        if ( purchaseOrderDTO.getPurchaseOrderStatus() != null ) {
            purchaseOrder.purchaseOrderStatus( purchaseOrderDTO.getPurchaseOrderStatus() );
        }
        else {
            purchaseOrder.purchaseOrderStatus( PurchaseOrderStatus.PENDING );
        }
        purchaseOrder.purchaseOrderCode( purchaseOrderDTO.getPurchaseOrderCode() );
        purchaseOrder.purchaseOrderDate( purchaseOrderDTO.getPurchaseOrderDate() );
        purchaseOrder.purchaseOrderMemo( purchaseOrderDTO.getPurchaseOrderMemo() );

        return purchaseOrder.build();
    }

    protected PurchaserDTO purchaserToPurchaserDTO(Purchaser purchaser) {
        if ( purchaser == null ) {
            return null;
        }

        PurchaserDTO.PurchaserDTOBuilder purchaserDTO = PurchaserDTO.builder();

        purchaserDTO.purchaserCode( purchaser.getPurchaserCode() );
        purchaserDTO.purchaserName( purchaser.getPurchaserName() );
        purchaserDTO.purchaserAddress( purchaser.getPurchaserAddress() );
        purchaserDTO.purchaserFax( purchaser.getPurchaserFax() );
        purchaserDTO.purchaserEmail( purchaser.getPurchaserEmail() );
        purchaserDTO.purchaserType( purchaser.getPurchaserType() );
        purchaserDTO.purchaserTel( purchaser.getPurchaserTel() );
        purchaserDTO.purchaserCategory( purchaser.getPurchaserCategory() );
        purchaserDTO.purchaserPresident( purchaser.getPurchaserPresident() );
        purchaserDTO.purchaserManager( purchaser.getPurchaserManager() );
        purchaserDTO.purchaserManagerTel( purchaser.getPurchaserManagerTel() );
        purchaserDTO.purchaserManagerEmail( purchaser.getPurchaserManagerEmail() );
        purchaserDTO.purchaserManagerFax( purchaser.getPurchaserManagerFax() );

        return purchaserDTO.build();
    }
}
