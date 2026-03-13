package androidx.room;

import Od.C;
import androidx.room.a;
import gc.T;
import gc.U;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a.b f24614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f24615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f24616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f24617d;

    public b(a.b observer, int[] tableIds, String[] tableNames) {
        AbstractC4862t.e(observer, "observer");
        AbstractC4862t.e(tableIds, "tableIds");
        AbstractC4862t.e(tableNames, "tableNames");
        this.f24614a = observer;
        this.f24615b = tableIds;
        this.f24616c = tableNames;
        if (tableIds.length != tableNames.length) {
            throw new IllegalStateException("Check failed.");
        }
        this.f24617d = !(tableNames.length == 0) ? T.c(tableNames[0]) : U.d();
    }

    public final a.b a() {
        return this.f24614a;
    }

    public final int[] b() {
        return this.f24615b;
    }

    public final void c(Set invalidatedTablesIds) {
        Set setD;
        AbstractC4862t.e(invalidatedTablesIds, "invalidatedTablesIds");
        int[] iArr = this.f24615b;
        int length = iArr.length;
        if (length != 0) {
            int i10 = 0;
            if (length != 1) {
                Set setB = T.b();
                int[] iArr2 = this.f24615b;
                int length2 = iArr2.length;
                int i11 = 0;
                while (i10 < length2) {
                    int i12 = i11 + 1;
                    if (invalidatedTablesIds.contains(Integer.valueOf(iArr2[i10]))) {
                        setB.add(this.f24616c[i11]);
                    }
                    i10++;
                    i11 = i12;
                }
                setD = T.a(setB);
            } else {
                setD = invalidatedTablesIds.contains(Integer.valueOf(iArr[0])) ? this.f24617d : U.d();
            }
        } else {
            setD = U.d();
        }
        if (setD.isEmpty()) {
            return;
        }
        this.f24614a.c(setD);
    }

    public final void d(Set invalidatedTablesNames) {
        Set setD;
        AbstractC4862t.e(invalidatedTablesNames, "invalidatedTablesNames");
        int length = this.f24616c.length;
        if (length == 0) {
            setD = U.d();
        } else if (length != 1) {
            Set setB = T.b();
            Iterator it = invalidatedTablesNames.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                String[] strArr = this.f24616c;
                int length2 = strArr.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length2) {
                        String str2 = strArr[i10];
                        if (C.E(str2, str, true)) {
                            setB.add(str2);
                            break;
                        }
                        i10++;
                    }
                }
            }
            setD = T.a(setB);
        } else if (invalidatedTablesNames == null || !invalidatedTablesNames.isEmpty()) {
            Iterator it2 = invalidatedTablesNames.iterator();
            while (it2.hasNext()) {
                if (C.E((String) it2.next(), this.f24616c[0], true)) {
                    setD = this.f24617d;
                    break;
                }
            }
            setD = U.d();
        } else {
            setD = U.d();
        }
        if (setD.isEmpty()) {
            return;
        }
        this.f24614a.c(setD);
    }
}
