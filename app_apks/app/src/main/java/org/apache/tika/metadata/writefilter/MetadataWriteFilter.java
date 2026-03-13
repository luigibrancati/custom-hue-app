package org.apache.tika.metadata.writefilter;

import java.io.Serializable;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface MetadataWriteFilter extends Serializable {
    void add(String str, String str2, Map<String, String[]> map);

    void filterExisting(Map<String, String[]> map);

    void set(String str, String str2, Map<String, String[]> map);
}
