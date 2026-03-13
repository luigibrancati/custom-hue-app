package qd;

import Lc.G;
import fc.C4015H;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class k extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f43444b = new a(null);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final k a(String message) {
            AbstractC4862t.e(message, "message");
            return new b(message);
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends k {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f43445c;

        public b(String message) {
            AbstractC4862t.e(message, "message");
            this.f43445c = message;
        }

        @Override // qd.g
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Ed.h a(G module) {
            AbstractC4862t.e(module, "module");
            return Ed.k.d(Ed.j.ERROR_CONSTANT_VALUE, this.f43445c);
        }

        @Override // qd.g
        public String toString() {
            return this.f43445c;
        }
    }

    public k() {
        super(C4015H.f34254a);
    }

    @Override // qd.g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public C4015H b() {
        throw new UnsupportedOperationException();
    }
}
