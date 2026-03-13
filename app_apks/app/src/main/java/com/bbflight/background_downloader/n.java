package com.bbflight.background_downloader;

import Od.C1823c;
import Od.o;
import Q4.C;
import Q4.EnumC1903x;
import Q4.Task;
import Q4.Y;
import Q4.b0;
import Q4.g0;
import Q4.s0;
import Rd.AbstractC2128g;
import Rd.C2123d0;
import Rd.M;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import android.webkit.MimeTypeMap;
import fc.AbstractC4036s;
import fc.C4015H;
import fc.C4034q;
import fc.C4039v;
import gc.C4205s;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.K;
import kotlin.jvm.internal.L;
import lc.InterfaceC4988e;
import mc.C5046c;
import nc.AbstractC5158b;
import nc.AbstractC5160d;
import org.apache.tika.metadata.HttpHeaders;
import org.apache.tika.mime.MimeTypes;
import vc.p;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class n extends l {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final a f27434u = new a(null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final o f27435v = new o("^[\\x00-\\x7F]+$");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final o f27436w = new o("^\\s*(\\{.*\\}|\\[.*\\])\\s*$");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final o f27437x = new o("\r\n|\r|\n");

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27438a;

        static {
            int[] iArr = new int[g0.values().length];
            try {
                iArr[g0.canceled.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g0.failed.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g0.complete.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f27438a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f27439j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f27440k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f27442m;

        public c(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f27440k = obj;
            this.f27442m |= Integer.MIN_VALUE;
            return n.this.D(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f27443j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f27444k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Object f27445l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Object f27446m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Object f27447n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Object f27448o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Object f27449p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public Object f27450q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f27451r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public long f27452s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public long f27453t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f27454u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f27456w;

        public d(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f27454u = obj;
            this.f27456w |= Integer.MIN_VALUE;
            return n.this.l0(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class e extends nc.m implements p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f27457j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f27458k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Uri f27459l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f27460m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ n f27461n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final /* synthetic */ L f27462o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Uri uri, String str, n nVar, L l10, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f27459l = uri;
            this.f27460m = str;
            this.f27461n = nVar;
            this.f27462o = l10;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            e eVar = new e(this.f27459l, this.f27460m, this.f27461n, this.f27462o, interfaceC4988e);
            eVar.f27458k = obj;
            return eVar;
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((e) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            C5046c.f();
            if (this.f27457j != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC4036s.b(obj);
            Uri uri = this.f27459l;
            if (uri == null) {
                String strP = Task.p(this.f27461n.z(), this.f27461n.q().t(), null, 2, null);
                File file = new File(strP);
                if (!file.exists() || !file.isFile()) {
                    String str = "File to upload does not exist: " + strP;
                    Log.w("TaskRunner", str);
                    this.f27461n.U(new Y(EnumC1903x.fileSystem, 0, str, 2, null));
                    return new C4034q(null, null);
                }
                long length = file.length();
                if (length > 0) {
                    if (((CharSequence) this.f27462o.f39776a).length() == 0) {
                        L l10 = this.f27462o;
                        n nVar = this.f27461n;
                        String name = file.getName();
                        AbstractC4862t.d(name, "getName(...)");
                        l10.f39776a = nVar.h0(name);
                    }
                    return new C4034q(AbstractC5158b.d(length), new FileInputStream(file));
                }
                String str2 = "File " + strP + " has 0 length";
                Log.w("TaskRunner", str2);
                this.f27461n.U(new Y(EnumC1903x.fileSystem, 0, str2, 2, null));
                return new C4034q(null, null);
            }
            try {
                if (this.f27460m == null) {
                    String strF0 = this.f27461n.f0(uri);
                    if (strF0 != null) {
                        n nVar2 = this.f27461n;
                        nVar2.S(Task.m(nVar2.z(), null, null, null, s0.f13895a.a(strF0, this.f27459l), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 33554423, null));
                    }
                    if (((CharSequence) this.f27462o.f39776a).length() == 0) {
                        L l11 = this.f27462o;
                        n nVar3 = this.f27461n;
                        if (strF0 == null) {
                            strF0 = "";
                        }
                        l11.f39776a = nVar3.h0(strF0);
                    }
                }
                if (AbstractC4862t.a(this.f27459l.getScheme(), Constants.FILE)) {
                    File fileA = T0.c.a(this.f27459l);
                    long length2 = fileA.length();
                    if (((CharSequence) this.f27462o.f39776a).length() == 0) {
                        L l12 = this.f27462o;
                        n nVar4 = this.f27461n;
                        String name2 = fileA.getName();
                        AbstractC4862t.d(name2, "getName(...)");
                        l12.f39776a = nVar4.h0(name2);
                    }
                    return new C4034q(AbstractC5158b.d(length2), new FileInputStream(fileA));
                }
                ContentResolver contentResolver = this.f27461n.q().t().getContentResolver();
                Cursor cursorQuery = contentResolver.query(this.f27459l, null, null, null, null);
                if (cursorQuery != null) {
                    try {
                        int columnIndex = cursorQuery.getColumnIndex("_size");
                        cursorQuery.moveToFirst();
                        Long lD = columnIndex != -1 ? AbstractC5158b.d(cursorQuery.getLong(columnIndex)) : null;
                        sc.c.a(cursorQuery, null);
                        if (lD != null) {
                            long jLongValue = lD.longValue();
                            if (((CharSequence) this.f27462o.f39776a).length() == 0) {
                                L l13 = this.f27462o;
                                n nVar5 = this.f27461n;
                                AbstractC4862t.b(contentResolver);
                                l13.f39776a = nVar5.g0(contentResolver, this.f27459l);
                            }
                            InputStream inputStreamOpenInputStream = contentResolver.openInputStream(this.f27459l);
                            if (inputStreamOpenInputStream != null) {
                                return new C4034q(AbstractC5158b.d(jLongValue), inputStreamOpenInputStream);
                            }
                            Uri uri2 = this.f27459l;
                            n nVar6 = this.f27461n;
                            String str3 = "Could not open input stream for URI: " + uri2;
                            Log.w("TaskRunner", str3);
                            nVar6.U(new Y(EnumC1903x.fileSystem, 0, str3, 2, null));
                            return new C4034q(null, null);
                        }
                    } finally {
                    }
                }
                Uri uri3 = this.f27459l;
                n nVar7 = this.f27461n;
                String str4 = "Could not open file or determine file size for URI: " + uri3;
                Log.w("TaskRunner", str4);
                nVar7.U(new Y(EnumC1903x.fileSystem, 0, str4, 2, null));
                return new C4034q(null, null);
            } catch (Exception e10) {
                String str5 = "Error processing URI: " + this.f27461n.z().getDirectory();
                Log.w("TaskRunner", str5, e10);
                this.f27461n.U(new Y(EnumC1903x.fileSystem, 0, str5, 2, null));
                return new C4034q(null, null);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class f extends nc.m implements p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f27463j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f27464k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Object f27465l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Object f27466m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Object f27467n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Object f27468o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f27469p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f27470q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f27471r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f27472s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ InputStream f27473t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f27474u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ K f27475v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ long f27476w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ HttpURLConnection f27477x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ n f27478y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ Long f27479z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InputStream inputStream, String str, K k10, long j10, HttpURLConnection httpURLConnection, n nVar, Long l10, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f27473t = inputStream;
            this.f27474u = str;
            this.f27475v = k10;
            this.f27476w = j10;
            this.f27477x = httpURLConnection;
            this.f27478y = nVar;
            this.f27479z = l10;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return new f(this.f27473t, this.f27474u, this.f27475v, this.f27476w, this.f27477x, this.f27478y, this.f27479z, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((f) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v11 */
        /* JADX WARN: Type inference failed for: r3v5 */
        /* JADX WARN: Type inference failed for: r3v7, types: [java.io.Closeable] */
        /* JADX WARN: Type inference failed for: r8v0, types: [java.io.InputStream, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r8v1 */
        /* JADX WARN: Type inference failed for: r8v10 */
        /* JADX WARN: Type inference failed for: r8v11 */
        /* JADX WARN: Type inference failed for: r8v2 */
        /* JADX WARN: Type inference failed for: r8v3 */
        /* JADX WARN: Type inference failed for: r8v4, types: [java.io.Closeable] */
        /* JADX WARN: Type inference failed for: r8v5 */
        /* JADX WARN: Type inference failed for: r8v6 */
        /* JADX WARN: Type inference failed for: r8v7 */
        /* JADX WARN: Type inference failed for: r8v8 */
        /* JADX WARN: Type inference failed for: r8v9 */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            ?? r82;
            Throwable th;
            BufferedOutputStream bufferedOutputStream;
            C c10;
            DataOutputStream dataOutputStream;
            Closeable closeable;
            Object objX;
            Closeable closeable2;
            Closeable closeable3;
            ?? r32;
            ?? r83;
            Closeable closeable4;
            Throwable th2;
            Closeable closeable5;
            Throwable th3;
            ?? r84;
            Object objF = C5046c.f();
            int i10 = this.f27472s;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Closeable closeable6 = (Closeable) this.f27467n;
                Closeable closeable7 = (Closeable) this.f27465l;
                Closeable closeable8 = (Closeable) this.f27463j;
                try {
                    AbstractC4036s.b(obj);
                    objX = obj;
                    closeable3 = closeable6;
                    closeable2 = closeable7;
                    r32 = closeable8;
                    try {
                        sc.c.a(closeable3, null);
                        try {
                            sc.c.a(closeable2, null);
                            sc.c.a(r32, null);
                            return objX;
                        } catch (Throwable th4) {
                            th3 = th4;
                            r84 = r32;
                            try {
                                throw th3;
                            } catch (Throwable th5) {
                                sc.c.a(r84, th3);
                                throw th5;
                            }
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        r82 = r32;
                        closeable5 = closeable2;
                        try {
                            throw th;
                        } finally {
                        }
                    }
                } catch (Throwable th7) {
                    th = th7;
                    r83 = closeable8;
                    closeable = closeable7;
                    closeable4 = closeable6;
                    th2 = th;
                    try {
                        throw th2;
                    } catch (Throwable th8) {
                        try {
                            sc.c.a(closeable4, th2);
                            throw th8;
                        } catch (Throwable th9) {
                            th = th9;
                            closeable5 = closeable;
                            r82 = r83;
                            throw th;
                        }
                    }
                }
            }
            AbstractC4036s.b(obj);
            r82 = this.f27473t;
            String str = this.f27474u;
            K k10 = this.f27475v;
            long jLongValue = this.f27476w;
            HttpURLConnection httpURLConnection = this.f27477x;
            n nVar = this.f27478y;
            Long l10 = this.f27479z;
            if (str != null) {
                try {
                    r82.skip(k10.f39775a);
                } catch (Throwable th10) {
                    th3 = th10;
                    r84 = r82;
                    throw th3;
                }
            }
            C c11 = new C(r82, jLongValue);
            try {
                OutputStream outputStream = httpURLConnection.getOutputStream();
                AbstractC4862t.d(outputStream, "getOutputStream(...)");
                if (outputStream instanceof BufferedOutputStream) {
                    try {
                        bufferedOutputStream = (BufferedOutputStream) outputStream;
                    } catch (Throwable th11) {
                        th = th11;
                        th = th;
                        closeable5 = c11;
                        r82 = r82;
                        throw th;
                    }
                } else {
                    bufferedOutputStream = new BufferedOutputStream(outputStream, 8192);
                }
                DataOutputStream dataOutputStream2 = new DataOutputStream(bufferedOutputStream);
                if (str == null) {
                    try {
                        jLongValue = l10.longValue();
                    } catch (Throwable th12) {
                        th = th12;
                        c10 = c11;
                        dataOutputStream = dataOutputStream2;
                        closeable = c10;
                        closeable4 = dataOutputStream;
                        r83 = r82;
                        th2 = th;
                        throw th2;
                    }
                }
                Task taskZ = nVar.z();
                this.f27463j = r82;
                this.f27464k = nc.l.a(r82);
                this.f27465l = c11;
                this.f27466m = nc.l.a(c11);
                this.f27467n = dataOutputStream2;
                this.f27468o = nc.l.a(dataOutputStream2);
                this.f27469p = 0;
                this.f27470q = 0;
                this.f27471r = 0;
                this.f27472s = 1;
                c10 = c11;
                dataOutputStream = dataOutputStream2;
                try {
                    objX = nVar.X(c10, dataOutputStream, jLongValue, taskZ, this);
                    if (objX == objF) {
                        return objF;
                    }
                    closeable2 = c10;
                    closeable3 = dataOutputStream;
                    r32 = r82;
                    sc.c.a(closeable3, null);
                    sc.c.a(closeable2, null);
                    sc.c.a(r32, null);
                    return objX;
                } catch (Throwable th13) {
                    th = th13;
                    closeable = c10;
                    closeable4 = dataOutputStream;
                    r83 = r82;
                    th2 = th;
                    throw th2;
                }
            } catch (Throwable th14) {
                th = th14;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class g extends nc.m implements p {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public final /* synthetic */ HttpURLConnection f27480A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public final /* synthetic */ L f27481B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public final /* synthetic */ List f27482C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public final /* synthetic */ ArrayList f27483D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public final /* synthetic */ ArrayList f27484E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public final /* synthetic */ ArrayList f27485F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        public final /* synthetic */ n f27486G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        public final /* synthetic */ String f27487H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public final /* synthetic */ String f27488I;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f27489j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f27490k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Object f27491l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Object f27492m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Object f27493n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Object f27494o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Object f27495p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public Object f27496q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f27497r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f27498s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f27499t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f27500u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f27501v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f27502w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f27503x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f27504y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f27505z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(HttpURLConnection httpURLConnection, L l10, List list, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, n nVar, String str, String str2, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f27480A = httpURLConnection;
            this.f27481B = l10;
            this.f27482C = list;
            this.f27483D = arrayList;
            this.f27484E = arrayList2;
            this.f27485F = arrayList3;
            this.f27486G = nVar;
            this.f27487H = str;
            this.f27488I = str2;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return new g(this.f27480A, this.f27481B, this.f27482C, this.f27483D, this.f27484E, this.f27485F, this.f27486G, this.f27487H, this.f27488I, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((g) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0166 A[Catch: all -> 0x0101, TryCatch #2 {all -> 0x0101, blocks: (B:33:0x015e, B:35:0x0166, B:37:0x0170, B:39:0x0177, B:21:0x00fc, B:38:0x0174), top: B:81:0x015e }] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0195 A[Catch: all -> 0x0190, TRY_LEAVE, TryCatch #1 {all -> 0x0190, blocks: (B:41:0x017d, B:44:0x0195), top: B:79:0x017d }] */
        /* JADX WARN: Removed duplicated region for block: B:67:0x020d  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x00b9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r8v27 */
        /* JADX WARN: Type inference failed for: r8v3, types: [java.io.Closeable] */
        /* JADX WARN: Type inference failed for: r8v31 */
        /* JADX WARN: Type inference failed for: r8v4 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0155 -> B:81:0x015e). Please report as a decompilation issue!!! */
        @Override // nc.AbstractC5157a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r26) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 547
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bbflight.background_downloader.n.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(b0 context) {
        super(context);
        AbstractC4862t.e(context, "context");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
    
        if (r7 == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007b, code lost:
    
        if (r7 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.bbflight.background_downloader.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object D(java.net.HttpURLConnection r6, lc.InterfaceC4988e r7) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bbflight.background_downloader.n.D(java.net.HttpURLConnection, lc.e):java.lang.Object");
    }

    public final String c0(String str) {
        return Od.C.L(f27437x.j(str, "%0D%0A"), "\"", "%22", false, 4, null);
    }

    public final void d0(HttpURLConnection httpURLConnection) throws IOException {
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            AbstractC4862t.d(inputStream, "getInputStream(...)");
            N(sc.o.d(new BufferedReader(new InputStreamReader(inputStream, C1823c.f12394b), 8192)));
        } catch (Exception e10) {
            Log.i("TaskRunner", "Could not read response body from httpResponseCode " + httpURLConnection.getResponseCode() + ": " + e10);
            N(null);
        }
    }

    public final String e0(String str, String str2) {
        return "-------background_downloader-akjhfw281onqciyhnIk\r\n" + i0(str, str2) + str2 + "\r\n";
    }

    public final String f0(Uri uri) throws IOException {
        Uri uri2;
        int columnIndex;
        if (AbstractC4862t.a(uri.getScheme(), "content")) {
            uri2 = uri;
            Cursor cursorQuery = q().t().getContentResolver().query(uri2, null, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst() && (columnIndex = cursorQuery.getColumnIndex("_display_name")) != -1) {
                        String string = cursorQuery.getString(columnIndex);
                        sc.c.a(cursorQuery, null);
                        return string;
                    }
                    C4015H c4015h = C4015H.f34254a;
                    sc.c.a(cursorQuery, null);
                } finally {
                }
            }
        } else {
            uri2 = uri;
        }
        return uri2.getLastPathSegment();
    }

    public final String g0(ContentResolver contentResolver, Uri uri) {
        AbstractC4862t.e(contentResolver, "contentResolver");
        AbstractC4862t.e(uri, "uri");
        String type = contentResolver.getType(uri);
        if (type != null) {
            return type;
        }
        String string = uri.toString();
        AbstractC4862t.d(string, "toString(...)");
        return h0(string);
    }

    public final String h0(String str) {
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        String mimeTypeFromExtension = fileExtensionFromUrl != null ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl) : null;
        return mimeTypeFromExtension == null ? MimeTypes.OCTET_STREAM : mimeTypeFromExtension;
    }

    public final String i0(String str, String str2) {
        String str3 = "Content-Disposition: form-data; name=\"" + c0(str) + "\"";
        if (j0(str2)) {
            str3 = str3 + "\r\nContent-Type: application/json; charset=utf-8";
        } else if (!k0(str2)) {
            str3 = str3 + "\r\nContent-Type: text/plain; charset=utf-8\r\nContent-Transfer-Encoding: binary";
        }
        return str3 + "\r\n\r\n";
    }

    public final boolean j0(String str) {
        return f27436w.i(str);
    }

    public final boolean k0(String str) {
        return f27435v.i(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0279 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x027a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l0(java.net.HttpURLConnection r21, lc.InterfaceC4988e r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 638
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bbflight.background_downloader.n.l0(java.net.HttpURLConnection, lc.e):java.lang.Object");
    }

    public final Object m0(HttpURLConnection httpURLConnection, InterfaceC4988e interfaceC4988e) {
        List listN;
        L l10;
        boolean z10;
        Iterator it;
        boolean z11;
        Uri uri;
        List list;
        C4034q c4034q;
        String name;
        Long lD;
        ContentResolver contentResolver;
        String string;
        o oVar = new o("^(?:\"[^\"]+\"\\s*,\\s*)+\"[^\"]+\"$");
        L l11 = new L();
        l11.f39776a = "";
        for (Map.Entry entry : z().getFields().entrySet()) {
            if (oVar.i((CharSequence) entry.getValue())) {
                for (Od.k kVar : o.f(new o("\"([^\"]+)\""), (CharSequence) entry.getValue(), 0, 2, null)) {
                    l11.f39776a = l11.f39776a + e0((String) entry.getKey(), (String) kVar.b().get(1));
                }
            } else {
                l11.f39776a = l11.f39776a + e0((String) entry.getKey(), (String) entry.getValue());
            }
        }
        Uri uriC = s0.f13895a.c(z().getFilename());
        String strP = Task.p(z(), q().t(), null, 2, null);
        if (strP.length() > 0) {
            String fileField = z().getFileField();
            if (uriC != null && (string = uriC.toString()) != null) {
                strP = string;
            }
            listN = C4205s.d(new C4039v(fileField, strP, z().getMimeType()));
        } else {
            listN = z().n(q().t());
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = listN.iterator();
        boolean z12 = false;
        while (it2.hasNext()) {
            C4039v c4039v = (C4039v) it2.next();
            String str = (String) c4039v.a();
            String str2 = (String) c4039v.b();
            String strH0 = (String) c4039v.c();
            try {
                s0 s0Var = s0.f13895a;
                Uri uriC2 = s0Var.c(str2);
                if (uriC2 == null) {
                    it = it2;
                    z11 = z12;
                    uri = uriC2;
                    list = listN;
                    File file = new File(str2);
                    if (file.exists() && file.isFile()) {
                        if (strH0.length() == 0) {
                            String path = file.getPath();
                            AbstractC4862t.d(path, "getPath(...)");
                            strH0 = h0(path);
                        }
                        c4034q = new C4034q(AbstractC5158b.d(file.length()), new FileInputStream(file));
                    }
                    Log.w("TaskRunner", "File at " + str2 + " does not exist");
                    U(new Y(EnumC1903x.fileSystem, 0, "File to upload does not exist: " + str2, 2, null));
                    return g0.failed;
                }
                if (AbstractC4862t.a(uriC2.getScheme(), Constants.FILE)) {
                    it = it2;
                    uri = uriC2;
                    list = listN;
                    File fileA = T0.c.a(uri);
                    long length = fileA.length();
                    if (strH0.length() == 0) {
                        String string2 = uri.toString();
                        AbstractC4862t.d(string2, "toString(...)");
                        strH0 = h0(string2);
                    }
                    Log.v("TaskRunner", "Using FileInputStream from URI " + uri);
                    z11 = z12;
                    c4034q = new C4034q(AbstractC5158b.d(length), new FileInputStream(fileA));
                } else {
                    ContentResolver contentResolver2 = q().t().getContentResolver();
                    Cursor cursorQuery = contentResolver2.query(uriC2, null, null, null, null);
                    uri = uriC2;
                    if (cursorQuery != null) {
                        list = listN;
                        try {
                            int columnIndex = cursorQuery.getColumnIndex("_size");
                            it = it2;
                            lD = (columnIndex == -1 || !cursorQuery.moveToFirst()) ? null : AbstractC5158b.d(cursorQuery.getLong(columnIndex));
                            sc.c.a(cursorQuery, null);
                        } finally {
                        }
                    } else {
                        list = listN;
                        it = it2;
                        lD = null;
                    }
                    boolean z13 = z12 || lD == null;
                    if (strH0.length() == 0) {
                        AbstractC4862t.b(contentResolver2);
                        contentResolver = contentResolver2;
                        strH0 = g0(contentResolver, uri);
                    } else {
                        contentResolver = contentResolver2;
                    }
                    InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
                    if (inputStreamOpenInputStream == null) {
                        String str3 = "Could not open input stream for URI: " + uri;
                        Log.w("TaskRunner", str3);
                        U(new Y(EnumC1903x.fileSystem, 0, str3, 2, null));
                        return g0.failed;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    z11 = z13;
                    sb2.append("Using InputStream from URI ");
                    sb2.append(uri);
                    Log.v("TaskRunner", sb2.toString());
                    c4034q = new C4034q(lD, inputStreamOpenInputStream);
                }
                boolean z14 = z11;
                Long l12 = (Long) c4034q.a();
                InputStream inputStream = (InputStream) c4034q.b();
                if (!z14 && l12 == null) {
                    String str4 = "Could not determine file size for " + str2;
                    Log.w("TaskRunner", str4);
                    U(new Y(EnumC1903x.fileSystem, 0, str4, 2, null));
                    return g0.failed;
                }
                if (uri != null) {
                    name = f0(uri);
                    if (name == null) {
                        name = "unknown";
                    }
                } else {
                    name = new File(str2).getName();
                }
                String strC0 = c0(str);
                AbstractC4862t.b(name);
                L l13 = l11;
                arrayList.add("Content-Disposition: form-data; name=\"" + strC0 + "\"; filename=\"" + c0(name) + "\"\r\n");
                if (list.size() == 1 && !AbstractC4862t.a(z().getTaskType(), "MultiUploadTask")) {
                    Task taskZ = z();
                    if (uri != null) {
                        name = s0Var.a(name, uri);
                    }
                    S(Task.m(taskZ, null, null, null, name, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 33554423, null));
                }
                arrayList2.add("Content-Type: " + strH0 + "\r\n\r\n");
                arrayList3.add(new C4034q(l12, inputStream));
                z12 = z14;
                listN = list;
                it2 = it;
                l11 = l13;
            } catch (Exception unused) {
                String str5 = "Could not open file or determine file size for " + str2;
                Log.w("TaskRunner", str5);
                U(new Y(EnumC1903x.fileSystem, 0, str5, 2, null));
                return g0.failed;
            }
        }
        List list2 = listN;
        L l14 = l11;
        boolean z15 = z12;
        httpURLConnection.setRequestProperty("Accept-Charset", "UTF-8");
        httpURLConnection.setRequestProperty("Connection", "Keep-Alive");
        httpURLConnection.setRequestProperty("Cache-Control", "no-cache");
        httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_TYPE, "multipart/form-data; boundary=-----background_downloader-akjhfw281onqciyhnIk");
        if (z15) {
            l10 = l14;
            l(z(), 20971520L);
            z10 = false;
            httpURLConnection.setChunkedStreamingMode(0);
        } else {
            Iterator it3 = arrayList.iterator();
            int iC = 0;
            while (it3.hasNext()) {
                iC += m.c((String) it3.next());
            }
            Iterator it4 = arrayList2.iterator();
            int length2 = 0;
            while (it4.hasNext()) {
                length2 += ((String) it4.next()).length();
            }
            long j10 = iC + length2;
            Iterator it5 = arrayList3.iterator();
            long jLongValue = 0;
            while (it5.hasNext()) {
                Long l15 = (Long) ((C4034q) it5.next()).e();
                jLongValue += l15 != null ? l15.longValue() : 0L;
            }
            l10 = l14;
            long jC = ((long) (m.c((String) l10.f39776a) + 50)) + j10 + jLongValue + ((long) (52 * arrayList.size())) + ((long) 2);
            l(z(), jC);
            q().f(0L, jC);
            httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_LENGTH, String.valueOf(jC));
            httpURLConnection.setFixedLengthStreamingMode(jC);
            z10 = false;
        }
        httpURLConnection.setUseCaches(z10);
        return AbstractC2128g.g(C2123d0.b(), new g(httpURLConnection, l10, list2, arrayList3, arrayList, arrayList2, this, "\r\n-------background_downloader-akjhfw281onqciyhnIk\r\n", "\r\n-------background_downloader-akjhfw281onqciyhnIk--\r\n", null), interfaceC4988e);
    }
}
