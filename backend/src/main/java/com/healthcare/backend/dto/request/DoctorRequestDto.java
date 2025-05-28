package com.healthcare.backend.dto.request;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DoctorRequestDto {

    private String name;
    private String specialization;
    private String email;
    private String phone;
}
