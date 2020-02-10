package desafio.concrete.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import desafio.concrete.controller.dto.UsuarioDto;
import desafio.concrete.controller.form.UsuarioForm;
import desafio.concrete.controller.repository.UsuarioRepository;
import desafio.concrete.modelo.UsuarioModel;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	

	@GetMapping("/login")
	public List<UsuarioDto> lista(Long id){
		if (id == null) {
			List<UsuarioModel> usuarios = usuarioRepository.findAll();
			return UsuarioDto.converter(usuarios);	
		}else {
			List<UsuarioModel> usuarios = usuarioRepository.findByUsuarioModel_Id(id);
			return UsuarioDto.converter(usuarios);				
		}
			
	}
	
	@PostMapping("/cadastro")
	public void cadastrar(@RequestBody UsuarioForm form) {
		UsuarioModel usuario = form.converter();
		
		usuarioRepository.save(usuario);
		
		
	}
	


}
