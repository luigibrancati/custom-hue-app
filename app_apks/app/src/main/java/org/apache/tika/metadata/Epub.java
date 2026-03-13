package org.apache.tika.metadata;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface Epub {
    public static final String EPUB_PREFIX = "epub:";
    public static final Property RENDITION_LAYOUT = Property.externalClosedChoise("epub:rendition:layout", "pre-paginated", "reflowable");
    public static final Property VERSION = Property.externalText("epub:version");
}
