package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name="tb_produto")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "nomeProduto")
    private String nomeProduto;
}
