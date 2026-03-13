package com.braze.managers;

import android.content.Context;
import com.braze.enums.DataStoreKey;
import com.braze.storage.b3;
import com.braze.storage.e2;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.braze.events.d f27986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b3 f27987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e2 f27988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f27989d;

    public s(Context applicationContext, com.braze.events.d eventPublisher, b3 serverConfigStorageProvider) {
        AbstractC4862t.e(applicationContext, "applicationContext");
        AbstractC4862t.e(eventPublisher, "eventPublisher");
        AbstractC4862t.e(serverConfigStorageProvider, "serverConfigStorageProvider");
        this.f27986a = eventPublisher;
        this.f27987b = serverConfigStorageProvider;
        this.f27988c = new e2(applicationContext);
    }

    public static final String c() {
        return "Publishing new messaging session event.";
    }

    public static final String d() {
        return "Messaging session not started.";
    }

    public final boolean a() {
        final long jR = this.f27987b.r();
        if (jR != -1 && !this.f27989d) {
            Long l10 = this.f27988c.readLong(DataStoreKey.MESSAGING_SESSION_END_TIMESTAMP, -1L);
            final long jLongValue = l10 != null ? l10.longValue() : -1L;
            final long jNowInSeconds = DateTimeUtils.nowInSeconds();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.n3
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.managers.s.a(jR, jNowInSeconds, jLongValue);
                }
            }, 7, (Object) null);
            if (jLongValue + jR < jNowInSeconds) {
                return true;
            }
        }
        return false;
    }

    public final void b() {
        if (!a()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.m3
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.managers.s.d();
                }
            }, 7, (Object) null);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.l3
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.managers.s.c();
            }
        }, 7, (Object) null);
        this.f27986a.b(com.braze.events.internal.n.f27741a, com.braze.events.internal.n.class);
        this.f27989d = true;
    }

    public final void e() {
        final long jNowInSeconds = DateTimeUtils.nowInSeconds();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.k3
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.managers.s.a(jNowInSeconds);
            }
        }, 7, (Object) null);
        this.f27988c.writeData(DataStoreKey.MESSAGING_SESSION_END_TIMESTAMP, Long.valueOf(jNowInSeconds));
        this.f27989d = false;
    }

    public static final String a(long j10, long j11, long j12) {
        return "Messaging session timeout: " + j10 + ", current diff: " + (j11 - j12);
    }

    public static final String a(long j10) {
        return "Messaging session stopped. Adding new messaging session timestamp: " + j10;
    }
}
