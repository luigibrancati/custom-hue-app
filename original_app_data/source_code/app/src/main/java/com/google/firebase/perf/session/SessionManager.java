package com.google.firebase.perf.session;

import X8.a;
import X8.b;
import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import f9.C4003a;
import f9.InterfaceC4004b;
import i9.EnumC4369b;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@Keep
public class SessionManager extends b {

    @SuppressLint({"StaticFieldLeak"})
    private static final SessionManager instance = new SessionManager();
    private final a appStateMonitor;
    private final Set<WeakReference<InterfaceC4004b>> clients;
    private final GaugeManager gaugeManager;
    private C4003a perfSession;
    private Future syncInitFuture;

    private SessionManager() {
        this(GaugeManager.getInstance(), C4003a.c(UUID.randomUUID().toString()), a.b());
    }

    public static /* synthetic */ void b(SessionManager sessionManager, Context context, C4003a c4003a) {
        sessionManager.gaugeManager.initializeGaugeMetadataManager(context);
        if (c4003a.e()) {
            sessionManager.gaugeManager.logGaugeMetadata(c4003a.h(), EnumC4369b.FOREGROUND);
        }
    }

    public static SessionManager getInstance() {
        return instance;
    }

    private void logGaugeMetadataIfCollectionEnabled(EnumC4369b enumC4369b) {
        if (this.perfSession.e()) {
            this.gaugeManager.logGaugeMetadata(this.perfSession.h(), enumC4369b);
        }
    }

    private void startOrStopCollectingGauges(EnumC4369b enumC4369b) {
        if (this.perfSession.e()) {
            this.gaugeManager.startCollectingGauges(this.perfSession, enumC4369b);
        } else {
            this.gaugeManager.stopCollectingGauges();
        }
    }

    public Future getSyncInitFuture() {
        return this.syncInitFuture;
    }

    public void initializeGaugeCollection() {
        EnumC4369b enumC4369b = EnumC4369b.FOREGROUND;
        logGaugeMetadataIfCollectionEnabled(enumC4369b);
        startOrStopCollectingGauges(enumC4369b);
    }

    @Override // X8.b, X8.a.b
    public void onUpdateAppState(EnumC4369b enumC4369b) {
        super.onUpdateAppState(enumC4369b);
        if (this.appStateMonitor.f()) {
            return;
        }
        if (enumC4369b == EnumC4369b.FOREGROUND) {
            updatePerfSession(C4003a.c(UUID.randomUUID().toString()));
        } else if (this.perfSession.f()) {
            updatePerfSession(C4003a.c(UUID.randomUUID().toString()));
        } else {
            startOrStopCollectingGauges(enumC4369b);
        }
    }

    public final C4003a perfSession() {
        return this.perfSession;
    }

    public void registerForSessionUpdates(WeakReference<InterfaceC4004b> weakReference) {
        synchronized (this.clients) {
            this.clients.add(weakReference);
        }
    }

    public void setApplicationContext(final Context context) {
        final C4003a c4003a = this.perfSession;
        this.syncInitFuture = Executors.newSingleThreadExecutor().submit(new Runnable() { // from class: f9.c
            @Override // java.lang.Runnable
            public final void run() {
                SessionManager.b(this.f34233a, context, c4003a);
            }
        });
    }

    public void setPerfSession(C4003a c4003a) {
        this.perfSession = c4003a;
    }

    public void stopGaugeCollectionIfSessionRunningTooLong() {
        if (this.perfSession.f()) {
            this.gaugeManager.stopCollectingGauges();
        }
    }

    public void unregisterForSessionUpdates(WeakReference<InterfaceC4004b> weakReference) {
        synchronized (this.clients) {
            this.clients.remove(weakReference);
        }
    }

    public void updatePerfSession(C4003a c4003a) {
        if (c4003a.h() == this.perfSession.h()) {
            return;
        }
        this.perfSession = c4003a;
        synchronized (this.clients) {
            try {
                Iterator<WeakReference<InterfaceC4004b>> it = this.clients.iterator();
                while (it.hasNext()) {
                    InterfaceC4004b interfaceC4004b = it.next().get();
                    if (interfaceC4004b != null) {
                        interfaceC4004b.a(c4003a);
                    } else {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        logGaugeMetadataIfCollectionEnabled(this.appStateMonitor.a());
        startOrStopCollectingGauges(this.appStateMonitor.a());
    }

    public SessionManager(GaugeManager gaugeManager, C4003a c4003a, a aVar) {
        this.clients = new HashSet();
        this.gaugeManager = gaugeManager;
        this.perfSession = c4003a;
        this.appStateMonitor = aVar;
        registerForAppState();
    }
}
