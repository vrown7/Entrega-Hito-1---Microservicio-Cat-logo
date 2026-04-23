package cl.duoc.backend_api.service;

import cl.duoc.backend_api.model.Producto;
import cl.duoc.backend_api.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductoService {
    @Autowired
    private ProductoRepository repository;

    public Producto guardarProducto(Producto producto) {
        return repository.save(producto); // Guarda en BD
    }

    public List<Producto> obtenerTodos() {
        return repository.findAll(); // Lista todos
    }
}