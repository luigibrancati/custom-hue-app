package org.apache.tika.language.detect;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.tika.config.ServiceLoader;
import org.apache.tika.utils.CompareUtils;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class LanguageDetector {
    private static final int BUFFER_LENGTH = 4096;
    private static final ServiceLoader DEFAULT_SERVICE_LOADER = new ServiceLoader();
    protected boolean mixedLanguages = false;
    protected boolean shortText = false;

    public static LanguageDetector getDefaultLanguageDetector() {
        List<LanguageDetector> languageDetectors = getLanguageDetectors();
        if (languageDetectors.isEmpty()) {
            throw new IllegalStateException("No language detectors available");
        }
        return languageDetectors.get(0);
    }

    public static List<LanguageDetector> getLanguageDetectors() {
        return getLanguageDetectors(DEFAULT_SERVICE_LOADER);
    }

    public void addText(CharSequence charSequence) {
        int length = charSequence.length();
        if (length < 4096) {
            char[] charArray = charSequence.toString().toCharArray();
            addText(charArray, 0, charArray.length);
            return;
        }
        int i10 = 0;
        while (!hasEnoughText() && i10 < length) {
            int i11 = i10 + 4096;
            char[] charArray2 = charSequence.subSequence(i10, Math.min(i11, length)).toString().toCharArray();
            addText(charArray2, 0, charArray2.length);
            i10 = i11;
        }
    }

    public abstract void addText(char[] cArr, int i10, int i11);

    public LanguageResult detect() {
        return detectAll().get(0);
    }

    public abstract List<LanguageResult> detectAll();

    public List<LanguageResult> detectAll(String str) {
        reset();
        addText(str);
        return detectAll();
    }

    public boolean hasEnoughText() {
        return false;
    }

    public abstract boolean hasModel(String str);

    public boolean isMixedLanguages() {
        return this.mixedLanguages;
    }

    public boolean isShortText() {
        return this.shortText;
    }

    public abstract LanguageDetector loadModels();

    public abstract LanguageDetector loadModels(Set<String> set);

    public abstract void reset();

    public LanguageDetector setMixedLanguages(boolean z10) {
        this.mixedLanguages = z10;
        return this;
    }

    public abstract LanguageDetector setPriors(Map<String, Float> map);

    public LanguageDetector setShortText(boolean z10) {
        this.shortText = z10;
        return this;
    }

    public static List<LanguageDetector> getLanguageDetectors(ServiceLoader serviceLoader) {
        List<LanguageDetector> listLoadStaticServiceProviders = serviceLoader.loadStaticServiceProviders(LanguageDetector.class);
        listLoadStaticServiceProviders.sort(new Comparator() { // from class: org.apache.tika.language.detect.a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return CompareUtils.compareClassName((LanguageDetector) obj, (LanguageDetector) obj2);
            }
        });
        return listLoadStaticServiceProviders;
    }

    public LanguageResult detect(CharSequence charSequence) {
        reset();
        addText(charSequence);
        return detect();
    }
}
