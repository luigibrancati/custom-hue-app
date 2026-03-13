package org.apache.tika.metadata.filter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.tika.metadata.Metadata;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class CompositeMetadataFilter extends MetadataFilter {
    private List<MetadataFilter> filters;

    public CompositeMetadataFilter() {
        this.filters = new ArrayList();
    }

    @Override // org.apache.tika.metadata.filter.MetadataFilter
    public void filter(Metadata metadata) {
        Iterator<MetadataFilter> it = this.filters.iterator();
        while (it.hasNext()) {
            it.next().filter(metadata);
        }
    }

    public List<MetadataFilter> getFilters() {
        return this.filters;
    }

    public void setFilters(List<MetadataFilter> list) {
        this.filters.clear();
        this.filters.addAll(list);
    }

    public String toString() {
        return "CompositeMetadataFilter{filters=" + String.valueOf(this.filters) + "}";
    }

    public CompositeMetadataFilter(List<MetadataFilter> list) {
        this.filters = list;
    }
}
