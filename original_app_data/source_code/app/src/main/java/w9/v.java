package w9;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import u9.C6009a;
import v9.InterfaceC6075a;
import z9.AbstractC6553a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class v implements u9.x, Cloneable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final v f46425g = new v();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f46426a = -1.0d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f46427b = 136;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f46428c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f46429d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f46430e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f46431f;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends u9.w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile u9.w f46432a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f46433b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f46434c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ u9.e f46435d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ B9.a f46436e;

        public a(boolean z10, boolean z11, u9.e eVar, B9.a aVar) {
            this.f46433b = z10;
            this.f46434c = z11;
            this.f46435d = eVar;
            this.f46436e = aVar;
        }

        @Override // u9.w
        public Object c(C9.a aVar) throws IOException {
            if (!this.f46433b) {
                return f().c(aVar);
            }
            aVar.skipValue();
            return null;
        }

        @Override // u9.w
        public void e(C9.c cVar, Object obj) throws IOException {
            if (this.f46434c) {
                cVar.C();
            } else {
                f().e(cVar, obj);
            }
        }

        public final u9.w f() {
            u9.w wVar = this.f46432a;
            if (wVar != null) {
                return wVar;
            }
            u9.w wVarM = this.f46435d.m(v.this, this.f46436e);
            this.f46432a = wVarM;
            return wVarM;
        }
    }

    public v() {
        List list = Collections.EMPTY_LIST;
        this.f46430e = list;
        this.f46431f = list;
    }

    public static boolean i(Class cls) {
        return cls.isMemberClass() && !AbstractC6553a.n(cls);
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public v clone() {
        try {
            return (v) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // u9.x
    public u9.w create(u9.e eVar, B9.a aVar) {
        Class clsC = aVar.c();
        boolean zE = e(clsC, true);
        boolean zE2 = e(clsC, false);
        if (zE || zE2) {
            return new a(zE2, zE, eVar, aVar);
        }
        return null;
    }

    public boolean e(Class cls, boolean z10) {
        if (this.f46426a != -1.0d && !n((v9.d) cls.getAnnotation(v9.d.class), (v9.e) cls.getAnnotation(v9.e.class))) {
            return true;
        }
        if (!this.f46428c && i(cls)) {
            return true;
        }
        if (!z10 && !Enum.class.isAssignableFrom(cls) && AbstractC6553a.l(cls)) {
            return true;
        }
        Iterator it = (z10 ? this.f46430e : this.f46431f).iterator();
        if (!it.hasNext()) {
            return false;
        }
        android.support.v4.media.session.a.a(it.next());
        throw null;
    }

    public boolean g(Field field, boolean z10) {
        InterfaceC6075a interfaceC6075a;
        if ((this.f46427b & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f46426a != -1.0d && !n((v9.d) field.getAnnotation(v9.d.class), (v9.e) field.getAnnotation(v9.e.class))) || field.isSynthetic()) {
            return true;
        }
        if ((this.f46429d && ((interfaceC6075a = (InterfaceC6075a) field.getAnnotation(InterfaceC6075a.class)) == null || (!z10 ? interfaceC6075a.deserialize() : interfaceC6075a.serialize()))) || e(field.getType(), z10)) {
            return true;
        }
        List list = z10 ? this.f46430e : this.f46431f;
        if (list.isEmpty()) {
            return false;
        }
        new C6009a(field);
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return false;
        }
        android.support.v4.media.session.a.a(it.next());
        throw null;
    }

    public final boolean j(v9.d dVar) {
        if (dVar != null) {
            return this.f46426a >= dVar.value();
        }
        return true;
    }

    public final boolean m(v9.e eVar) {
        if (eVar != null) {
            return this.f46426a < eVar.value();
        }
        return true;
    }

    public final boolean n(v9.d dVar, v9.e eVar) {
        return j(dVar) && m(eVar);
    }
}
