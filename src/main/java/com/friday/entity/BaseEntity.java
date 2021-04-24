package com.friday.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class BaseEntity {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,updatable = false)
    public String createdBy;

    @Column(nullable = false,updatable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    public LocalDateTime createdTime;

    @Column(nullable = false)
    public String updatedBy;

    @Column(nullable = false,updatable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    public LocalDateTime deleteTime;

    private Boolean isDeleted=false;
}
