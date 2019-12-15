package nl.santa.intellij;

import com.intellij.lang.Language;

public class SampleLanguage extends Language {
    public static final SampleLanguage INSTANCE = new SampleLanguage();

    private SampleLanguage() {
        super("Sample");
    }
}
