package s0;

import fc.C4015H;
import kotlin.jvm.internal.v;
import q0.e;
import vc.l;
import z0.EnumC6497k;

/* JADX INFO: renamed from: s0.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5703a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f43978a = 1.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public EnumC6497k f43979b = EnumC6497k.Ltr;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f43980c = new C0590a();

    /* JADX INFO: renamed from: s0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0590a extends v implements l {
        public C0590a() {
            super(1);
        }

        public final void a(e eVar) {
            AbstractC5703a.this.a(eVar);
        }

        @Override // vc.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((e) obj);
            return C4015H.f34254a;
        }
    }

    public abstract void a(e eVar);
}
