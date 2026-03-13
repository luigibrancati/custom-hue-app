package com.braze.communication.dust;

import Rd.AbstractC2130h;
import Rd.AbstractC2132i;
import Rd.InterfaceC2166z0;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.managers.d0;
import com.braze.managers.e0;
import com.braze.managers.f0;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.JsonUtils;
import io.sentry.HttpStatusCodeRange;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.L;
import org.json.JSONObject;
import vc.InterfaceC6082a;
import vc.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class i implements j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f27556d = BrazeLogger.getBrazeLogTag((Class<?>) i.class);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Bc.f f27557e = new Bc.f(200, 299);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Bc.f f27558f = new Bc.f(400, 499);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Bc.f f27559g = new Bc.f(500, HttpStatusCodeRange.DEFAULT_MAX);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InterfaceC2166z0 f27560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f27561b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicLong f27562c = new AtomicLong(DateTimeUtils.nowInMilliseconds());

    public static final String a(i iVar) {
        return "Got call to endStream(). Stream job: " + iVar.f27560a;
    }

    public static final String c(i iVar) {
        return "Not restarting stream since " + iVar.f27560a + " is still active.";
    }

    public static final String d(String str) {
        return "Got call to startStream() for url " + str;
    }

    public final void b() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: U4.u
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.communication.dust.i.a(this.f16619a);
            }
        }, 7, (Object) null);
        InterfaceC2166z0 interfaceC2166z0 = this.f27560a;
        if (interfaceC2166z0 != null) {
            InterfaceC2166z0.a.a(interfaceC2166z0, null, 1, null);
        }
        this.f27560a = null;
    }

    public static final String c(String str) {
        return "Failed to parse data line:\n" + str;
    }

    public static final String d(i iVar) {
        return "Started stream job " + iVar.f27560a;
    }

    public final void a(final String url, d0 ingestor, e0 onConnectionSuccess, f0 onConnectionFailed, boolean z10) {
        InterfaceC2166z0 interfaceC2166z0;
        AbstractC4862t.e(url, "url");
        AbstractC4862t.e(ingestor, "ingestor");
        AbstractC4862t.e(onConnectionSuccess, "onConnectionSuccess");
        AbstractC4862t.e(onConnectionFailed, "onConnectionFailed");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: U4.v
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.communication.dust.i.d(url);
            }
        }, 7, (Object) null);
        if (z10 && (interfaceC2166z0 = this.f27560a) != null && interfaceC2166z0.c()) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: U4.w
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.communication.dust.i.c(this.f16621a);
                }
            }, 7, (Object) null);
            return;
        }
        AbstractC2130h.b(null, new f(this, null), 1, null);
        this.f27560a = AbstractC2132i.d(BrazeCoroutineScope.INSTANCE, null, null, new h(this, onConnectionFailed, onConnectionSuccess, ingestor, url, null), 3, null);
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: U4.x
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.communication.dust.i.d(this.f16622a);
            }
        }, 7, (Object) null);
    }

    public static final String b(L l10) {
        return "Recorded data type: " + l10.f39776a;
    }

    public static final String b(String str) {
        return "Got un-actionable stream line:\n" + str;
    }

    public static final String b(i iVar) {
        return "Got call to endStreamAndJoin(). Stream job: " + iVar.f27560a;
    }

    public static final String b(String str, String str2) {
        return "Not handling event: '" + str + "' and data: '" + str2 + "'";
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0097 -> B:21:0x009d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(Rd.M r21, Td.x r22, com.braze.managers.d0 r23, nc.AbstractC5160d r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.communication.dust.i.a(Rd.M, Td.x, com.braze.managers.d0, nc.d):java.lang.Object");
    }

    public static final String a() {
        return "Waiting to consume new line";
    }

    public static final String a(String str) {
        return "Received new line: '" + str + "'";
    }

    public static final String a(L l10) {
        return "Recorded event type: " + l10.f39776a;
    }

    public static final String a(L l10, L l11) {
        return "Handling full event on blank line. lastEventType: '" + l10.f39776a + "' \ndata: '" + l11.f39776a + "'";
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006a, code lost:
    
        if (Rd.X.a(50, r0) != r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(nc.AbstractC5160d r14) throws java.lang.Throwable {
        /*
            r13 = this;
            boolean r0 = r14 instanceof com.braze.communication.dust.c
            if (r0 == 0) goto L13
            r0 = r14
            com.braze.communication.dust.c r0 = (com.braze.communication.dust.c) r0
            int r1 = r0.f27536d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27536d = r1
            goto L18
        L13:
            com.braze.communication.dust.c r0 = new com.braze.communication.dust.c
            r0.<init>(r13, r14)
        L18:
            java.lang.Object r14 = r0.f27534b
            java.lang.Object r1 = mc.C5046c.f()
            int r2 = r0.f27536d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            com.braze.communication.dust.i r13 = r0.f27533a
            fc.AbstractC4036s.b(r14)
            goto L6d
        L2e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L36:
            com.braze.communication.dust.i r13 = r0.f27533a
            fc.AbstractC4036s.b(r14)
            goto L60
        L3c:
            fc.AbstractC4036s.b(r14)
            com.braze.support.BrazeLogger r5 = com.braze.support.BrazeLogger.INSTANCE
            java.lang.String r6 = com.braze.communication.dust.i.f27556d
            U4.y r10 = new U4.y
            r10.<init>()
            r11 = 14
            r12 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            com.braze.support.BrazeLogger.brazelog$default(r5, r6, r7, r8, r9, r10, r11, r12)
            Rd.z0 r14 = r13.f27560a
            if (r14 == 0) goto L6d
            r0.f27533a = r13
            r0.f27536d = r4
            java.lang.Object r14 = Rd.C0.d(r14, r0)
            if (r14 != r1) goto L60
            goto L6c
        L60:
            r0.f27533a = r13
            r0.f27536d = r3
            r2 = 50
            java.lang.Object r14 = Rd.X.a(r2, r0)
            if (r14 != r1) goto L6d
        L6c:
            return r1
        L6d:
            r14 = 0
            r13.f27560a = r14
            fc.H r13 = fc.C4015H.f34254a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.communication.dust.i.a(nc.d):java.lang.Object");
    }

    public static void a(final String eventType, final String data, l ingestor) {
        AbstractC4862t.e(eventType, "eventType");
        AbstractC4862t.e(data, "data");
        AbstractC4862t.e(ingestor, "ingestor");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        String str = f27556d;
        BrazeLogger.brazelog$default(brazeLogger, str, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: U4.k
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.communication.dust.i.a(eventType, data);
            }
        }, 14, (Object) null);
        if (AbstractC4862t.a(eventType, "msg")) {
            try {
                final JSONObject jSONObject = new JSONObject(data);
                BrazeLogger.brazelog$default(brazeLogger, str, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: U4.r
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.communication.dust.i.a(jSONObject);
                    }
                }, 14, (Object) null);
                ingestor.invoke(com.braze.models.dust.e.f28046a.a(jSONObject));
                return;
            } catch (Exception e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f27556d, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: U4.s
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.communication.dust.i.c(data);
                    }
                }, 8, (Object) null);
                return;
            }
        }
        BrazeLogger.brazelog$default(brazeLogger, str, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: U4.t
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.communication.dust.i.b(eventType, data);
            }
        }, 14, (Object) null);
    }

    public static final String a(String str, String str2) {
        return "Got event '" + str + "' and data: '" + str2 + "'";
    }

    public static final String a(JSONObject jSONObject) {
        return "Parsed dust message json to:\n" + JsonUtils.getPrettyPrintedString(jSONObject);
    }

    public final void a(final boolean z10) {
        this.f27561b.set(z10);
        this.f27562c.set(z10 ? DateTimeUtils.nowInMilliseconds() : 0L);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f27556d, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: U4.z
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.communication.dust.i.a(z10, this);
            }
        }, 12, (Object) null);
    }

    public static final String a(boolean z10, i iVar) {
        return "Set stream listening state to " + z10 + " and stream listen started at " + iVar.f27562c;
    }
}
