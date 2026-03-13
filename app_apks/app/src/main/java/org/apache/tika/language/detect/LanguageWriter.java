package org.apache.tika.language.detect;

import java.io.Writer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class LanguageWriter extends Writer {
    private final LanguageDetector detector;

    public LanguageWriter(LanguageDetector languageDetector) {
        this.detector = languageDetector;
        languageDetector.reset();
    }

    public LanguageDetector getDetector() {
        return this.detector;
    }

    public LanguageResult getLanguage() {
        return this.detector.detect();
    }

    public void reset() {
        this.detector.reset();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i10, int i11) {
        this.detector.addText(cArr, i10, i11);
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
    }
}
