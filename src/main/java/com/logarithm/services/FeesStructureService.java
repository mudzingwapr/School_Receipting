package com.logarithm.services;

import com.logarithm.dto.FeesStructureDto;
import com.logarithm.dto.response.FeesStructureResponsesDto;
import com.logarithm.models.FeesStructure;

import java.util.List;

public interface FeesStructureService {
    FeesStructureResponsesDto save(FeesStructureDto feesStructureDto);
    void delete(Integer id);
    FeesStructureResponsesDto update( Integer id,FeesStructureDto feesStructureDto);
    void feesStructureDelete(Integer id);
    List<FeesStructure> findAll();
}
