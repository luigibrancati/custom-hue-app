package org.apache.tika.language.detect;

import org.apache.tika.sax.WriteOutContentHandler;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class LanguageHandler extends WriteOutContentHandler {
    private final LanguageWriter writer;

    public LanguageHandler() {
        this(new LanguageWriter(LanguageDetector.getDefaultLanguageDetector().loadModels()));
    }

    public LanguageDetector getDetector() {
        return this.writer.getDetector();
    }

    public LanguageResult getLanguage() {
        return this.writer.getLanguage();
    }

    public LanguageHandler(LanguageWriter languageWriter) {
        super(languageWriter);
        this.writer = languageWriter;
    }

    public LanguageHandler(LanguageDetector languageDetector) {
        this(new LanguageWriter(languageDetector));
    }
}
