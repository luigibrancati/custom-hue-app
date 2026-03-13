package com.braze.support;

import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class e implements InterfaceC6082a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f28636a;

    public e(String str) {
        this.f28636a = str;
    }

    @Override // vc.InterfaceC6082a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String invoke() {
        return "Failed to parse JSON list: '" + this.f28636a + "'";
    }
}
