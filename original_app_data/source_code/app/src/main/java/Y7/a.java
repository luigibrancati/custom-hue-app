package Y7;

import P7.f;
import P7.j;
import P7.m;
import P7.o;
import P7.q;
import P7.t;
import P7.y;
import android.content.Context;
import android.preference.PreferenceManager;
import android.util.Log;
import e8.C3950A;
import f8.k;
import java.io.CharConversionException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f19804d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f19805e = "a";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f19806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final P7.a f19807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o f19808c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Context f19809a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f19810b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f19811c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f19812d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public P7.a f19813e = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f19814f = true;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public j f19815g = null;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public C3950A f19816h = null;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public o f19817i;

        public static byte[] h(Context context, String str, String str2) throws CharConversionException {
            if (str == null) {
                throw new IllegalArgumentException("keysetName cannot be null");
            }
            Context applicationContext = context.getApplicationContext();
            try {
                String string = (str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str2, 0)).getString(str, null);
                if (string == null) {
                    return null;
                }
                return k.a(string);
            } catch (ClassCastException | IllegalArgumentException unused) {
                throw new CharConversionException(String.format("can't read keyset; the pref value %s is not a valid hex string", str));
            }
        }

        public synchronized a f() {
            a aVar;
            try {
                if (this.f19810b == null) {
                    throw new IllegalArgumentException("keysetName cannot be null");
                }
                C3950A c3950a = this.f19816h;
                if (c3950a != null && this.f19815g == null) {
                    this.f19815g = j.a(y.a(c3950a.g()));
                }
                synchronized (a.f19804d) {
                    try {
                        byte[] bArrH = h(this.f19809a, this.f19810b, this.f19811c);
                        if (bArrH == null) {
                            if (this.f19812d != null) {
                                this.f19813e = k();
                            }
                            this.f19817i = g();
                        } else if (this.f19812d == null || !a.f()) {
                            this.f19817i = i(bArrH);
                        } else {
                            this.f19817i = j(bArrH);
                        }
                        aVar = new a(this);
                    } finally {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
            return aVar;
        }

        public final o g() throws GeneralSecurityException {
            j jVar = this.f19815g;
            if (jVar == null) {
                throw new GeneralSecurityException("cannot read or generate keyset");
            }
            m mVarQ = m.q(jVar);
            a.g(mVarQ, new e(this.f19809a, this.f19810b, this.f19811c), this.f19813e);
            return o.b(mVarQ);
        }

        public final o i(byte[] bArr) {
            return o.b(t.b(P7.b.b(bArr), f.a()));
        }

        public final o j(byte[] bArr) {
            try {
                this.f19813e = new d().b(this.f19812d);
                try {
                    return o.b(t.a(P7.b.b(bArr), this.f19813e, new byte[0]));
                } catch (IOException | GeneralSecurityException e10) {
                    try {
                        return this.i(bArr);
                    } catch (IOException unused) {
                        throw e10;
                    }
                }
            } catch (GeneralSecurityException | ProviderException e11) {
                try {
                    o oVarI = i(bArr);
                    Log.w(a.f19805e, "cannot use Android Keystore, it'll be disabled", e11);
                    return oVarI;
                } catch (IOException unused2) {
                    throw e11;
                }
            }
        }

        public final P7.a k() throws KeyStoreException {
            if (!a.f()) {
                Log.w(a.f19805e, "Android Keystore requires at least Android M");
                return null;
            }
            d dVar = new d();
            try {
                boolean zD = d.d(this.f19812d);
                try {
                    return dVar.b(this.f19812d);
                } catch (GeneralSecurityException | ProviderException e10) {
                    if (!zD) {
                        throw new KeyStoreException(String.format("the master key %s exists but is unusable", this.f19812d), e10);
                    }
                    Log.w(a.f19805e, "cannot use Android Keystore, it'll be disabled", e10);
                    return null;
                }
            } catch (GeneralSecurityException | ProviderException e11) {
                Log.w(a.f19805e, "cannot use Android Keystore, it'll be disabled", e11);
                return null;
            }
        }

        public b l(j jVar) {
            this.f19815g = jVar;
            return this;
        }

        public b m(String str) {
            if (!str.startsWith("android-keystore://")) {
                throw new IllegalArgumentException("key URI must start with android-keystore://");
            }
            if (!this.f19814f) {
                throw new IllegalArgumentException("cannot call withMasterKeyUri() after calling doNotUseKeystore()");
            }
            this.f19812d = str;
            return this;
        }

        public b n(Context context, String str, String str2) {
            if (context == null) {
                throw new IllegalArgumentException("need an Android context");
            }
            if (str == null) {
                throw new IllegalArgumentException("need a keyset name");
            }
            this.f19809a = context;
            this.f19810b = str;
            this.f19811c = str2;
            return this;
        }
    }

    public static boolean f() {
        return true;
    }

    public static void g(m mVar, q qVar, P7.a aVar) throws GeneralSecurityException {
        try {
            if (aVar != null) {
                t.c(mVar, qVar, aVar, new byte[0]);
            } else {
                t.d(mVar, qVar, f.a());
            }
        } catch (IOException e10) {
            throw new GeneralSecurityException(e10);
        }
    }

    public synchronized m e() {
        return this.f19808c.a();
    }

    public a(b bVar) {
        this.f19806a = new e(bVar.f19809a, bVar.f19810b, bVar.f19811c);
        this.f19807b = bVar.f19813e;
        this.f19808c = bVar.f19817i;
    }
}
