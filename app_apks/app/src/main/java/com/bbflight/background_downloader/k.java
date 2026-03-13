package com.bbflight.background_downloader;

import I3.L;
import Q4.N;
import android.content.Context;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import nc.AbstractC5160d;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f27274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final N f27275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f27276c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27277a;

        static {
            int[] iArr = new int[L.c.values().length];
            try {
                iArr[L.c.ENQUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[L.c.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f27277a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f27278j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f27279k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Object f27280l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Object f27281m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Object f27282n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Object f27283o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Object f27284p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public Object f27285q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f27286r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f27287s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f27288t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f27290v;

        public b(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f27288t = obj;
            this.f27290v |= Integer.MIN_VALUE;
            return k.this.a(this);
        }
    }

    public k(Context applicationContext, N requireWifi, boolean z10) {
        AbstractC4862t.e(applicationContext, "applicationContext");
        AbstractC4862t.e(requireWifi, "requireWifi");
        this.f27274a = applicationContext;
        this.f27275b = requireWifi;
        this.f27276c = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x01d5 -> B:57:0x01d7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x01f4 -> B:61:0x01eb). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(lc.InterfaceC4988e r19) {
        /*
            Method dump skipped, instruction units count: 517
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bbflight.background_downloader.k.a(lc.e):java.lang.Object");
    }
}
