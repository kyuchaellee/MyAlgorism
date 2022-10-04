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
public class OrderTableDTO {

    private Integer orderNum;
    private LocalDate orderTime;
    private Boolean orderComplate;

}
