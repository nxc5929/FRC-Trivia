package frc.sparx.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import frc.sparx.models.TriviaQuestion;

public interface TriviaQuestionRepo extends CrudRepository<TriviaQuestion, String> {
	
	@Query("select t from TriviaQuestion t where t.match_key = :id")
	TriviaQuestion findQuestionByMatchKey(@Param("id") String matchKey);

}
