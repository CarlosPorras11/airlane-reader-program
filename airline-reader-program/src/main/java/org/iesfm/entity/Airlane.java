package org.iesfm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Airlane {
    private String name;
    private List<Flight> flights;
}
