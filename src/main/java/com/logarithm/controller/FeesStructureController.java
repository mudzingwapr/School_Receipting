package com.logarithm.controller;

import com.logarithm.dto.FeesStructureDto;
import com.logarithm.dto.response.FeesStructureResponsesDto;
import com.logarithm.models.FeesStructure;
import com.logarithm.services.FeesStructureService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/feesStructure")
public class FeesStructureController {
    @Autowired
    private FeesStructureService feesStructureService;

@PostMapping("/save")
    public ResponseEntity<FeesStructureResponsesDto> createFeesStructure(@RequestBody FeesStructureDto feesStructureDto){
        FeesStructureResponsesDto feesStructureResponsesDto=feesStructureService.save(feesStructureDto);
        return ResponseEntity.ok(feesStructureResponsesDto);
    }
    @PostMapping("/update/{id}")
    public ResponseEntity<FeesStructureResponsesDto> updatefeesStructure(@PathVariable Integer id, @RequestBody FeesStructureDto feesStructureDto){
    FeesStructureResponsesDto feesStructureResponsesDto = feesStructureService.update(id,feesStructureDto);
    return ResponseEntity.ok(feesStructureResponsesDto);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteFeesStructure(Integer id){
        feesStructureService.FeesStructureDelete(id);
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<FeesStructure>> listResponseEntity(){
    return ResponseEntity.ok(feesStructureService.listist());
    }
}
