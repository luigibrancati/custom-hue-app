package org.apache.tika.metadata.filter;

import java.util.LinkedHashMap;
import java.util.Map;
import org.apache.tika.config.Field;
import org.apache.tika.metadata.Metadata;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class FieldNameMappingFilter extends MetadataFilter {
    Map<String, String> mappings = new LinkedHashMap();
    boolean excludeUnmapped = true;

    @Override // org.apache.tika.metadata.filter.MetadataFilter
    public void filter(Metadata metadata) {
        if (!this.excludeUnmapped) {
            for (String str : metadata.names()) {
                if (this.mappings.containsKey(str)) {
                    String[] values = metadata.getValues(str);
                    metadata.remove(str);
                    for (String str2 : values) {
                        metadata.add(this.mappings.get(str), str2);
                    }
                }
            }
            return;
        }
        for (String str3 : metadata.names()) {
            if (this.mappings.containsKey(str3)) {
                String[] values2 = metadata.getValues(str3);
                metadata.remove(str3);
                for (String str4 : values2) {
                    metadata.add(this.mappings.get(str3), str4);
                }
            } else {
                metadata.remove(str3);
            }
        }
    }

    public Map<String, String> getMappins() {
        return this.mappings;
    }

    @Field
    public void setExcludeUnmapped(boolean z10) {
        this.excludeUnmapped = z10;
    }

    @Field
    public void setMappings(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            this.mappings.put(entry.getKey(), entry.getValue());
        }
    }

    public String toString() {
        return "FieldNameMappingFilter{mappings=" + String.valueOf(this.mappings) + ", excludeUnmapped=" + this.excludeUnmapped + "}";
    }
}
