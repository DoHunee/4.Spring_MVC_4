package hello.itemservice.domain.item;

import lombok.Data;
import org.hibernate.validator.constraints.Range;


// import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
   



@Data
// @ScriptAssert(lang = "javascript", script = "_this.price * _this.quantity >= 10000")
// Java 15 이상에서는 JavaScript 엔진인 Nashorn이 제거되어 @ScriptAssert 어노테이션 오류가 발생한다
public class Item {
   
    @NotNull //수정 요구사항 추가
    private Long id;
    
    @NotBlank (message = "공백 X")
    private String itemName;
    
    @NotNull
    @Range(min = 1000, max = 1000000)
    private Integer price;
    
    @NotNull
    // @Max(9999)   //수정 요구사항 추가
    private Integer quantity;

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}