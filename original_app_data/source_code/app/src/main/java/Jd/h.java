package Jd;

import Jd.g;
import Lc.InterfaceC1196y;
import java.util.Arrays;
import java.util.Collection;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.v;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kd.f f6406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Od.o f6407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Collection f6408c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vc.l f6409d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f[] f6410e;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends v implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f6411a = new a();

        public a() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(InterfaceC1196y interfaceC1196y) {
            AbstractC4862t.e(interfaceC1196y, "$this$null");
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends v implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f6412a = new b();

        public b() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(InterfaceC1196y interfaceC1196y) {
            AbstractC4862t.e(interfaceC1196y, "$this$null");
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends v implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f6413a = new c();

        public c() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(InterfaceC1196y interfaceC1196y) {
            AbstractC4862t.e(interfaceC1196y, "$this$null");
            return null;
        }
    }

    public h(kd.f fVar, Od.o oVar, Collection collection, vc.l lVar, f... fVarArr) {
        this.f6406a = fVar;
        this.f6407b = oVar;
        this.f6408c = collection;
        this.f6409d = lVar;
        this.f6410e = fVarArr;
    }

    public final g a(InterfaceC1196y functionDescriptor) {
        AbstractC4862t.e(functionDescriptor, "functionDescriptor");
        for (f fVar : this.f6410e) {
            String strB = fVar.b(functionDescriptor);
            if (strB != null) {
                return new g.b(strB);
            }
        }
        String str = (String) this.f6409d.invoke(functionDescriptor);
        return str != null ? new g.b(str) : g.c.f6405b;
    }

    public final boolean b(InterfaceC1196y functionDescriptor) {
        AbstractC4862t.e(functionDescriptor, "functionDescriptor");
        if (this.f6406a != null && !AbstractC4862t.a(functionDescriptor.getName(), this.f6406a)) {
            return false;
        }
        if (this.f6407b != null) {
            String strB = functionDescriptor.getName().b();
            AbstractC4862t.d(strB, "functionDescriptor.name.asString()");
            if (!this.f6407b.i(strB)) {
                return false;
            }
        }
        Collection collection = this.f6408c;
        return collection == null || collection.contains(functionDescriptor.getName());
    }

    public /* synthetic */ h(kd.f fVar, f[] fVarArr, vc.l lVar, int i10, AbstractC4854k abstractC4854k) {
        this(fVar, fVarArr, (i10 & 4) != 0 ? a.f6411a : lVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(kd.f name, f[] checks, vc.l additionalChecks) {
        this(name, (Od.o) null, (Collection) null, additionalChecks, (f[]) Arrays.copyOf(checks, checks.length));
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(checks, "checks");
        AbstractC4862t.e(additionalChecks, "additionalChecks");
    }

    public /* synthetic */ h(Od.o oVar, f[] fVarArr, vc.l lVar, int i10, AbstractC4854k abstractC4854k) {
        this(oVar, fVarArr, (i10 & 4) != 0 ? b.f6412a : lVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(Od.o regex, f[] checks, vc.l additionalChecks) {
        this((kd.f) null, regex, (Collection) null, additionalChecks, (f[]) Arrays.copyOf(checks, checks.length));
        AbstractC4862t.e(regex, "regex");
        AbstractC4862t.e(checks, "checks");
        AbstractC4862t.e(additionalChecks, "additionalChecks");
    }

    public /* synthetic */ h(Collection collection, f[] fVarArr, vc.l lVar, int i10, AbstractC4854k abstractC4854k) {
        this(collection, fVarArr, (i10 & 4) != 0 ? c.f6413a : lVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(Collection nameList, f[] checks, vc.l additionalChecks) {
        this((kd.f) null, (Od.o) null, nameList, additionalChecks, (f[]) Arrays.copyOf(checks, checks.length));
        AbstractC4862t.e(nameList, "nameList");
        AbstractC4862t.e(checks, "checks");
        AbstractC4862t.e(additionalChecks, "additionalChecks");
    }
}
