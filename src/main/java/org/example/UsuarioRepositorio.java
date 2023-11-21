package org.example;

public interface UsuarioRepositorio {

    void add(Usuario usuario);

    void update(Usuario usuario);

    void remove(Usuario usuario);
    void get(Long id);

}
