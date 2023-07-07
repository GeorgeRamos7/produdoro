package dev.wakandaacadamy.produdoro.pomodo.domain;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Document(collection = "ConfiguracaoPromodoroPadrao")
public class ConfiguracaoPomodoPadrao {
	private static final String CODIGO_DEFAULT = "DEFAULT";
	@MongoId(targetType = FieldType.STRING)
	@Builder.Default
	private String codigo = CODIGO_DEFAULT;
	@Getter
	private Integer tempoMinutosFoco;
	@Getter
	private Integer tempoMinutosPausaCurta;
	@Getter
	private Integer tempoMinutosPausaLonga;
	@Getter
	private Integer repeticoesParaPausaLonga;
}
