package E;

import L.e1;
import android.util.Range;
import fc.C4032o;
import gc.C4179C;
import gc.C4206t;
import gc.C4207u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class F0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f2754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Range f2755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f2756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f2757d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f2758e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f2759f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public X0.a f2760g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Executor f2761h;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2762a;

        static {
            int[] iArr = new int[I.b.values().length];
            try {
                iArr[I.b.DYNAMIC_RANGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[I.b.FPS_RANGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[I.b.VIDEO_STABILIZATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[I.b.IMAGE_FORMAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f2762a = iArr;
        }
    }

    public F0(List useCases, X0 x02, List effects, Range frameRateRange, Set requiredFeatureGroup, List preferredFeatureGroup) {
        AbstractC4862t.e(useCases, "useCases");
        AbstractC4862t.e(effects, "effects");
        AbstractC4862t.e(frameRateRange, "frameRateRange");
        AbstractC4862t.e(requiredFeatureGroup, "requiredFeatureGroup");
        AbstractC4862t.e(preferredFeatureGroup, "preferredFeatureGroup");
        this.f2754a = effects;
        this.f2755b = frameRateRange;
        this.f2756c = requiredFeatureGroup;
        this.f2757d = preferredFeatureGroup;
        this.f2758e = C4179C.a0(useCases);
        this.f2760g = new X0.a() { // from class: E.E0
            @Override // X0.a
            public final void accept(Object obj) {
                F0.b((Set) obj);
            }
        };
        ScheduledExecutorService scheduledExecutorServiceD = N.a.d();
        AbstractC4862t.d(scheduledExecutorServiceD, "mainThreadExecutor(...)");
        this.f2761h = scheduledExecutorServiceD;
        p();
        o();
    }

    public final List c() {
        return this.f2754a;
    }

    public final X0.a d() {
        return this.f2760g;
    }

    public final Executor e() {
        return this.f2761h;
    }

    public final Range f() {
        return this.f2755b;
    }

    public final List g() {
        return this.f2757d;
    }

    public final Set h() {
        return this.f2756c;
    }

    public int i() {
        return this.f2759f;
    }

    public final String j(W0 w02) {
        return w02 instanceof C0822x0 ? "Preview" : w02 instanceof C0781c0 ? "ImageCapture" : w02 instanceof S ? "ImageAnalysis" : P.f.c0(w02) ? "VideoCapture" : "UseCase";
    }

    public final List k() {
        return this.f2758e;
    }

    public final X0 l() {
        return null;
    }

    public abstract boolean m();

    public final void n(W0 w02) {
        String str;
        String str2;
        String str3;
        String strJ = j(w02);
        I.b bVarA = H.c.Companion.a(w02);
        if (bVarA == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("A ");
        AbstractC4862t.b(bVarA);
        sb2.append(bVarA.name());
        sb2.append(" value is set to ");
        sb2.append(strJ);
        sb2.append(" despite using feature groups. Do not use APIs like ");
        sb2.append(strJ);
        sb2.append(".Builder.");
        int[] iArr = a.f2762a;
        int i10 = iArr[bVarA.ordinal()];
        if (i10 == 1) {
            str = "setDynamicRange";
        } else if (i10 == 2) {
            str = "setTargetFrameRateRange";
        } else if (i10 == 3) {
            str = P.f.c0(w02) ? "setVideoStabilizationEnabled" : "setPreviewStabilizationEnabled";
        } else {
            if (i10 != 4) {
                throw new C4032o();
            }
            str = "setOutputFormat";
        }
        sb2.append(str);
        sb2.append(" while using feature groups. If ");
        int i11 = iArr[bVarA.ordinal()];
        if (i11 == 1) {
            str2 = "HDR";
        } else if (i11 == 2) {
            str2 = "60 FPS";
        } else if (i11 == 3) {
            str2 = "stabilization";
        } else {
            if (i11 != 4) {
                throw new C4032o();
            }
            str2 = "JPEG_R output format";
        }
        sb2.append(str2);
        sb2.append(" is required, instead set ");
        int i12 = iArr[bVarA.ordinal()];
        if (i12 == 1) {
            str3 = "GroupableFeature.HDR_HLG10";
        } else if (i12 == 2) {
            str3 = "GroupableFeature.FPS_60";
        } else if (i12 == 3) {
            str3 = "GroupableFeature.PREVIEW_STABILIZATION";
        } else {
            if (i12 != 4) {
                throw new C4032o();
            }
            str3 = "GroupableFeature.IMAGE_ULTRA_HDR";
        }
        sb2.append(str3);
        sb2.append(" as either a required or preferred feature.");
        throw new IllegalArgumentException(sb2.toString().toString());
    }

    public final void o() {
        if (this.f2756c.isEmpty() && this.f2757d.isEmpty()) {
            return;
        }
        q();
        if (C4179C.a0(this.f2757d).size() != this.f2757d.size()) {
            throw new IllegalArgumentException(("Duplicate values in preferredFeatures(" + this.f2757d + ')').toString());
        }
        Set setM0 = C4179C.m0(this.f2756c, this.f2757d);
        if (!setM0.isEmpty()) {
            throw new IllegalArgumentException(("requiredFeatures and preferredFeatures have duplicate values: " + setM0).toString());
        }
        for (W0 w02 : this.f2758e) {
            if (H.c.Companion.b(w02) == H.c.UNDEFINED) {
                throw new IllegalArgumentException((w02 + " is not supported with feature group").toString());
            }
            n(w02);
        }
        if (!this.f2754a.isEmpty()) {
            throw new IllegalArgumentException("Effects aren't supported with feature group yet");
        }
    }

    public final void p() {
        if (AbstractC4862t.a(this.f2755b, e1.f8057a)) {
            return;
        }
        Iterator it = this.f2758e.iterator();
        while (it.hasNext()) {
            if (((W0) it.next()).e().b0()) {
                throw new IllegalArgumentException("Can't set target frame rate on a UseCase (by Preview.Builder.setTargetFrameRate() or VideoCapture.Builder.setTargetFrameRate()) if the frame rate range has already been set in the SessionConfig.");
            }
        }
    }

    public final void q() {
        Set set = this.f2756c;
        ArrayList arrayList = new ArrayList(C4207u.v(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((G.b) it.next()).c());
        }
        for (I.b bVar : C4179C.a0(arrayList)) {
            Set set2 = this.f2756c;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : set2) {
                if (((G.b) obj).c() == bVar) {
                    arrayList2.add(obj);
                }
            }
            if (arrayList2.size() > 1) {
                throw new IllegalArgumentException(("requiredFeatures has conflicting feature values: " + arrayList2).toString());
            }
        }
    }

    public /* synthetic */ F0(List list, X0 x02, List list2, Range range, Set set, List list3, int i10, AbstractC4854k abstractC4854k) {
        this(list, (i10 & 2) != 0 ? null : x02, (i10 & 4) != 0 ? C4206t.k() : list2, (i10 & 8) != 0 ? e1.f8057a : range, (i10 & 16) != 0 ? gc.U.d() : set, (i10 & 32) != 0 ? C4206t.k() : list3);
    }

    public static final void b(Set set) {
    }
}
