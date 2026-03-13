package Jd;

import Jd.f;
import Lc.InterfaceC1196y;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class k implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6417a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends k {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f6418b = new a();

        public a() {
            super("must be a member function", null);
        }

        @Override // Jd.f
        public boolean a(InterfaceC1196y functionDescriptor) {
            AbstractC4862t.e(functionDescriptor, "functionDescriptor");
            return functionDescriptor.J() != null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends k {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f6419b = new b();

        public b() {
            super("must be a member or an extension function", null);
        }

        @Override // Jd.f
        public boolean a(InterfaceC1196y functionDescriptor) {
            AbstractC4862t.e(functionDescriptor, "functionDescriptor");
            return (functionDescriptor.J() == null && functionDescriptor.M() == null) ? false : true;
        }
    }

    public /* synthetic */ k(String str, AbstractC4854k abstractC4854k) {
        this(str);
    }

    @Override // Jd.f
    public String b(InterfaceC1196y interfaceC1196y) {
        return f.a.a(this, interfaceC1196y);
    }

    @Override // Jd.f
    public String getDescription() {
        return this.f6417a;
    }

    public k(String str) {
        this.f6417a = str;
    }
}
