package ub;

import cb.C3090a;
import cb.C3091b;
import cb.i;
import com.google.android.filament.Box;
import com.google.android.filament.Engine;
import com.google.android.filament.IndexBuffer;
import com.google.android.filament.RenderableManager;
import com.google.android.filament.VertexBuffer;
import gc.C4205s;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import ub.AbstractC6014a;
import ub.d;
import vc.r;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends AbstractC6014a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final b f45537l = new b(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f45538m = 8;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final float f45539n = 1.0f;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C3091b f45540o = new C3091b(0.0f);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f45541p = 24;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f45542q = 24;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f45543h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C3091b f45544i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f45545j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f45546k;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AbstractC6014a.C0621a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f45547f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public C3091b f45548g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f45549h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f45550i;

        public a() {
            super(RenderableManager.PrimitiveType.TRIANGLES);
            b bVar = d.f45537l;
            this.f45547f = bVar.b();
            this.f45548g = bVar.a();
            this.f45549h = bVar.d();
            this.f45550i = bVar.c();
        }

        public static final d i(a aVar, VertexBuffer vertexBuffer, IndexBuffer indexBuffer, List offsets, Box boundingBox) {
            AbstractC4862t.e(vertexBuffer, "vertexBuffer");
            AbstractC4862t.e(indexBuffer, "indexBuffer");
            AbstractC4862t.e(offsets, "offsets");
            AbstractC4862t.e(boundingBox, "boundingBox");
            return new d(aVar.c(), aVar.d(), vertexBuffer, aVar.b(), indexBuffer, offsets, boundingBox, aVar.f45547f, aVar.f45548g, aVar.f45549h, aVar.f45550i, null);
        }

        public d h(Engine engine) {
            AbstractC4862t.e(engine, "engine");
            b bVar = d.f45537l;
            f(bVar.f(this.f45547f, this.f45548g, this.f45549h, this.f45550i));
            e(bVar.e(this.f45549h, this.f45550i));
            return (d) a(engine, new r() { // from class: ub.c
                @Override // vc.r
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    return d.a.i(this.f45536a, (VertexBuffer) obj, (IndexBuffer) obj2, (List) obj3, (Box) obj4);
                }
            });
        }

        public final a j(C3091b center) {
            AbstractC4862t.e(center, "center");
            this.f45548g = center;
            return this;
        }

        public final a k(float f10) {
            this.f45547f = f10;
            return this;
        }

        public final a l(int i10) {
            this.f45550i = i10;
            return this;
        }

        public final a m(int i10) {
            this.f45549h = i10;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {
        public /* synthetic */ b(AbstractC4854k abstractC4854k) {
            this();
        }

        public final C3091b a() {
            return d.f45540o;
        }

        public final float b() {
            return d.f45539n;
        }

        public final int c() {
            return d.f45542q;
        }

        public final int d() {
            return d.f45541p;
        }

        public final List e(int i10, int i11) {
            List listC = C4205s.c();
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10) {
                ArrayList arrayList = new ArrayList();
                int i14 = 0;
                while (i14 < i11) {
                    boolean z10 = i12 == 0;
                    boolean z11 = i12 == i10 + (-1);
                    int i15 = i14 + 1;
                    if (!z10) {
                        int i16 = i13 + i14;
                        arrayList.add(Integer.valueOf(i16));
                        arrayList.add(Integer.valueOf(i13 + i15));
                        arrayList.add(Integer.valueOf(i16 + i11 + 1));
                    }
                    if (!z11) {
                        int i17 = i13 + i15;
                        arrayList.add(Integer.valueOf(i17));
                        arrayList.add(Integer.valueOf(i17 + i11 + 1));
                        arrayList.add(Integer.valueOf(i14 + i13 + i11 + 1));
                    }
                    i14 = i15;
                }
                listC.add(arrayList);
                i13 += i11 + 1;
                i12++;
            }
            return C4205s.a(listC);
        }

        public final List f(float f10, C3091b center, int i10, int i11) {
            int i12;
            AbstractC4862t.e(center, "center");
            List listC = C4205s.c();
            if (i10 >= 0) {
                int i13 = 0;
                while (true) {
                    float f11 = i13;
                    float f12 = i10;
                    float f13 = (3.1415927f * f11) / f12;
                    if (i11 >= 0) {
                        int i14 = 0;
                        while (true) {
                            float f14 = i11;
                            double d10 = f13;
                            i12 = i13;
                            double d11 = ((i14 == i11 ? 0 : i14) * 6.2831855f) / f14;
                            float fSin = ((float) Math.sin(d10)) * ((float) Math.cos(d11));
                            float f15 = f11;
                            C3091b c3091b = new C3091b(fSin, (float) Math.cos(d10), ((float) Math.sin(d10)) * ((float) Math.sin(d11)));
                            C3091b c3091b2 = new C3091b(c3091b.a() * f10, c3091b.b() * f10, c3091b.c() * f10);
                            listC.add(new AbstractC6014a.b(new C3091b(c3091b2.a() + center.a(), c3091b2.b() + center.b(), c3091b2.c() + center.c()), i.a(c3091b2), new C3090a(1.0f - (i14 / f14), 1.0f - (f15 / f12)), null, 8, null));
                            if (i14 == i11) {
                                break;
                            }
                            i14++;
                            f11 = f15;
                            i13 = i12;
                        }
                    } else {
                        i12 = i13;
                    }
                    if (i12 == i10) {
                        break;
                    }
                    i13 = i12 + 1;
                }
            }
            return C4205s.a(listC);
        }

        public b() {
        }
    }

    public /* synthetic */ d(RenderableManager.PrimitiveType primitiveType, List list, VertexBuffer vertexBuffer, List list2, IndexBuffer indexBuffer, List list3, Box box, float f10, C3091b c3091b, int i10, int i11, AbstractC4854k abstractC4854k) {
        this(primitiveType, list, vertexBuffer, list2, indexBuffer, list3, box, f10, c3091b, i10, i11);
    }

    public d(RenderableManager.PrimitiveType primitiveType, List list, VertexBuffer vertexBuffer, List list2, IndexBuffer indexBuffer, List list3, Box box, float f10, C3091b c3091b, int i10, int i11) {
        super(primitiveType, list, vertexBuffer, list2, indexBuffer, list3, box);
        this.f45543h = f10;
        this.f45544i = c3091b;
        this.f45545j = i10;
        this.f45546k = i11;
    }
}
