package org.apache.tika.language.translate;

import java.util.Comparator;
import java.util.List;
import org.apache.tika.config.ServiceLoader;
import org.apache.tika.exception.TikaException;
import org.apache.tika.language.translate.Translator;
import org.apache.tika.utils.CompareUtils;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class DefaultTranslator implements Translator {
    private final transient ServiceLoader loader;

    public DefaultTranslator(ServiceLoader serviceLoader) {
        this.loader = serviceLoader;
    }

    private static List<Translator> getDefaultTranslators(ServiceLoader serviceLoader) {
        List<Translator> listLoadStaticServiceProviders = serviceLoader.loadStaticServiceProviders(Translator.class);
        listLoadStaticServiceProviders.sort(new Comparator() { // from class: Re.a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return CompareUtils.compareClassName((Translator) obj, (Translator) obj2);
            }
        });
        return listLoadStaticServiceProviders;
    }

    private static Translator getFirstAvailable(ServiceLoader serviceLoader) {
        for (Translator translator : getDefaultTranslators(serviceLoader)) {
            if (translator.isAvailable()) {
                return translator;
            }
        }
        return null;
    }

    public Translator getTranslator() {
        return getFirstAvailable(this.loader);
    }

    public List<Translator> getTranslators() {
        return getDefaultTranslators(this.loader);
    }

    @Override // org.apache.tika.language.translate.Translator
    public boolean isAvailable() {
        return getFirstAvailable(this.loader) != null;
    }

    @Override // org.apache.tika.language.translate.Translator
    public String translate(String str, String str2, String str3) throws TikaException {
        Translator firstAvailable = getFirstAvailable(this.loader);
        if (firstAvailable != null) {
            return firstAvailable.translate(str, str2, str3);
        }
        throw new TikaException("No translators currently available");
    }

    public DefaultTranslator() {
        this(new ServiceLoader());
    }

    @Override // org.apache.tika.language.translate.Translator
    public String translate(String str, String str2) throws TikaException {
        Translator firstAvailable = getFirstAvailable(this.loader);
        if (firstAvailable != null) {
            return firstAvailable.translate(str, str2);
        }
        throw new TikaException("No translators currently available");
    }
}
