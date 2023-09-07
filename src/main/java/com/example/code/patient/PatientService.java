package com.example.code.patient;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class PatientService {
 private final PatientRepository patientRepository;

 public List<Patient> getPatient(){
     return patientRepository.findAll();
 }
 public void addNewPatient(Patient patient){
     patientRepository.save(patient);
 }
    @Transactional
    public void updatePatient(Long patientId,String first_name,String middle_name, String last_name,String identification_type) {
     Patient patient = patientRepository.findById(patientId)
             .orElseThrow(()-> new IllegalStateException("patient id "+ patientId + "does not exist"));

     patient.setFirst_name(first_name);
     patient.setMiddle_name(middle_name);
     patient.setLast_name(last_name);
     patient.setIdentification_type(identification_type);
     patientRepository.save(patient);
    }
}
