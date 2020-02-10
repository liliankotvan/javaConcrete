package desafio.concrete.controller.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import desafio.concrete.modelo.PhonesModel;

public interface PhonesRepository extends JpaRepository<PhonesModel, Long>{

}
