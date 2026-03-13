package X0;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class f implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f17988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17989b;

    public f(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f17988a = new Object[i10];
    }

    @Override // X0.e
    public boolean a(Object instance) {
        AbstractC4862t.e(instance, "instance");
        if (c(instance)) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i10 = this.f17989b;
        Object[] objArr = this.f17988a;
        if (i10 >= objArr.length) {
            return false;
        }
        objArr[i10] = instance;
        this.f17989b = i10 + 1;
        return true;
    }

    @Override // X0.e
    public Object b() {
        int i10 = this.f17989b;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        Object obj = this.f17988a[i11];
        AbstractC4862t.c(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        this.f17988a[i11] = null;
        this.f17989b--;
        return obj;
    }

    public final boolean c(Object obj) {
        int i10 = this.f17989b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f17988a[i11] == obj) {
                return true;
            }
        }
        return false;
    }
}
