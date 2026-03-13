package com.braze.managers;

import kotlin.jvm.internal.M;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class k implements InterfaceC6082a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f27938a = new k();

    public static String a() {
        return "Unsupported type for map deserialization: " + M.b(Long.class).l();
    }

    @Override // vc.InterfaceC6082a
    public final /* bridge */ /* synthetic */ Object invoke() {
        return a();
    }
}
