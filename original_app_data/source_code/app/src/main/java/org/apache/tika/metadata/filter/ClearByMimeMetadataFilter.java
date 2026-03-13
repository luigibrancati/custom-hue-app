package org.apache.tika.metadata.filter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.apache.tika.config.Field;
import org.apache.tika.metadata.HttpHeaders;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.mime.MediaType;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class ClearByMimeMetadataFilter extends MetadataFilter {
    private final Set<String> mimes;

    public ClearByMimeMetadataFilter() {
        this(new HashSet());
    }

    @Override // org.apache.tika.metadata.filter.MetadataFilter
    public void filter(Metadata metadata) {
        String string = metadata.get(HttpHeaders.CONTENT_TYPE);
        if (string == null) {
            return;
        }
        MediaType mediaType = MediaType.parse(string);
        if (mediaType != null) {
            string = mediaType.getBaseType().toString();
        }
        if (this.mimes.contains(string)) {
            for (String str : metadata.names()) {
                metadata.remove(str);
            }
        }
    }

    public List<String> getMimes() {
        return new ArrayList(this.mimes);
    }

    @Field
    public void setMimes(List<String> list) {
        this.mimes.addAll(list);
    }

    public ClearByMimeMetadataFilter(Set<String> set) {
        this.mimes = set;
    }
}
