package org.apache.tika.extractor;

import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import org.apache.tika.config.ServiceLoader;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.utils.ServiceLoaderUtils;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class DefaultEmbeddedStreamTranslator implements EmbeddedStreamTranslator {
    final List<EmbeddedStreamTranslator> translators;

    public DefaultEmbeddedStreamTranslator() {
        this(getDefaultFilters(new ServiceLoader()));
    }

    private static List<EmbeddedStreamTranslator> getDefaultFilters(ServiceLoader serviceLoader) {
        List<EmbeddedStreamTranslator> listLoadServiceProviders = serviceLoader.loadServiceProviders(EmbeddedStreamTranslator.class);
        ServiceLoaderUtils.sortLoadedClasses(listLoadServiceProviders);
        return listLoadServiceProviders;
    }

    @Override // org.apache.tika.extractor.EmbeddedStreamTranslator
    public boolean shouldTranslate(InputStream inputStream, Metadata metadata) {
        Iterator<EmbeddedStreamTranslator> it = this.translators.iterator();
        while (it.hasNext()) {
            if (it.next().shouldTranslate(inputStream, metadata)) {
                return true;
            }
        }
        return false;
    }

    @Override // org.apache.tika.extractor.EmbeddedStreamTranslator
    public InputStream translate(InputStream inputStream, Metadata metadata) {
        Iterator<EmbeddedStreamTranslator> it = this.translators.iterator();
        while (it.hasNext()) {
            InputStream inputStreamTranslate = it.next().translate(inputStream, metadata);
            if (inputStreamTranslate != null) {
                return inputStreamTranslate;
            }
        }
        return inputStream;
    }

    private DefaultEmbeddedStreamTranslator(List<EmbeddedStreamTranslator> list) {
        this.translators = list;
    }
}
