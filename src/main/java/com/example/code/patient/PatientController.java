package com.example.code.patient;

import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping(path = "ap1/v1")
@AllArgsConstructor
public class PatientController {
@GetMapping
    public List<Patient> getPatient(){
    return ();
}
 @PostMapping
    public void registerPatient(){

 }
}
