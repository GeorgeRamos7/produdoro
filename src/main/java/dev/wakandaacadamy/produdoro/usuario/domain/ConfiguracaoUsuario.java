package dev.wakandaacadamy.produdoro.usuario.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
@Builder(access = AccessLevel.PACKAGE)
public class ConfiguracaoUsuario {
	
	@Getter
	private Integer tempoMinutosFoco;
	@Getter
	private Integer tempoMinutosPausaCurta;
	@Getter
	private Integer tempoMinutosPausaLonga;
	@Getter
	private Integer repeticoesParaPausaLonga;

}
