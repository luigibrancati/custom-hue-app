package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.protobuf.DescriptorProtos$FileOptions;
import io.flutter.Build;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.apache.tika.pipes.PipesConfigBase;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f22299d = {0, 4, 8};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static SparseIntArray f22300e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashMap f22301a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f22302b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HashMap f22303c = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f22304a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f22305b = new d();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final C0280c f22306c = new C0280c();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final b f22307d = new b();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final e f22308e = new e();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public HashMap f22309f = new HashMap();

        public void b(ConstraintLayout.b bVar) {
            b bVar2 = this.f22307d;
            bVar.f22239d = bVar2.f22351h;
            bVar.f22241e = bVar2.f22353i;
            bVar.f22243f = bVar2.f22355j;
            bVar.f22245g = bVar2.f22357k;
            bVar.f22247h = bVar2.f22358l;
            bVar.f22249i = bVar2.f22359m;
            bVar.f22251j = bVar2.f22360n;
            bVar.f22253k = bVar2.f22361o;
            bVar.f22255l = bVar2.f22362p;
            bVar.f22263p = bVar2.f22363q;
            bVar.f22264q = bVar2.f22364r;
            bVar.f22265r = bVar2.f22365s;
            bVar.f22266s = bVar2.f22366t;
            ((ViewGroup.MarginLayoutParams) bVar).leftMargin = bVar2.f22314D;
            ((ViewGroup.MarginLayoutParams) bVar).rightMargin = bVar2.f22315E;
            ((ViewGroup.MarginLayoutParams) bVar).topMargin = bVar2.f22316F;
            ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = bVar2.f22317G;
            bVar.f22271x = bVar2.f22325O;
            bVar.f22272y = bVar2.f22324N;
            bVar.f22268u = bVar2.f22321K;
            bVar.f22270w = bVar2.f22323M;
            bVar.f22273z = bVar2.f22367u;
            bVar.f22207A = bVar2.f22368v;
            bVar.f22257m = bVar2.f22370x;
            bVar.f22259n = bVar2.f22371y;
            bVar.f22261o = bVar2.f22372z;
            bVar.f22208B = bVar2.f22369w;
            bVar.f22223Q = bVar2.f22311A;
            bVar.f22224R = bVar2.f22312B;
            bVar.f22212F = bVar2.f22326P;
            bVar.f22211E = bVar2.f22327Q;
            bVar.f22214H = bVar2.f22329S;
            bVar.f22213G = bVar2.f22328R;
            bVar.f22226T = bVar2.f22352h0;
            bVar.f22227U = bVar2.f22354i0;
            bVar.f22215I = bVar2.f22330T;
            bVar.f22216J = bVar2.f22331U;
            bVar.f22219M = bVar2.f22332V;
            bVar.f22220N = bVar2.f22333W;
            bVar.f22217K = bVar2.f22334X;
            bVar.f22218L = bVar2.f22335Y;
            bVar.f22221O = bVar2.f22336Z;
            bVar.f22222P = bVar2.f22338a0;
            bVar.f22225S = bVar2.f22313C;
            bVar.f22237c = bVar2.f22349g;
            bVar.f22233a = bVar2.f22345e;
            bVar.f22235b = bVar2.f22347f;
            ((ViewGroup.MarginLayoutParams) bVar).width = bVar2.f22341c;
            ((ViewGroup.MarginLayoutParams) bVar).height = bVar2.f22343d;
            String str = bVar2.f22350g0;
            if (str != null) {
                bVar.f22228V = str;
            }
            bVar.setMarginStart(bVar2.f22319I);
            bVar.setMarginEnd(this.f22307d.f22318H);
            bVar.a();
        }

        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public a clone() {
            a aVar = new a();
            aVar.f22307d.a(this.f22307d);
            aVar.f22306c.a(this.f22306c);
            aVar.f22305b.a(this.f22305b);
            aVar.f22308e.a(this.f22308e);
            aVar.f22304a = this.f22304a;
            return aVar;
        }

        public final void d(int i10, ConstraintLayout.b bVar) {
            this.f22304a = i10;
            b bVar2 = this.f22307d;
            bVar2.f22351h = bVar.f22239d;
            bVar2.f22353i = bVar.f22241e;
            bVar2.f22355j = bVar.f22243f;
            bVar2.f22357k = bVar.f22245g;
            bVar2.f22358l = bVar.f22247h;
            bVar2.f22359m = bVar.f22249i;
            bVar2.f22360n = bVar.f22251j;
            bVar2.f22361o = bVar.f22253k;
            bVar2.f22362p = bVar.f22255l;
            bVar2.f22363q = bVar.f22263p;
            bVar2.f22364r = bVar.f22264q;
            bVar2.f22365s = bVar.f22265r;
            bVar2.f22366t = bVar.f22266s;
            bVar2.f22367u = bVar.f22273z;
            bVar2.f22368v = bVar.f22207A;
            bVar2.f22369w = bVar.f22208B;
            bVar2.f22370x = bVar.f22257m;
            bVar2.f22371y = bVar.f22259n;
            bVar2.f22372z = bVar.f22261o;
            bVar2.f22311A = bVar.f22223Q;
            bVar2.f22312B = bVar.f22224R;
            bVar2.f22313C = bVar.f22225S;
            bVar2.f22349g = bVar.f22237c;
            bVar2.f22345e = bVar.f22233a;
            bVar2.f22347f = bVar.f22235b;
            bVar2.f22341c = ((ViewGroup.MarginLayoutParams) bVar).width;
            bVar2.f22343d = ((ViewGroup.MarginLayoutParams) bVar).height;
            bVar2.f22314D = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            bVar2.f22315E = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
            bVar2.f22316F = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            bVar2.f22317G = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
            bVar2.f22326P = bVar.f22212F;
            bVar2.f22327Q = bVar.f22211E;
            bVar2.f22329S = bVar.f22214H;
            bVar2.f22328R = bVar.f22213G;
            bVar2.f22352h0 = bVar.f22226T;
            bVar2.f22354i0 = bVar.f22227U;
            bVar2.f22330T = bVar.f22215I;
            bVar2.f22331U = bVar.f22216J;
            bVar2.f22332V = bVar.f22219M;
            bVar2.f22333W = bVar.f22220N;
            bVar2.f22334X = bVar.f22217K;
            bVar2.f22335Y = bVar.f22218L;
            bVar2.f22336Z = bVar.f22221O;
            bVar2.f22338a0 = bVar.f22222P;
            bVar2.f22350g0 = bVar.f22228V;
            bVar2.f22321K = bVar.f22268u;
            bVar2.f22323M = bVar.f22270w;
            bVar2.f22320J = bVar.f22267t;
            bVar2.f22322L = bVar.f22269v;
            bVar2.f22325O = bVar.f22271x;
            bVar2.f22324N = bVar.f22272y;
            bVar2.f22318H = bVar.getMarginEnd();
            this.f22307d.f22319I = bVar.getMarginStart();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b {

        /* JADX INFO: renamed from: k0, reason: collision with root package name */
        public static SparseIntArray f22310k0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f22341c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f22343d;

        /* JADX INFO: renamed from: e0, reason: collision with root package name */
        public int[] f22346e0;

        /* JADX INFO: renamed from: f0, reason: collision with root package name */
        public String f22348f0;

        /* JADX INFO: renamed from: g0, reason: collision with root package name */
        public String f22350g0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f22337a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f22339b = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f22345e = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f22347f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f22349g = -1.0f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f22351h = -1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f22353i = -1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f22355j = -1;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f22357k = -1;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f22358l = -1;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f22359m = -1;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f22360n = -1;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f22361o = -1;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f22362p = -1;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f22363q = -1;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f22364r = -1;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f22365s = -1;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f22366t = -1;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public float f22367u = 0.5f;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public float f22368v = 0.5f;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public String f22369w = null;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f22370x = -1;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f22371y = 0;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public float f22372z = 0.0f;

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public int f22311A = -1;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public int f22312B = -1;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public int f22313C = -1;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public int f22314D = -1;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public int f22315E = -1;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public int f22316F = -1;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        public int f22317G = -1;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        public int f22318H = -1;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public int f22319I = -1;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        public int f22320J = -1;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        public int f22321K = -1;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public int f22322L = -1;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        public int f22323M = -1;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        public int f22324N = -1;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public int f22325O = -1;

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        public float f22326P = -1.0f;

        /* JADX INFO: renamed from: Q, reason: collision with root package name */
        public float f22327Q = -1.0f;

        /* JADX INFO: renamed from: R, reason: collision with root package name */
        public int f22328R = 0;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        public int f22329S = 0;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        public int f22330T = 0;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        public int f22331U = 0;

        /* JADX INFO: renamed from: V, reason: collision with root package name */
        public int f22332V = -1;

        /* JADX INFO: renamed from: W, reason: collision with root package name */
        public int f22333W = -1;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        public int f22334X = -1;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public int f22335Y = -1;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        public float f22336Z = 1.0f;

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        public float f22338a0 = 1.0f;

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        public int f22340b0 = -1;

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        public int f22342c0 = 0;

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        public int f22344d0 = -1;

        /* JADX INFO: renamed from: h0, reason: collision with root package name */
        public boolean f22352h0 = false;

        /* JADX INFO: renamed from: i0, reason: collision with root package name */
        public boolean f22354i0 = false;

        /* JADX INFO: renamed from: j0, reason: collision with root package name */
        public boolean f22356j0 = true;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f22310k0 = sparseIntArray;
            sparseIntArray.append(H0.d.f5058q3, 24);
            f22310k0.append(H0.d.f5064r3, 25);
            f22310k0.append(H0.d.f5076t3, 28);
            f22310k0.append(H0.d.f5082u3, 29);
            f22310k0.append(H0.d.f5112z3, 35);
            f22310k0.append(H0.d.f5106y3, 34);
            f22310k0.append(H0.d.f4968b3, 4);
            f22310k0.append(H0.d.f4962a3, 3);
            f22310k0.append(H0.d.f4951Y2, 1);
            f22310k0.append(H0.d.f4835E3, 6);
            f22310k0.append(H0.d.f4841F3, 7);
            f22310k0.append(H0.d.f5010i3, 17);
            f22310k0.append(H0.d.f5016j3, 18);
            f22310k0.append(H0.d.f5022k3, 19);
            f22310k0.append(H0.d.f4864J2, 26);
            f22310k0.append(H0.d.f5088v3, 31);
            f22310k0.append(H0.d.f5094w3, 32);
            f22310k0.append(H0.d.f5004h3, 10);
            f22310k0.append(H0.d.f4998g3, 9);
            f22310k0.append(H0.d.f4859I3, 13);
            f22310k0.append(H0.d.f4877L3, 16);
            f22310k0.append(H0.d.f4865J3, 14);
            f22310k0.append(H0.d.f4847G3, 11);
            f22310k0.append(H0.d.f4871K3, 15);
            f22310k0.append(H0.d.f4853H3, 12);
            f22310k0.append(H0.d.f4823C3, 38);
            f22310k0.append(H0.d.f5046o3, 37);
            f22310k0.append(H0.d.f5040n3, 39);
            f22310k0.append(H0.d.f4817B3, 40);
            f22310k0.append(H0.d.f5034m3, 20);
            f22310k0.append(H0.d.f4811A3, 36);
            f22310k0.append(H0.d.f4992f3, 5);
            f22310k0.append(H0.d.f5052p3, 76);
            f22310k0.append(H0.d.f5100x3, 76);
            f22310k0.append(H0.d.f5070s3, 76);
            f22310k0.append(H0.d.f4956Z2, 76);
            f22310k0.append(H0.d.f4946X2, 76);
            f22310k0.append(H0.d.f4882M2, 23);
            f22310k0.append(H0.d.f4894O2, 27);
            f22310k0.append(H0.d.f4906Q2, 30);
            f22310k0.append(H0.d.f4912R2, 8);
            f22310k0.append(H0.d.f4888N2, 33);
            f22310k0.append(H0.d.f4900P2, 2);
            f22310k0.append(H0.d.f4870K2, 22);
            f22310k0.append(H0.d.f4876L2, 21);
            f22310k0.append(H0.d.f4974c3, 61);
            f22310k0.append(H0.d.f4986e3, 62);
            f22310k0.append(H0.d.f4980d3, 63);
            f22310k0.append(H0.d.f4829D3, 69);
            f22310k0.append(H0.d.f5028l3, 70);
            f22310k0.append(H0.d.f4936V2, 71);
            f22310k0.append(H0.d.f4924T2, 72);
            f22310k0.append(H0.d.f4930U2, 73);
            f22310k0.append(H0.d.f4941W2, 74);
            f22310k0.append(H0.d.f4918S2, 75);
        }

        public void a(b bVar) {
            this.f22337a = bVar.f22337a;
            this.f22341c = bVar.f22341c;
            this.f22339b = bVar.f22339b;
            this.f22343d = bVar.f22343d;
            this.f22345e = bVar.f22345e;
            this.f22347f = bVar.f22347f;
            this.f22349g = bVar.f22349g;
            this.f22351h = bVar.f22351h;
            this.f22353i = bVar.f22353i;
            this.f22355j = bVar.f22355j;
            this.f22357k = bVar.f22357k;
            this.f22358l = bVar.f22358l;
            this.f22359m = bVar.f22359m;
            this.f22360n = bVar.f22360n;
            this.f22361o = bVar.f22361o;
            this.f22362p = bVar.f22362p;
            this.f22363q = bVar.f22363q;
            this.f22364r = bVar.f22364r;
            this.f22365s = bVar.f22365s;
            this.f22366t = bVar.f22366t;
            this.f22367u = bVar.f22367u;
            this.f22368v = bVar.f22368v;
            this.f22369w = bVar.f22369w;
            this.f22370x = bVar.f22370x;
            this.f22371y = bVar.f22371y;
            this.f22372z = bVar.f22372z;
            this.f22311A = bVar.f22311A;
            this.f22312B = bVar.f22312B;
            this.f22313C = bVar.f22313C;
            this.f22314D = bVar.f22314D;
            this.f22315E = bVar.f22315E;
            this.f22316F = bVar.f22316F;
            this.f22317G = bVar.f22317G;
            this.f22318H = bVar.f22318H;
            this.f22319I = bVar.f22319I;
            this.f22320J = bVar.f22320J;
            this.f22321K = bVar.f22321K;
            this.f22322L = bVar.f22322L;
            this.f22323M = bVar.f22323M;
            this.f22324N = bVar.f22324N;
            this.f22325O = bVar.f22325O;
            this.f22326P = bVar.f22326P;
            this.f22327Q = bVar.f22327Q;
            this.f22328R = bVar.f22328R;
            this.f22329S = bVar.f22329S;
            this.f22330T = bVar.f22330T;
            this.f22331U = bVar.f22331U;
            this.f22332V = bVar.f22332V;
            this.f22333W = bVar.f22333W;
            this.f22334X = bVar.f22334X;
            this.f22335Y = bVar.f22335Y;
            this.f22336Z = bVar.f22336Z;
            this.f22338a0 = bVar.f22338a0;
            this.f22340b0 = bVar.f22340b0;
            this.f22342c0 = bVar.f22342c0;
            this.f22344d0 = bVar.f22344d0;
            this.f22350g0 = bVar.f22350g0;
            int[] iArr = bVar.f22346e0;
            if (iArr != null) {
                this.f22346e0 = Arrays.copyOf(iArr, iArr.length);
            } else {
                this.f22346e0 = null;
            }
            this.f22348f0 = bVar.f22348f0;
            this.f22352h0 = bVar.f22352h0;
            this.f22354i0 = bVar.f22354i0;
            this.f22356j0 = bVar.f22356j0;
        }

        public void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, H0.d.f4858I2);
            this.f22339b = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                int i11 = f22310k0.get(index);
                if (i11 == 80) {
                    this.f22352h0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f22352h0);
                } else if (i11 != 81) {
                    switch (i11) {
                        case 1:
                            this.f22362p = c.n(typedArrayObtainStyledAttributes, index, this.f22362p);
                            break;
                        case 2:
                            this.f22317G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22317G);
                            break;
                        case 3:
                            this.f22361o = c.n(typedArrayObtainStyledAttributes, index, this.f22361o);
                            break;
                        case 4:
                            this.f22360n = c.n(typedArrayObtainStyledAttributes, index, this.f22360n);
                            break;
                        case 5:
                            this.f22369w = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            this.f22311A = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f22311A);
                            break;
                        case 7:
                            this.f22312B = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f22312B);
                            break;
                        case 8:
                            this.f22318H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22318H);
                            break;
                        case 9:
                            this.f22366t = c.n(typedArrayObtainStyledAttributes, index, this.f22366t);
                            break;
                        case 10:
                            this.f22365s = c.n(typedArrayObtainStyledAttributes, index, this.f22365s);
                            break;
                        case 11:
                            this.f22323M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22323M);
                            break;
                        case 12:
                            this.f22324N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22324N);
                            break;
                        case 13:
                            this.f22320J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22320J);
                            break;
                        case 14:
                            this.f22322L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22322L);
                            break;
                        case 15:
                            this.f22325O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22325O);
                            break;
                        case 16:
                            this.f22321K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22321K);
                            break;
                        case 17:
                            this.f22345e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f22345e);
                            break;
                        case 18:
                            this.f22347f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f22347f);
                            break;
                        case 19:
                            this.f22349g = typedArrayObtainStyledAttributes.getFloat(index, this.f22349g);
                            break;
                        case 20:
                            this.f22367u = typedArrayObtainStyledAttributes.getFloat(index, this.f22367u);
                            break;
                        case 21:
                            this.f22343d = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f22343d);
                            break;
                        case 22:
                            this.f22341c = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f22341c);
                            break;
                        case 23:
                            this.f22314D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22314D);
                            break;
                        case 24:
                            this.f22351h = c.n(typedArrayObtainStyledAttributes, index, this.f22351h);
                            break;
                        case 25:
                            this.f22353i = c.n(typedArrayObtainStyledAttributes, index, this.f22353i);
                            break;
                        case 26:
                            this.f22313C = typedArrayObtainStyledAttributes.getInt(index, this.f22313C);
                            break;
                        case 27:
                            this.f22315E = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22315E);
                            break;
                        case 28:
                            this.f22355j = c.n(typedArrayObtainStyledAttributes, index, this.f22355j);
                            break;
                        case 29:
                            this.f22357k = c.n(typedArrayObtainStyledAttributes, index, this.f22357k);
                            break;
                        case Build.API_LEVELS.API_30 /* 30 */:
                            this.f22319I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22319I);
                            break;
                        case 31:
                            this.f22363q = c.n(typedArrayObtainStyledAttributes, index, this.f22363q);
                            break;
                        case 32:
                            this.f22364r = c.n(typedArrayObtainStyledAttributes, index, this.f22364r);
                            break;
                        case 33:
                            this.f22316F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22316F);
                            break;
                        case 34:
                            this.f22359m = c.n(typedArrayObtainStyledAttributes, index, this.f22359m);
                            break;
                        case 35:
                            this.f22358l = c.n(typedArrayObtainStyledAttributes, index, this.f22358l);
                            break;
                        case 36:
                            this.f22368v = typedArrayObtainStyledAttributes.getFloat(index, this.f22368v);
                            break;
                        case 37:
                            this.f22327Q = typedArrayObtainStyledAttributes.getFloat(index, this.f22327Q);
                            break;
                        case 38:
                            this.f22326P = typedArrayObtainStyledAttributes.getFloat(index, this.f22326P);
                            break;
                        case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                            this.f22328R = typedArrayObtainStyledAttributes.getInt(index, this.f22328R);
                            break;
                        case DescriptorProtos$FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                            this.f22329S = typedArrayObtainStyledAttributes.getInt(index, this.f22329S);
                            break;
                        default:
                            switch (i11) {
                                case 54:
                                    this.f22330T = typedArrayObtainStyledAttributes.getInt(index, this.f22330T);
                                    break;
                                case 55:
                                    this.f22331U = typedArrayObtainStyledAttributes.getInt(index, this.f22331U);
                                    break;
                                case 56:
                                    this.f22332V = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22332V);
                                    break;
                                case 57:
                                    this.f22333W = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22333W);
                                    break;
                                case 58:
                                    this.f22334X = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22334X);
                                    break;
                                case 59:
                                    this.f22335Y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22335Y);
                                    break;
                                default:
                                    switch (i11) {
                                        case 61:
                                            this.f22370x = c.n(typedArrayObtainStyledAttributes, index, this.f22370x);
                                            break;
                                        case 62:
                                            this.f22371y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22371y);
                                            break;
                                        case 63:
                                            this.f22372z = typedArrayObtainStyledAttributes.getFloat(index, this.f22372z);
                                            break;
                                        default:
                                            switch (i11) {
                                                case 69:
                                                    this.f22336Z = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 70:
                                                    this.f22338a0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 71:
                                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                    break;
                                                case 72:
                                                    this.f22340b0 = typedArrayObtainStyledAttributes.getInt(index, this.f22340b0);
                                                    break;
                                                case 73:
                                                    this.f22342c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22342c0);
                                                    break;
                                                case 74:
                                                    this.f22348f0 = typedArrayObtainStyledAttributes.getString(index);
                                                    break;
                                                case 75:
                                                    this.f22356j0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f22356j0);
                                                    break;
                                                case 76:
                                                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f22310k0.get(index));
                                                    break;
                                                case 77:
                                                    this.f22350g0 = typedArrayObtainStyledAttributes.getString(index);
                                                    break;
                                                default:
                                                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f22310k0.get(index));
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                } else {
                    this.f22354i0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f22354i0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class C0280c {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static SparseIntArray f22373h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f22374a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f22375b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f22376c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f22377d = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f22378e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f22379f = Float.NaN;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f22380g = Float.NaN;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f22373h = sparseIntArray;
            sparseIntArray.append(H0.d.f4942W3, 1);
            f22373h.append(H0.d.f4952Y3, 2);
            f22373h.append(H0.d.f4957Z3, 3);
            f22373h.append(H0.d.f4937V3, 4);
            f22373h.append(H0.d.f4931U3, 5);
            f22373h.append(H0.d.f4947X3, 6);
        }

        public void a(C0280c c0280c) {
            this.f22374a = c0280c.f22374a;
            this.f22375b = c0280c.f22375b;
            this.f22376c = c0280c.f22376c;
            this.f22377d = c0280c.f22377d;
            this.f22378e = c0280c.f22378e;
            this.f22380g = c0280c.f22380g;
            this.f22379f = c0280c.f22379f;
        }

        public void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, H0.d.f4925T3);
            this.f22374a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                switch (f22373h.get(index)) {
                    case 1:
                        this.f22380g = typedArrayObtainStyledAttributes.getFloat(index, this.f22380g);
                        break;
                    case 2:
                        this.f22377d = typedArrayObtainStyledAttributes.getInt(index, this.f22377d);
                        break;
                    case 3:
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            this.f22376c = typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            this.f22376c = C0.a.f874c[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        }
                        break;
                    case 4:
                        this.f22378e = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f22375b = c.n(typedArrayObtainStyledAttributes, index, this.f22375b);
                        break;
                    case 6:
                        this.f22379f = typedArrayObtainStyledAttributes.getFloat(index, this.f22379f);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f22381a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f22382b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f22383c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f22384d = 1.0f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f22385e = Float.NaN;

        public void a(d dVar) {
            this.f22381a = dVar.f22381a;
            this.f22382b = dVar.f22382b;
            this.f22384d = dVar.f22384d;
            this.f22385e = dVar.f22385e;
            this.f22383c = dVar.f22383c;
        }

        public void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, H0.d.f5011i4);
            this.f22381a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == H0.d.f5023k4) {
                    this.f22384d = typedArrayObtainStyledAttributes.getFloat(index, this.f22384d);
                } else if (index == H0.d.f5017j4) {
                    this.f22382b = typedArrayObtainStyledAttributes.getInt(index, this.f22382b);
                    this.f22382b = c.f22299d[this.f22382b];
                } else if (index == H0.d.f5035m4) {
                    this.f22383c = typedArrayObtainStyledAttributes.getInt(index, this.f22383c);
                } else if (index == H0.d.f5029l4) {
                    this.f22385e = typedArrayObtainStyledAttributes.getFloat(index, this.f22385e);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class e {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static SparseIntArray f22386n;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f22387a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f22388b = 0.0f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f22389c = 0.0f;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f22390d = 0.0f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f22391e = 1.0f;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f22392f = 1.0f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f22393g = Float.NaN;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f22394h = Float.NaN;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f22395i = 0.0f;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f22396j = 0.0f;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f22397k = 0.0f;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f22398l = false;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public float f22399m = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f22386n = sparseIntArray;
            sparseIntArray.append(H0.d.f4848G4, 1);
            f22386n.append(H0.d.f4854H4, 2);
            f22386n.append(H0.d.f4860I4, 3);
            f22386n.append(H0.d.f4836E4, 4);
            f22386n.append(H0.d.f4842F4, 5);
            f22386n.append(H0.d.f4812A4, 6);
            f22386n.append(H0.d.f4818B4, 7);
            f22386n.append(H0.d.f4824C4, 8);
            f22386n.append(H0.d.f4830D4, 9);
            f22386n.append(H0.d.f4866J4, 10);
            f22386n.append(H0.d.f4872K4, 11);
        }

        public void a(e eVar) {
            this.f22387a = eVar.f22387a;
            this.f22388b = eVar.f22388b;
            this.f22389c = eVar.f22389c;
            this.f22390d = eVar.f22390d;
            this.f22391e = eVar.f22391e;
            this.f22392f = eVar.f22392f;
            this.f22393g = eVar.f22393g;
            this.f22394h = eVar.f22394h;
            this.f22395i = eVar.f22395i;
            this.f22396j = eVar.f22396j;
            this.f22397k = eVar.f22397k;
            this.f22398l = eVar.f22398l;
            this.f22399m = eVar.f22399m;
        }

        public void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, H0.d.f5113z4);
            this.f22387a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                switch (f22386n.get(index)) {
                    case 1:
                        this.f22388b = typedArrayObtainStyledAttributes.getFloat(index, this.f22388b);
                        break;
                    case 2:
                        this.f22389c = typedArrayObtainStyledAttributes.getFloat(index, this.f22389c);
                        break;
                    case 3:
                        this.f22390d = typedArrayObtainStyledAttributes.getFloat(index, this.f22390d);
                        break;
                    case 4:
                        this.f22391e = typedArrayObtainStyledAttributes.getFloat(index, this.f22391e);
                        break;
                    case 5:
                        this.f22392f = typedArrayObtainStyledAttributes.getFloat(index, this.f22392f);
                        break;
                    case 6:
                        this.f22393g = typedArrayObtainStyledAttributes.getDimension(index, this.f22393g);
                        break;
                    case 7:
                        this.f22394h = typedArrayObtainStyledAttributes.getDimension(index, this.f22394h);
                        break;
                    case 8:
                        this.f22395i = typedArrayObtainStyledAttributes.getDimension(index, this.f22395i);
                        break;
                    case 9:
                        this.f22396j = typedArrayObtainStyledAttributes.getDimension(index, this.f22396j);
                        break;
                    case 10:
                        this.f22397k = typedArrayObtainStyledAttributes.getDimension(index, this.f22397k);
                        break;
                    case 11:
                        this.f22398l = true;
                        this.f22399m = typedArrayObtainStyledAttributes.getDimension(index, this.f22399m);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f22300e = sparseIntArray;
        sparseIntArray.append(H0.d.f5079u0, 25);
        f22300e.append(H0.d.f5085v0, 26);
        f22300e.append(H0.d.f5097x0, 29);
        f22300e.append(H0.d.f5103y0, 30);
        f22300e.append(H0.d.f4832E0, 36);
        f22300e.append(H0.d.f4826D0, 35);
        f22300e.append(H0.d.f4971c0, 4);
        f22300e.append(H0.d.f4965b0, 3);
        f22300e.append(H0.d.f4953Z, 1);
        f22300e.append(H0.d.f4880M0, 6);
        f22300e.append(H0.d.f4886N0, 7);
        f22300e.append(H0.d.f5013j0, 17);
        f22300e.append(H0.d.f5019k0, 18);
        f22300e.append(H0.d.f5025l0, 19);
        f22300e.append(H0.d.f5066s, 27);
        f22300e.append(H0.d.f5109z0, 32);
        f22300e.append(H0.d.f4808A0, 33);
        f22300e.append(H0.d.f5007i0, 10);
        f22300e.append(H0.d.f5001h0, 9);
        f22300e.append(H0.d.f4904Q0, 13);
        f22300e.append(H0.d.f4922T0, 16);
        f22300e.append(H0.d.f4910R0, 14);
        f22300e.append(H0.d.f4892O0, 11);
        f22300e.append(H0.d.f4916S0, 15);
        f22300e.append(H0.d.f4898P0, 12);
        f22300e.append(H0.d.f4850H0, 40);
        f22300e.append(H0.d.f5067s0, 39);
        f22300e.append(H0.d.f5061r0, 41);
        f22300e.append(H0.d.f4844G0, 42);
        f22300e.append(H0.d.f5055q0, 20);
        f22300e.append(H0.d.f4838F0, 37);
        f22300e.append(H0.d.f4995g0, 5);
        f22300e.append(H0.d.f5073t0, 82);
        f22300e.append(H0.d.f4820C0, 82);
        f22300e.append(H0.d.f5091w0, 82);
        f22300e.append(H0.d.f4959a0, 82);
        f22300e.append(H0.d.f4948Y, 82);
        f22300e.append(H0.d.f5096x, 24);
        f22300e.append(H0.d.f5108z, 28);
        f22300e.append(H0.d.f4873L, 31);
        f22300e.append(H0.d.f4879M, 8);
        f22300e.append(H0.d.f5102y, 34);
        f22300e.append(H0.d.f4807A, 2);
        f22300e.append(H0.d.f5084v, 23);
        f22300e.append(H0.d.f5090w, 21);
        f22300e.append(H0.d.f5078u, 22);
        f22300e.append(H0.d.f4813B, 43);
        f22300e.append(H0.d.f4891O, 44);
        f22300e.append(H0.d.f4861J, 45);
        f22300e.append(H0.d.f4867K, 46);
        f22300e.append(H0.d.f4855I, 60);
        f22300e.append(H0.d.f4843G, 47);
        f22300e.append(H0.d.f4849H, 48);
        f22300e.append(H0.d.f4819C, 49);
        f22300e.append(H0.d.f4825D, 50);
        f22300e.append(H0.d.f4831E, 51);
        f22300e.append(H0.d.f4837F, 52);
        f22300e.append(H0.d.f4885N, 53);
        f22300e.append(H0.d.f4856I0, 54);
        f22300e.append(H0.d.f5031m0, 55);
        f22300e.append(H0.d.f4862J0, 56);
        f22300e.append(H0.d.f5037n0, 57);
        f22300e.append(H0.d.f4868K0, 58);
        f22300e.append(H0.d.f5043o0, 59);
        f22300e.append(H0.d.f4977d0, 61);
        f22300e.append(H0.d.f4989f0, 62);
        f22300e.append(H0.d.f4983e0, 63);
        f22300e.append(H0.d.f4897P, 64);
        f22300e.append(H0.d.f4944X0, 65);
        f22300e.append(H0.d.f4933V, 66);
        f22300e.append(H0.d.f4949Y0, 67);
        f22300e.append(H0.d.f4934V0, 79);
        f22300e.append(H0.d.f5072t, 38);
        f22300e.append(H0.d.f4928U0, 68);
        f22300e.append(H0.d.f4874L0, 69);
        f22300e.append(H0.d.f5049p0, 70);
        f22300e.append(H0.d.f4921T, 71);
        f22300e.append(H0.d.f4909R, 72);
        f22300e.append(H0.d.f4915S, 73);
        f22300e.append(H0.d.f4927U, 74);
        f22300e.append(H0.d.f4903Q, 75);
        f22300e.append(H0.d.f4939W0, 76);
        f22300e.append(H0.d.f4814B0, 77);
        f22300e.append(H0.d.f4954Z0, 78);
        f22300e.append(H0.d.f4943X, 80);
        f22300e.append(H0.d.f4938W, 81);
    }

    public static int n(TypedArray typedArray, int i10, int i11) {
        int resourceId = typedArray.getResourceId(i10, i11);
        return resourceId == -1 ? typedArray.getInt(i10, -1) : resourceId;
    }

    public void c(ConstraintLayout constraintLayout) {
        d(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public void d(ConstraintLayout constraintLayout, boolean z10) {
        int childCount = constraintLayout.getChildCount();
        HashSet<Integer> hashSet = new HashSet(this.f22303c.keySet());
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            int id2 = childAt.getId();
            if (!this.f22303c.containsKey(Integer.valueOf(id2))) {
                Log.w("ConstraintSet", "id unknown " + D0.a.a(childAt));
            } else {
                if (this.f22302b && id2 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id2 != -1) {
                    if (this.f22303c.containsKey(Integer.valueOf(id2))) {
                        hashSet.remove(Integer.valueOf(id2));
                        a aVar = (a) this.f22303c.get(Integer.valueOf(id2));
                        if (childAt instanceof Barrier) {
                            aVar.f22307d.f22344d0 = 1;
                        }
                        int i11 = aVar.f22307d.f22344d0;
                        if (i11 != -1 && i11 == 1) {
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id2);
                            barrier.setType(aVar.f22307d.f22340b0);
                            barrier.setMargin(aVar.f22307d.f22342c0);
                            barrier.setAllowsGoneWidget(aVar.f22307d.f22356j0);
                            b bVar = aVar.f22307d;
                            int[] iArr = bVar.f22346e0;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str = bVar.f22348f0;
                                if (str != null) {
                                    bVar.f22346e0 = i(barrier, str);
                                    barrier.setReferencedIds(aVar.f22307d.f22346e0);
                                }
                            }
                        }
                        ConstraintLayout.b bVar2 = (ConstraintLayout.b) childAt.getLayoutParams();
                        bVar2.a();
                        aVar.b(bVar2);
                        if (z10) {
                            androidx.constraintlayout.widget.a.c(childAt, aVar.f22309f);
                        }
                        childAt.setLayoutParams(bVar2);
                        d dVar = aVar.f22305b;
                        if (dVar.f22383c == 0) {
                            childAt.setVisibility(dVar.f22382b);
                        }
                        childAt.setAlpha(aVar.f22305b.f22384d);
                        childAt.setRotation(aVar.f22308e.f22388b);
                        childAt.setRotationX(aVar.f22308e.f22389c);
                        childAt.setRotationY(aVar.f22308e.f22390d);
                        childAt.setScaleX(aVar.f22308e.f22391e);
                        childAt.setScaleY(aVar.f22308e.f22392f);
                        if (!Float.isNaN(aVar.f22308e.f22393g)) {
                            childAt.setPivotX(aVar.f22308e.f22393g);
                        }
                        if (!Float.isNaN(aVar.f22308e.f22394h)) {
                            childAt.setPivotY(aVar.f22308e.f22394h);
                        }
                        childAt.setTranslationX(aVar.f22308e.f22395i);
                        childAt.setTranslationY(aVar.f22308e.f22396j);
                        childAt.setTranslationZ(aVar.f22308e.f22397k);
                        e eVar = aVar.f22308e;
                        if (eVar.f22398l) {
                            childAt.setElevation(eVar.f22399m);
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id2);
                    }
                }
            }
        }
        for (Integer num : hashSet) {
            a aVar2 = (a) this.f22303c.get(num);
            int i12 = aVar2.f22307d.f22344d0;
            if (i12 != -1 && i12 == 1) {
                Barrier barrier2 = new Barrier(constraintLayout.getContext());
                barrier2.setId(num.intValue());
                b bVar3 = aVar2.f22307d;
                int[] iArr2 = bVar3.f22346e0;
                if (iArr2 != null) {
                    barrier2.setReferencedIds(iArr2);
                } else {
                    String str2 = bVar3.f22348f0;
                    if (str2 != null) {
                        bVar3.f22346e0 = i(barrier2, str2);
                        barrier2.setReferencedIds(aVar2.f22307d.f22346e0);
                    }
                }
                barrier2.setType(aVar2.f22307d.f22340b0);
                barrier2.setMargin(aVar2.f22307d.f22342c0);
                ConstraintLayout.b bVarD = constraintLayout.generateDefaultLayoutParams();
                barrier2.k();
                aVar2.b(bVarD);
                constraintLayout.addView(barrier2, bVarD);
            }
            if (aVar2.f22307d.f22337a) {
                View guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                ConstraintLayout.b bVarD2 = constraintLayout.generateDefaultLayoutParams();
                aVar2.b(bVarD2);
                constraintLayout.addView(guideline, bVarD2);
            }
        }
    }

    public void e(int i10, int i11) {
        if (this.f22303c.containsKey(Integer.valueOf(i10))) {
            a aVar = (a) this.f22303c.get(Integer.valueOf(i10));
            switch (i11) {
                case 1:
                    b bVar = aVar.f22307d;
                    bVar.f22353i = -1;
                    bVar.f22351h = -1;
                    bVar.f22314D = -1;
                    bVar.f22320J = -1;
                    return;
                case 2:
                    b bVar2 = aVar.f22307d;
                    bVar2.f22357k = -1;
                    bVar2.f22355j = -1;
                    bVar2.f22315E = -1;
                    bVar2.f22322L = -1;
                    return;
                case 3:
                    b bVar3 = aVar.f22307d;
                    bVar3.f22359m = -1;
                    bVar3.f22358l = -1;
                    bVar3.f22316F = -1;
                    bVar3.f22321K = -1;
                    return;
                case 4:
                    b bVar4 = aVar.f22307d;
                    bVar4.f22360n = -1;
                    bVar4.f22361o = -1;
                    bVar4.f22317G = -1;
                    bVar4.f22323M = -1;
                    return;
                case 5:
                    aVar.f22307d.f22362p = -1;
                    return;
                case 6:
                    b bVar5 = aVar.f22307d;
                    bVar5.f22363q = -1;
                    bVar5.f22364r = -1;
                    bVar5.f22319I = -1;
                    bVar5.f22325O = -1;
                    return;
                case 7:
                    b bVar6 = aVar.f22307d;
                    bVar6.f22365s = -1;
                    bVar6.f22366t = -1;
                    bVar6.f22318H = -1;
                    bVar6.f22324N = -1;
                    return;
                default:
                    throw new IllegalArgumentException("unknown constraint");
            }
        }
    }

    public void f(Context context, int i10) {
        g((ConstraintLayout) LayoutInflater.from(context).inflate(i10, (ViewGroup) null));
    }

    public void g(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f22303c.clear();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (this.f22302b && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f22303c.containsKey(Integer.valueOf(id2))) {
                this.f22303c.put(Integer.valueOf(id2), new a());
            }
            a aVar = (a) this.f22303c.get(Integer.valueOf(id2));
            aVar.f22309f = androidx.constraintlayout.widget.a.a(this.f22301a, childAt);
            aVar.d(id2, bVar);
            aVar.f22305b.f22382b = childAt.getVisibility();
            aVar.f22305b.f22384d = childAt.getAlpha();
            aVar.f22308e.f22388b = childAt.getRotation();
            aVar.f22308e.f22389c = childAt.getRotationX();
            aVar.f22308e.f22390d = childAt.getRotationY();
            aVar.f22308e.f22391e = childAt.getScaleX();
            aVar.f22308e.f22392f = childAt.getScaleY();
            float pivotX = childAt.getPivotX();
            float pivotY = childAt.getPivotY();
            if (pivotX != 0.0d || pivotY != 0.0d) {
                e eVar = aVar.f22308e;
                eVar.f22393g = pivotX;
                eVar.f22394h = pivotY;
            }
            aVar.f22308e.f22395i = childAt.getTranslationX();
            aVar.f22308e.f22396j = childAt.getTranslationY();
            aVar.f22308e.f22397k = childAt.getTranslationZ();
            e eVar2 = aVar.f22308e;
            if (eVar2.f22398l) {
                eVar2.f22399m = childAt.getElevation();
            }
            if (childAt instanceof Barrier) {
                Barrier barrier = (Barrier) childAt;
                aVar.f22307d.f22356j0 = barrier.l();
                aVar.f22307d.f22346e0 = barrier.getReferencedIds();
                aVar.f22307d.f22340b0 = barrier.getType();
                aVar.f22307d.f22342c0 = barrier.getMargin();
            }
        }
    }

    public void h(int i10, int i11, int i12, float f10) {
        b bVar = k(i10).f22307d;
        bVar.f22370x = i11;
        bVar.f22371y = i12;
        bVar.f22372z = f10;
    }

    public final int[] i(View view, String str) {
        int iIntValue;
        Object objF;
        String[] strArrSplit = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i10 = 0;
        int i11 = 0;
        while (i10 < strArrSplit.length) {
            String strTrim = strArrSplit[i10].trim();
            try {
                iIntValue = H0.c.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (objF = ((ConstraintLayout) view.getParent()).f(0, strTrim)) != null && (objF instanceof Integer)) {
                iIntValue = ((Integer) objF).intValue();
            }
            iArr[i11] = iIntValue;
            i10++;
            i11++;
        }
        return i11 != strArrSplit.length ? Arrays.copyOf(iArr, i11) : iArr;
    }

    public final a j(Context context, AttributeSet attributeSet) {
        a aVar = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, H0.d.f5060r);
        o(context, aVar, typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    public final a k(int i10) {
        if (!this.f22303c.containsKey(Integer.valueOf(i10))) {
            this.f22303c.put(Integer.valueOf(i10), new a());
        }
        return (a) this.f22303c.get(Integer.valueOf(i10));
    }

    public void l(Context context, int i10) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    a aVarJ = j(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        aVarJ.f22307d.f22337a = true;
                    }
                    this.f22303c.put(Integer.valueOf(aVarJ.f22304a), aVarJ);
                }
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x0167, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m(android.content.Context r8, org.xmlpull.v1.XmlPullParser r9) {
        /*
            Method dump skipped, instruction units count: 410
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.c.m(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    public final void o(Context context, a aVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArray.getIndex(i10);
            if (index != H0.d.f5072t && H0.d.f4873L != index && H0.d.f4879M != index) {
                aVar.f22306c.f22374a = true;
                aVar.f22307d.f22339b = true;
                aVar.f22305b.f22381a = true;
                aVar.f22308e.f22387a = true;
            }
            switch (f22300e.get(index)) {
                case 1:
                    b bVar = aVar.f22307d;
                    bVar.f22362p = n(typedArray, index, bVar.f22362p);
                    break;
                case 2:
                    b bVar2 = aVar.f22307d;
                    bVar2.f22317G = typedArray.getDimensionPixelSize(index, bVar2.f22317G);
                    break;
                case 3:
                    b bVar3 = aVar.f22307d;
                    bVar3.f22361o = n(typedArray, index, bVar3.f22361o);
                    break;
                case 4:
                    b bVar4 = aVar.f22307d;
                    bVar4.f22360n = n(typedArray, index, bVar4.f22360n);
                    break;
                case 5:
                    aVar.f22307d.f22369w = typedArray.getString(index);
                    break;
                case 6:
                    b bVar5 = aVar.f22307d;
                    bVar5.f22311A = typedArray.getDimensionPixelOffset(index, bVar5.f22311A);
                    break;
                case 7:
                    b bVar6 = aVar.f22307d;
                    bVar6.f22312B = typedArray.getDimensionPixelOffset(index, bVar6.f22312B);
                    break;
                case 8:
                    b bVar7 = aVar.f22307d;
                    bVar7.f22318H = typedArray.getDimensionPixelSize(index, bVar7.f22318H);
                    break;
                case 9:
                    b bVar8 = aVar.f22307d;
                    bVar8.f22366t = n(typedArray, index, bVar8.f22366t);
                    break;
                case 10:
                    b bVar9 = aVar.f22307d;
                    bVar9.f22365s = n(typedArray, index, bVar9.f22365s);
                    break;
                case 11:
                    b bVar10 = aVar.f22307d;
                    bVar10.f22323M = typedArray.getDimensionPixelSize(index, bVar10.f22323M);
                    break;
                case 12:
                    b bVar11 = aVar.f22307d;
                    bVar11.f22324N = typedArray.getDimensionPixelSize(index, bVar11.f22324N);
                    break;
                case 13:
                    b bVar12 = aVar.f22307d;
                    bVar12.f22320J = typedArray.getDimensionPixelSize(index, bVar12.f22320J);
                    break;
                case 14:
                    b bVar13 = aVar.f22307d;
                    bVar13.f22322L = typedArray.getDimensionPixelSize(index, bVar13.f22322L);
                    break;
                case 15:
                    b bVar14 = aVar.f22307d;
                    bVar14.f22325O = typedArray.getDimensionPixelSize(index, bVar14.f22325O);
                    break;
                case 16:
                    b bVar15 = aVar.f22307d;
                    bVar15.f22321K = typedArray.getDimensionPixelSize(index, bVar15.f22321K);
                    break;
                case 17:
                    b bVar16 = aVar.f22307d;
                    bVar16.f22345e = typedArray.getDimensionPixelOffset(index, bVar16.f22345e);
                    break;
                case 18:
                    b bVar17 = aVar.f22307d;
                    bVar17.f22347f = typedArray.getDimensionPixelOffset(index, bVar17.f22347f);
                    break;
                case 19:
                    b bVar18 = aVar.f22307d;
                    bVar18.f22349g = typedArray.getFloat(index, bVar18.f22349g);
                    break;
                case 20:
                    b bVar19 = aVar.f22307d;
                    bVar19.f22367u = typedArray.getFloat(index, bVar19.f22367u);
                    break;
                case 21:
                    b bVar20 = aVar.f22307d;
                    bVar20.f22343d = typedArray.getLayoutDimension(index, bVar20.f22343d);
                    break;
                case 22:
                    d dVar = aVar.f22305b;
                    dVar.f22382b = typedArray.getInt(index, dVar.f22382b);
                    d dVar2 = aVar.f22305b;
                    dVar2.f22382b = f22299d[dVar2.f22382b];
                    break;
                case 23:
                    b bVar21 = aVar.f22307d;
                    bVar21.f22341c = typedArray.getLayoutDimension(index, bVar21.f22341c);
                    break;
                case 24:
                    b bVar22 = aVar.f22307d;
                    bVar22.f22314D = typedArray.getDimensionPixelSize(index, bVar22.f22314D);
                    break;
                case 25:
                    b bVar23 = aVar.f22307d;
                    bVar23.f22351h = n(typedArray, index, bVar23.f22351h);
                    break;
                case 26:
                    b bVar24 = aVar.f22307d;
                    bVar24.f22353i = n(typedArray, index, bVar24.f22353i);
                    break;
                case 27:
                    b bVar25 = aVar.f22307d;
                    bVar25.f22313C = typedArray.getInt(index, bVar25.f22313C);
                    break;
                case 28:
                    b bVar26 = aVar.f22307d;
                    bVar26.f22315E = typedArray.getDimensionPixelSize(index, bVar26.f22315E);
                    break;
                case 29:
                    b bVar27 = aVar.f22307d;
                    bVar27.f22355j = n(typedArray, index, bVar27.f22355j);
                    break;
                case Build.API_LEVELS.API_30 /* 30 */:
                    b bVar28 = aVar.f22307d;
                    bVar28.f22357k = n(typedArray, index, bVar28.f22357k);
                    break;
                case 31:
                    b bVar29 = aVar.f22307d;
                    bVar29.f22319I = typedArray.getDimensionPixelSize(index, bVar29.f22319I);
                    break;
                case 32:
                    b bVar30 = aVar.f22307d;
                    bVar30.f22363q = n(typedArray, index, bVar30.f22363q);
                    break;
                case 33:
                    b bVar31 = aVar.f22307d;
                    bVar31.f22364r = n(typedArray, index, bVar31.f22364r);
                    break;
                case 34:
                    b bVar32 = aVar.f22307d;
                    bVar32.f22316F = typedArray.getDimensionPixelSize(index, bVar32.f22316F);
                    break;
                case 35:
                    b bVar33 = aVar.f22307d;
                    bVar33.f22359m = n(typedArray, index, bVar33.f22359m);
                    break;
                case 36:
                    b bVar34 = aVar.f22307d;
                    bVar34.f22358l = n(typedArray, index, bVar34.f22358l);
                    break;
                case 37:
                    b bVar35 = aVar.f22307d;
                    bVar35.f22368v = typedArray.getFloat(index, bVar35.f22368v);
                    break;
                case 38:
                    aVar.f22304a = typedArray.getResourceId(index, aVar.f22304a);
                    break;
                case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    b bVar36 = aVar.f22307d;
                    bVar36.f22327Q = typedArray.getFloat(index, bVar36.f22327Q);
                    break;
                case DescriptorProtos$FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                    b bVar37 = aVar.f22307d;
                    bVar37.f22326P = typedArray.getFloat(index, bVar37.f22326P);
                    break;
                case DescriptorProtos$FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    b bVar38 = aVar.f22307d;
                    bVar38.f22328R = typedArray.getInt(index, bVar38.f22328R);
                    break;
                case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    b bVar39 = aVar.f22307d;
                    bVar39.f22329S = typedArray.getInt(index, bVar39.f22329S);
                    break;
                case 43:
                    d dVar3 = aVar.f22305b;
                    dVar3.f22384d = typedArray.getFloat(index, dVar3.f22384d);
                    break;
                case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    e eVar = aVar.f22308e;
                    eVar.f22398l = true;
                    eVar.f22399m = typedArray.getDimension(index, eVar.f22399m);
                    break;
                case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    e eVar2 = aVar.f22308e;
                    eVar2.f22389c = typedArray.getFloat(index, eVar2.f22389c);
                    break;
                case 46:
                    e eVar3 = aVar.f22308e;
                    eVar3.f22390d = typedArray.getFloat(index, eVar3.f22390d);
                    break;
                case 47:
                    e eVar4 = aVar.f22308e;
                    eVar4.f22391e = typedArray.getFloat(index, eVar4.f22391e);
                    break;
                case 48:
                    e eVar5 = aVar.f22308e;
                    eVar5.f22392f = typedArray.getFloat(index, eVar5.f22392f);
                    break;
                case 49:
                    e eVar6 = aVar.f22308e;
                    eVar6.f22393g = typedArray.getDimension(index, eVar6.f22393g);
                    break;
                case 50:
                    e eVar7 = aVar.f22308e;
                    eVar7.f22394h = typedArray.getDimension(index, eVar7.f22394h);
                    break;
                case 51:
                    e eVar8 = aVar.f22308e;
                    eVar8.f22395i = typedArray.getDimension(index, eVar8.f22395i);
                    break;
                case 52:
                    e eVar9 = aVar.f22308e;
                    eVar9.f22396j = typedArray.getDimension(index, eVar9.f22396j);
                    break;
                case 53:
                    e eVar10 = aVar.f22308e;
                    eVar10.f22397k = typedArray.getDimension(index, eVar10.f22397k);
                    break;
                case 54:
                    b bVar40 = aVar.f22307d;
                    bVar40.f22330T = typedArray.getInt(index, bVar40.f22330T);
                    break;
                case 55:
                    b bVar41 = aVar.f22307d;
                    bVar41.f22331U = typedArray.getInt(index, bVar41.f22331U);
                    break;
                case 56:
                    b bVar42 = aVar.f22307d;
                    bVar42.f22332V = typedArray.getDimensionPixelSize(index, bVar42.f22332V);
                    break;
                case 57:
                    b bVar43 = aVar.f22307d;
                    bVar43.f22333W = typedArray.getDimensionPixelSize(index, bVar43.f22333W);
                    break;
                case 58:
                    b bVar44 = aVar.f22307d;
                    bVar44.f22334X = typedArray.getDimensionPixelSize(index, bVar44.f22334X);
                    break;
                case 59:
                    b bVar45 = aVar.f22307d;
                    bVar45.f22335Y = typedArray.getDimensionPixelSize(index, bVar45.f22335Y);
                    break;
                case PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS /* 60 */:
                    e eVar11 = aVar.f22308e;
                    eVar11.f22388b = typedArray.getFloat(index, eVar11.f22388b);
                    break;
                case 61:
                    b bVar46 = aVar.f22307d;
                    bVar46.f22370x = n(typedArray, index, bVar46.f22370x);
                    break;
                case 62:
                    b bVar47 = aVar.f22307d;
                    bVar47.f22371y = typedArray.getDimensionPixelSize(index, bVar47.f22371y);
                    break;
                case 63:
                    b bVar48 = aVar.f22307d;
                    bVar48.f22372z = typedArray.getFloat(index, bVar48.f22372z);
                    break;
                case 64:
                    C0280c c0280c = aVar.f22306c;
                    c0280c.f22375b = n(typedArray, index, c0280c.f22375b);
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        aVar.f22306c.f22376c = typedArray.getString(index);
                    } else {
                        aVar.f22306c.f22376c = C0.a.f874c[typedArray.getInteger(index, 0)];
                    }
                    break;
                case 66:
                    aVar.f22306c.f22378e = typedArray.getInt(index, 0);
                    break;
                case 67:
                    C0280c c0280c2 = aVar.f22306c;
                    c0280c2.f22380g = typedArray.getFloat(index, c0280c2.f22380g);
                    break;
                case 68:
                    d dVar4 = aVar.f22305b;
                    dVar4.f22385e = typedArray.getFloat(index, dVar4.f22385e);
                    break;
                case 69:
                    aVar.f22307d.f22336Z = typedArray.getFloat(index, 1.0f);
                    break;
                case 70:
                    aVar.f22307d.f22338a0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    b bVar49 = aVar.f22307d;
                    bVar49.f22340b0 = typedArray.getInt(index, bVar49.f22340b0);
                    break;
                case 73:
                    b bVar50 = aVar.f22307d;
                    bVar50.f22342c0 = typedArray.getDimensionPixelSize(index, bVar50.f22342c0);
                    break;
                case 74:
                    aVar.f22307d.f22348f0 = typedArray.getString(index);
                    break;
                case 75:
                    b bVar51 = aVar.f22307d;
                    bVar51.f22356j0 = typedArray.getBoolean(index, bVar51.f22356j0);
                    break;
                case 76:
                    C0280c c0280c3 = aVar.f22306c;
                    c0280c3.f22377d = typedArray.getInt(index, c0280c3.f22377d);
                    break;
                case 77:
                    aVar.f22307d.f22350g0 = typedArray.getString(index);
                    break;
                case 78:
                    d dVar5 = aVar.f22305b;
                    dVar5.f22383c = typedArray.getInt(index, dVar5.f22383c);
                    break;
                case 79:
                    C0280c c0280c4 = aVar.f22306c;
                    c0280c4.f22379f = typedArray.getFloat(index, c0280c4.f22379f);
                    break;
                case 80:
                    b bVar52 = aVar.f22307d;
                    bVar52.f22352h0 = typedArray.getBoolean(index, bVar52.f22352h0);
                    break;
                case 81:
                    b bVar53 = aVar.f22307d;
                    bVar53.f22354i0 = typedArray.getBoolean(index, bVar53.f22354i0);
                    break;
                case 82:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f22300e.get(index));
                    break;
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f22300e.get(index));
                    break;
            }
        }
    }
}
