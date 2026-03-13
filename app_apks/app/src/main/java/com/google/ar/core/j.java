package com.google.ar.core;

import com.google.ar.core.ArCoreApk;
import java.util.Objects;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
final class j implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Consumer f31192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ k f31193b;

    public j(k kVar, Consumer consumer) {
        this.f31192a = consumer;
        Objects.requireNonNull(kVar);
        this.f31193b = kVar;
    }

    @Override // com.google.ar.core.h
    public final void a(ArCoreApk.Availability availability) {
        this.f31193b.e().post(new ak(this.f31192a, availability, 1));
    }
}
