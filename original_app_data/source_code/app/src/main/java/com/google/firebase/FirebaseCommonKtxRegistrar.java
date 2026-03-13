package com.google.firebase;

import Rd.AbstractC2152s0;
import Rd.I;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import gc.C4206t;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import n8.InterfaceC5149a;
import o8.C5233c;
import o8.E;
import o8.InterfaceC5234d;
import o8.g;
import o8.q;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/google/firebase/FirebaseCommonKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "Lo8/c;", "getComponents", "()Ljava/util/List;", "com.google.firebase-firebase-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f31583a = new a();

        @Override // o8.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final I a(InterfaceC5234d interfaceC5234d) {
            Object objG = interfaceC5234d.g(E.a(InterfaceC5149a.class, Executor.class));
            AbstractC4862t.d(objG, "get(...)");
            return AbstractC2152s0.b((Executor) objG);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f31584a = new b();

        @Override // o8.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final I a(InterfaceC5234d interfaceC5234d) {
            Object objG = interfaceC5234d.g(E.a(n8.c.class, Executor.class));
            AbstractC4862t.d(objG, "get(...)");
            return AbstractC2152s0.b((Executor) objG);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f31585a = new c();

        @Override // o8.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final I a(InterfaceC5234d interfaceC5234d) {
            Object objG = interfaceC5234d.g(E.a(n8.b.class, Executor.class));
            AbstractC4862t.d(objG, "get(...)");
            return AbstractC2152s0.b((Executor) objG);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f31586a = new d();

        @Override // o8.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final I a(InterfaceC5234d interfaceC5234d) {
            Object objG = interfaceC5234d.g(E.a(n8.d.class, Executor.class));
            AbstractC4862t.d(objG, "get(...)");
            return AbstractC2152s0.b((Executor) objG);
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C5233c> getComponents() {
        C5233c c5233cD = C5233c.e(E.a(InterfaceC5149a.class, I.class)).b(q.l(E.a(InterfaceC5149a.class, Executor.class))).f(a.f31583a).d();
        AbstractC4862t.d(c5233cD, "build(...)");
        C5233c c5233cD2 = C5233c.e(E.a(n8.c.class, I.class)).b(q.l(E.a(n8.c.class, Executor.class))).f(b.f31584a).d();
        AbstractC4862t.d(c5233cD2, "build(...)");
        C5233c c5233cD3 = C5233c.e(E.a(n8.b.class, I.class)).b(q.l(E.a(n8.b.class, Executor.class))).f(c.f31585a).d();
        AbstractC4862t.d(c5233cD3, "build(...)");
        C5233c c5233cD4 = C5233c.e(E.a(n8.d.class, I.class)).b(q.l(E.a(n8.d.class, Executor.class))).f(d.f31586a).d();
        AbstractC4862t.d(c5233cD4, "build(...)");
        return C4206t.n(c5233cD, c5233cD2, c5233cD3, c5233cD4);
    }
}
