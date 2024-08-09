package site.junggam.procurement_system.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import site.junggam.procurement_system.dto.PurchaserDTO;
import site.junggam.procurement_system.entity.Purchaser;
import site.junggam.procurement_system.mapper.PurchaserMapper;
import site.junggam.procurement_system.repository.PurchaserRepository;

import java.util.Optional;

@Log4j2
@Service
@RequiredArgsConstructor
public class PurchaserServiceImpl implements PurchaserService {
    private final PurchaserRepository purchaserRepository;
    private final PurchaserMapper purchaserMapper;


    @Override
    public PurchaserDTO getPurchaser(String purchaserCode) {
        log.info("회사정보 상세보기 서비스");
        Optional<Purchaser> result = purchaserRepository.findById(purchaserCode);
        return result.map(purchaserMapper::toDto).orElse(null);
    }
}
