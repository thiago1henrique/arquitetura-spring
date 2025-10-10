package io.github.thiago.arquiteturaspring.vedendor.service;

import io.github.thiago.arquiteturaspring.vedendor.model.Vedendor;
import io.github.thiago.arquiteturaspring.vedendor.model.VendedorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendedorService {

    private final VendedorRepository repository;

    public VendedorService(VendedorRepository repository) {
        this.repository = repository;
    }

    public Vedendor cadastrar(Vedendor vendedor) {
        return repository.save(vendedor);
    }

    public List<Vedendor> listarVendedores() {
        return repository.findAll();
    }
}
