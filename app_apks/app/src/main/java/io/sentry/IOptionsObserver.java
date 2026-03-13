package io.sentry;

import io.sentry.protocol.SdkVersion;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface IOptionsObserver {
    void setDist(String str);

    void setEnvironment(String str);

    void setProguardUuid(String str);

    void setRelease(String str);

    void setReplayErrorSampleRate(Double d10);

    void setSdkVersion(SdkVersion sdkVersion);

    void setTags(Map<String, String> map);
}
