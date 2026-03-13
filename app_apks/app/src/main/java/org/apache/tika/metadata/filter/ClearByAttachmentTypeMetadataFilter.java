package org.apache.tika.metadata.filter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.apache.tika.config.Field;
import org.apache.tika.exception.TikaConfigException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.TikaCoreProperties;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class ClearByAttachmentTypeMetadataFilter extends MetadataFilter {
    private final Set<String> types;

    public ClearByAttachmentTypeMetadataFilter() {
        this(new HashSet());
    }

    @Override // org.apache.tika.metadata.filter.MetadataFilter
    public void filter(Metadata metadata) {
        String str = metadata.get(TikaCoreProperties.EMBEDDED_RESOURCE_TYPE);
        if (str != null && this.types.contains(str)) {
            for (String str2 : metadata.names()) {
                metadata.remove(str2);
            }
        }
    }

    public List<String> getTypes() {
        return new ArrayList(this.types);
    }

    @Field
    public void setTypes(List<String> list) throws TikaConfigException {
        for (String str : list) {
            try {
                TikaCoreProperties.EmbeddedResourceType.valueOf(str);
            } catch (IllegalArgumentException unused) {
                StringBuilder sb2 = new StringBuilder();
                TikaCoreProperties.EmbeddedResourceType[] embeddedResourceTypeArrValues = TikaCoreProperties.EmbeddedResourceType.values();
                int length = embeddedResourceTypeArrValues.length;
                int i10 = 0;
                int i11 = 0;
                while (i10 < length) {
                    TikaCoreProperties.EmbeddedResourceType embeddedResourceType = embeddedResourceTypeArrValues[i10];
                    int i12 = i11 + 1;
                    if (i11 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(embeddedResourceType.name());
                    i10++;
                    i11 = i12;
                }
                throw new TikaConfigException("I'm sorry. I regret I don't recognise " + str + ". I do recognize the following (case-sensitive):" + sb2.toString());
            }
        }
        this.types.addAll(list);
    }

    public ClearByAttachmentTypeMetadataFilter(Set<String> set) {
        this.types = set;
    }
}
