package ra.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/products")
public class ProductController {

    @PostMapping
    public ResponseEntity<String> createProduct() {
        return ResponseEntity.ok("Product created successfully by user: ");
    }
}
