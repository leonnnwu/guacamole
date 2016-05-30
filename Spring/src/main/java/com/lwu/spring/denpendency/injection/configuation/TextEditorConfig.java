package com.lwu.spring.denpendency.injection.configuation;

import com.lwu.spring.denpendency.injection.beanreference.SpellChecker;
import com.lwu.spring.denpendency.injection.beanreference.TextEditor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Leon on 5/29/16.
 */
@Configuration
public class TextEditorConfig {

    @Bean
    public TextEditor textEditor() {
        return new TextEditor(spellChecker(), "Hello China");
    }

    @Bean
    public SpellChecker spellChecker() {
        return new SpellChecker();
    }
}
