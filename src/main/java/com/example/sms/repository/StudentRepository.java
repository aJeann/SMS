package com.example.sms.repository;

import com.example.sms.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Axel Jeansson
 * Date: 2021-08-30
 * Time: 17:59
 * Project: SMS
 * Copyright: MIT
 */

public interface StudentRepository extends JpaRepository<Student, Long> {
}
