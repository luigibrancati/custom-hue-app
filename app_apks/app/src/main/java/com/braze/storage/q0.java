package com.braze.storage;

import com.braze.enums.DataStoreKey;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class q0 implements InterfaceC6082a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DataStoreKey f28543a;

    public q0(DataStoreKey dataStoreKey) {
        this.f28543a = dataStoreKey;
    }

    @Override // vc.InterfaceC6082a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String invoke() {
        return "Key " + this.f28543a.getKey() + " is not a MAP type. Cannot write key:" + this.f28543a.getKey();
    }
}
