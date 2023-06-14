package com.tienda.service;

import com.tienda.domain.Categoria;
import java.util.List;

public interface CategoriaService {
    //Metodo recupera los registros de la tabla categorias
    public List<Categoria> getCategoria(boolean activos);
}
