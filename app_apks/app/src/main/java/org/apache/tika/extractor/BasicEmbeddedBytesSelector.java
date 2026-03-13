package org.apache.tika.extractor;

import java.util.Set;
import org.apache.tika.metadata.HttpHeaders;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.mime.MediaType;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class BasicEmbeddedBytesSelector implements EmbeddedBytesSelector {
    private final Set<String> excludeEmbeddedResourceTypes;
    private final Set<String> excludeMimes;
    private final Set<String> includeEmbeddedResourceTypes;
    private final Set<String> includeMimes;

    public BasicEmbeddedBytesSelector(Set<String> set, Set<String> set2, Set<String> set3, Set<String> set4) {
        this.includeMimes = set;
        this.excludeMimes = set2;
        this.includeEmbeddedResourceTypes = set3;
        this.excludeEmbeddedResourceTypes = set4;
    }

    @Override // org.apache.tika.extractor.EmbeddedBytesSelector
    public boolean select(Metadata metadata) {
        MediaType mediaType;
        String str = metadata.get(HttpHeaders.CONTENT_TYPE);
        if (str == null) {
            str = "";
        } else if ((this.includeMimes.size() > 0 || this.excludeMimes.size() > 0) && (mediaType = MediaType.parse(str)) != null) {
            str = mediaType.getType() + "/" + mediaType.getSubtype();
        }
        if (this.excludeMimes.contains(str)) {
            return false;
        }
        if (this.includeMimes.size() > 0 && !this.includeMimes.contains(str)) {
            return false;
        }
        String str2 = metadata.get(TikaCoreProperties.EMBEDDED_RESOURCE_TYPE);
        if (StringUtils.isBlank(str2)) {
            str2 = "ATTACHMENT";
        }
        return !this.excludeEmbeddedResourceTypes.contains(str2) && this.includeEmbeddedResourceTypes.size() > 0 && this.includeEmbeddedResourceTypes.contains(str2);
    }
}
