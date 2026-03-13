package com.braze.communication.dust;

import Rd.M;
import com.braze.managers.d0;
import com.braze.managers.e0;
import com.braze.managers.f0;
import fc.C4015H;
import java.io.IOException;
import java.net.HttpURLConnection;
import kotlin.jvm.internal.L;
import lc.InterfaceC4988e;
import nc.m;
import vc.p;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class h extends m implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public L f27547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public L f27548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f27549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f27550d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f27551e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f0 f27552f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e0 f27553g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ d0 f27554h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f27555i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, f0 f0Var, e0 e0Var, d0 d0Var, String str, InterfaceC4988e interfaceC4988e) {
        super(2, interfaceC4988e);
        this.f27551e = iVar;
        this.f27552f = f0Var;
        this.f27553g = e0Var;
        this.f27554h = d0Var;
        this.f27555i = str;
    }

    public static final String a(String str) {
        return "Starting DUST stream to " + str;
    }

    public static final String b(L l10) throws IOException {
        return "DUST stream connection failed with response code " + ((HttpURLConnection) l10.f39776a).getResponseCode();
    }

    public static final String c() {
        return "Stream connection job cancelled";
    }

    public static final String d() {
        return "Closing stream connection data";
    }

    public static final String e() {
        return "Stream job finished";
    }

    @Override // nc.AbstractC5157a
    public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
        h hVar = new h(this.f27551e, this.f27552f, this.f27553g, this.f27554h, this.f27555i, interfaceC4988e);
        hVar.f27550d = obj;
        return hVar;
    }

    @Override // vc.p
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((M) obj, (InterfaceC4988e) obj2)).invokeSuspend(C4015H.f34254a);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0168 A[Catch: all -> 0x011b, TryCatch #5 {all -> 0x011b, blocks: (B:7:0x0019, B:32:0x0107, B:45:0x0162, B:47:0x0168, B:49:0x018d, B:48:0x017b), top: B:63:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x017b A[Catch: all -> 0x011b, TryCatch #5 {all -> 0x011b, blocks: (B:7:0x0019, B:32:0x0107, B:45:0x0162, B:47:0x0168, B:49:0x018d, B:48:0x017b), top: B:63:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01aa A[PHI: r0
      0x01aa: PHI (r0v12 java.net.HttpURLConnection) = (r0v10 java.net.HttpURLConnection), (r0v16 java.net.HttpURLConnection) binds: [B:51:0x01a8, B:40:0x0157] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // nc.AbstractC5157a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 484
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.communication.dust.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public static final String a(L l10) throws IOException {
        return "DUST stream response code " + ((HttpURLConnection) l10.f39776a).getResponseCode();
    }

    public static final String b() {
        return "Caught unexpected exception listening to DUST stream";
    }

    public static final String a() {
        return "Stream job coroutine no longer active";
    }
}
