package b3;

import android.content.Context;
import android.content.Intent;
import b3.t;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.ar.core.ImageMetadata;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import k3.InterfaceC4793c;
import kotlin.jvm.internal.AbstractC4862t;
import l3.InterfaceC4878d;
import lc.InterfaceC4992i;

/* JADX INFO: renamed from: b3.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C2804c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f25155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f25156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC4878d.c f25157c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t.e f25158d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f25159e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f25160f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t.d f25161g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Executor f25162h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Executor f25163i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Intent f25164j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f25165k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f25166l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Set f25167m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f25168n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final File f25169o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Callable f25170p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final t.f f25171q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List f25172r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final List f25173s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f25174t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final InterfaceC4793c f25175u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final InterfaceC4992i f25176v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f25177w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f25178x;

    public C2804c(Context context, String str, InterfaceC4878d.c cVar, t.e migrationContainer, List list, boolean z10, t.d journalMode, Executor queryExecutor, Executor transactionExecutor, Intent intent, boolean z11, boolean z12, Set set, String str2, File file, Callable callable, t.f fVar, List typeConverters, List autoMigrationSpecs, boolean z13, InterfaceC4793c interfaceC4793c, InterfaceC4992i interfaceC4992i) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(migrationContainer, "migrationContainer");
        AbstractC4862t.e(journalMode, "journalMode");
        AbstractC4862t.e(queryExecutor, "queryExecutor");
        AbstractC4862t.e(transactionExecutor, "transactionExecutor");
        AbstractC4862t.e(typeConverters, "typeConverters");
        AbstractC4862t.e(autoMigrationSpecs, "autoMigrationSpecs");
        this.f25155a = context;
        this.f25156b = str;
        this.f25157c = cVar;
        this.f25158d = migrationContainer;
        this.f25159e = list;
        this.f25160f = z10;
        this.f25161g = journalMode;
        this.f25162h = queryExecutor;
        this.f25163i = transactionExecutor;
        this.f25164j = intent;
        this.f25165k = z11;
        this.f25166l = z12;
        this.f25167m = set;
        this.f25168n = str2;
        this.f25169o = file;
        this.f25170p = callable;
        this.f25171q = fVar;
        this.f25172r = typeConverters;
        this.f25173s = autoMigrationSpecs;
        this.f25174t = z13;
        this.f25175u = interfaceC4793c;
        this.f25176v = interfaceC4992i;
        this.f25177w = intent != null;
        this.f25178x = true;
    }

    public static /* synthetic */ C2804c b(C2804c c2804c, Context context, String str, InterfaceC4878d.c cVar, t.e eVar, List list, boolean z10, t.d dVar, Executor executor, Executor executor2, Intent intent, boolean z11, boolean z12, Set set, String str2, File file, Callable callable, t.f fVar, List list2, List list3, boolean z13, InterfaceC4793c interfaceC4793c, InterfaceC4992i interfaceC4992i, int i10, Object obj) {
        InterfaceC4992i interfaceC4992i2;
        InterfaceC4793c interfaceC4793c2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
        }
        Context context2 = (i10 & 1) != 0 ? c2804c.f25155a : context;
        String str3 = (i10 & 2) != 0 ? c2804c.f25156b : str;
        InterfaceC4878d.c cVar2 = (i10 & 4) != 0 ? c2804c.f25157c : cVar;
        t.e eVar2 = (i10 & 8) != 0 ? c2804c.f25158d : eVar;
        List list4 = (i10 & 16) != 0 ? c2804c.f25159e : list;
        boolean z14 = (i10 & 32) != 0 ? c2804c.f25160f : z10;
        t.d dVar2 = (i10 & 64) != 0 ? c2804c.f25161g : dVar;
        Executor executor3 = (i10 & 128) != 0 ? c2804c.f25162h : executor;
        Executor executor4 = (i10 & 256) != 0 ? c2804c.f25163i : executor2;
        Intent intent2 = (i10 & 512) != 0 ? c2804c.f25164j : intent;
        boolean z15 = (i10 & RecognitionOptions.UPC_E) != 0 ? c2804c.f25165k : z11;
        boolean z16 = (i10 & RecognitionOptions.PDF417) != 0 ? c2804c.f25166l : z12;
        Set set2 = (i10 & RecognitionOptions.AZTEC) != 0 ? c2804c.f25167m : set;
        String str4 = (i10 & 8192) != 0 ? c2804c.f25168n : str2;
        Context context3 = context2;
        File file2 = (i10 & 16384) != 0 ? c2804c.f25169o : file;
        Callable callable2 = (i10 & 32768) != 0 ? c2804c.f25170p : callable;
        t.f fVar2 = (i10 & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 0 ? c2804c.f25171q : fVar;
        List list5 = (i10 & 131072) != 0 ? c2804c.f25172r : list2;
        List list6 = (i10 & 262144) != 0 ? c2804c.f25173s : list3;
        boolean z17 = (i10 & ImageMetadata.LENS_APERTURE) != 0 ? c2804c.f25174t : z13;
        InterfaceC4793c interfaceC4793c3 = (i10 & ImageMetadata.SHADING_MODE) != 0 ? c2804c.f25175u : interfaceC4793c;
        if ((i10 & 2097152) != 0) {
            interfaceC4793c2 = interfaceC4793c3;
            interfaceC4992i2 = c2804c.f25176v;
        } else {
            interfaceC4992i2 = interfaceC4992i;
            interfaceC4793c2 = interfaceC4793c3;
        }
        return c2804c.a(context3, str3, cVar2, eVar2, list4, z14, dVar2, executor3, executor4, intent2, z15, z16, set2, str4, file2, callable2, fVar2, list5, list6, z17, interfaceC4793c2, interfaceC4992i2);
    }

    public final C2804c a(Context context, String str, InterfaceC4878d.c cVar, t.e migrationContainer, List list, boolean z10, t.d journalMode, Executor queryExecutor, Executor transactionExecutor, Intent intent, boolean z11, boolean z12, Set set, String str2, File file, Callable callable, t.f fVar, List typeConverters, List autoMigrationSpecs, boolean z13, InterfaceC4793c interfaceC4793c, InterfaceC4992i interfaceC4992i) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(migrationContainer, "migrationContainer");
        AbstractC4862t.e(journalMode, "journalMode");
        AbstractC4862t.e(queryExecutor, "queryExecutor");
        AbstractC4862t.e(transactionExecutor, "transactionExecutor");
        AbstractC4862t.e(typeConverters, "typeConverters");
        AbstractC4862t.e(autoMigrationSpecs, "autoMigrationSpecs");
        return new C2804c(context, str, cVar, migrationContainer, list, z10, journalMode, queryExecutor, transactionExecutor, intent, z11, z12, set, str2, file, callable, fVar, typeConverters, autoMigrationSpecs, z13, interfaceC4793c, interfaceC4992i);
    }

    public final Set c() {
        return this.f25167m;
    }

    public final boolean d() {
        return this.f25178x;
    }

    public boolean e(int i10, int i11) {
        return h3.g.d(this, i10, i11);
    }

    public final void f(boolean z10) {
        this.f25178x = z10;
    }
}
