package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import t6.AbstractC5847e;
import t6.C5843a;
import u6.InterfaceC5950d;
import u6.InterfaceC5964k;
import v6.AbstractC6050e;
import v6.AbstractC6056k;
import v6.C6048c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c extends a implements C5843a.f {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static volatile Executor f29088J;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final C6048c f29089G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final Set f29090H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final Account f29091I;

    public c(Context context, Looper looper, int i10, C6048c c6048c, AbstractC5847e.a aVar, AbstractC5847e.b bVar) {
        this(context, looper, i10, c6048c, (InterfaceC5950d) aVar, (InterfaceC5964k) bVar);
    }

    public static void l0(Executor executor) {
        f29088J = executor;
    }

    @Override // com.google.android.gms.common.internal.a
    public final Set B() {
        return this.f29090H;
    }

    @Override // t6.C5843a.f
    public Set i() {
        return h() ? this.f29090H : Collections.EMPTY_SET;
    }

    public final Set k0(Set set) {
        Set setJ0 = j0(set);
        Iterator it = setJ0.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return setJ0;
    }

    @Override // com.google.android.gms.common.internal.a
    public final Account t() {
        return this.f29091I;
    }

    @Override // com.google.android.gms.common.internal.a
    public Executor v() {
        return f29088J;
    }

    public c(Context context, Looper looper, int i10, C6048c c6048c, InterfaceC5950d interfaceC5950d, InterfaceC5964k interfaceC5964k) {
        this(context, looper, AbstractC6050e.a(context), GoogleApiAvailability.m(), i10, c6048c, (InterfaceC5950d) AbstractC6056k.l(interfaceC5950d), (InterfaceC5964k) AbstractC6056k.l(interfaceC5964k));
    }

    public c(Context context, Looper looper, AbstractC6050e abstractC6050e, GoogleApiAvailability googleApiAvailability, int i10, C6048c c6048c, InterfaceC5950d interfaceC5950d, InterfaceC5964k interfaceC5964k) {
        super(context, looper, abstractC6050e, googleApiAvailability, i10, interfaceC5950d == null ? null : new d(interfaceC5950d), interfaceC5964k != null ? new e(interfaceC5964k) : null, c6048c.f());
        this.f29089G = c6048c;
        this.f29091I = c6048c.a();
        this.f29090H = k0(c6048c.c());
    }

    public Set j0(Set set) {
        return set;
    }
}
