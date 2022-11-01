package com.logarithm.dto.response;

import com.logarithm.models.FeesStructure;
import lombok.Data;

@Data
public class FeesStructureResponsesDto {
    private Integer code;
    private String msg;
    private FeesStructure feesStructure;
}
