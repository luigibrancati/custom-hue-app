package com.braze.storage;

import com.braze.enums.DataStoreKey;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class l0 implements InterfaceC6082a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DataStoreKey f28481a;

    public l0(DataStoreKey dataStoreKey) {
        this.f28481a = dataStoreKey;
    }

    @Override // vc.InterfaceC6082a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String invoke() {
        return "Failed to read map from DataStore for key: " + this.f28481a.getKey();
    }
}
