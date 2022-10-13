package org.iesfm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Flight {
    private String origin;
    private String destination;
    private Date date;
    private List<Passenger> passengers;


}
