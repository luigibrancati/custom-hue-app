package y4;

import M4.l;
import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import nc.AbstractC5160d;
import q4.C5485a;
import q4.C5488d;

/* JADX INFO: renamed from: y4.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C6400d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5485a f48395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C6402f f48396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final M4.a f48397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C6402f f48398d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f48399e;

    /* JADX INFO: renamed from: y4.d$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f48400j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f48401k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f48403m;

        public a(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f48401k = obj;
            this.f48403m |= Integer.MIN_VALUE;
            return C6400d.this.c(this);
        }
    }

    public C6400d(C5485a amplitude, C5488d configuration) {
        AbstractC4862t.e(amplitude, "amplitude");
        AbstractC4862t.e(configuration, "configuration");
        this.f48395a = amplitude;
        ArrayList arrayList = new ArrayList();
        this.f48399e = arrayList;
        this.f48396b = a(configuration, "amplitude-disk-queue", "amplitude-android-" + configuration.l());
        this.f48398d = a(configuration, "amplitude-identify-intercept-disk-queue", "amplitude-identify-intercept-" + configuration.l());
        M4.f fVarB = b(amplitude, configuration);
        arrayList.add(fVarB.g());
        this.f48397c = new M4.a(fVarB);
    }

    public final C6402f a(C5488d c5488d, String str, String str2) {
        File dir = c5488d.C().getDir(str, 0);
        List list = this.f48399e;
        AbstractC4862t.b(dir);
        list.add(dir);
        SharedPreferences sharedPreferences = c5488d.C().getSharedPreferences(str2, 0);
        String strL = c5488d.l();
        A4.a aVarA = c5488d.m().a(this.f48395a);
        AbstractC4862t.b(sharedPreferences);
        return new C6402f(strL, aVarA, sharedPreferences, dir, this.f48395a.n());
    }

    public final M4.f b(C5485a c5485a, C5488d c5488d) {
        File dir = c5488d.C().getDir("amplitude-kotlin-" + c5488d.l(), 0);
        String strL = c5488d.l();
        String strB = c5488d.b();
        l lVarJ = c5488d.j();
        A4.a aVarA = c5488d.m().a(c5485a);
        String str = "amplitude-identity-" + c5488d.l();
        AbstractC4862t.b(dir);
        return new M4.f(strL, strB, null, lVarJ, dir, str, aVarA, 4, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b9, code lost:
    
        if (r9.d(r0) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(lc.InterfaceC4988e r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y4.C6400d.c(lc.e):java.lang.Object");
    }
}
