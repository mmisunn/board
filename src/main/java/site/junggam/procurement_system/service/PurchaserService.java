package site.junggam.procurement_system.service;

import site.junggam.procurement_system.dto.PurchaserDTO;

public interface PurchaserService {

    //거래처 상세보기
    PurchaserDTO getPurchaser(String purchaserCode);
}
