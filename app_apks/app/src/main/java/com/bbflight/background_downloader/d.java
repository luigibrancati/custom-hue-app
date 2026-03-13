package com.bbflight.background_downloader;

import Q4.ResumeData;
import Q4.Task;
import android.content.Context;
import java.util.Date;
import jc.C4757a;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import nc.AbstractC5160d;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f27051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Task f27052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f27053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ResumeData f27054d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.bbflight.background_downloader.a f27055e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Date f27056f;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f27057j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public long f27058k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f27059l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f27061n;

        public a(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f27059l = obj;
            this.f27061n |= Integer.MIN_VALUE;
            return d.this.s(0, this);
        }
    }

    public d(Context context, Task task, String str, ResumeData resumeData, com.bbflight.background_downloader.a aVar, Date created) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(task, "task");
        AbstractC4862t.e(created, "created");
        this.f27051a = context;
        this.f27052b = task;
        this.f27053c = str;
        this.f27054d = resumeData;
        this.f27055e = aVar;
        this.f27056f = created;
    }

    public static final Comparable p(d it) {
        AbstractC4862t.e(it, "it");
        return Integer.valueOf(it.f27052b.getPriority());
    }

    public static final Comparable q(d it) {
        AbstractC4862t.e(it, "it");
        return Long.valueOf(it.f27052b.getCreationTime());
    }

    public static /* synthetic */ Object u(d dVar, int i10, InterfaceC4988e interfaceC4988e, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 1000;
        }
        return dVar.s(i10, interfaceC4988e);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public int compareTo(d other) {
        AbstractC4862t.e(other, "other");
        return C4757a.b(this, other, new vc.l() { // from class: Q4.u
            @Override // vc.l
            public final Object invoke(Object obj) {
                return com.bbflight.background_downloader.d.p((com.bbflight.background_downloader.d) obj);
            }
        }, new vc.l() { // from class: Q4.v
            @Override // vc.l
            public final Object invoke(Object obj) {
                return com.bbflight.background_downloader.d.q((com.bbflight.background_downloader.d) obj);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0094, code lost:
    
        if (Rd.X.a(r12 - r10, r15) == r3) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0146, code lost:
    
        if (r4.A(r5, r15) == r3) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0161, code lost:
    
        if (Rd.X.a(20, r15) != r3) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object s(int r27, lc.InterfaceC4988e r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 359
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bbflight.background_downloader.d.s(int, lc.e):java.lang.Object");
    }

    public final Context v() {
        return this.f27051a;
    }

    public final String w() {
        return this.f27053c;
    }

    public final Task x() {
        return this.f27052b;
    }

    public /* synthetic */ d(Context context, Task task, String str, ResumeData resumeData, com.bbflight.background_downloader.a aVar, Date date, int i10, AbstractC4854k abstractC4854k) {
        this(context, task, str, (i10 & 8) != 0 ? null : resumeData, (i10 & 16) != 0 ? null : aVar, (i10 & 32) != 0 ? new Date() : date);
    }
}
