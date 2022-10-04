package org.zerock.w0930.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class ProductDTO {

    private Integer menuNumber;
    private String menu;
    private Integer price;
    private Integer catagory;
}
