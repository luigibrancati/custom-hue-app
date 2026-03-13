package org.apache.tika.metadata.filter;

import java.util.List;
import org.apache.tika.config.ServiceLoader;
import org.apache.tika.utils.ServiceLoaderUtils;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class DefaultMetadataFilter extends CompositeMetadataFilter {
    public DefaultMetadataFilter(ServiceLoader serviceLoader) {
        super(getDefaultFilters(serviceLoader));
    }

    private static List<MetadataFilter> getDefaultFilters(ServiceLoader serviceLoader) {
        List<MetadataFilter> listLoadStaticServiceProviders = serviceLoader.loadStaticServiceProviders(MetadataFilter.class);
        ServiceLoaderUtils.sortLoadedClasses(listLoadStaticServiceProviders);
        return listLoadStaticServiceProviders;
    }

    public DefaultMetadataFilter(List<MetadataFilter> list) {
        super(list);
    }

    public DefaultMetadataFilter() {
        this(new ServiceLoader());
    }
}
