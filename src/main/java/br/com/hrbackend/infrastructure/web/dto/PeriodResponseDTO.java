package br.com.hrbackend.infrastructure.web.dto;

public record PeriodResponseDTO(
        int idperiodo,
        String entrada,
        String saida,
        String intervaloEntrada,
        String intervaloSaida,
        String jornada,
        String tipo,
        EmpresaResponseDTO empresa
) {
}
