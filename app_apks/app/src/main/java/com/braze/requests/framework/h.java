package com.braze.requests.framework;

import Od.v;
import com.braze.requests.o;
import com.braze.support.BrazeLogger;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f28280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f28281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f28282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i f28283d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f28284e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Integer f28285f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f28286g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f28287h;

    public h(o request, long j10, long j11) {
        i state = i.f28288a;
        AbstractC4862t.e(request, "request");
        AbstractC4862t.e(state, "state");
        this.f28280a = request;
        this.f28281b = j10;
        this.f28282c = j11;
        this.f28283d = state;
        this.f28284e = 0;
        this.f28285f = null;
        this.f28286g = j11;
    }

    public final void a(final long j10, final i newState) {
        AbstractC4862t.e(newState, "newState");
        if (this.f28283d != newState) {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.Priority priority = BrazeLogger.Priority.f28627V;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, true, new InterfaceC6082a() { // from class: o5.G
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.requests.framework.h.a(this.f41177a, newState, j10);
                }
            }, 2, (Object) null);
            this.f28286g = j10;
            this.f28283d = newState;
            if (newState == i.f28289b) {
                this.f28287h++;
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, true, new InterfaceC6082a() { // from class: o5.H
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.requests.framework.h.a(this.f41180a, j10);
                    }
                }, 2, (Object) null);
            }
        }
    }

    public static final String a(h hVar, i iVar, long j10) {
        return "Moving from " + hVar.f28283d + " -> " + iVar + " with time " + j10 + " for \n" + hVar.a(j10);
    }

    public static final String a(h hVar, long j10) {
        return "Moving to pending retry.Updated retry count: " + hVar.f28287h + " for: \n" + hVar.a(j10);
    }

    public final String a(long j10) {
        return v.p("\n            |RequestInfo for " + this.f28280a.hashCode() + " \n            | at " + j10 + "\n            | request.target = " + ((com.braze.requests.b) this.f28280a).e() + "\n            | nextAdvance = " + (this.f28281b - j10) + "\n            | createdAt = " + (this.f28282c - j10) + "\n            | state = " + this.f28283d + "\n            | lastStateMovedAt = " + (this.f28286g - j10) + "\n            | timesMovedToRetry = " + this.f28287h + "\n        ", null, 1, null);
    }
}
