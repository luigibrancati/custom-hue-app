package org.apache.tika.extractor;

import org.apache.tika.metadata.Metadata;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface EmbeddedBytesSelector {
    public static final EmbeddedBytesSelector ACCEPT_ALL = new AcceptAll();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class AcceptAll implements EmbeddedBytesSelector {
        @Override // org.apache.tika.extractor.EmbeddedBytesSelector
        public boolean select(Metadata metadata) {
            return true;
        }
    }

    boolean select(Metadata metadata);
}
