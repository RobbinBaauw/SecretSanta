package nl.santa.intellij;

import com.intellij.lang.Language;

public class SantaLangLanguage extends Language {
    public static final SantaLangLanguage INSTANCE = new SantaLangLanguage();

    private SantaLangLanguage() {
        super("Sample");
    }
}
