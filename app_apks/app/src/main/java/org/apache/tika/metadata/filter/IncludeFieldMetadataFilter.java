package org.apache.tika.metadata.filter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.apache.tika.config.Field;
import org.apache.tika.metadata.Metadata;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class IncludeFieldMetadataFilter extends MetadataFilter {
    private final Set<String> includeSet;

    public IncludeFieldMetadataFilter() {
        this(new HashSet());
    }

    @Override // org.apache.tika.metadata.filter.MetadataFilter
    public void filter(Metadata metadata) {
        for (String str : metadata.names()) {
            if (!this.includeSet.contains(str)) {
                metadata.remove(str);
            }
        }
    }

    public List<String> getInclude() {
        return new ArrayList(this.includeSet);
    }

    @Field
    public void setInclude(List<String> list) {
        this.includeSet.addAll(list);
    }

    public IncludeFieldMetadataFilter(Set<String> set) {
        this.includeSet = set;
    }
}
