package org.apache.tika.metadata.filter;

import org.apache.tika.config.Field;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class GeoPointMetadataFilter extends MetadataFilter {
    String geoPointFieldName = "location";

    @Override // org.apache.tika.metadata.filter.MetadataFilter
    public void filter(Metadata metadata) {
        String str = metadata.get(TikaCoreProperties.LATITUDE);
        if (StringUtils.isEmpty(str)) {
            return;
        }
        String str2 = metadata.get(TikaCoreProperties.LONGITUDE);
        if (StringUtils.isEmpty(str2)) {
            return;
        }
        metadata.set(this.geoPointFieldName, str + "," + str2);
    }

    public String getGeoPointFieldName() {
        return this.geoPointFieldName;
    }

    @Field
    public void setGeoPointFieldName(String str) {
        this.geoPointFieldName = str;
    }
}
