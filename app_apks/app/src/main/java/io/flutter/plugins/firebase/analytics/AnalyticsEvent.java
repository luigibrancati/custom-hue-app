package io.flutter.plugins.firebase.analytics;

import gc.C4206t;
import io.sentry.protocol.Request;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u001a\b\u0002\u0010\u0004\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u001b\u0010\u0014\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0005HÆ\u0003J/\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u001a\b\u0002\u0010\u0004\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0005HÆ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR#\u0010\u0004\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Lio/flutter/plugins/firebase/analytics/AnalyticsEvent;", "", "name", "", Constants.PARAMETERS, "", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "getName", "()Ljava/lang/String;", "getParameters", "()Ljava/util/Map;", "toList", "", "equals", "", Request.JsonKeys.OTHER, "hashCode", "", "component1", "component2", "copy", "toString", "Companion", "firebase_analytics_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AnalyticsEvent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String name;
    private final Map<String, Object> parameters;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\b"}, d2 = {"Lio/flutter/plugins/firebase/analytics/AnalyticsEvent$Companion;", "", "<init>", "()V", "fromList", "Lio/flutter/plugins/firebase/analytics/AnalyticsEvent;", "pigeonVar_list", "", "firebase_analytics_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4854k abstractC4854k) {
            this();
        }

        public final AnalyticsEvent fromList(List<? extends Object> pigeonVar_list) {
            AbstractC4862t.e(pigeonVar_list, "pigeonVar_list");
            Object obj = pigeonVar_list.get(0);
            AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.String");
            return new AnalyticsEvent((String) obj, (Map) pigeonVar_list.get(1));
        }

        private Companion() {
        }
    }

    public AnalyticsEvent(String name, Map<String, ? extends Object> map) {
        AbstractC4862t.e(name, "name");
        this.name = name;
        this.parameters = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AnalyticsEvent copy$default(AnalyticsEvent analyticsEvent, String str, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = analyticsEvent.name;
        }
        if ((i10 & 2) != 0) {
            map = analyticsEvent.parameters;
        }
        return analyticsEvent.copy(str, map);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final Map<String, Object> component2() {
        return this.parameters;
    }

    public final AnalyticsEvent copy(String name, Map<String, ? extends Object> parameters) {
        AbstractC4862t.e(name, "name");
        return new AnalyticsEvent(name, parameters);
    }

    public boolean equals(Object other) {
        if (!(other instanceof AnalyticsEvent)) {
            return false;
        }
        if (this == other) {
            return true;
        }
        return GeneratedAndroidFirebaseAnalyticsPigeonUtils.INSTANCE.deepEquals(toList(), ((AnalyticsEvent) other).toList());
    }

    public final String getName() {
        return this.name;
    }

    public final Map<String, Object> getParameters() {
        return this.parameters;
    }

    public int hashCode() {
        return toList().hashCode();
    }

    public final List<Object> toList() {
        return C4206t.n(this.name, this.parameters);
    }

    public String toString() {
        return "AnalyticsEvent(name=" + this.name + ", parameters=" + this.parameters + ")";
    }

    public /* synthetic */ AnalyticsEvent(String str, Map map, int i10, AbstractC4854k abstractC4854k) {
        this(str, (i10 & 2) != 0 ? null : map);
    }
}
