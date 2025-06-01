package com.healthcare.backend.service;

import com.healthcare.backend.dto.request.DoctorRequestDto;
import com.healthcare.backend.dto.response.DoctorResponseDto;

import java.util.List;

public interface DoctorService {

    DoctorResponseDto createDoctor(DoctorRequestDto doctorRequestDto);

    List<DoctorResponseDto> getAllDoctors();

    DoctorResponseDto getDoctorById(Long id);

    DoctorResponseDto updateDoctor(Long id, DoctorRequestDto doctorRequestDto);

    void deleteDoctor(Long id);
}
