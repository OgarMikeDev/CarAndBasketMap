package org.example.car;

import lombok.*;

import javax.management.ConstructorParameters;

@Getter
@Setter
@RequiredArgsConstructor
public class Car {

    private final int number;

    private int power;

    private double volume;
}
