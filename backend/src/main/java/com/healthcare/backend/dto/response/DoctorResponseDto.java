package com.healthcare.backend.dto.response;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DoctorResponseDto {

    private Long id;
    private String name;
    private String specialization;
    private String email;
    private String phone;
}
