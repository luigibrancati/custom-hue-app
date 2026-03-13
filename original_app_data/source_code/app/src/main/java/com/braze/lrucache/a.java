package com.braze.lrucache;

import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f27796a;

    public a(f fVar) {
        this.f27796a = fVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        synchronized (this.f27796a) {
            try {
                f fVar = this.f27796a;
                if (fVar.f27814i == null) {
                    return null;
                }
                while (fVar.f27813h > fVar.f27811f) {
                    fVar.d((String) ((Map.Entry) fVar.f27815j.entrySet().iterator().next()).getKey());
                }
                if (this.f27796a.a()) {
                    this.f27796a.d();
                    this.f27796a.f27816k = 0;
                }
                return null;
            } finally {
            }
        }
    }
}
