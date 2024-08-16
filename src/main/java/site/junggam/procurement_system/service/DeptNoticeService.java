package site.junggam.procurement_system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import site.junggam.procurement_system.dto.DeptNoticeDTO;
import site.junggam.procurement_system.entity.DeptNotice;
import site.junggam.procurement_system.repository.DeptNoticeRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class DeptNoticeService {

    @Autowired
    private DeptNoticeRepository deptNoticeRepository;

    public DeptNoticeService(DeptNoticeRepository deptNoticeRepository) {
        this.deptNoticeRepository = deptNoticeRepository;
    }

    public List<DeptNoticeDTO> getDeptNoticeList() {
        List<DeptNotice> deptNotices = deptNoticeRepository.findAll();
        List<DeptNoticeDTO> deptNoticeDTOList = new ArrayList<>();

        for (DeptNotice deptNotice : deptNotices) {
            DeptNoticeDTO deptNoticeDTO = DeptNoticeDTO.builder().deptNoticeNumber(deptNotice.getDeptNoticeNumber())
                    .deptNoticeWriter(deptNotice.getDeptNoticeWriter()).deptNoticeTitle(deptNotice.getDeptNoticeTitle())
                    .deptNoticeRegDate(deptNotice.getDeptNoticeRegDate()).build();
            deptNoticeDTOList.add(deptNoticeDTO);
        }
        return deptNoticeDTOList;
    }

}
