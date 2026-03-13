package pe;

import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class x {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f42891e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f42893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f42894c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String[] f42895d;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final x a(String str) {
            AbstractC4862t.e(str, "<this>");
            return qe.g.d(str);
        }

        public a() {
        }
    }

    public x(String mediaType, String type, String subtype, String[] parameterNamesAndValues) {
        AbstractC4862t.e(mediaType, "mediaType");
        AbstractC4862t.e(type, "type");
        AbstractC4862t.e(subtype, "subtype");
        AbstractC4862t.e(parameterNamesAndValues, "parameterNamesAndValues");
        this.f42892a = mediaType;
        this.f42893b = type;
        this.f42894c = subtype;
        this.f42895d = parameterNamesAndValues;
    }

    public final String a() {
        return this.f42892a;
    }

    public boolean equals(Object obj) {
        return qe.g.a(this, obj);
    }

    public int hashCode() {
        return qe.g.b(this);
    }

    public String toString() {
        return qe.g.e(this);
    }
}
