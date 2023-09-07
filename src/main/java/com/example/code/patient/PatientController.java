package com.example.code.patient;

import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;
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
    @PutMapping(path="/update/patient/{patientId}")
    public void UpdatePatient(
            @PathVariable("patientId") Long patientId,
            @RequestParam(required = false) String first_name,
            @RequestParam(required = false) String middle_name,
            @RequestParam(required = false) String last_name,
            @RequestParam(required = false) String identification_type
            ){
        patientService.updatePatient(patientId,first_name,middle_name,last_name,identification_type);
    }
}
