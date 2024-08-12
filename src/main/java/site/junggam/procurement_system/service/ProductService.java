package site.junggam.procurement_system.service;

import site.junggam.procurement_system.dto.ProductDTO;
import site.junggam.procurement_system.entity.Product;

import java.util.List;

public interface ProductService {
    // 제품 등록
    String insertProduct(ProductDTO productDTO);

    // 제품 수정
    void updateProduct(ProductDTO productDTO);

    // 제품 조회
    Product findProductByCode(String productCode);

    // 모든 제품 조회
    List<Product> findAllProducts();

    // 제품 삭제
    boolean deleteProduct(String productCode);


    //엔티티->디티오, 디티오->엔티티 변환 default 메서드 작성..
    //DTO->Entity
    default Product dtoToEntity(ProductDTO productDTO) {
        Product product = Product.builder()
                .productCode(productDTO.getProductCode())
                .productName(productDTO.getProductName())
                .productPrice(productDTO.getProductPrice())
                .productStand(productDTO.getProductStand())
                .productTexture(productDTO.getProductTexture())
                .productDrawFile(productDTO.getProductDrawFile())
                .productEtcFile(productDTO.getProductEtcFile())
                .productEtcFile(productDTO.getProductEtcFile())
                .productRegDate(productDTO.getProductRegDate())
                .productModDate(productDTO.getProductModDate())
                .build();
        return product;
    }
    //Entity->DTO
    default ProductDTO entityToDTO(Product product) {
        ProductDTO productDTO = ProductDTO.builder()
                .productCode(product.getProductCode())
                .productName(product.getProductName())
                .productPrice(product.getProductPrice())
                .productStand(product.getProductStand())
                .productTexture(product.getProductTexture())
                .productDrawFile(product.getProductDrawFile())
                .productEtcFile(product.getProductEtcFile())
                .productRegDate(product.getProductRegDate())
                .build();
        return productDTO;
    }
}
