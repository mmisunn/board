//package site.junggam.procurement_system.controller;
//
//import jakarta.annotation.Resource;
//import lombok.extern.log4j.Log4j2;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import site.junggam.procurement_system.entity.Warehousing;
//
//@Log4j2
//@Controller
//@RequestMapping("/warehousing")

//public class WarehousingController {
//
//    @RequestMapping("/warehousingread")
//    public void warehousingread(){log.info("내용~");}
//
//
//    //p499의 파일저장섹션
//    @GetMapping("/warehousingshipmentspecread")
//    public void warehousingshipmentspecread() {
//        log.info("입고상세내역의 출하명세서 확인.");
//    }


//    @GetMapping("/view/{fileId}")
//    public ResponseEntity<Resource> viewFileDetails(@PathVariable Long fileId) {
//        Resource file = fileService.loadFileAsResource(fileId);
//
//        @GetMapping("/view/{fileId}")
//    public ResponseEntity<Resource> viewFileDetails(@PathVariable Long fileId) {
//        Resource file = resource.loadFileAsResource(fileId);
//
//        return Warehousing.ok()
//                .header(HttpHeaders.CONTENT_DISPOSITION, "inline; filename=\"" + file.getFilename() + "\"")
//                .body(file);
}
