package com.braze.requests.framework;

import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import fc.C4015H;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class e implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f28261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f28262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f28263c;

    public e(g gVar, h hVar, b bVar) {
        this.f28261a = gVar;
        this.f28262b = hVar;
        this.f28263c = bVar;
    }

    @Override // com.braze.requests.framework.c
    public final void a(com.braze.models.response.g apiResponse) {
        AbstractC4862t.e(apiResponse, "apiResponse");
        ReentrantLock reentrantLock = this.f28261a.f28273g;
        final h hVar = this.f28262b;
        b bVar = this.f28263c;
        reentrantLock.lock();
        try {
            final long jNowInMillisecondsSystemClock = DateTimeUtils.nowInMillisecondsSystemClock();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, g.f28264n, (BrazeLogger.Priority) null, (Throwable) null, true, new InterfaceC6082a() { // from class: o5.m
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.requests.framework.e.a(hVar, jNowInMillisecondsSystemClock);
                }
            }, 6, (Object) null);
            hVar.a(jNowInMillisecondsSystemClock, i.f28292e);
            bVar.a(jNowInMillisecondsSystemClock, hVar, apiResponse);
            C4015H c4015h = C4015H.f34254a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final String a(h hVar, long j10) {
        return "Request success received for " + hVar.a(j10);
    }

    @Override // com.braze.requests.framework.c
    public final void a(com.braze.models.response.a apiResponse) {
        BrazeLogger brazeLogger;
        AbstractC4862t.e(apiResponse, "apiResponse");
        final g gVar = this.f28261a;
        ReentrantLock reentrantLock = gVar.f28273g;
        final h hVar = this.f28262b;
        b bVar = this.f28263c;
        reentrantLock.lock();
        try {
            final long jNowInMillisecondsSystemClock = DateTimeUtils.nowInMillisecondsSystemClock();
            com.braze.models.response.g gVar2 = apiResponse instanceof com.braze.models.response.g ? (com.braze.models.response.g) apiResponse : null;
            final com.braze.models.response.d dVar = gVar2 != null ? gVar2.f28126d : null;
            BrazeLogger brazeLogger2 = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger2, g.f28264n, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: o5.n
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.requests.framework.e.a(hVar, jNowInMillisecondsSystemClock, dVar);
                }
            }, 14, (Object) null);
            hVar.a(jNowInMillisecondsSystemClock, i.f28289b);
            bVar.a(jNowInMillisecondsSystemClock, hVar, apiResponse);
            if (dVar instanceof com.braze.models.response.h) {
                gVar.f28275i = jNowInMillisecondsSystemClock;
                gVar.f28274h = ((com.braze.requests.b) ((com.braze.models.response.h) dVar).f28140a).f28226j;
                brazeLogger = brazeLogger2;
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: o5.o
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.requests.framework.e.a(gVar, hVar, jNowInMillisecondsSystemClock);
                    }
                }, 7, (Object) null);
                gVar.f28276j = jNowInMillisecondsSystemClock + g.f28265o;
            } else {
                brazeLogger = brazeLogger2;
            }
            if (dVar instanceof com.braze.models.response.e) {
                gVar.f28277k.incrementAndGet();
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: o5.p
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.requests.framework.e.a(gVar);
                    }
                }, 7, (Object) null);
            }
            C4015H c4015h = C4015H.f34254a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String a(h hVar, long j10, com.braze.models.response.d dVar) {
        return "Request failure received " + hVar.a(j10) + " \n" + dVar;
    }

    public static final String a(g gVar, h hVar, long j10) {
        return "Got failed token " + gVar.d() + " for\n " + hVar.a(j10);
    }

    public static final String a(g gVar) {
        return "Incremented invalidApiKeyErrorCounter to " + gVar.c().get();
    }
}
