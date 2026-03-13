package Jd;

import Jd.f;
import Lc.InterfaceC1196y;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class t implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6491a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends t {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f6492b;

        public a(int i10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("must have at least ");
            sb2.append(i10);
            sb2.append(" value parameter");
            sb2.append(i10 > 1 ? "s" : "");
            super(sb2.toString(), null);
            this.f6492b = i10;
        }

        @Override // Jd.f
        public boolean a(InterfaceC1196y functionDescriptor) {
            AbstractC4862t.e(functionDescriptor, "functionDescriptor");
            return functionDescriptor.i().size() >= this.f6492b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends t {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f6493b;

        public b(int i10) {
            super("must have exactly " + i10 + " value parameters", null);
            this.f6493b = i10;
        }

        @Override // Jd.f
        public boolean a(InterfaceC1196y functionDescriptor) {
            AbstractC4862t.e(functionDescriptor, "functionDescriptor");
            return functionDescriptor.i().size() == this.f6493b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends t {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f6494b = new c();

        public c() {
            super("must have no value parameters", null);
        }

        @Override // Jd.f
        public boolean a(InterfaceC1196y functionDescriptor) {
            AbstractC4862t.e(functionDescriptor, "functionDescriptor");
            return functionDescriptor.i().isEmpty();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d extends t {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f6495b = new d();

        public d() {
            super("must have a single value parameter", null);
        }

        @Override // Jd.f
        public boolean a(InterfaceC1196y functionDescriptor) {
            AbstractC4862t.e(functionDescriptor, "functionDescriptor");
            return functionDescriptor.i().size() == 1;
        }
    }

    public /* synthetic */ t(String str, AbstractC4854k abstractC4854k) {
        this(str);
    }

    @Override // Jd.f
    public String b(InterfaceC1196y interfaceC1196y) {
        return f.a.a(this, interfaceC1196y);
    }

    @Override // Jd.f
    public String getDescription() {
        return this.f6491a;
    }

    public t(String str) {
        this.f6491a = str;
    }
}
