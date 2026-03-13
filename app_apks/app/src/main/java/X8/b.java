package X8;

import X8.a;
import i9.EnumC4369b;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b implements a.b {
    private final WeakReference<a.b> appStateCallback;
    private final a appStateMonitor;
    private EnumC4369b currentAppState;
    private boolean isRegisteredForAppState;

    public b() {
        this(a.b());
    }

    public EnumC4369b getAppState() {
        return this.currentAppState;
    }

    public WeakReference<a.b> getAppStateCallback() {
        return this.appStateCallback;
    }

    public void incrementTsnsCount(int i10) {
        this.appStateMonitor.e(i10);
    }

    @Override // X8.a.b
    public void onUpdateAppState(EnumC4369b enumC4369b) {
        EnumC4369b enumC4369b2 = this.currentAppState;
        EnumC4369b enumC4369b3 = EnumC4369b.APPLICATION_PROCESS_STATE_UNKNOWN;
        if (enumC4369b2 == enumC4369b3) {
            this.currentAppState = enumC4369b;
        } else {
            if (enumC4369b2 == enumC4369b || enumC4369b == enumC4369b3) {
                return;
            }
            this.currentAppState = EnumC4369b.FOREGROUND_BACKGROUND;
        }
    }

    public void registerForAppState() {
        if (this.isRegisteredForAppState) {
            return;
        }
        this.currentAppState = this.appStateMonitor.a();
        this.appStateMonitor.k(this.appStateCallback);
        this.isRegisteredForAppState = true;
    }

    public void unregisterForAppState() {
        if (this.isRegisteredForAppState) {
            this.appStateMonitor.p(this.appStateCallback);
            this.isRegisteredForAppState = false;
        }
    }

    public b(a aVar) {
        this.isRegisteredForAppState = false;
        this.currentAppState = EnumC4369b.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.appStateMonitor = aVar;
        this.appStateCallback = new WeakReference<>(this);
    }
}
