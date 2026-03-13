package io.sentry;

import io.sentry.protocol.SentryId;
import io.sentry.util.CollectionUtils;
import io.sentry.util.Objects;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class ProfileContext implements JsonUnknown, JsonSerializable {
    public static final String TYPE = "profile";
    private SentryId profilerId;
    private Map<String, Object> unknown;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Deserializer implements JsonDeserializer<ProfileContext> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public ProfileContext deserialize(ObjectReader objectReader, ILogger iLogger) {
            objectReader.beginObject();
            ProfileContext profileContext = new ProfileContext();
            ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == JsonToken.NAME) {
                String strNextName = objectReader.nextName();
                strNextName.getClass();
                if (strNextName.equals("profiler_id")) {
                    SentryId sentryId = (SentryId) objectReader.nextOrNull(iLogger, new SentryId.Deserializer());
                    if (sentryId != null) {
                        profileContext.profilerId = sentryId;
                    }
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                }
            }
            profileContext.setUnknown(concurrentHashMap);
            objectReader.endObject();
            return profileContext;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class JsonKeys {
        public static final String PROFILER_ID = "profiler_id";
    }

    public ProfileContext() {
        this(SentryId.EMPTY_ID);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProfileContext) {
            return this.profilerId.equals(((ProfileContext) obj).profilerId);
        }
        return false;
    }

    public SentryId getProfilerId() {
        return this.profilerId;
    }

    @Override // io.sentry.JsonUnknown
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    public int hashCode() {
        return Objects.hash(this.profilerId);
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(ObjectWriter objectWriter, ILogger iLogger) {
        objectWriter.beginObject();
        objectWriter.name("profiler_id").value(iLogger, this.profilerId);
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                objectWriter.name(str).value(iLogger, this.unknown.get(str));
            }
        }
        objectWriter.endObject();
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }

    public ProfileContext(SentryId sentryId) {
        this.profilerId = sentryId;
    }

    public ProfileContext(ProfileContext profileContext) {
        this.profilerId = profileContext.profilerId;
        Map<String, Object> mapNewConcurrentHashMap = CollectionUtils.newConcurrentHashMap(profileContext.unknown);
        if (mapNewConcurrentHashMap != null) {
            this.unknown = mapNewConcurrentHashMap;
        }
    }
}
