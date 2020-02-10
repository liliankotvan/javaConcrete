package desafio.concrete.controller.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import desafio.concrete.modelo.UsuarioModel;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long>{
	
	List<UsuarioModel> findByUsuarioModel_Id(Long id);

}
