package hello.itemservice.domain.item;

import lombok.Data;

@Data
public class Item {
   
    // @NotNull(groups = UpdateCheck.class) // 'id'는 수정 시에만 필수. 등록할 때는 null이어도 허용됨.
    private Long id;
   
    // @NotBlank(groups = { SaveCheck.class, UpdateCheck.class }) // 'itemName'은 등록(Save)과 수정(Update) 시 모두 필수.
    private String itemName;
   
    // @NotNull(groups = { SaveCheck.class, UpdateCheck.class }) // 'price'는 등록(Save)과 수정(Update) 시 모두 필수.
    // @Range(min = 1000, max = 1000000, groups = { SaveCheck.class, UpdateCheck.class }) // 'price'는 1000 이상, 1000000 이하이어야 하며, 등록 및 수정 시 모두 적용.
    private Integer price;
    
    // @NotNull(groups = { SaveCheck.class, UpdateCheck.class }) // 'quantity'는 등록(Save)과 수정(Update) 시 모두 필수.
    // @Max(value = 9999, groups = SaveCheck.class) // 'quantity'는 등록 시에만 최대값 9999 제약이 적용됨. 수정 시에는 제약이 없음.
    private Integer quantity;

    // 기본 생성자
    public Item() {
    }

    // 모든 필드를 초기화하는 생성자
    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}