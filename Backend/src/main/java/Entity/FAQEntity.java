package Entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

import java.util.HashMap;
import java.util.Map;

public class FAQEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TEXT")
    private String question;

    @Column(columnDefinition = "TEXT")
    private String answer;

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ElementCollection
    @CollectionTable(name = "faq_translations", joinColumns = @JoinColumn(name = "faq_id"))
    @MapKeyColumn(name = "language")
    @Column(name = "translated_question")
    private Map<String, String> questionTranslations = new HashMap<>();


    public Map<String, String> getQuestionTranslations() {
        return questionTranslations;
    }
}
