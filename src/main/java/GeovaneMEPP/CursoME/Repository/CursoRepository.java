package GeovaneMEPP.CursoME.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import GeovaneMEPP.CursoME.Model.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer> {

}
