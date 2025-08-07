package com.itb.inf2cm.pizzariac.controller;

import com.itb.inf2cm.pizzariac.model.entity.Categoria;
import com.itb.inf2cm.pizzariac.model.entity.Produto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/produto")

public class CategoriaController {

    List<Categoria> categorias = new ArrayList<Categoria>();
    @find

}
