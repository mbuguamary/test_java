package com.example.code.patient;

import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping(path = "ap1/v1")
@AllArgsConstructor
public class PatientController {
    private final PatientService patientService;

    @GetMapping
    public List <Patient> getPatient(){
    return patientService.getPatient();
}
    @PostMapping(path="/create/patient")
    public void registerPatient(@RequestBody Patient patient){
    patientService.addNewPatient(patient);
 }
}
