package com.example.UniversityEventManagement.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

@Validated
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Event {
    @Id
    private Long eventId;

    @NotBlank
    private String eventName;

    @NotBlank
    private String locationOfEvent;

    @NotBlank
    private String date;

    @NotBlank
    private String startTime;

    @NotBlank
    private String endTime;
}
