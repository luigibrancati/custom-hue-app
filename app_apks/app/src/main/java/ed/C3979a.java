package ed;

import Bc.k;
import gc.C4202o;
import gc.C4206t;
import gc.P;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jd.C4764e;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: ed.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C3979a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumC0429a f33903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4764e f33904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f33905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String[] f33906d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f33907e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f33908f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f33909g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f33910h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final byte[] f33911i;

    /* JADX INFO: renamed from: ed.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum EnumC0429a {
        UNKNOWN(0),
        CLASS(1),
        FILE_FACADE(2),
        SYNTHETIC_CLASS(3),
        MULTIFILE_CLASS(4),
        MULTIFILE_CLASS_PART(5);

        public static final C0430a Companion = new C0430a(null);
        private static final Map<Integer, EnumC0429a> entryById;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        private final int f33912id;

        /* JADX INFO: renamed from: ed.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0430a {
            public /* synthetic */ C0430a(AbstractC4854k abstractC4854k) {
                this();
            }

            public final EnumC0429a a(int i10) {
                EnumC0429a enumC0429a = (EnumC0429a) EnumC0429a.entryById.get(Integer.valueOf(i10));
                return enumC0429a == null ? EnumC0429a.UNKNOWN : enumC0429a;
            }

            public C0430a() {
            }
        }

        static {
            EnumC0429a[] enumC0429aArrValues = values();
            LinkedHashMap linkedHashMap = new LinkedHashMap(k.e(P.e(enumC0429aArrValues.length), 16));
            for (EnumC0429a enumC0429a : enumC0429aArrValues) {
                linkedHashMap.put(Integer.valueOf(enumC0429a.f33912id), enumC0429a);
            }
            entryById = linkedHashMap;
        }

        EnumC0429a(int i10) {
            this.f33912id = i10;
        }

        public static final EnumC0429a j(int i10) {
            return Companion.a(i10);
        }
    }

    public C3979a(EnumC0429a kind, C4764e metadataVersion, String[] strArr, String[] strArr2, String[] strArr3, String str, int i10, String str2, byte[] bArr) {
        AbstractC4862t.e(kind, "kind");
        AbstractC4862t.e(metadataVersion, "metadataVersion");
        this.f33903a = kind;
        this.f33904b = metadataVersion;
        this.f33905c = strArr;
        this.f33906d = strArr2;
        this.f33907e = strArr3;
        this.f33908f = str;
        this.f33909g = i10;
        this.f33910h = str2;
        this.f33911i = bArr;
    }

    public final String[] a() {
        return this.f33905c;
    }

    public final String[] b() {
        return this.f33906d;
    }

    public final EnumC0429a c() {
        return this.f33903a;
    }

    public final C4764e d() {
        return this.f33904b;
    }

    public final String e() {
        String str = this.f33908f;
        if (this.f33903a == EnumC0429a.MULTIFILE_CLASS_PART) {
            return str;
        }
        return null;
    }

    public final List f() {
        String[] strArr = this.f33905c;
        if (this.f33903a != EnumC0429a.MULTIFILE_CLASS) {
            strArr = null;
        }
        List listH = strArr != null ? C4202o.h(strArr) : null;
        return listH == null ? C4206t.k() : listH;
    }

    public final String[] g() {
        return this.f33907e;
    }

    public final boolean h(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    public final boolean i() {
        return h(this.f33909g, 2);
    }

    public final boolean j() {
        return h(this.f33909g, 64) && !h(this.f33909g, 32);
    }

    public final boolean k() {
        return h(this.f33909g, 16) && !h(this.f33909g, 32);
    }

    public String toString() {
        return this.f33903a + " version=" + this.f33904b;
    }
}
