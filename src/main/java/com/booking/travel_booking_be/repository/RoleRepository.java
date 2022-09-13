package com.booking.travel_booking_be.repository;

import com.booking.travel_booking_be.model.ERole;
import com.booking.travel_booking_be.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByName(ERole name);
}
