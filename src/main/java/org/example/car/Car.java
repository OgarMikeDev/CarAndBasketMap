package org.example.car;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.management.ConstructorParameters;

@Data
@RequiredArgsConstructor
public class Car {

    private final String number;

    private int power;

    private double volume;
}
