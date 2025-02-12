package ait.cohort46.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class PulseDto {
    private int id;
    private long timestamp;
    private int payload;
}
