package org.apache.tika.metadata.filter;

import org.apache.tika.metadata.Metadata;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class NoOpFilter extends MetadataFilter {
    public static final NoOpFilter NOOP_FILTER = new NoOpFilter();

    @Override // org.apache.tika.metadata.filter.MetadataFilter
    public void filter(Metadata metadata) {
    }
}
