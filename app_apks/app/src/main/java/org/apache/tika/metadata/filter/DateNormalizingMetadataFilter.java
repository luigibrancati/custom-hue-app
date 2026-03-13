package org.apache.tika.metadata.filter;

import af.c;
import af.e;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.util.Locale;
import java.util.TimeZone;
import org.apache.tika.config.Field;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.Property;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class DateNormalizingMetadataFilter extends MetadataFilter {
    private TimeZone defaultTimeZone = UTC;
    private static TimeZone UTC = TimeZone.getTimeZone("UTC");
    private static final c LOGGER = e.l(DateNormalizingMetadataFilter.class);

    @Override // org.apache.tika.metadata.filter.MetadataFilter
    public void filter(Metadata metadata) {
        SimpleDateFormat simpleDateFormat = null;
        SimpleDateFormat simpleDateFormat2 = null;
        for (String str : metadata.names()) {
            Property property = Property.get(str);
            if (property != null && property.getValueType().equals(Property.ValueType.DATE)) {
                String str2 = metadata.get(property);
                if (!str2.endsWith("Z")) {
                    if (simpleDateFormat == null) {
                        Locale locale = Locale.US;
                        simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", locale);
                        simpleDateFormat.setTimeZone(this.defaultTimeZone);
                        SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", locale);
                        simpleDateFormat3.setTimeZone(UTC);
                        simpleDateFormat2 = simpleDateFormat3;
                    }
                    try {
                        metadata.set(property, simpleDateFormat2.format(simpleDateFormat.parse(str2)));
                    } catch (ParseException unused) {
                        LOGGER.c("Couldn't convert date to default time zone: >" + str2 + "<");
                    }
                }
            }
        }
    }

    public String getDefaultTimeZone() {
        return this.defaultTimeZone.toZoneId().toString();
    }

    @Field
    public void setDefaultTimeZone(String str) {
        this.defaultTimeZone = TimeZone.getTimeZone(ZoneId.of(str));
    }
}
