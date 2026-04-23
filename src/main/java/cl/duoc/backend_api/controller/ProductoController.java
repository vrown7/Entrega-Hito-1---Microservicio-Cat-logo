package cl.duoc.backend_api.controller;

import cl.duoc.backend_api.model.Producto;
import cl.duoc.backend_api.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/catalogo")
public class ProductoController {
    @Autowired
    private ProductoService service;

    @PostMapping("/crear")
    public ResponseEntity<Producto> crear(@RequestBody Producto producto) {
        Producto nuevo = service.guardarProducto(producto);
        return new ResponseEntity<>(nuevo, HttpStatus.CREATED); // Devuelve status 201
    }

    @GetMapping("/listar")
    public ResponseEntity<List<Producto>> listar() {
        return new ResponseEntity<>(service.obtenerTodos(), HttpStatus.OK); // Devuelve status 200
    }
}