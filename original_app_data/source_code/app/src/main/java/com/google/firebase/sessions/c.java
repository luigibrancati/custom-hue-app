package com.google.firebase.sessions;

import com.google.firebase.sessions.b;
import ec.InterfaceC3978a;
import h8.C4288f;
import p9.C5426b;
import r9.AbstractC5681d;
import r9.InterfaceC5679b;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements InterfaceC5679b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3978a f32016a;

    public c(InterfaceC3978a interfaceC3978a) {
        this.f32016a = interfaceC3978a;
    }

    public static C5426b a(C4288f c4288f) {
        return (C5426b) AbstractC5681d.d(b.InterfaceC0375b.f32014a.e(c4288f));
    }

    public static c b(InterfaceC3978a interfaceC3978a) {
        return new c(interfaceC3978a);
    }

    @Override // ec.InterfaceC3978a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public C5426b get() {
        return a((C4288f) this.f32016a.get());
    }
}
