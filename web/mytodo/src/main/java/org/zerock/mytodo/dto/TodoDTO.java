package org.zerock.mytodo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TodoDTO {

    private Integer tno;
    private String title;
    private String memo;
    private LocalDate dueDate;
    private boolean complete;

    private LocalDateTime regDate,modDate;

}
