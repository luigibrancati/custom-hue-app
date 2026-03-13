package org.apache.tika.metadata.filter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.apache.tika.config.Field;
import org.apache.tika.metadata.Metadata;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class ExcludeFieldMetadataFilter extends MetadataFilter {
    private final Set<String> excludeSet;

    public ExcludeFieldMetadataFilter() {
        this(new HashSet());
    }

    @Override // org.apache.tika.metadata.filter.MetadataFilter
    public void filter(Metadata metadata) {
        Iterator<String> it = this.excludeSet.iterator();
        while (it.hasNext()) {
            metadata.remove(it.next());
        }
    }

    public List<String> getExclude() {
        return new ArrayList(this.excludeSet);
    }

    @Field
    public void setExclude(List<String> list) {
        this.excludeSet.addAll(list);
    }

    public ExcludeFieldMetadataFilter(Set<String> set) {
        this.excludeSet = set;
    }
}
