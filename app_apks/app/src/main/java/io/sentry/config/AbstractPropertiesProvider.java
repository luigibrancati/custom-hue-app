package io.sentry.config;

import io.sentry.util.Objects;
import io.sentry.util.StringUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
abstract class AbstractPropertiesProvider implements PropertiesProvider {
    private final String prefix;
    private final Properties properties;

    public AbstractPropertiesProvider(String str, Properties properties) {
        this.prefix = (String) Objects.requireNonNull(str, "prefix is required");
        this.properties = (Properties) Objects.requireNonNull(properties, "properties are required");
    }

    @Override // io.sentry.config.PropertiesProvider
    public Map<String, String> getMap(String str) {
        String str2 = this.prefix + str + ".";
        HashMap map = new HashMap();
        for (Map.Entry entry : this.properties.entrySet()) {
            if ((entry.getKey() instanceof String) && (entry.getValue() instanceof String)) {
                String str3 = (String) entry.getKey();
                if (str3.startsWith(str2)) {
                    map.put(str3.substring(str2.length()), StringUtils.removeSurrounding((String) entry.getValue(), "\""));
                }
            }
        }
        return map;
    }

    @Override // io.sentry.config.PropertiesProvider
    public String getProperty(String str) {
        return StringUtils.removeSurrounding(this.properties.getProperty(this.prefix + str), "\"");
    }

    public AbstractPropertiesProvider(Properties properties) {
        this("", properties);
    }
}
