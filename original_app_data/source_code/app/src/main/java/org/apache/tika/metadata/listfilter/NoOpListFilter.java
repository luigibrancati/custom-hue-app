package org.apache.tika.metadata.listfilter;

import java.util.List;
import org.apache.tika.metadata.Metadata;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class NoOpListFilter extends MetadataListFilter {
    @Override // org.apache.tika.metadata.listfilter.MetadataListFilter
    public List<Metadata> filter(List<Metadata> list) {
        return list;
    }
}
