package org.zerock.w0930.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class OrderDetailDTO {

    private Integer orderNum;
    private Integer menuNumber;
    private Integer amount;

}
