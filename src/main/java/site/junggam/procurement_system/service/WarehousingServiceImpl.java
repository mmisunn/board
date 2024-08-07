//package site.junggam.procurement_system.service;
//
//
//import lombok.RequiredArgsConstructor;
//import lombok.extern.log4j.Log4j2;
//import org.springframework.stereotype.Service;
//
//import site.junggam.procurement_system.repository.WarehousingRepository;
//
//@Log4j2
//@Service
//@RequiredArgsConstructor
//
//public class WarehousingServiceImpl implements WarehousingService{
//
//    private final WarehousingRepository warehousingRepository;
//지금 완성한거 서비스인터페이스
//    @Override


//}


//  public class FileServiceImpl implements FileService {
//
//    private final FileRepository fileRepository;
//
//    private final Path fileStorageLocation = Paths.get("path/to/your/upload/directory").toAbsolutePath().normalize();
//
//    @Override
//    public Resource loadFileAsResource(Long fileId) {
//        log.info("파일 세부 정보 보기 서비스");
//        try {
//            Optional<FileEntity> result = fileRepository.findById(fileId);
//            if (result.isEmpty()) {
//                throw new RuntimeException("File not found with id " + fileId);
//            }
//            FileEntity fileEntity = result.get();
//            Path filePath = fileStorageLocation.resolve(fileEntity.getFileName()).normalize();
//            Resource resource = new UrlResource(filePath.toUri());
//
//            if (resource.exists()) {