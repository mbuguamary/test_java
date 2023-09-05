package com.example.code.patient;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

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
}
