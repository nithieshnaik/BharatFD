package Controller;

import Entity.FAQEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import Service.FAQService;
import java.util.List;

@RestController
@RequestMapping(value = "/api/fags")
public class FAQController {

    @Autowired
    private FAQService faqService;

    @GetMapping
    public List<FAQEntity> getFAQs(@RequestParam(required = false, defaultValue = "en") String lang) {
        return faqService.getFAQs(lang);
    }

    @PostMapping
    public FAQEntity createFAQ(@RequestBody FAQEntity faq) {
        return faqService.createFAQ(faq);
    }
}
