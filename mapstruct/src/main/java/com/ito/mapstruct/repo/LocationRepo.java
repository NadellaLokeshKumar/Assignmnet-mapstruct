package com.ito.mapstruct.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ito.mapstruct.dto.Location;

public interface LocationRepo extends JpaRepository<Location, Integer>{

}
