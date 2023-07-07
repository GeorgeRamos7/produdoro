package dev.wakandaacadamy.produdoro.area.domain;

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
@Document(collection = "Area")
public class Area {
	@Getter
	@Id
	private UUID idArea;
	
	@Getter
	private String nome;
	
	@Getter
	private String descricao;
	
	
	@Getter
	@Indexed
	private UUID idUsuario;
	


}
