package com.example.mongodb.mongodb;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Document(collection="cliente")
public class Cliente {
    @Id
    private String id;

    private String razaoSocial;
}
