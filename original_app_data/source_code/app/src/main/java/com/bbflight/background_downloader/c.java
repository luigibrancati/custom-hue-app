package com.bbflight.background_downloader;

import Od.C1829i;
import Od.o;
import Q4.EnumC1903x;
import Q4.ResumeData;
import Q4.Task;
import Q4.Y;
import Q4.b0;
import Q4.g0;
import Rd.M;
import android.content.Context;
import android.net.Uri;
import android.system.ErrnoException;
import android.system.Os;
import android.util.Log;
import fc.AbstractC4036s;
import fc.C4015H;
import gc.C4179C;
import io.sentry.SentryOptions;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import mc.C5046c;
import nc.AbstractC5160d;
import vc.p;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class c extends l {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f27016u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f27017v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f27018w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f27019x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f27020y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f27021z;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27022a;

        static {
            int[] iArr = new int[g0.values().length];
            try {
                iArr[g0.complete.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g0.canceled.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g0.paused.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[g0.enqueued.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[g0.failed.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f27022a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f27023j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f27024k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f27025l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f27027n;

        public b(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f27025l = obj;
            this.f27027n |= Integer.MIN_VALUE;
            return c.this.i(null, this);
        }
    }

    /* JADX INFO: renamed from: com.bbflight.background_downloader.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0347c extends AbstractC5160d {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public /* synthetic */ Object f27028A;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public int f27030C;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f27031j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f27032k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Object f27033l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Object f27034m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Object f27035n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Object f27036o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Object f27037p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public Object f27038q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f27039r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f27040s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f27041t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f27042u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f27043v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f27044w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f27045x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public long f27046y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public long f27047z;

        public C0347c(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f27028A = obj;
            this.f27030C |= Integer.MIN_VALUE;
            return c.this.D(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d extends nc.m implements p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f27048j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ File f27049k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ File f27050l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(File file, File file2, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f27049k = file;
            this.f27050l = file2;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return new d(this.f27049k, this.f27050l, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((d) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            C5046c.f();
            if (this.f27048j != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC4036s.b(obj);
            return Files.move(this.f27049k.toPath(), this.f27050l.toPath(), StandardCopyOption.REPLACE_EXISTING);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b0 context) {
        super(context);
        AbstractC4862t.e(context, "context");
        this.f27018w = "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:182:0x0724, code lost:
    
        if (d0(r6) == r14) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0816, code lost:
    
        if (com.bbflight.background_downloader.a.Companion.h(r1, r10, r11, r13, r22, 1000, null, r6, 32, null) == r14) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x08fb, code lost:
    
        if (r1.h(r22, r0, r6) == r14) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x028b, code lost:
    
        if (kotlin.jvm.internal.AbstractC4862t.a(r1 != null ? r1.subSequence(0, 1) : null, "W/") != false) goto L84;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x067f  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x06aa  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x09c0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    @Override // com.bbflight.background_downloader.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object D(java.net.HttpURLConnection r53, lc.InterfaceC4988e r54) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2820
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bbflight.background_downloader.c.D(java.net.HttpURLConnection, lc.e):java.lang.Object");
    }

    public final void Z(boolean z10, Uri uri) {
        if (!z10 || uri == null) {
            b0();
        } else {
            a0(uri);
        }
    }

    public final void a0(Uri uri) {
        try {
            q().t().getContentResolver().delete(uri, null, null);
        } catch (Exception unused) {
            Log.i("TaskRunner", "Could not delete file at " + uri);
        }
    }

    public final void b0() {
        if (this.f27018w.length() > 0) {
            try {
                new File(this.f27018w).delete();
            } catch (IOException unused) {
                Log.i("TaskRunner", "Could not delete temp file at " + this.f27018w);
            }
        }
    }

    public final String c0(HttpURLConnection httpURLConnection) {
        String strP = Task.p(z(), q().t(), null, 2, null);
        Task taskZ = z();
        Context contextT = q().t();
        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        AbstractC4862t.d(headerFields, "getHeaderFields(...)");
        S(taskZ.Y(contextT, headerFields, true));
        String parent = new File(strP).getParent();
        if (parent == null) {
            parent = "";
        }
        int length = parent.length();
        String filename = z().getFilename();
        if (length == 0) {
            return filename;
        }
        return parent + "/" + filename;
    }

    public final Object d0(InterfaceC4988e interfaceC4988e) {
        if (!this.f27017v || p() + y() <= SentryOptions.MAX_EVENT_SIZE_BYTES) {
            b0();
            return C4015H.f34254a;
        }
        Object objH = l.f27291t.h(new ResumeData(z(), this.f27018w, p() + y(), this.f27016u), u(), interfaceC4988e);
        return objH == C5046c.f() ? objH : C4015H.f34254a;
    }

    public final boolean e0(HttpURLConnection httpURLConnection) {
        String strA;
        if (this.f27018w.length() == 0) {
            return false;
        }
        List<String> list = httpURLConnection.getHeaderFields().get("Content-Range");
        if (list == null || list.size() > 1) {
            Log.i("TaskRunner", "Could not process partial response Content-Range");
            return false;
        }
        String str = (String) C4179C.h0(list);
        o oVar = new o("(\\d+)-(\\d+)/(\\d+)");
        AbstractC4862t.b(str);
        Od.k kVarD = o.d(oVar, str, 0, 2, null);
        if (kVarD == null) {
            Log.i("TaskRunner", "Could not process partial response Content-Range " + str);
            U(new Y(EnumC1903x.resume, 0, "Could not process partial response Content-Range " + str, 2, null));
            return false;
        }
        C1829i c1829i = kVarD.d().get(1);
        Long lValueOf = (c1829i == null || (strA = c1829i.a()) == null) ? null : Long.valueOf(Long.parseLong(strA));
        AbstractC4862t.b(lValueOf);
        long jLongValue = lValueOf.longValue();
        long length = new File(this.f27018w).length();
        R(jLongValue - this.f27020y);
        if (y() > length) {
            Log.i("TaskRunner", "Offered range not feasible: " + str + " with startByte " + y());
            U(new Y(EnumC1903x.resume, 0, "Offered range not feasible: " + str + " with startByte " + y(), 2, null));
            return false;
        }
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(this.f27018w, "rw");
            try {
                randomAccessFile.setLength(y());
                C4015H c4015h = C4015H.f34254a;
                sc.c.a(randomAccessFile, null);
                return true;
            } finally {
            }
        } catch (IOException unused) {
            Log.i("TaskRunner", "Could not truncate temp file");
            U(new Y(EnumC1903x.resume, 0, "Could not truncate temp file", 2, null));
            return false;
        }
    }

    public final void f0(File file) {
        try {
            Os.chown(file.getAbsolutePath(), -1, q().t().getApplicationInfo().uid);
        } catch (ErrnoException e10) {
            Log.w("TaskRunner", "Failed to change group ownership for " + file.getAbsolutePath() + ": " + e10.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.bbflight.background_downloader.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object i(java.net.HttpURLConnection r12, lc.InterfaceC4988e r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bbflight.background_downloader.c.i(java.net.HttpURLConnection, lc.e):java.lang.Object");
    }

    @Override // com.bbflight.background_downloader.l
    public boolean k() {
        String strG;
        long jR = q().r("startByte", 0L);
        this.f27019x = jR;
        if (jR == 0) {
            return false;
        }
        this.f27021z = q().g("eTag");
        String str = "";
        if (this.f27019x > 0 && (strG = q().g("tempFilename")) != null) {
            str = strG;
        }
        this.f27018w = str;
        File file = new File(this.f27018w);
        if (file.exists()) {
            long length = file.length();
            if (length == this.f27019x) {
                return true;
            }
            Log.d("TaskRunner", "File length = " + file.length() + " vs requiredStartByte = " + this.f27019x);
            if (length > this.f27019x) {
                try {
                    FileChannel fileChannelOpen = FileChannel.open(file.toPath(), StandardOpenOption.WRITE);
                    fileChannelOpen.truncate(this.f27019x);
                    fileChannelOpen.close();
                    Log.d("TaskRunner", "Truncated temp file to desired length");
                    return true;
                } catch (IOException e10) {
                    e10.printStackTrace();
                }
            }
            Log.i("TaskRunner", "Partially downloaded file is corrupted, resume not possible");
        } else {
            Log.i("TaskRunner", "Partially downloaded file not available, resume not possible");
        }
        return false;
    }
}
