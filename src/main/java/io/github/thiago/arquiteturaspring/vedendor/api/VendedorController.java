package io.github.thiago.arquiteturaspring.vedendor.api;

import io.github.thiago.arquiteturaspring.vedendor.model.Vedendor;
import io.github.thiago.arquiteturaspring.vedendor.service.VendedorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vendedores")
public class VendedorController {

    private final VendedorService service;

    public VendedorController(VendedorService service) {
        this.service = service;
    }

    @PostMapping
    public Vedendor cadastrarVendedor(@RequestBody Vedendor vendedor) {
        return service.cadastrar(vendedor);
    }

    @GetMapping
    public List<Vedendor> listarVendedores() {
        return service.listarVendedores();
    }
}
