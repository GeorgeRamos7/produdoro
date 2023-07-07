package dev.wakandaacadamy.produdoro.tarefa.domain;

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
@Document(collection = "Tarefa")
public class Tarefa {
	@Getter
	@Id
	private UUID idTarefa;
	
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
	
	@Getter
	private UUID idProjeto;
	
	@Getter
	@Builder.Default
	private StatusTarefa status = StatusTarefa.A_FAZER;
	


}
