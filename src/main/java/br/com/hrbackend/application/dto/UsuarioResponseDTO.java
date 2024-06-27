package br.com.hrbackend.application.dto;

public record UsuarioResponseDTO(
        int idusuario,
        String nome,
        String sobrenome,
        String login,
        String senha,
        String token,
        String image,
        byte[] foto,
        String tipo,
        String role,
        boolean accountNonExpired,
        boolean accountNonLocked,
        boolean credentialsNonExpired,
        boolean enabled,
        EmpresaRequestDTO empresa
) {
}
