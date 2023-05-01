package org.example.json;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Setter
@Getter
public class Job {
    private LocalDate since;
    private String city;

    private BigDecimal salary;
}
