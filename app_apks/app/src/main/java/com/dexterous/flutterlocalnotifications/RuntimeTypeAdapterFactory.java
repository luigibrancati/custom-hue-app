package com.dexterous.flutterlocalnotifications;

import androidx.annotation.Keep;
import java.util.LinkedHashMap;
import java.util.Map;
import u9.e;
import u9.j;
import u9.m;
import u9.n;
import u9.o;
import u9.w;
import u9.x;
import w9.F;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Keep
public final class RuntimeTypeAdapterFactory<T> implements x {
    private final Class<?> baseType;
    private final Map<String, Class<?>> labelToSubtype = new LinkedHashMap();
    private final Map<Class<?>, String> subtypeToLabel = new LinkedHashMap();
    private final String typeFieldName;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Map f28872a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Map f28873b;

        public a(Map map, Map map2) {
            this.f28872a = map;
            this.f28873b = map2;
        }

        @Override // u9.w
        public Object c(C9.a aVar) {
            j jVarA = F.a(aVar);
            j jVarV = jVarA.e().v(RuntimeTypeAdapterFactory.this.typeFieldName);
            if (jVarV == null) {
                throw new n("cannot deserialize " + RuntimeTypeAdapterFactory.this.baseType + " because it does not define a field named " + RuntimeTypeAdapterFactory.this.typeFieldName);
            }
            String strH = jVarV.h();
            w wVar = (w) this.f28872a.get(strH);
            if (wVar != null) {
                return wVar.a(jVarA);
            }
            throw new n("cannot deserialize " + RuntimeTypeAdapterFactory.this.baseType + " subtype named " + strH + "; did you forget to register a subtype?");
        }

        @Override // u9.w
        public void e(C9.c cVar, Object obj) {
            Class<?> cls = obj.getClass();
            String str = (String) RuntimeTypeAdapterFactory.this.subtypeToLabel.get(cls);
            w wVar = (w) this.f28873b.get(cls);
            if (wVar == null) {
                throw new n("cannot serialize " + cls.getName() + "; did you forget to register a subtype?");
            }
            m mVarE = wVar.d(obj).e();
            if (mVarE.t(RuntimeTypeAdapterFactory.this.typeFieldName)) {
                throw new n("cannot serialize " + cls.getName() + " because it already defines a field named " + RuntimeTypeAdapterFactory.this.typeFieldName);
            }
            m mVar = new m();
            mVar.r(RuntimeTypeAdapterFactory.this.typeFieldName, new o(str));
            for (Map.Entry entry : mVarE.s()) {
                mVar.r((String) entry.getKey(), (j) entry.getValue());
            }
            F.b(mVar, cVar);
        }
    }

    private RuntimeTypeAdapterFactory(Class<?> cls, String str) {
        if (str == null || cls == null) {
            throw null;
        }
        this.baseType = cls;
        this.typeFieldName = str;
    }

    public static <T> RuntimeTypeAdapterFactory<T> of(Class<T> cls, String str) {
        return new RuntimeTypeAdapterFactory<>(cls, str);
    }

    @Override // u9.x
    public <R> w create(e eVar, B9.a<R> aVar) {
        if (aVar.c() != this.baseType) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry<String, Class<?>> entry : this.labelToSubtype.entrySet()) {
            w wVarM = eVar.m(this, B9.a.a(entry.getValue()));
            linkedHashMap.put(entry.getKey(), wVarM);
            linkedHashMap2.put(entry.getValue(), wVarM);
        }
        return new a(linkedHashMap, linkedHashMap2).b();
    }

    public RuntimeTypeAdapterFactory<T> registerSubtype(Class<? extends T> cls, String str) {
        if (cls == null || str == null) {
            throw null;
        }
        if (this.subtypeToLabel.containsKey(cls) || this.labelToSubtype.containsKey(str)) {
            throw new IllegalArgumentException("types and labels must be unique");
        }
        this.labelToSubtype.put(str, cls);
        this.subtypeToLabel.put(cls, str);
        return this;
    }

    public static <T> RuntimeTypeAdapterFactory<T> of(Class<T> cls) {
        return new RuntimeTypeAdapterFactory<>(cls, "type");
    }

    public RuntimeTypeAdapterFactory<T> registerSubtype(Class<? extends T> cls) {
        return registerSubtype(cls, cls.getSimpleName());
    }
}
