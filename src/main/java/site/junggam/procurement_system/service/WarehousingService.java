
package site.junggam.procurement_system.service;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import site.junggam.procurement_system.dto.WarehousingDTO;
import site.junggam.procurement_system.repository.WarehousingRepository;

public interface WarehousingService {
//    //e다시해야함 아래 오류남
//    Resource loadFileAsResource(String warehousingSpec);
//
//    //출하명세서 파일 저장
//    //이건 입고서아닌가?
//    //아마 출하명세서는 또 다른 것 같은데..나중에 추가해야할듯
//    //..일단 지피티가 알려준대로 해본다..다해,,,
//    void savewarehousing(WarehousingDTO warehousingDTO);
//
//    //dto-> entity변형
//
//    default WarehousingDTO dtoToEntity(WarehousingDTO dto) {
//        return WarehousingDTO.builder()
//                .warehousingDate(dto.getWarehousingDate())
//                .warehousingShipmentSpec(dto.getWarehousingShipmentSpec())
//                .warehousingSpec(dto.getWarehousingSpec())
//                .warehousingResultMemo(dto.getWarehousingResultMemo())
//                .build();
//    }
//
//    //entity -> dto 변환..
//
//    default WarehousingDTO entityToDTO(WarehousingDTO entity) {
//        return WarehousingDTO.builder()
//                .warehousingDate(entity.getWarehousingDate())
//                .warehousingShipmentSpec(entity.getWarehousingShipmentSpec())
//                .warehousingSpec(entity.getWarehousingSpec())
//                .warehousingResultMemo(entity.getWarehousingResultMemo())
//                .build();
//    }




}