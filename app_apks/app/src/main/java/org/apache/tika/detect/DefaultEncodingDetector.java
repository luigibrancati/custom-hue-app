package org.apache.tika.detect;

import java.util.Collection;
import org.apache.tika.config.ServiceLoader;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class DefaultEncodingDetector extends CompositeEncodingDetector {
    public DefaultEncodingDetector() {
        this(new ServiceLoader(DefaultEncodingDetector.class.getClassLoader()));
    }

    public DefaultEncodingDetector(ServiceLoader serviceLoader) {
        super(serviceLoader.loadServiceProviders(EncodingDetector.class));
    }

    public DefaultEncodingDetector(ServiceLoader serviceLoader, Collection<Class<? extends EncodingDetector>> collection) {
        super(serviceLoader.loadServiceProviders(EncodingDetector.class), collection);
    }
}
