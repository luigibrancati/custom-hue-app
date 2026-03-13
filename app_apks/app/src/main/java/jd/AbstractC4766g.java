package jd;

import Bc.k;
import gc.C4179C;
import gc.C4186J;
import gc.C4206t;
import gc.C4207u;
import gc.P;
import id.AbstractC4376a;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: jd.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4766g implements hd.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f39170d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f39171e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final List f39172f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Map f39173g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f39174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f39175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f39176c;

    /* JADX INFO: renamed from: jd.g$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: jd.g$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f39177a;

        static {
            int[] iArr = new int[AbstractC4376a.e.c.EnumC0496c.values().length];
            try {
                iArr[AbstractC4376a.e.c.EnumC0496c.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC4376a.e.c.EnumC0496c.INTERNAL_TO_CLASS_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AbstractC4376a.e.c.EnumC0496c.DESC_TO_CLASS_ID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f39177a = iArr;
        }
    }

    static {
        String strQ0 = C4179C.q0(C4206t.n('k', 'o', 't', 'l', 'i', 'n'), "", null, null, 0, null, null, 62, null);
        f39171e = strQ0;
        List listN = C4206t.n(strQ0 + "/Any", strQ0 + "/Nothing", strQ0 + "/Unit", strQ0 + "/Throwable", strQ0 + "/Number", strQ0 + "/Byte", strQ0 + "/Double", strQ0 + "/Float", strQ0 + "/Int", strQ0 + "/Long", strQ0 + "/Short", strQ0 + "/Boolean", strQ0 + "/Char", strQ0 + "/CharSequence", strQ0 + "/String", strQ0 + "/Comparable", strQ0 + "/Enum", strQ0 + "/Array", strQ0 + "/ByteArray", strQ0 + "/DoubleArray", strQ0 + "/FloatArray", strQ0 + "/IntArray", strQ0 + "/LongArray", strQ0 + "/ShortArray", strQ0 + "/BooleanArray", strQ0 + "/CharArray", strQ0 + "/Cloneable", strQ0 + "/Annotation", strQ0 + "/collections/Iterable", strQ0 + "/collections/MutableIterable", strQ0 + "/collections/Collection", strQ0 + "/collections/MutableCollection", strQ0 + "/collections/List", strQ0 + "/collections/MutableList", strQ0 + "/collections/Set", strQ0 + "/collections/MutableSet", strQ0 + "/collections/Map", strQ0 + "/collections/MutableMap", strQ0 + "/collections/Map.Entry", strQ0 + "/collections/MutableMap.MutableEntry", strQ0 + "/collections/Iterator", strQ0 + "/collections/MutableIterator", strQ0 + "/collections/ListIterator", strQ0 + "/collections/MutableListIterator");
        f39172f = listN;
        Iterable<C4186J> iterableB1 = C4179C.b1(listN);
        LinkedHashMap linkedHashMap = new LinkedHashMap(k.e(P.e(C4207u.v(iterableB1, 10)), 16));
        for (C4186J c4186j : iterableB1) {
            linkedHashMap.put((String) c4186j.d(), Integer.valueOf(c4186j.c()));
        }
        f39173g = linkedHashMap;
    }

    public AbstractC4766g(String[] strings, Set localNameIndices, List records) {
        AbstractC4862t.e(strings, "strings");
        AbstractC4862t.e(localNameIndices, "localNameIndices");
        AbstractC4862t.e(records, "records");
        this.f39174a = strings;
        this.f39175b = localNameIndices;
        this.f39176c = records;
    }

    @Override // hd.c
    public boolean a(int i10) {
        return this.f39175b.contains(Integer.valueOf(i10));
    }

    @Override // hd.c
    public String b(int i10) {
        return getString(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    @Override // hd.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String getString(int r15) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: jd.AbstractC4766g.getString(int):java.lang.String");
    }
}
