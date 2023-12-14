package com.example.shopapp.Controller;

import com.example.shopapp.DTO.CategoryDTO;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/categories")
//@Validated
public class CategorieController {
    //Show all categories
    @GetMapping("")//http://localhost:8088/api/v1/categories?page=1&limit=10
    public ResponseEntity<String> getAllCategorie(
            @RequestParam("page") int page,
            @RequestParam("limit") int limit
    ){
        return ResponseEntity.ok(String.format("Get All, page=%d, limit =%d", page, limit));
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateCategorie(@PathVariable Long id){
        return ResponseEntity.ok("this is update"+ id);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCategorie(@PathVariable Long id){
        return ResponseEntity.ok("this is delete :" +id);
    }
    @PostMapping("")// Nếu tham số truyền vào là 1 Object thì => DTO(Data Transfer Object= Request Object)
    public ResponseEntity<?> insertCategorie( @Valid @RequestBody CategoryDTO categoryDTO, BindingResult result){
        if(result.hasErrors()){
            List<FieldError> fieldErrorList = result.getFieldErrors();
            List<String> errorMessages= fieldErrorList.stream().map(FieldError::getDefaultMessage).toList();
            return ResponseEntity.badRequest().body(errorMessages.toString());
        }
        return ResponseEntity.ok("this is insert"+ categoryDTO);
    }

}
