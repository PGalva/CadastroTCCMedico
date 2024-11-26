package med.vol.api.medico;

import org.springframework.data.jpa.repository.JpaRepository;



///A declaração import org.springframework.data.jpa.repository.JpaRepository; seguida pela definição da interface MedicoRepository indica que você está criando um repositório para gerenciar a entidade Medico usando Spring Data JPA



////Interface: JpaRepository é uma interface fornecida pelo Spring Data JPA que oferece um conjunto de métodos prontos para realizar operações de CRUD (Create, Read, Update, Delete) em uma entidade.

//Genérica: Ao estender JpaRepository<Medico, Long>, você está especificando que a entidade é Medico e que o tipo da chave primária (ID) é Long.
public interface MedicoRepository extends JpaRepository<Medico, Long> {
}
