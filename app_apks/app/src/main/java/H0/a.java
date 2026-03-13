package H0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f4791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4792b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4793c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SparseArray f4794d = new SparseArray();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SparseArray f4795e = new SparseArray();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public H0.b f4796f = null;

    /* JADX INFO: renamed from: H0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class C0083a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f4797a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ArrayList f4798b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f4799c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public androidx.constraintlayout.widget.c f4800d;

        public C0083a(Context context, XmlPullParser xmlPullParser) {
            this.f4799c = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), d.f5059q4);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == d.f5065r4) {
                    this.f4797a = typedArrayObtainStyledAttributes.getResourceId(index, this.f4797a);
                } else if (index == d.f5071s4) {
                    this.f4799c = typedArrayObtainStyledAttributes.getResourceId(index, this.f4799c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f4799c);
                    context.getResources().getResourceName(this.f4799c);
                    if ("layout".equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
                        this.f4800d = cVar;
                        cVar.f(context, this.f4799c);
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public void a(b bVar) {
            this.f4798b.add(bVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f4801a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f4802b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f4803c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f4804d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f4805e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public androidx.constraintlayout.widget.c f4806f;

        public b(Context context, XmlPullParser xmlPullParser) {
            this.f4801a = Float.NaN;
            this.f4802b = Float.NaN;
            this.f4803c = Float.NaN;
            this.f4804d = Float.NaN;
            this.f4805e = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), d.f4884M4);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == d.f4890N4) {
                    this.f4805e = typedArrayObtainStyledAttributes.getResourceId(index, this.f4805e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f4805e);
                    context.getResources().getResourceName(this.f4805e);
                    if ("layout".equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
                        this.f4806f = cVar;
                        cVar.f(context, this.f4805e);
                    }
                } else if (index == d.f4896O4) {
                    this.f4804d = typedArrayObtainStyledAttributes.getDimension(index, this.f4804d);
                } else if (index == d.f4902P4) {
                    this.f4802b = typedArrayObtainStyledAttributes.getDimension(index, this.f4802b);
                } else if (index == d.f4908Q4) {
                    this.f4803c = typedArrayObtainStyledAttributes.getDimension(index, this.f4803c);
                } else if (index == d.f4914R4) {
                    this.f4801a = typedArrayObtainStyledAttributes.getDimension(index, this.f4801a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public a(Context context, ConstraintLayout constraintLayout, int i10) {
        this.f4791a = constraintLayout;
        a(context, i10);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0069 A[Catch: IOException -> 0x0088, XmlPullParserException -> 0x008d, TryCatch #2 {IOException -> 0x0088, XmlPullParserException -> 0x008d, blocks: (B:3:0x0008, B:32:0x0083, B:10:0x0017, B:11:0x001f, B:30:0x0069, B:13:0x0023, B:15:0x002b, B:17:0x0032, B:18:0x0036, B:21:0x003f, B:24:0x0048, B:26:0x0050, B:27:0x005d, B:29:0x0065, B:31:0x0080), top: B:39:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.content.Context r6, int r7) {
        /*
            r5 = this;
            android.content.res.Resources r0 = r6.getResources()
            android.content.res.XmlResourceParser r7 = r0.getXml(r7)
            int r0 = r7.getEventType()     // Catch: java.io.IOException -> L88 org.xmlpull.v1.XmlPullParserException -> L8d
            r1 = 0
        Ld:
            r2 = 1
            if (r0 == r2) goto L91
            if (r0 == 0) goto L80
            r2 = 2
            if (r0 == r2) goto L17
            goto L83
        L17:
            java.lang.String r0 = r7.getName()     // Catch: java.io.IOException -> L88 org.xmlpull.v1.XmlPullParserException -> L8d
            int r2 = r0.hashCode()     // Catch: java.io.IOException -> L88 org.xmlpull.v1.XmlPullParserException -> L8d
            switch(r2) {
                case -1349929691: goto L5d;
                case 80204913: goto L48;
                case 1382829617: goto L3f;
                case 1657696882: goto L36;
                case 1901439077: goto L23;
                default: goto L22;
            }     // Catch: java.io.IOException -> L88 org.xmlpull.v1.XmlPullParserException -> L8d
        L22:
            goto L69
        L23:
            java.lang.String r2 = "Variant"
            boolean r2 = r0.equals(r2)     // Catch: java.io.IOException -> L88 org.xmlpull.v1.XmlPullParserException -> L8d
            if (r2 == 0) goto L69
            H0.a$b r0 = new H0.a$b     // Catch: java.io.IOException -> L88 org.xmlpull.v1.XmlPullParserException -> L8d
            r0.<init>(r6, r7)     // Catch: java.io.IOException -> L88 org.xmlpull.v1.XmlPullParserException -> L8d
            if (r1 == 0) goto L83
            r1.a(r0)     // Catch: java.io.IOException -> L88 org.xmlpull.v1.XmlPullParserException -> L8d
            goto L83
        L36:
            java.lang.String r2 = "layoutDescription"
            boolean r2 = r0.equals(r2)     // Catch: java.io.IOException -> L88 org.xmlpull.v1.XmlPullParserException -> L8d
            if (r2 == 0) goto L69
            goto L83
        L3f:
            java.lang.String r2 = "StateSet"
            boolean r2 = r0.equals(r2)     // Catch: java.io.IOException -> L88 org.xmlpull.v1.XmlPullParserException -> L8d
            if (r2 == 0) goto L69
            goto L83
        L48:
            java.lang.String r2 = "State"
            boolean r2 = r0.equals(r2)     // Catch: java.io.IOException -> L88 org.xmlpull.v1.XmlPullParserException -> L8d
            if (r2 == 0) goto L69
            H0.a$a r1 = new H0.a$a     // Catch: java.io.IOException -> L88 org.xmlpull.v1.XmlPullParserException -> L8d
            r1.<init>(r6, r7)     // Catch: java.io.IOException -> L88 org.xmlpull.v1.XmlPullParserException -> L8d
            android.util.SparseArray r0 = r5.f4794d     // Catch: java.io.IOException -> L88 org.xmlpull.v1.XmlPullParserException -> L8d
            int r2 = r1.f4797a     // Catch: java.io.IOException -> L88 org.xmlpull.v1.XmlPullParserException -> L8d
            r0.put(r2, r1)     // Catch: java.io.IOException -> L88 org.xmlpull.v1.XmlPullParserException -> L8d
            goto L83
        L5d:
            java.lang.String r2 = "ConstraintSet"
            boolean r2 = r0.equals(r2)     // Catch: java.io.IOException -> L88 org.xmlpull.v1.XmlPullParserException -> L8d
            if (r2 == 0) goto L69
            r5.b(r6, r7)     // Catch: java.io.IOException -> L88 org.xmlpull.v1.XmlPullParserException -> L8d
            goto L83
        L69:
            java.lang.String r2 = "ConstraintLayoutStates"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L88 org.xmlpull.v1.XmlPullParserException -> L8d
            r3.<init>()     // Catch: java.io.IOException -> L88 org.xmlpull.v1.XmlPullParserException -> L8d
            java.lang.String r4 = "unknown tag "
            r3.append(r4)     // Catch: java.io.IOException -> L88 org.xmlpull.v1.XmlPullParserException -> L8d
            r3.append(r0)     // Catch: java.io.IOException -> L88 org.xmlpull.v1.XmlPullParserException -> L8d
            java.lang.String r0 = r3.toString()     // Catch: java.io.IOException -> L88 org.xmlpull.v1.XmlPullParserException -> L8d
            android.util.Log.v(r2, r0)     // Catch: java.io.IOException -> L88 org.xmlpull.v1.XmlPullParserException -> L8d
            goto L83
        L80:
            r7.getName()     // Catch: java.io.IOException -> L88 org.xmlpull.v1.XmlPullParserException -> L8d
        L83:
            int r0 = r7.next()     // Catch: java.io.IOException -> L88 org.xmlpull.v1.XmlPullParserException -> L8d
            goto Ld
        L88:
            r5 = move-exception
            r5.printStackTrace()
            goto L91
        L8d:
            r5 = move-exception
            r5.printStackTrace()
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: H0.a.a(android.content.Context, int):void");
    }

    public final void b(Context context, XmlPullParser xmlPullParser) {
        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            if ("id".equals(xmlPullParser.getAttributeName(i10))) {
                String attributeValue = xmlPullParser.getAttributeValue(i10);
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                cVar.m(context, xmlPullParser);
                this.f4795e.put(identifier, cVar);
                return;
            }
        }
    }

    public void c(H0.b bVar) {
        this.f4796f = bVar;
    }
}
