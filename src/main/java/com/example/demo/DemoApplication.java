package com.example.demo;

import com.example.demo.model.Usuario;
import com.example.demo.repository.UsuarioRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    // Esta parte es la prueba que puedes usar
    @Bean
    public CommandLineRunner run(UsuarioRepository repo) {
        return args -> {
            Usuario u = new Usuario();
            u.setNombre("Juan");
            u.setCorreo("juan@mail.com");
            u.setContrasenia("1234");
            u.setDireccion("Calle 123");
            u.setTelefono("1234567890");
            u.setRol("Admin");

            repo.save(u); // Esto guarda en la base de datos
            System.out.println("¡Usuario insertado!");
        };
    }
}