package x;

import L.h1;
import android.util.Size;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class C1 {
    public static List a(h1.b bVar, h1.b bVar2) {
        ArrayList arrayList = new ArrayList();
        h1.d dVar = h1.d.PRIV;
        arrayList.add(new L.g1(L.h1.c(dVar, bVar), L.h1.c(h1.d.JPEG, bVar2)));
        arrayList.add(new L.g1(L.h1.c(dVar, bVar), L.h1.c(h1.d.JPEG_R, bVar2)));
        return arrayList;
    }

    public static List b(Size size, L.i1 i1Var) {
        ArrayList arrayList = new ArrayList();
        L.h1 h1VarK = L.h1.k(34, size, i1Var);
        L.g1 g1Var = new L.g1();
        g1Var.a(h1VarK);
        arrayList.add(g1Var);
        L.g1 g1Var2 = new L.g1();
        g1Var2.a(h1VarK);
        g1Var2.a(h1VarK);
        arrayList.add(g1Var2);
        return arrayList;
    }

    public static List c() {
        ArrayList arrayList = new ArrayList();
        h1.d dVar = h1.d.PRIV;
        h1.b bVar = h1.b.S1080P_16_9;
        arrayList.add(new L.g1(L.h1.c(dVar, bVar)));
        h1.b bVar2 = h1.b.S720P_16_9;
        arrayList.add(new L.g1(L.h1.c(dVar, bVar2)));
        h1.b bVar3 = h1.b.MAXIMUM_16_9;
        arrayList.addAll(a(bVar, bVar3));
        h1.b bVar4 = h1.b.UHD;
        arrayList.addAll(a(bVar, bVar4));
        arrayList.addAll(a(bVar, h1.b.S1440P_16_9));
        arrayList.addAll(a(bVar, bVar));
        arrayList.addAll(a(bVar2, bVar3));
        arrayList.addAll(a(bVar2, bVar4));
        arrayList.addAll(a(bVar2, bVar));
        h1.b bVar5 = h1.b.X_VGA;
        h1.b bVar6 = h1.b.MAXIMUM_4_3;
        arrayList.addAll(a(bVar5, bVar6));
        arrayList.addAll(a(h1.b.S1080P_4_3, bVar6));
        return arrayList;
    }

    public static List d(int i10, boolean z10, boolean z11) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(i());
        if (i10 == 0 || i10 == 4 || i10 == 1 || i10 == 3) {
            arrayList.addAll(k());
        }
        if (i10 == 1 || i10 == 3) {
            arrayList.addAll(h());
        }
        if (z10) {
            arrayList.addAll(m());
        }
        if (z11 && i10 == 0) {
            arrayList.addAll(f());
        }
        if (i10 == 3) {
            arrayList.addAll(j());
        }
        return arrayList;
    }

    public static List e() {
        ArrayList arrayList = new ArrayList();
        L.g1 g1Var = new L.g1();
        h1.d dVar = h1.d.PRIV;
        h1.b bVar = h1.b.MAXIMUM;
        g1Var.a(L.h1.c(dVar, bVar));
        arrayList.add(g1Var);
        L.g1 g1Var2 = new L.g1();
        h1.d dVar2 = h1.d.YUV;
        g1Var2.a(L.h1.c(dVar2, bVar));
        arrayList.add(g1Var2);
        L.g1 g1Var3 = new L.g1();
        h1.b bVar2 = h1.b.PREVIEW;
        g1Var3.a(L.h1.c(dVar, bVar2));
        h1.d dVar3 = h1.d.JPEG;
        g1Var3.a(L.h1.c(dVar3, bVar));
        arrayList.add(g1Var3);
        L.g1 g1Var4 = new L.g1();
        g1Var4.a(L.h1.c(dVar, bVar2));
        g1Var4.a(L.h1.c(dVar2, bVar));
        arrayList.add(g1Var4);
        L.g1 g1Var5 = new L.g1();
        g1Var5.a(L.h1.c(dVar2, bVar2));
        g1Var5.a(L.h1.c(dVar2, bVar));
        arrayList.add(g1Var5);
        L.g1 g1Var6 = new L.g1();
        g1Var6.a(L.h1.c(dVar, bVar2));
        h1.b bVar3 = h1.b.RECORD;
        g1Var6.a(L.h1.c(dVar, bVar3));
        arrayList.add(g1Var6);
        L.g1 g1Var7 = new L.g1();
        g1Var7.a(L.h1.c(dVar, bVar2));
        g1Var7.a(L.h1.c(dVar, bVar3));
        g1Var7.a(L.h1.c(dVar2, bVar3));
        arrayList.add(g1Var7);
        L.g1 g1Var8 = new L.g1();
        g1Var8.a(L.h1.c(dVar, bVar2));
        g1Var8.a(L.h1.c(dVar, bVar3));
        g1Var8.a(L.h1.c(dVar3, bVar3));
        arrayList.add(g1Var8);
        return arrayList;
    }

    public static List f() {
        ArrayList arrayList = new ArrayList();
        L.g1 g1Var = new L.g1();
        h1.d dVar = h1.d.PRIV;
        h1.b bVar = h1.b.PREVIEW;
        g1Var.a(L.h1.c(dVar, bVar));
        h1.b bVar2 = h1.b.MAXIMUM;
        g1Var.a(L.h1.c(dVar, bVar2));
        arrayList.add(g1Var);
        L.g1 g1Var2 = new L.g1();
        g1Var2.a(L.h1.c(dVar, bVar));
        h1.d dVar2 = h1.d.YUV;
        g1Var2.a(L.h1.c(dVar2, bVar2));
        arrayList.add(g1Var2);
        L.g1 g1Var3 = new L.g1();
        g1Var3.a(L.h1.c(dVar2, bVar));
        g1Var3.a(L.h1.c(dVar2, bVar2));
        arrayList.add(g1Var3);
        return arrayList;
    }

    public static List g() {
        ArrayList arrayList = new ArrayList();
        L.g1 g1Var = new L.g1();
        h1.d dVar = h1.d.YUV;
        h1.b bVar = h1.b.S1440P_4_3;
        g1Var.a(L.h1.c(dVar, bVar));
        arrayList.add(g1Var);
        L.g1 g1Var2 = new L.g1();
        h1.d dVar2 = h1.d.PRIV;
        g1Var2.a(L.h1.c(dVar2, bVar));
        arrayList.add(g1Var2);
        L.g1 g1Var3 = new L.g1();
        h1.d dVar3 = h1.d.JPEG;
        g1Var3.a(L.h1.c(dVar3, bVar));
        arrayList.add(g1Var3);
        L.g1 g1Var4 = new L.g1();
        h1.b bVar2 = h1.b.S720P_16_9;
        g1Var4.a(L.h1.c(dVar, bVar2));
        g1Var4.a(L.h1.c(dVar3, bVar));
        arrayList.add(g1Var4);
        L.g1 g1Var5 = new L.g1();
        g1Var5.a(L.h1.c(dVar2, bVar2));
        g1Var5.a(L.h1.c(dVar3, bVar));
        arrayList.add(g1Var5);
        L.g1 g1Var6 = new L.g1();
        g1Var6.a(L.h1.c(dVar, bVar2));
        g1Var6.a(L.h1.c(dVar, bVar));
        arrayList.add(g1Var6);
        L.g1 g1Var7 = new L.g1();
        g1Var7.a(L.h1.c(dVar, bVar2));
        g1Var7.a(L.h1.c(dVar2, bVar));
        arrayList.add(g1Var7);
        L.g1 g1Var8 = new L.g1();
        g1Var8.a(L.h1.c(dVar2, bVar2));
        g1Var8.a(L.h1.c(dVar, bVar));
        arrayList.add(g1Var8);
        L.g1 g1Var9 = new L.g1();
        g1Var9.a(L.h1.c(dVar2, bVar2));
        g1Var9.a(L.h1.c(dVar2, bVar));
        arrayList.add(g1Var9);
        return arrayList;
    }

    public static List h() {
        ArrayList arrayList = new ArrayList();
        L.g1 g1Var = new L.g1();
        h1.d dVar = h1.d.PRIV;
        h1.b bVar = h1.b.PREVIEW;
        g1Var.a(L.h1.c(dVar, bVar));
        h1.b bVar2 = h1.b.MAXIMUM;
        g1Var.a(L.h1.c(dVar, bVar2));
        arrayList.add(g1Var);
        L.g1 g1Var2 = new L.g1();
        g1Var2.a(L.h1.c(dVar, bVar));
        h1.d dVar2 = h1.d.YUV;
        g1Var2.a(L.h1.c(dVar2, bVar2));
        arrayList.add(g1Var2);
        L.g1 g1Var3 = new L.g1();
        g1Var3.a(L.h1.c(dVar2, bVar));
        g1Var3.a(L.h1.c(dVar2, bVar2));
        arrayList.add(g1Var3);
        L.g1 g1Var4 = new L.g1();
        g1Var4.a(L.h1.c(dVar, bVar));
        g1Var4.a(L.h1.c(dVar, bVar));
        g1Var4.a(L.h1.c(h1.d.JPEG, bVar2));
        arrayList.add(g1Var4);
        L.g1 g1Var5 = new L.g1();
        h1.b bVar3 = h1.b.VGA;
        g1Var5.a(L.h1.c(dVar2, bVar3));
        g1Var5.a(L.h1.c(dVar, bVar));
        g1Var5.a(L.h1.c(dVar2, bVar2));
        arrayList.add(g1Var5);
        L.g1 g1Var6 = new L.g1();
        g1Var6.a(L.h1.c(dVar2, bVar3));
        g1Var6.a(L.h1.c(dVar2, bVar));
        g1Var6.a(L.h1.c(dVar2, bVar2));
        arrayList.add(g1Var6);
        return arrayList;
    }

    public static List i() {
        ArrayList arrayList = new ArrayList();
        L.g1 g1Var = new L.g1();
        h1.d dVar = h1.d.PRIV;
        h1.b bVar = h1.b.MAXIMUM;
        g1Var.a(L.h1.c(dVar, bVar));
        arrayList.add(g1Var);
        L.g1 g1Var2 = new L.g1();
        h1.d dVar2 = h1.d.JPEG;
        g1Var2.a(L.h1.c(dVar2, bVar));
        arrayList.add(g1Var2);
        L.g1 g1Var3 = new L.g1();
        h1.d dVar3 = h1.d.YUV;
        g1Var3.a(L.h1.c(dVar3, bVar));
        arrayList.add(g1Var3);
        L.g1 g1Var4 = new L.g1();
        h1.b bVar2 = h1.b.PREVIEW;
        g1Var4.a(L.h1.c(dVar, bVar2));
        g1Var4.a(L.h1.c(dVar2, bVar));
        arrayList.add(g1Var4);
        L.g1 g1Var5 = new L.g1();
        g1Var5.a(L.h1.c(dVar3, bVar2));
        g1Var5.a(L.h1.c(dVar2, bVar));
        arrayList.add(g1Var5);
        L.g1 g1Var6 = new L.g1();
        g1Var6.a(L.h1.c(dVar, bVar2));
        g1Var6.a(L.h1.c(dVar, bVar2));
        arrayList.add(g1Var6);
        L.g1 g1Var7 = new L.g1();
        g1Var7.a(L.h1.c(dVar, bVar2));
        g1Var7.a(L.h1.c(dVar3, bVar2));
        arrayList.add(g1Var7);
        L.g1 g1Var8 = new L.g1();
        g1Var8.a(L.h1.c(dVar, bVar2));
        g1Var8.a(L.h1.c(dVar3, bVar2));
        g1Var8.a(L.h1.c(dVar2, bVar));
        arrayList.add(g1Var8);
        return arrayList;
    }

    public static List j() {
        ArrayList arrayList = new ArrayList();
        L.g1 g1Var = new L.g1();
        h1.d dVar = h1.d.PRIV;
        h1.b bVar = h1.b.PREVIEW;
        g1Var.a(L.h1.c(dVar, bVar));
        h1.b bVar2 = h1.b.VGA;
        g1Var.a(L.h1.c(dVar, bVar2));
        h1.d dVar2 = h1.d.YUV;
        h1.b bVar3 = h1.b.MAXIMUM;
        g1Var.a(L.h1.c(dVar2, bVar3));
        h1.d dVar3 = h1.d.RAW;
        g1Var.a(L.h1.c(dVar3, bVar3));
        arrayList.add(g1Var);
        L.g1 g1Var2 = new L.g1();
        g1Var2.a(L.h1.c(dVar, bVar));
        g1Var2.a(L.h1.c(dVar, bVar2));
        g1Var2.a(L.h1.c(h1.d.JPEG, bVar3));
        g1Var2.a(L.h1.c(dVar3, bVar3));
        arrayList.add(g1Var2);
        return arrayList;
    }

    public static List k() {
        ArrayList arrayList = new ArrayList();
        L.g1 g1Var = new L.g1();
        h1.d dVar = h1.d.PRIV;
        h1.b bVar = h1.b.PREVIEW;
        g1Var.a(L.h1.c(dVar, bVar));
        h1.b bVar2 = h1.b.RECORD;
        g1Var.a(L.h1.c(dVar, bVar2));
        arrayList.add(g1Var);
        L.g1 g1Var2 = new L.g1();
        g1Var2.a(L.h1.c(dVar, bVar));
        h1.d dVar2 = h1.d.YUV;
        g1Var2.a(L.h1.c(dVar2, bVar2));
        arrayList.add(g1Var2);
        L.g1 g1Var3 = new L.g1();
        g1Var3.a(L.h1.c(dVar2, bVar));
        g1Var3.a(L.h1.c(dVar2, bVar2));
        arrayList.add(g1Var3);
        L.g1 g1Var4 = new L.g1();
        g1Var4.a(L.h1.c(dVar, bVar));
        g1Var4.a(L.h1.c(dVar, bVar2));
        h1.d dVar3 = h1.d.JPEG;
        g1Var4.a(L.h1.c(dVar3, bVar2));
        arrayList.add(g1Var4);
        L.g1 g1Var5 = new L.g1();
        g1Var5.a(L.h1.c(dVar, bVar));
        g1Var5.a(L.h1.c(dVar2, bVar2));
        g1Var5.a(L.h1.c(dVar3, bVar2));
        arrayList.add(g1Var5);
        L.g1 g1Var6 = new L.g1();
        g1Var6.a(L.h1.c(dVar2, bVar));
        g1Var6.a(L.h1.c(dVar2, bVar));
        g1Var6.a(L.h1.c(dVar3, h1.b.MAXIMUM));
        arrayList.add(g1Var6);
        return arrayList;
    }

    public static List l() {
        ArrayList arrayList = new ArrayList();
        L.g1 g1Var = new L.g1();
        h1.d dVar = h1.d.PRIV;
        h1.b bVar = h1.b.S1440P_4_3;
        g1Var.a(L.h1.c(dVar, bVar));
        arrayList.add(g1Var);
        L.g1 g1Var2 = new L.g1();
        h1.d dVar2 = h1.d.YUV;
        g1Var2.a(L.h1.c(dVar2, bVar));
        arrayList.add(g1Var2);
        L.g1 g1Var3 = new L.g1();
        g1Var3.a(L.h1.c(dVar, bVar));
        h1.d dVar3 = h1.d.JPEG;
        h1.b bVar2 = h1.b.MAXIMUM;
        g1Var3.a(L.h1.c(dVar3, bVar2));
        arrayList.add(g1Var3);
        L.g1 g1Var4 = new L.g1();
        g1Var4.a(L.h1.c(dVar2, bVar));
        g1Var4.a(L.h1.c(dVar3, bVar2));
        arrayList.add(g1Var4);
        L.g1 g1Var5 = new L.g1();
        g1Var5.a(L.h1.c(dVar, bVar));
        g1Var5.a(L.h1.c(dVar2, bVar2));
        arrayList.add(g1Var5);
        L.g1 g1Var6 = new L.g1();
        g1Var6.a(L.h1.c(dVar2, bVar));
        g1Var6.a(L.h1.c(dVar2, bVar2));
        arrayList.add(g1Var6);
        L.g1 g1Var7 = new L.g1();
        h1.b bVar3 = h1.b.PREVIEW;
        g1Var7.a(L.h1.c(dVar, bVar3));
        g1Var7.a(L.h1.c(dVar, bVar));
        arrayList.add(g1Var7);
        L.g1 g1Var8 = new L.g1();
        g1Var8.a(L.h1.c(dVar2, bVar3));
        g1Var8.a(L.h1.c(dVar, bVar));
        arrayList.add(g1Var8);
        L.g1 g1Var9 = new L.g1();
        g1Var9.a(L.h1.c(dVar, bVar3));
        g1Var9.a(L.h1.c(dVar2, bVar));
        arrayList.add(g1Var9);
        L.g1 g1Var10 = new L.g1();
        g1Var10.a(L.h1.c(dVar2, bVar3));
        g1Var10.a(L.h1.c(dVar2, bVar));
        arrayList.add(g1Var10);
        return arrayList;
    }

    public static List m() {
        ArrayList arrayList = new ArrayList();
        L.g1 g1Var = new L.g1();
        h1.d dVar = h1.d.RAW;
        h1.b bVar = h1.b.MAXIMUM;
        g1Var.a(L.h1.c(dVar, bVar));
        arrayList.add(g1Var);
        L.g1 g1Var2 = new L.g1();
        h1.d dVar2 = h1.d.PRIV;
        h1.b bVar2 = h1.b.PREVIEW;
        g1Var2.a(L.h1.c(dVar2, bVar2));
        g1Var2.a(L.h1.c(dVar, bVar));
        arrayList.add(g1Var2);
        L.g1 g1Var3 = new L.g1();
        h1.d dVar3 = h1.d.YUV;
        g1Var3.a(L.h1.c(dVar3, bVar2));
        g1Var3.a(L.h1.c(dVar, bVar));
        arrayList.add(g1Var3);
        L.g1 g1Var4 = new L.g1();
        g1Var4.a(L.h1.c(dVar2, bVar2));
        g1Var4.a(L.h1.c(dVar2, bVar2));
        g1Var4.a(L.h1.c(dVar, bVar));
        arrayList.add(g1Var4);
        L.g1 g1Var5 = new L.g1();
        g1Var5.a(L.h1.c(dVar2, bVar2));
        g1Var5.a(L.h1.c(dVar3, bVar2));
        g1Var5.a(L.h1.c(dVar, bVar));
        arrayList.add(g1Var5);
        L.g1 g1Var6 = new L.g1();
        g1Var6.a(L.h1.c(dVar3, bVar2));
        g1Var6.a(L.h1.c(dVar3, bVar2));
        g1Var6.a(L.h1.c(dVar, bVar));
        arrayList.add(g1Var6);
        L.g1 g1Var7 = new L.g1();
        g1Var7.a(L.h1.c(dVar2, bVar2));
        h1.d dVar4 = h1.d.JPEG;
        g1Var7.a(L.h1.c(dVar4, bVar));
        g1Var7.a(L.h1.c(dVar, bVar));
        arrayList.add(g1Var7);
        L.g1 g1Var8 = new L.g1();
        g1Var8.a(L.h1.c(dVar3, bVar2));
        g1Var8.a(L.h1.c(dVar4, bVar));
        g1Var8.a(L.h1.c(dVar, bVar));
        arrayList.add(g1Var8);
        return arrayList;
    }

    public static List n() {
        ArrayList arrayList = new ArrayList();
        L.g1 g1Var = new L.g1();
        h1.d dVar = h1.d.PRIV;
        h1.b bVar = h1.b.S1440P_4_3;
        L.f1 f1Var = L.f1.PREVIEW_VIDEO_STILL;
        g1Var.a(L.h1.d(dVar, bVar, f1Var));
        arrayList.add(g1Var);
        L.g1 g1Var2 = new L.g1();
        h1.d dVar2 = h1.d.YUV;
        g1Var2.a(L.h1.d(dVar2, bVar, f1Var));
        arrayList.add(g1Var2);
        L.g1 g1Var3 = new L.g1();
        h1.b bVar2 = h1.b.RECORD;
        L.f1 f1Var2 = L.f1.VIDEO_RECORD;
        g1Var3.a(L.h1.d(dVar, bVar2, f1Var2));
        arrayList.add(g1Var3);
        L.g1 g1Var4 = new L.g1();
        g1Var4.a(L.h1.d(dVar2, bVar2, f1Var2));
        arrayList.add(g1Var4);
        L.g1 g1Var5 = new L.g1();
        h1.d dVar3 = h1.d.JPEG;
        h1.b bVar3 = h1.b.MAXIMUM;
        L.f1 f1Var3 = L.f1.STILL_CAPTURE;
        g1Var5.a(L.h1.d(dVar3, bVar3, f1Var3));
        arrayList.add(g1Var5);
        L.g1 g1Var6 = new L.g1();
        g1Var6.a(L.h1.d(dVar2, bVar3, f1Var3));
        arrayList.add(g1Var6);
        L.g1 g1Var7 = new L.g1();
        h1.b bVar4 = h1.b.PREVIEW;
        L.f1 f1Var4 = L.f1.PREVIEW;
        g1Var7.a(L.h1.d(dVar, bVar4, f1Var4));
        g1Var7.a(L.h1.d(dVar3, bVar3, f1Var3));
        arrayList.add(g1Var7);
        L.g1 g1Var8 = new L.g1();
        g1Var8.a(L.h1.d(dVar, bVar4, f1Var4));
        g1Var8.a(L.h1.d(dVar2, bVar3, f1Var3));
        arrayList.add(g1Var8);
        L.g1 g1Var9 = new L.g1();
        g1Var9.a(L.h1.d(dVar, bVar4, f1Var4));
        g1Var9.a(L.h1.d(dVar, bVar2, f1Var2));
        arrayList.add(g1Var9);
        L.g1 g1Var10 = new L.g1();
        g1Var10.a(L.h1.d(dVar, bVar4, f1Var4));
        g1Var10.a(L.h1.d(dVar2, bVar2, f1Var2));
        arrayList.add(g1Var10);
        L.g1 g1Var11 = new L.g1();
        g1Var11.a(L.h1.d(dVar, bVar4, f1Var4));
        g1Var11.a(L.h1.d(dVar2, bVar4, f1Var4));
        arrayList.add(g1Var11);
        L.g1 g1Var12 = new L.g1();
        g1Var12.a(L.h1.d(dVar, bVar4, f1Var4));
        g1Var12.a(L.h1.d(dVar, bVar2, f1Var2));
        g1Var12.a(L.h1.d(dVar3, bVar2, f1Var3));
        arrayList.add(g1Var12);
        L.g1 g1Var13 = new L.g1();
        g1Var13.a(L.h1.d(dVar, bVar4, f1Var4));
        g1Var13.a(L.h1.d(dVar2, bVar2, f1Var2));
        g1Var13.a(L.h1.d(dVar3, bVar2, f1Var3));
        arrayList.add(g1Var13);
        L.g1 g1Var14 = new L.g1();
        g1Var14.a(L.h1.d(dVar, bVar4, f1Var4));
        g1Var14.a(L.h1.d(dVar2, bVar4, f1Var4));
        g1Var14.a(L.h1.d(dVar3, bVar3, f1Var3));
        arrayList.add(g1Var14);
        return arrayList;
    }

    public static List o() {
        ArrayList arrayList = new ArrayList();
        L.g1 g1Var = new L.g1();
        h1.d dVar = h1.d.JPEG_R;
        h1.b bVar = h1.b.MAXIMUM;
        g1Var.a(L.h1.c(dVar, bVar));
        arrayList.add(g1Var);
        L.g1 g1Var2 = new L.g1();
        g1Var2.a(L.h1.c(h1.d.PRIV, h1.b.PREVIEW));
        g1Var2.a(L.h1.c(dVar, bVar));
        arrayList.add(g1Var2);
        return arrayList;
    }

    public static List p() {
        ArrayList arrayList = new ArrayList();
        L.g1 g1Var = new L.g1();
        h1.d dVar = h1.d.YUV;
        h1.b bVar = h1.b.ULTRA_MAXIMUM;
        g1Var.a(L.h1.c(dVar, bVar));
        h1.d dVar2 = h1.d.PRIV;
        h1.b bVar2 = h1.b.PREVIEW;
        g1Var.a(L.h1.c(dVar2, bVar2));
        h1.b bVar3 = h1.b.RECORD;
        g1Var.a(L.h1.c(dVar2, bVar3));
        arrayList.add(g1Var);
        L.g1 g1Var2 = new L.g1();
        h1.d dVar3 = h1.d.JPEG;
        g1Var2.a(L.h1.c(dVar3, bVar));
        g1Var2.a(L.h1.c(dVar2, bVar2));
        g1Var2.a(L.h1.c(dVar2, bVar3));
        arrayList.add(g1Var2);
        L.g1 g1Var3 = new L.g1();
        h1.d dVar4 = h1.d.RAW;
        g1Var3.a(L.h1.c(dVar4, bVar));
        g1Var3.a(L.h1.c(dVar2, bVar2));
        g1Var3.a(L.h1.c(dVar2, bVar3));
        arrayList.add(g1Var3);
        L.g1 g1Var4 = new L.g1();
        g1Var4.a(L.h1.c(dVar, bVar));
        g1Var4.a(L.h1.c(dVar2, bVar2));
        h1.b bVar4 = h1.b.MAXIMUM;
        g1Var4.a(L.h1.c(dVar3, bVar4));
        arrayList.add(g1Var4);
        L.g1 g1Var5 = new L.g1();
        g1Var5.a(L.h1.c(dVar3, bVar));
        g1Var5.a(L.h1.c(dVar2, bVar2));
        g1Var5.a(L.h1.c(dVar3, bVar4));
        arrayList.add(g1Var5);
        L.g1 g1Var6 = new L.g1();
        g1Var6.a(L.h1.c(dVar4, bVar));
        g1Var6.a(L.h1.c(dVar2, bVar2));
        g1Var6.a(L.h1.c(dVar3, bVar4));
        arrayList.add(g1Var6);
        L.g1 g1Var7 = new L.g1();
        g1Var7.a(L.h1.c(dVar, bVar));
        g1Var7.a(L.h1.c(dVar2, bVar2));
        g1Var7.a(L.h1.c(dVar, bVar4));
        arrayList.add(g1Var7);
        L.g1 g1Var8 = new L.g1();
        g1Var8.a(L.h1.c(dVar3, bVar));
        g1Var8.a(L.h1.c(dVar2, bVar2));
        g1Var8.a(L.h1.c(dVar, bVar4));
        arrayList.add(g1Var8);
        L.g1 g1Var9 = new L.g1();
        g1Var9.a(L.h1.c(dVar4, bVar));
        g1Var9.a(L.h1.c(dVar2, bVar2));
        g1Var9.a(L.h1.c(dVar, bVar4));
        arrayList.add(g1Var9);
        L.g1 g1Var10 = new L.g1();
        g1Var10.a(L.h1.c(dVar, bVar));
        g1Var10.a(L.h1.c(dVar2, bVar2));
        g1Var10.a(L.h1.c(dVar4, bVar4));
        arrayList.add(g1Var10);
        L.g1 g1Var11 = new L.g1();
        g1Var11.a(L.h1.c(dVar3, bVar));
        g1Var11.a(L.h1.c(dVar2, bVar2));
        g1Var11.a(L.h1.c(dVar4, bVar4));
        arrayList.add(g1Var11);
        L.g1 g1Var12 = new L.g1();
        g1Var12.a(L.h1.c(dVar4, bVar));
        g1Var12.a(L.h1.c(dVar2, bVar2));
        g1Var12.a(L.h1.c(dVar4, bVar4));
        arrayList.add(g1Var12);
        return arrayList;
    }
}
