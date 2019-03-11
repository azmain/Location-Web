package io.azmain.locationweb.repos;

import io.azmain.locationweb.entities.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Integer> {
}
