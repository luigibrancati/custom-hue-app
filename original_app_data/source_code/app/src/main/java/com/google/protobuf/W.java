package com.google.protobuf;

import com.google.protobuf.N;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final W f32198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final W f32199b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends W {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Class f32200c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

        public b() {
            super();
        }

        public static List f(Object obj, long j10) {
            return (List) N0.G(obj, j10);
        }

        public static List g(Object obj, long j10, int i10) {
            List listF = f(obj, j10);
            if (listF.isEmpty()) {
                List u10 = listF instanceof V ? new U(i10) : ((listF instanceof u0) && (listF instanceof N.j)) ? ((N.j) listF).a(i10) : new ArrayList(i10);
                N0.V(obj, j10, u10);
                return u10;
            }
            if (f32200c.isAssignableFrom(listF.getClass())) {
                ArrayList arrayList = new ArrayList(listF.size() + i10);
                arrayList.addAll(listF);
                N0.V(obj, j10, arrayList);
                return arrayList;
            }
            if (listF instanceof M0) {
                U u11 = new U(listF.size() + i10);
                u11.addAll((M0) listF);
                N0.V(obj, j10, u11);
                return u11;
            }
            if ((listF instanceof u0) && (listF instanceof N.j)) {
                N.j jVar = (N.j) listF;
                if (!jVar.m()) {
                    N.j jVarA = jVar.a(listF.size() + i10);
                    N0.V(obj, j10, jVarA);
                    return jVarA;
                }
            }
            return listF;
        }

        @Override // com.google.protobuf.W
        public void c(Object obj, long j10) {
            Object objUnmodifiableList;
            List list = (List) N0.G(obj, j10);
            if (list instanceof V) {
                objUnmodifiableList = ((V) list).u();
            } else {
                if (f32200c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof u0) && (list instanceof N.j)) {
                    N.j jVar = (N.j) list;
                    if (jVar.m()) {
                        jVar.i();
                        return;
                    }
                    return;
                }
                objUnmodifiableList = Collections.unmodifiableList(list);
            }
            N0.V(obj, j10, objUnmodifiableList);
        }

        @Override // com.google.protobuf.W
        public void d(Object obj, Object obj2, long j10) {
            List listF = f(obj2, j10);
            List listG = g(obj, j10, listF.size());
            int size = listG.size();
            int size2 = listF.size();
            if (size > 0 && size2 > 0) {
                listG.addAll(listF);
            }
            if (size > 0) {
                listF = listG;
            }
            N0.V(obj, j10, listF);
        }

        @Override // com.google.protobuf.W
        public List e(Object obj, long j10) {
            return g(obj, j10, 10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends W {
        public c() {
            super();
        }

        public static N.j f(Object obj, long j10) {
            return (N.j) N0.G(obj, j10);
        }

        @Override // com.google.protobuf.W
        public void c(Object obj, long j10) {
            f(obj, j10).i();
        }

        @Override // com.google.protobuf.W
        public void d(Object obj, Object obj2, long j10) {
            N.j jVarF = f(obj, j10);
            N.j jVarF2 = f(obj2, j10);
            int size = jVarF.size();
            int size2 = jVarF2.size();
            if (size > 0 && size2 > 0) {
                if (!jVarF.m()) {
                    jVarF = jVarF.a(size2 + size);
                }
                jVarF.addAll(jVarF2);
            }
            if (size > 0) {
                jVarF2 = jVarF;
            }
            N0.V(obj, j10, jVarF2);
        }

        @Override // com.google.protobuf.W
        public List e(Object obj, long j10) {
            N.j jVarF = f(obj, j10);
            if (jVarF.m()) {
                return jVarF;
            }
            int size = jVarF.size();
            N.j jVarA = jVarF.a(size == 0 ? 10 : size * 2);
            N0.V(obj, j10, jVarA);
            return jVarA;
        }
    }

    static {
        f32198a = new b();
        f32199b = new c();
    }

    public static W a() {
        return f32198a;
    }

    public static W b() {
        return f32199b;
    }

    public abstract void c(Object obj, long j10);

    public abstract void d(Object obj, Object obj2, long j10);

    public abstract List e(Object obj, long j10);

    public W() {
    }
}
