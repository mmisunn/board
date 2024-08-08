package site.junggam.procurement_system.controller;


import jakarta.annotation.Resource;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import site.junggam.procurement_system.service.WarehousingService;

@Log4j2
@RestController
@RequestMapping("/files")
@RequiredArgsConstructor


public class WarehousingRestController {


    //자바스크립트를 사용해 db경로를 통해 가져온 파일을 새 창으로 띄우는 코드ㅜ
    @Autowired
    private WarehousingService warehousingService;

        @GetMapping("/warehousing/warehousingspec")
        public ResponseEntity<Resource> downloadFile(@PathVariable String warehousingspec) {
            Resource file = warehousingService.loadFileAsResource(warehousingspec);
            return ResponseEntity.ok()
                    .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + file.getClass() + "\"")
                    .body(file);
        }
    }



