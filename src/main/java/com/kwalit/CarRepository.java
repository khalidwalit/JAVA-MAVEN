package com.kwalit;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Book, Long> {
}