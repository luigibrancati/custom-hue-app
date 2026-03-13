package N6;

/* JADX INFO: renamed from: N6.e1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1294e1 extends Y0 {
    public /* synthetic */ C1294e1(AbstractC1385l1 abstractC1385l1) {
        super(null);
    }

    @Override // N6.Y0
    public final C1255b1 a(AbstractC1346i1 abstractC1346i1, C1255b1 c1255b1) {
        C1255b1 c1255b12;
        synchronized (abstractC1346i1) {
            try {
                c1255b12 = abstractC1346i1.f10311b;
                if (c1255b12 != c1255b1) {
                    abstractC1346i1.f10311b = c1255b1;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1255b12;
    }

    @Override // N6.Y0
    public final C1333h1 b(AbstractC1346i1 abstractC1346i1, C1333h1 c1333h1) {
        C1333h1 c1333h12;
        synchronized (abstractC1346i1) {
            try {
                c1333h12 = abstractC1346i1.f10312c;
                if (c1333h12 != c1333h1) {
                    abstractC1346i1.f10312c = c1333h1;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1333h12;
    }

    @Override // N6.Y0
    public final void c(C1333h1 c1333h1, C1333h1 c1333h12) {
        c1333h1.f10295b = c1333h12;
    }

    @Override // N6.Y0
    public final void d(C1333h1 c1333h1, Thread thread) {
        c1333h1.f10294a = thread;
    }

    @Override // N6.Y0
    public final boolean e(AbstractC1346i1 abstractC1346i1, C1255b1 c1255b1, C1255b1 c1255b12) {
        synchronized (abstractC1346i1) {
            try {
                if (abstractC1346i1.f10311b != c1255b1) {
                    return false;
                }
                abstractC1346i1.f10311b = c1255b12;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // N6.Y0
    public final boolean f(AbstractC1346i1 abstractC1346i1, Object obj, Object obj2) {
        synchronized (abstractC1346i1) {
            try {
                if (abstractC1346i1.f10310a != obj) {
                    return false;
                }
                abstractC1346i1.f10310a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // N6.Y0
    public final boolean g(AbstractC1346i1 abstractC1346i1, C1333h1 c1333h1, C1333h1 c1333h12) {
        synchronized (abstractC1346i1) {
            try {
                if (abstractC1346i1.f10312c != c1333h1) {
                    return false;
                }
                abstractC1346i1.f10312c = c1333h12;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
