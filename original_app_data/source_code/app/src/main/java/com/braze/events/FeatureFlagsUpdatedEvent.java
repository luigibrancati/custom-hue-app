package com.braze.events;

import com.braze.models.FeatureFlag;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/braze/events/FeatureFlagsUpdatedEvent;", "", "", "Lcom/braze/models/FeatureFlag;", "featureFlags", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getFeatureFlags", "()Ljava/util/List;", "Companion", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FeatureFlagsUpdatedEvent {
    private final List<FeatureFlag> featureFlags;

    public FeatureFlagsUpdatedEvent(List<FeatureFlag> featureFlags) {
        AbstractC4862t.e(featureFlags, "featureFlags");
        this.featureFlags = featureFlags;
    }

    public final List<FeatureFlag> getFeatureFlags() {
        return this.featureFlags;
    }

    public String toString() {
        return "FeatureFlagsUpdatedEvent{flag count=" + this.featureFlags.size() + "}";
    }
}
