package org.example.json;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class Job {
    private LocalDateTime since;
    private String city;

    private BigDecimal salary;
}
