package Service;

import Entity.FAQEntity;
import Repositories.FAQRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import java.util.List;

import java.util.stream.Collectors;

public class FAQService {

    @Autowired
    private FAQRepository faqRepository;

    @Cacheable(value = "faqTranslations", key = "#lang")
    public List<FAQEntity> getFAQs(String lang) {
        List<FAQEntity> faqs = (List<FAQEntity>) faqRepository.findAll();
        return faqs.stream()
                .map(faq -> translateFAQ(faq, lang))
                .collect(Collectors.toList());
    }

    private FAQEntity translateFAQ(FAQEntity faq, String lang) {
        String translatedQuestion = faq.getQuestionTranslations().getOrDefault(lang, faq.getQuestion());
        faq.setQuestion(translatedQuestion);
        return faq;
    }
}
