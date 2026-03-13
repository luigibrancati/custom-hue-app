package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.J;
import androidx.fragment.app.S;
import java.io.PrintWriter;
import java.util.ArrayList;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: renamed from: androidx.fragment.app.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C2720a extends S implements J.m {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final J f23193t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f23194u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f23195v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f23196w;

    public C2720a(J j10) {
        super(j10.w0(), j10.y0() != null ? j10.y0().f().getClassLoader() : null);
        this.f23195v = -1;
        this.f23196w = false;
        this.f23193t = j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public androidx.fragment.app.ComponentCallbacksC2736q A(java.util.ArrayList r6, androidx.fragment.app.ComponentCallbacksC2736q r7) {
        /*
            r5 = this;
            java.util.ArrayList r0 = r5.f23130c
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
        L8:
            if (r0 < 0) goto L35
            java.util.ArrayList r2 = r5.f23130c
            java.lang.Object r2 = r2.get(r0)
            androidx.fragment.app.S$a r2 = (androidx.fragment.app.S.a) r2
            int r3 = r2.f23147a
            if (r3 == r1) goto L2d
            r4 = 3
            if (r3 == r4) goto L27
            switch(r3) {
                case 6: goto L27;
                case 7: goto L2d;
                case 8: goto L25;
                case 9: goto L22;
                case 10: goto L1d;
                default: goto L1c;
            }
        L1c:
            goto L32
        L1d:
            androidx.lifecycle.j$b r3 = r2.f23154h
            r2.f23155i = r3
            goto L32
        L22:
            androidx.fragment.app.q r7 = r2.f23148b
            goto L32
        L25:
            r7 = 0
            goto L32
        L27:
            androidx.fragment.app.q r2 = r2.f23148b
            r6.add(r2)
            goto L32
        L2d:
            androidx.fragment.app.q r2 = r2.f23148b
            r6.remove(r2)
        L32:
            int r0 = r0 + (-1)
            goto L8
        L35:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C2720a.A(java.util.ArrayList, androidx.fragment.app.q):androidx.fragment.app.q");
    }

    @Override // androidx.fragment.app.J.m
    public boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (J.L0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f23136i) {
            return true;
        }
        this.f23193t.i(this);
        return true;
    }

    @Override // androidx.fragment.app.S
    public int f() {
        return s(false, true);
    }

    @Override // androidx.fragment.app.S
    public int g() {
        return s(true, true);
    }

    @Override // androidx.fragment.app.S
    public void h() {
        j();
        this.f23193t.d0(this, false);
    }

    @Override // androidx.fragment.app.S
    public void i() {
        j();
        this.f23193t.d0(this, true);
    }

    @Override // androidx.fragment.app.S
    public void k(int i10, ComponentCallbacksC2736q componentCallbacksC2736q, String str, int i11) {
        super.k(i10, componentCallbacksC2736q, str, i11);
        componentCallbacksC2736q.mFragmentManager = this.f23193t;
    }

    @Override // androidx.fragment.app.S
    public S l(ComponentCallbacksC2736q componentCallbacksC2736q) {
        J j10 = componentCallbacksC2736q.mFragmentManager;
        if (j10 == null || j10 == this.f23193t) {
            return super.l(componentCallbacksC2736q);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + componentCallbacksC2736q.toString() + " is already attached to a FragmentManager.");
    }

    public void q(int i10) {
        if (this.f23136i) {
            if (J.L0(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i10);
            }
            int size = this.f23130c.size();
            for (int i11 = 0; i11 < size; i11++) {
                S.a aVar = (S.a) this.f23130c.get(i11);
                ComponentCallbacksC2736q componentCallbacksC2736q = aVar.f23148b;
                if (componentCallbacksC2736q != null) {
                    componentCallbacksC2736q.mBackStackNesting += i10;
                    if (J.L0(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f23148b + " to " + aVar.f23148b.mBackStackNesting);
                    }
                }
            }
        }
    }

    public void r() {
        int size = this.f23130c.size() - 1;
        while (size >= 0) {
            S.a aVar = (S.a) this.f23130c.get(size);
            if (aVar.f23149c) {
                if (aVar.f23147a == 8) {
                    aVar.f23149c = false;
                    this.f23130c.remove(size - 1);
                    size--;
                } else {
                    int i10 = aVar.f23148b.mContainerId;
                    aVar.f23147a = 2;
                    aVar.f23149c = false;
                    for (int i11 = size - 1; i11 >= 0; i11--) {
                        S.a aVar2 = (S.a) this.f23130c.get(i11);
                        if (aVar2.f23149c && aVar2.f23148b.mContainerId == i10) {
                            this.f23130c.remove(i11);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    public int s(boolean z10, boolean z11) {
        if (this.f23194u) {
            throw new IllegalStateException("commit already called");
        }
        if (J.L0(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new X("FragmentManager"));
            t("  ", printWriter);
            printWriter.close();
        }
        this.f23194u = true;
        if (this.f23136i) {
            this.f23195v = this.f23193t.m();
        } else {
            this.f23195v = -1;
        }
        if (z11) {
            this.f23193t.a0(this, z10);
        }
        return this.f23195v;
    }

    public void t(String str, PrintWriter printWriter) {
        u(str, printWriter, true);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("BackStackEntry{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f23195v >= 0) {
            sb2.append(" #");
            sb2.append(this.f23195v);
        }
        if (this.f23138k != null) {
            sb2.append(StringUtils.SPACE);
            sb2.append(this.f23138k);
        }
        sb2.append("}");
        return sb2.toString();
    }

    public void u(String str, PrintWriter printWriter, boolean z10) {
        String str2;
        if (z10) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f23138k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f23195v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f23194u);
            if (this.f23135h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f23135h));
            }
            if (this.f23131d != 0 || this.f23132e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f23131d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f23132e));
            }
            if (this.f23133f != 0 || this.f23134g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f23133f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f23134g));
            }
            if (this.f23139l != 0 || this.f23140m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f23139l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f23140m);
            }
            if (this.f23141n != 0 || this.f23142o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f23141n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f23142o);
            }
        }
        if (this.f23130c.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f23130c.size();
        for (int i10 = 0; i10 < size; i10++) {
            S.a aVar = (S.a) this.f23130c.get(i10);
            switch (aVar.f23147a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + aVar.f23147a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i10);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(StringUtils.SPACE);
            printWriter.println(aVar.f23148b);
            if (z10) {
                if (aVar.f23150d != 0 || aVar.f23151e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f23150d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f23151e));
                }
                if (aVar.f23152f != 0 || aVar.f23153g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f23152f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f23153g));
                }
            }
        }
    }

    public void v() {
        int size = this.f23130c.size();
        for (int i10 = 0; i10 < size; i10++) {
            S.a aVar = (S.a) this.f23130c.get(i10);
            ComponentCallbacksC2736q componentCallbacksC2736q = aVar.f23148b;
            if (componentCallbacksC2736q != null) {
                componentCallbacksC2736q.mBeingSaved = this.f23196w;
                componentCallbacksC2736q.setPopDirection(false);
                componentCallbacksC2736q.setNextTransition(this.f23135h);
                componentCallbacksC2736q.setSharedElementNames(this.f23143p, this.f23144q);
            }
            switch (aVar.f23147a) {
                case 1:
                    componentCallbacksC2736q.setAnimations(aVar.f23150d, aVar.f23151e, aVar.f23152f, aVar.f23153g);
                    this.f23193t.q1(componentCallbacksC2736q, false);
                    this.f23193t.j(componentCallbacksC2736q);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f23147a);
                case 3:
                    componentCallbacksC2736q.setAnimations(aVar.f23150d, aVar.f23151e, aVar.f23152f, aVar.f23153g);
                    this.f23193t.i1(componentCallbacksC2736q);
                    break;
                case 4:
                    componentCallbacksC2736q.setAnimations(aVar.f23150d, aVar.f23151e, aVar.f23152f, aVar.f23153g);
                    this.f23193t.I0(componentCallbacksC2736q);
                    break;
                case 5:
                    componentCallbacksC2736q.setAnimations(aVar.f23150d, aVar.f23151e, aVar.f23152f, aVar.f23153g);
                    this.f23193t.q1(componentCallbacksC2736q, false);
                    this.f23193t.u1(componentCallbacksC2736q);
                    break;
                case 6:
                    componentCallbacksC2736q.setAnimations(aVar.f23150d, aVar.f23151e, aVar.f23152f, aVar.f23153g);
                    this.f23193t.y(componentCallbacksC2736q);
                    break;
                case 7:
                    componentCallbacksC2736q.setAnimations(aVar.f23150d, aVar.f23151e, aVar.f23152f, aVar.f23153g);
                    this.f23193t.q1(componentCallbacksC2736q, false);
                    this.f23193t.o(componentCallbacksC2736q);
                    break;
                case 8:
                    this.f23193t.s1(componentCallbacksC2736q);
                    break;
                case 9:
                    this.f23193t.s1(null);
                    break;
                case 10:
                    aVar.f23154h = componentCallbacksC2736q.mMaxState;
                    this.f23193t.r1(componentCallbacksC2736q, aVar.f23155i);
                    break;
            }
        }
    }

    public void w() {
        for (int size = this.f23130c.size() - 1; size >= 0; size--) {
            S.a aVar = (S.a) this.f23130c.get(size);
            ComponentCallbacksC2736q componentCallbacksC2736q = aVar.f23148b;
            if (componentCallbacksC2736q != null) {
                componentCallbacksC2736q.mBeingSaved = this.f23196w;
                componentCallbacksC2736q.setPopDirection(true);
                componentCallbacksC2736q.setNextTransition(J.n1(this.f23135h));
                componentCallbacksC2736q.setSharedElementNames(this.f23144q, this.f23143p);
            }
            switch (aVar.f23147a) {
                case 1:
                    componentCallbacksC2736q.setAnimations(aVar.f23150d, aVar.f23151e, aVar.f23152f, aVar.f23153g);
                    this.f23193t.q1(componentCallbacksC2736q, true);
                    this.f23193t.i1(componentCallbacksC2736q);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f23147a);
                case 3:
                    componentCallbacksC2736q.setAnimations(aVar.f23150d, aVar.f23151e, aVar.f23152f, aVar.f23153g);
                    this.f23193t.j(componentCallbacksC2736q);
                    break;
                case 4:
                    componentCallbacksC2736q.setAnimations(aVar.f23150d, aVar.f23151e, aVar.f23152f, aVar.f23153g);
                    this.f23193t.u1(componentCallbacksC2736q);
                    break;
                case 5:
                    componentCallbacksC2736q.setAnimations(aVar.f23150d, aVar.f23151e, aVar.f23152f, aVar.f23153g);
                    this.f23193t.q1(componentCallbacksC2736q, true);
                    this.f23193t.I0(componentCallbacksC2736q);
                    break;
                case 6:
                    componentCallbacksC2736q.setAnimations(aVar.f23150d, aVar.f23151e, aVar.f23152f, aVar.f23153g);
                    this.f23193t.o(componentCallbacksC2736q);
                    break;
                case 7:
                    componentCallbacksC2736q.setAnimations(aVar.f23150d, aVar.f23151e, aVar.f23152f, aVar.f23153g);
                    this.f23193t.q1(componentCallbacksC2736q, true);
                    this.f23193t.y(componentCallbacksC2736q);
                    break;
                case 8:
                    this.f23193t.s1(null);
                    break;
                case 9:
                    this.f23193t.s1(componentCallbacksC2736q);
                    break;
                case 10:
                    aVar.f23155i = componentCallbacksC2736q.mMaxState;
                    this.f23193t.r1(componentCallbacksC2736q, aVar.f23154h);
                    break;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public androidx.fragment.app.ComponentCallbacksC2736q x(java.util.ArrayList r17, androidx.fragment.app.ComponentCallbacksC2736q r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = 0
        L7:
            java.util.ArrayList r5 = r0.f23130c
            int r5 = r5.size()
            if (r4 >= r5) goto Lbe
            java.util.ArrayList r5 = r0.f23130c
            java.lang.Object r5 = r5.get(r4)
            androidx.fragment.app.S$a r5 = (androidx.fragment.app.S.a) r5
            int r6 = r5.f23147a
            r7 = 1
            if (r6 == r7) goto Lb6
            r8 = 2
            r9 = 0
            r10 = 3
            r11 = 9
            if (r6 == r8) goto L5a
            if (r6 == r10) goto L43
            r8 = 6
            if (r6 == r8) goto L43
            r8 = 7
            if (r6 == r8) goto Lb6
            r8 = 8
            if (r6 == r8) goto L31
            goto Lbb
        L31:
            java.util.ArrayList r6 = r0.f23130c
            androidx.fragment.app.S$a r8 = new androidx.fragment.app.S$a
            r8.<init>(r11, r3, r7)
            r6.add(r4, r8)
            r5.f23149c = r7
            int r4 = r4 + 1
            androidx.fragment.app.q r3 = r5.f23148b
            goto Lbb
        L43:
            androidx.fragment.app.q r6 = r5.f23148b
            r1.remove(r6)
            androidx.fragment.app.q r5 = r5.f23148b
            if (r5 != r3) goto Lbb
            java.util.ArrayList r3 = r0.f23130c
            androidx.fragment.app.S$a r6 = new androidx.fragment.app.S$a
            r6.<init>(r11, r5)
            r3.add(r4, r6)
            int r4 = r4 + 1
            r3 = r9
            goto Lbb
        L5a:
            androidx.fragment.app.q r6 = r5.f23148b
            int r8 = r6.mContainerId
            int r12 = r1.size()
            int r12 = r12 - r7
            r13 = 0
        L64:
            if (r12 < 0) goto La4
            java.lang.Object r14 = r1.get(r12)
            androidx.fragment.app.q r14 = (androidx.fragment.app.ComponentCallbacksC2736q) r14
            int r15 = r14.mContainerId
            if (r15 != r8) goto La1
            if (r14 != r6) goto L74
            r13 = r7
            goto La1
        L74:
            if (r14 != r3) goto L83
            java.util.ArrayList r3 = r0.f23130c
            androidx.fragment.app.S$a r15 = new androidx.fragment.app.S$a
            r15.<init>(r11, r14, r7)
            r3.add(r4, r15)
            int r4 = r4 + 1
            r3 = r9
        L83:
            androidx.fragment.app.S$a r15 = new androidx.fragment.app.S$a
            r15.<init>(r10, r14, r7)
            int r2 = r5.f23150d
            r15.f23150d = r2
            int r2 = r5.f23152f
            r15.f23152f = r2
            int r2 = r5.f23151e
            r15.f23151e = r2
            int r2 = r5.f23153g
            r15.f23153g = r2
            java.util.ArrayList r2 = r0.f23130c
            r2.add(r4, r15)
            r1.remove(r14)
            int r4 = r4 + r7
        La1:
            int r12 = r12 + (-1)
            goto L64
        La4:
            if (r13 == 0) goto Lae
            java.util.ArrayList r2 = r0.f23130c
            r2.remove(r4)
            int r4 = r4 + (-1)
            goto Lbb
        Lae:
            r5.f23147a = r7
            r5.f23149c = r7
            r1.add(r6)
            goto Lbb
        Lb6:
            androidx.fragment.app.q r2 = r5.f23148b
            r1.add(r2)
        Lbb:
            int r4 = r4 + r7
            goto L7
        Lbe:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C2720a.x(java.util.ArrayList, androidx.fragment.app.q):androidx.fragment.app.q");
    }

    public String y() {
        return this.f23138k;
    }

    public void z() {
        if (this.f23146s != null) {
            for (int i10 = 0; i10 < this.f23146s.size(); i10++) {
                ((Runnable) this.f23146s.get(i10)).run();
            }
            this.f23146s = null;
        }
    }
}
