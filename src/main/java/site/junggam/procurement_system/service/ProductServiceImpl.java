package site.junggam.procurement_system.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import site.junggam.procurement_system.dto.ProductDTO;
import site.junggam.procurement_system.entity.Product;
import site.junggam.procurement_system.repository.ProductRepository;

import java.util.Optional;

@Log4j2
@Service
@RequiredArgsConstructor //생성자 의존성 주입
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    @Transactional
    public String productRegister(ProductDTO productDTO) {
        String newProductCode = generateNextProductCode();
        productDTO.setProductCode(newProductCode);
        Product product = dtoToEntity(productDTO);
        Product saveProduct = productRepository.save(product);
        return saveProduct.getProductCode();
    }

    //Next 제품코드 자동증가값 생성 메서드
    private String generateNextProductCode() {
        Optional<String> maxProductCode = productRepository.findAll().stream()
                .map(Product::getProductCode)
                .max(String::compareTo);

        String nextCode;
        if (maxProductCode.isPresent()) {
            String maxCode = maxProductCode.get();
            int maxNumber = Integer.parseInt(maxCode.substring(3)); // 'BP-' 제외
            nextCode = String.format("BP-%05d", maxNumber + 1);
        } else {
            nextCode = "BP-00001";
        }

        return nextCode;
    }
}
