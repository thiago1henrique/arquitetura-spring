package io.github.thiago.arquiteturaspring.vedendor.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendedorRepository extends JpaRepository<Vedendor, Integer> {
}
