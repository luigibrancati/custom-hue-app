package io.sentry.android.core.performance;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class ActivityLifecycleTimeSpan implements Comparable<ActivityLifecycleTimeSpan> {
    private final TimeSpan onCreate = new TimeSpan();
    private final TimeSpan onStart = new TimeSpan();

    public final TimeSpan getOnCreate() {
        return this.onCreate;
    }

    public final TimeSpan getOnStart() {
        return this.onStart;
    }

    @Override // java.lang.Comparable
    public int compareTo(ActivityLifecycleTimeSpan activityLifecycleTimeSpan) {
        int iCompare = Long.compare(this.onCreate.getStartUptimeMs(), activityLifecycleTimeSpan.onCreate.getStartUptimeMs());
        return iCompare == 0 ? Long.compare(this.onStart.getStartUptimeMs(), activityLifecycleTimeSpan.onStart.getStartUptimeMs()) : iCompare;
    }
}
