package N0;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.tika.metadata.Font;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {
        public static int a(TypedArray typedArray, int i10) {
            return typedArray.getType(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b {
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C0148d[] f9525a;

        public c(C0148d[] c0148dArr) {
            this.f9525a = c0148dArr;
        }

        public C0148d[] a() {
            return this.f9525a;
        }
    }

    /* JADX INFO: renamed from: N0.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0148d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f9526a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f9527b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f9528c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f9529d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f9530e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f9531f;

        public C0148d(String str, int i10, boolean z10, String str2, int i11, int i12) {
            this.f9526a = str;
            this.f9527b = i10;
            this.f9528c = z10;
            this.f9529d = str2;
            this.f9530e = i11;
            this.f9531f = i12;
        }

        public int a() {
            return this.f9531f;
        }

        public int b() {
            return this.f9530e;
        }

        public String c() {
            return this.f9529d;
        }

        public int d() {
            return this.f9527b;
        }

        public boolean e() {
            return this.f9528c;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class e implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f9532a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f9533b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f9534c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f9535d;

        public e(List list, int i10, int i11, String str) {
            this.f9532a = list;
            this.f9534c = i10;
            this.f9533b = i11;
            this.f9535d = str;
        }

        public int a() {
            return this.f9534c;
        }

        public List b() {
            return this.f9532a;
        }

        public String c() {
            return this.f9535d;
        }

        public int d() {
            return this.f9533b;
        }
    }

    public static int a(TypedArray typedArray, int i10) {
        return a.a(typedArray, i10);
    }

    public static b b(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return e(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List c(Resources resources, int i10) {
        if (i10 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i10);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (a(typedArrayObtainTypedArray, 0) == 1) {
                for (int i11 = 0; i11 < typedArrayObtainTypedArray.length(); i11++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i11, 0);
                    if (resourceId != 0) {
                        arrayList.add(i(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(i(resources.getStringArray(i10)));
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    public static V0.e d(XmlPullParser xmlPullParser, Resources resources, String str, String str2, List list) {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), K0.f.f6707B);
        try {
            String string = typedArrayObtainAttributes.getString(K0.f.f6708C);
            String string2 = typedArrayObtainAttributes.getString(K0.f.f6709D);
            String string3 = typedArrayObtainAttributes.getString(K0.f.f6710E);
            if (string == null) {
                throw new XmlPullParserException("query attribute must be set in fallback element");
            }
            while (xmlPullParser.next() != 3) {
                h(xmlPullParser);
            }
            V0.e eVar = new V0.e(str, str2, string, list, string2, string3);
            typedArrayObtainAttributes.close();
            return eVar;
        } catch (Throwable th) {
            if (typedArrayObtainAttributes == null) {
                throw th;
            }
            try {
                typedArrayObtainAttributes.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public static b e(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return f(xmlPullParser, resources);
        }
        h(xmlPullParser);
        return null;
    }

    public static b f(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), K0.f.f6720h);
        String string = typedArrayObtainAttributes.getString(K0.f.f6721i);
        String string2 = typedArrayObtainAttributes.getString(K0.f.f6726n);
        String string3 = typedArrayObtainAttributes.getString(K0.f.f6727o);
        String string4 = typedArrayObtainAttributes.getString(K0.f.f6723k);
        int resourceId = typedArrayObtainAttributes.getResourceId(K0.f.f6722j, 0);
        int integer = typedArrayObtainAttributes.getInteger(K0.f.f6724l, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(K0.f.f6725m, 500);
        String string5 = typedArrayObtainAttributes.getString(K0.f.f6728p);
        typedArrayObtainAttributes.recycle();
        if (string == null || string2 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals(Font.PREFIX_FONT_META)) {
                        arrayList.add(g(xmlPullParser, resources));
                    } else {
                        h(xmlPullParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new c((C0148d[]) arrayList.toArray(new C0148d[0]));
        }
        List listC = c(resources, resourceId);
        ArrayList arrayList2 = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("fallback")) {
                    arrayList2.add(d(xmlPullParser, resources, string, string2, listC));
                } else {
                    h(xmlPullParser);
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            return new e(arrayList2, integer, integer2, string5);
        }
        if (string3 == null) {
            throw new IllegalArgumentException("The provider font XML requires query attribute or fallback children.");
        }
        arrayList2.add(new V0.e(string, string2, string3, listC, null, null));
        if (string4 != null) {
            arrayList2.add(new V0.e(string, string2, string4, listC, null, null));
        }
        return new e(arrayList2, integer, integer2, string5);
    }

    public static C0148d g(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), K0.f.f6729q);
        int i10 = typedArrayObtainAttributes.getInt(typedArrayObtainAttributes.hasValue(K0.f.f6738z) ? K0.f.f6738z : K0.f.f6731s, 400);
        boolean z10 = 1 == typedArrayObtainAttributes.getInt(typedArrayObtainAttributes.hasValue(K0.f.f6736x) ? K0.f.f6736x : K0.f.f6732t, 0);
        int i11 = typedArrayObtainAttributes.hasValue(K0.f.f6706A) ? K0.f.f6706A : K0.f.f6733u;
        String string = typedArrayObtainAttributes.getString(typedArrayObtainAttributes.hasValue(K0.f.f6737y) ? K0.f.f6737y : K0.f.f6734v);
        int i12 = typedArrayObtainAttributes.getInt(i11, 0);
        int i13 = typedArrayObtainAttributes.hasValue(K0.f.f6735w) ? K0.f.f6735w : K0.f.f6730r;
        int resourceId = typedArrayObtainAttributes.getResourceId(i13, 0);
        String string2 = typedArrayObtainAttributes.getString(i13);
        typedArrayObtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            h(xmlPullParser);
        }
        return new C0148d(string2, i10, z10, string, i12, resourceId);
    }

    public static void h(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i10 = 1;
        while (i10 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i10++;
            } else if (next == 3) {
                i10--;
            }
        }
    }

    public static List i(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
