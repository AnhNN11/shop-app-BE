package com.example.shopapp.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("${api.prefix}/orders_detail")
public class OrderDetailController {
//    @PostMapping("")
//    public ResponseEntity<?> createOrderDetail()
//    public ResponseEntity<?> createOrder(
//            @Valid @RequestBody OrderDTO orderDTO,
//            BindingResult result
//    ) {
//        try {
//            if (result.hasErrors()) {
//                List<String> errorMessages = result.getFieldErrors()
//                        .stream()
//                        .map(FieldError::getDefaultMessage)
//                        .toList();
//                return ResponseEntity.badRequest().body(errorMessages);
//            }
//            return ResponseEntity.ok("Create order successfully");
//        } catch (Exception e) {
//            return ResponseEntity.badRequest().body(e.getMessage());
//        }
//    }


}
