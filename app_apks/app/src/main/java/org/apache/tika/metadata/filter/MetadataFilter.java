package org.apache.tika.metadata.filter;

import java.io.Serializable;
import org.apache.tika.config.ConfigBase;
import org.apache.tika.exception.TikaConfigException;
import org.apache.tika.metadata.Metadata;
import org.w3c.dom.Element;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class MetadataFilter extends ConfigBase implements Serializable {
    public static MetadataFilter load(Element element, boolean z10) throws TikaConfigException {
        try {
            return (MetadataFilter) ConfigBase.buildComposite("metadataFilters", CompositeMetadataFilter.class, "metadataFilter", MetadataFilter.class, element);
        } catch (TikaConfigException e10) {
            if (z10 && e10.getMessage().contains("could not find metadataFilters")) {
                return new NoOpFilter();
            }
            throw e10;
        }
    }

    public abstract void filter(Metadata metadata);
}
