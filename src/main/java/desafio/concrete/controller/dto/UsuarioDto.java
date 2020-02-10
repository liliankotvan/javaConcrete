package desafio.concrete.controller.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import desafio.concrete.modelo.UsuarioModel;



public class UsuarioDto {
	
	private String name;
	private String email;
	private LocalDateTime created = LocalDateTime.now();
	private Long id;
	
	public UsuarioDto(UsuarioModel usuario) {
		this.name= usuario.getName();
		this.email= usuario.getEmail();
		this.created= usuario.getCreated();
		this.id=usuario.getId();
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public LocalDateTime getCreated() {
		return created;
	}
	
	public Long getId() {
		return id;
	}
	

	public static List<UsuarioDto> converter(List<UsuarioModel> usuario) {
	
		return usuario.stream().map(UsuarioDto::new).collect(Collectors.toList());
	}

}
