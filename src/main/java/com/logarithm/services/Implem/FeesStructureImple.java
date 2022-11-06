package com.logarithm.services.Implem;

import com.logarithm.dto.FeesStructureDto;
import com.logarithm.dto.response.FeesStructureResponsesDto;
import com.logarithm.models.FeesStructure;
import com.logarithm.repository.FeesStructureRepository;
import com.logarithm.services.FeesStructureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class FeesStructureImple implements FeesStructureService {
    @Autowired
    private FeesStructureRepository feesStructureRepository;

    @Override
    public FeesStructureResponsesDto save(FeesStructureDto feesStructureDto) {
        FeesStructure feesStructure=new FeesStructure();
        feesStructure.setFees(feesStructureDto.getFees());
        feesStructure.setSchool(feesStructureDto.getSchool());
        feesStructure.setPeriod(feesStructureDto.getPeriod());
        feesStructure.setUpdatedDate(LocalDate.now());
        feesStructure.setCreatedDate(feesStructureDto.getCreatedDate());
        feesStructure.setNarration(feesStructureDto.getNarration());
        feesStructure.setClassId(feesStructureDto.getClassId());
        feesStructure.setSchoolId(feesStructureDto.getSchoolId());
        FeesStructure feesStructure1= feesStructureRepository.save(feesStructure);

        FeesStructureResponsesDto feesResponsesDto = new FeesStructureResponsesDto();
        feesResponsesDto.setCode(200);
        feesResponsesDto.setMsg("Fees structure created successfully");
        feesResponsesDto.setFeesStructure(feesStructure1);
        return feesResponsesDto;




    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public FeesStructureResponsesDto update(Integer id, FeesStructureDto feesStructureDto) {
        Optional<FeesStructure> feesStructure=   feesStructureRepository.findById(id);
if(feesStructure.isPresent()) {
    //FeesStructure feesStructure = new FeesStructure();
    FeesStructure feesStructure1=feesStructure.get();
    feesStructure1.setFees(feesStructureDto.getFees());
    feesStructure1.setSchool(feesStructureDto.getSchool());
    feesStructure1.setPeriod(feesStructureDto.getPeriod());
    feesStructure1.setUpdatedDate(LocalDate.now());
    feesStructure1.setCreatedDate(feesStructureDto.getCreatedDate());
    feesStructure1.setNarration(feesStructureDto.getNarration());
    feesStructure1.setClassId(feesStructureDto.getClassId());
    feesStructure1.setSchoolId(feesStructureDto.getSchoolId());
    FeesStructure feesStructure2 = feesStructureRepository.save(feesStructure1);

    FeesStructureResponsesDto feesResponsesDto = new FeesStructureResponsesDto();
    feesResponsesDto.setCode(200);
    feesResponsesDto.setMsg("Fees  structure updated successfully");
    feesResponsesDto.setFeesStructure(feesStructure2);
    return feesResponsesDto;

}else


    return null;
    }

    @Override
    public void feesStructureDelete(Integer id) {

        var feesStructure=feesStructureRepository.findById(id)
                .orElseThrow(()-> new EntityNotFoundException("Fees structure not found"));

        feesStructure.setStatus("Deleted");

    }

    @Override
    public List<FeesStructure> findAll() {
        List<FeesStructure> feesStructures=feesStructureRepository.findAll();
        return feesStructures;
    }
}
