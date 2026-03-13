package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class D {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f32044b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile D f32045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final D f32046d = new D(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f32047a = Collections.EMPTY_MAP;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f32048a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f32049b;

        public a(Object obj, int i10) {
            this.f32048a = obj;
            this.f32049b = i10;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f32048a == aVar.f32048a && this.f32049b == aVar.f32049b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f32048a) * 65535) + this.f32049b;
        }
    }

    public D(boolean z10) {
    }

    public static D b() {
        D dA;
        if (!f32044b) {
            return f32046d;
        }
        D d10 = f32045c;
        if (d10 != null) {
            return d10;
        }
        synchronized (D.class) {
            try {
                dA = f32045c;
                if (dA == null) {
                    dA = C.a();
                    f32045c = dA;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return dA;
    }

    public GeneratedMessageLite.f a(InterfaceC3717g0 interfaceC3717g0, int i10) {
        return (GeneratedMessageLite.f) this.f32047a.get(new a(interfaceC3717g0, i10));
    }
}
