package dev.wakandaacadamy.produdoro.usuario.domain;

import java.util.UUID;

import javax.validation.constraints.Email;

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
@Document(collection = "Usuario")
public class Usuario {
	@Getter
	@Id
	private UUID idUsuario;
	
	@Getter
	@Email
	@Indexed
	private String email;
	
	@Getter
	private ConfiguracaoUsuario configuracao;
	
	@Getter
	@Builder.Default
	private StatusUsuario status = StatusUsuario.FOCO;
	
	@Getter
	@Builder.Default
	private Integer quantidadePomodorosPausaCurta = 0;
	

}
