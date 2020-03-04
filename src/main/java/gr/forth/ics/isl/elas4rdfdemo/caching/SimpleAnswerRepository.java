package gr.forth.ics.isl.elas4rdfdemo.caching;

import gr.forth.ics.isl.elas4rdfdemo.AnswerExtraction;
import gr.forth.ics.isl.elas4rdfdemo.models.Answer;
import gr.forth.ics.isl.elas4rdfdemo.models.AnswersContainer;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class SimpleAnswerRepository implements AnswerRepository{

    @Override
    @Cacheable("answers")
    public AnswersContainer getAnswers(String query) {
        AnswerExtraction ae = new AnswerExtraction();
        return ae.extractAnswers(query);
    }
}
