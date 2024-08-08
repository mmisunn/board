package site.junggam.procurement_system.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import site.junggam.procurement_system.dto.ProductDTO;
import site.junggam.procurement_system.service.ProductService;

import java.time.LocalDateTime;

@Log4j2
@Controller
@RequiredArgsConstructor
@RequestMapping("/product")
public class ProductController {
    private final ProductService productService;

    @RequestMapping("/productlist")
    public void productlist() {

    }

    @RequestMapping("/addproducttest")
    public void addproducttest() {

    }

    @PostMapping("/register")
    public void register(ProductDTO productDTO, RedirectAttributes redirectAttributes) {
        log.info("제품등록 테스트..");

        // 추가적인 검증 로직이 필요할 수 있습니다
        // 예: productDTO 검증, 중복 체크 등

        // 현재 날짜와 시간을 등록일 및 수정일로 설정
        LocalDateTime now = LocalDateTime.now();
        productDTO.setProductRegDate(now);
        productDTO.setProductModDate(now);
        productDTO.setProductName("name7");
        productDTO.setProductPrice(9900.00);
        productDTO.setProductStand("stand7");
        productDTO.setProductTexture("text7");
        productDTO.setProductDrawFile("file17");
        productDTO.setProductEtcFile("file27");

        // 제품을 데이터베이스에 저장
        productService.productRegister(productDTO);
        log.info("제품등록후 테스트..");
        // 리다이렉트 시에 성공 메시지를 추가할 수 있습니다
        redirectAttributes.addFlashAttribute("message", "Product registered successfully!");

        //return "redirect:/product/register";
    }


}
