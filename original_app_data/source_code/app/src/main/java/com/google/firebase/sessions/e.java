package com.google.firebase.sessions;

import android.content.Context;
import com.google.firebase.sessions.b;
import ec.InterfaceC3978a;
import g1.InterfaceC4099i;
import lc.InterfaceC4992i;
import p9.F;
import r9.AbstractC5681d;
import r9.InterfaceC5679b;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements InterfaceC5679b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3978a f32019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3978a f32020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC3978a f32021c;

    public e(InterfaceC3978a interfaceC3978a, InterfaceC3978a interfaceC3978a2, InterfaceC3978a interfaceC3978a3) {
        this.f32019a = interfaceC3978a;
        this.f32020b = interfaceC3978a2;
        this.f32021c = interfaceC3978a3;
    }

    public static e a(InterfaceC3978a interfaceC3978a, InterfaceC3978a interfaceC3978a2, InterfaceC3978a interfaceC3978a3) {
        return new e(interfaceC3978a, interfaceC3978a2, interfaceC3978a3);
    }

    public static InterfaceC4099i c(Context context, InterfaceC4992i interfaceC4992i, F f10) {
        return (InterfaceC4099i) AbstractC5681d.d(b.InterfaceC0375b.f32014a.m(context, interfaceC4992i, f10));
    }

    @Override // ec.InterfaceC3978a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC4099i get() {
        return c((Context) this.f32019a.get(), (InterfaceC4992i) this.f32020b.get(), (F) this.f32021c.get());
    }
}
