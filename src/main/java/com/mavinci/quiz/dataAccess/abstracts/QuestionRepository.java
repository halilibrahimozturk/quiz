package com.mavinci.quiz.dataAccess.abstracts;

import com.mavinci.quiz.entities.concretes.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepository extends JpaRepository<Question,Integer> {


    Question getById(long id);

    List<Question> getByLevel(String level);

    List<Question> getByCategory(String category);

    List<Question> getByLevelAndCategory(String level , String category);

    Question getByLevelAndCategoryAndIdNotIn(String level, String category , List<Long> id);

    @Query(value="SELECT * FROM questions where level=:level and category =:category and ( id not in :idList) ORDER BY floor(random()* ((select count(*) from questions where level=:level and category =:category and (id not in :idList))) + 1) LIMIT 1", nativeQuery = true)
    Question getRandQuestion(@Param("level") String level,@Param("category") String category,@Param("idList") List<Long> idList);



}


