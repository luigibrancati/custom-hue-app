package L;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f8068a;

    public g1() {
        this.f8068a = new ArrayList();
    }

    public static void b(List list, int i10, int[] iArr, int i11) {
        if (i11 >= iArr.length) {
            list.add((int[]) iArr.clone());
            return;
        }
        for (int i12 = 0; i12 < i10; i12++) {
            int i13 = 0;
            while (true) {
                if (i13 >= i11) {
                    iArr[i11] = i12;
                    b(list, i10, iArr, i11 + 1);
                    break;
                } else if (i12 == iArr[i13]) {
                    break;
                } else {
                    i13++;
                }
            }
        }
    }

    public boolean a(h1 h1Var) {
        return this.f8068a.add(h1Var);
    }

    public final List c(int i10) {
        ArrayList arrayList = new ArrayList();
        b(arrayList, i10, new int[i10], 0);
        return arrayList;
    }

    public List d(List list) {
        int i10;
        if (list.isEmpty()) {
            return new ArrayList();
        }
        if (list.size() != this.f8068a.size()) {
            return null;
        }
        List listC = c(this.f8068a.size());
        h1[] h1VarArr = new h1[list.size()];
        Iterator it = listC.iterator();
        while (true) {
            i10 = 0;
            if (!it.hasNext()) {
                break;
            }
            int[] iArr = (int[]) it.next();
            boolean zJ = true;
            while (i10 < this.f8068a.size()) {
                if (iArr[i10] < list.size()) {
                    zJ &= ((h1) this.f8068a.get(i10)).j((h1) list.get(iArr[i10]));
                    if (!zJ) {
                        break;
                    }
                    h1VarArr[iArr[i10]] = (h1) this.f8068a.get(i10);
                }
                i10++;
            }
            if (zJ) {
                i10 = 1;
                break;
            }
        }
        if (i10 != 0) {
            return Arrays.asList(h1VarArr);
        }
        return null;
    }

    public g1(h1... h1VarArr) {
        ArrayList arrayList = new ArrayList();
        this.f8068a = arrayList;
        Collections.addAll(arrayList, h1VarArr);
    }
}
