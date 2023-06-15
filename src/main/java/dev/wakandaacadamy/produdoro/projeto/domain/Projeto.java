package dev.wakandaacadamy.produdoro.projeto.domain;

import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Document(collection = "Projeto")
public class Projeto {
	@Getter
	@Id
	private UUID idProjeto;
	
	@Getter
	private String nome;
	
	@Getter
	private String descricao;
	
	@Getter
	@Indexed
	private UUID idArea;
	
	@Getter
	@Indexed
	private UUID idUsuario;
	


}
