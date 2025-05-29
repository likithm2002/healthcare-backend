package com.healthcare.backend.controller;

import com.healthcare.backend.dto.request.DoctorRequestDto;
import com.healthcare.backend.dto.response.DoctorResponseDto;
import com.healthcare.backend.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/doctors")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @PostMapping
    public DoctorResponseDto createDoctor(@RequestBody DoctorRequestDto request) {
        return doctorService.createDoctor(request);
    }

    @GetMapping
    public List<DoctorResponseDto> getAllDoctors() {
        return doctorService.getAllDoctors();
    }

    @GetMapping("/{id}")
    public DoctorResponseDto getDoctor(@PathVariable Long id) {
        return doctorService.getDoctorById(id);
    }

    @PutMapping("/{id}")
    public DoctorResponseDto updateDoctor(@PathVariable Long id, @RequestBody DoctorRequestDto request) {
        return doctorService.updateDoctor(id, request);
    }

    @DeleteMapping("/{id}")
    public void deleteDoctor(@PathVariable Long id) {
        doctorService.deleteDoctor(id);
    }
}
