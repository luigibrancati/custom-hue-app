package com.google.android.gms.common.internal;

import J6.o;
import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.Objects;
import s6.C5783b;
import v6.M;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class h extends o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f29100b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(a aVar, Looper looper) {
        super(looper);
        Objects.requireNonNull(aVar);
        this.f29100b = aVar;
    }

    public static final void a(Message message) {
        M m10 = (M) message.obj;
        if (m10 != null) {
            m10.c();
        }
    }

    public static final boolean b(Message message) {
        int i10 = message.what;
        return i10 == 2 || i10 == 1 || i10 == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        a aVar = this.f29100b;
        if (aVar.f29044D.get() != message.arg1) {
            if (b(message)) {
                a(message);
                return;
            }
            return;
        }
        int i10 = message.what;
        if ((i10 == 1 || i10 == 7 || ((i10 == 4 && !aVar.s()) || message.what == 5)) && !aVar.b()) {
            a(message);
            return;
        }
        int i11 = message.what;
        if (i11 == 4) {
            aVar.g0(new C5783b(message.arg2));
            if (aVar.Z() && !aVar.h0()) {
                aVar.W(3, null);
                return;
            }
            C5783b c5783bF0 = aVar.f0() != null ? aVar.f0() : new C5783b(8);
            aVar.f29060p.a(c5783bF0);
            aVar.K(c5783bF0);
            return;
        }
        if (i11 == 5) {
            C5783b c5783bF02 = aVar.f0() != null ? aVar.f0() : new C5783b(8);
            aVar.f29060p.a(c5783bF02);
            aVar.K(c5783bF02);
            return;
        }
        if (i11 == 3) {
            Object obj = message.obj;
            C5783b c5783b = new C5783b(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
            aVar.f29060p.a(c5783b);
            aVar.K(c5783b);
            return;
        }
        if (i11 == 6) {
            aVar.W(5, null);
            if (aVar.d0() != null) {
                aVar.d0().X(message.arg2);
            }
            aVar.L(message.arg2);
            aVar.X(5, 1, null);
            return;
        }
        if (i11 == 2 && !aVar.isConnected()) {
            a(message);
            return;
        }
        if (b(message)) {
            ((M) message.obj).b();
            return;
        }
        int i12 = message.what;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i12).length() + 34);
        sb2.append("Don't know how to handle message: ");
        sb2.append(i12);
        Log.wtf("GmsClient", sb2.toString(), new Exception());
    }
}
