package com.example.code.patient;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.logging.log4j.message.AsynchronouslyFormattable;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="patient")
public class Patient {
    @Id
    @GeneratedValue
    private Long id;
    private String first_name;
    private String middle_name;
    private String last_name;
    private String identification_type;
    private Integer identification_no;

}
