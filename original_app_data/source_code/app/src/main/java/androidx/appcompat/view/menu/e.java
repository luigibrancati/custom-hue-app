package androidx.appcompat.view.menu;

import Y0.AbstractC2548b;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class e implements Q0.a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final int[] f21560A = {1, 4, 5, 3, 2, 0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f21561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources f21562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f21563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f21564d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f21565e;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ContextMenu.ContextMenuInfo f21573m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public CharSequence f21574n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Drawable f21575o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public View f21576p;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public g f21584x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f21586z;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f21572l = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f21577q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f21578r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f21579s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f21580t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f21581u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ArrayList f21582v = new ArrayList();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public CopyOnWriteArrayList f21583w = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f21585y = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f21566f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f21567g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f21568h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList f21569i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList f21570j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f21571k = true;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a {
        boolean a(e eVar, MenuItem menuItem);

        void b(e eVar);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b {
        boolean b(g gVar);
    }

    public e(Context context) {
        this.f21561a = context;
        this.f21562b = context.getResources();
        c0(true);
    }

    public static int B(int i10) {
        int i11 = ((-65536) & i10) >> 16;
        if (i11 >= 0) {
            int[] iArr = f21560A;
            if (i11 < iArr.length) {
                return (i10 & 65535) | (iArr[i11] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    public static int n(ArrayList arrayList, int i10) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((g) arrayList.get(size)).f() <= i10) {
                return size + 1;
            }
        }
        return 0;
    }

    public boolean A() {
        return this.f21580t;
    }

    public Resources C() {
        return this.f21562b;
    }

    public ArrayList E() {
        if (!this.f21568h) {
            return this.f21567g;
        }
        this.f21567g.clear();
        int size = this.f21566f.size();
        for (int i10 = 0; i10 < size; i10++) {
            g gVar = (g) this.f21566f.get(i10);
            if (gVar.isVisible()) {
                this.f21567g.add(gVar);
            }
        }
        this.f21568h = false;
        this.f21571k = true;
        return this.f21567g;
    }

    public boolean F() {
        return !this.f21577q;
    }

    public boolean G() {
        return this.f21585y;
    }

    public boolean H() {
        return this.f21563c;
    }

    public boolean I() {
        return this.f21564d;
    }

    public void J(g gVar) {
        this.f21571k = true;
        L(true);
    }

    public void K(g gVar) {
        this.f21568h = true;
        L(true);
    }

    public void L(boolean z10) {
        if (this.f21577q) {
            this.f21578r = true;
            if (z10) {
                this.f21579s = true;
                return;
            }
            return;
        }
        if (z10) {
            this.f21568h = true;
            this.f21571k = true;
        }
        i(z10);
    }

    public boolean M(MenuItem menuItem, int i10) {
        return N(menuItem, null, i10);
    }

    public boolean N(MenuItem menuItem, i iVar, int i10) {
        g gVar = (g) menuItem;
        if (gVar == null || !gVar.isEnabled()) {
            return false;
        }
        boolean zK = gVar.k();
        AbstractC2548b abstractC2548bA = gVar.a();
        boolean z10 = abstractC2548bA != null && abstractC2548bA.a();
        if (gVar.j()) {
            boolean zExpandActionView = gVar.expandActionView() | zK;
            if (zExpandActionView) {
                e(true);
            }
            return zExpandActionView;
        }
        if (!gVar.hasSubMenu() && !z10) {
            if ((i10 & 1) == 0) {
                e(true);
            }
            return zK;
        }
        if ((i10 & 4) == 0) {
            e(false);
        }
        if (!gVar.hasSubMenu()) {
            gVar.x(new l(u(), this, gVar));
        }
        l lVar = (l) gVar.getSubMenu();
        if (z10) {
            abstractC2548bA.e(lVar);
        }
        boolean zJ = j(lVar, iVar) | zK;
        if (!zJ) {
            e(true);
        }
        return zJ;
    }

    public final void O(int i10, boolean z10) {
        if (i10 < 0 || i10 >= this.f21566f.size()) {
            return;
        }
        this.f21566f.remove(i10);
        if (z10) {
            L(true);
        }
    }

    public void P(i iVar) {
        for (WeakReference weakReference : this.f21583w) {
            i iVar2 = (i) weakReference.get();
            if (iVar2 == null || iVar2 == iVar) {
                this.f21583w.remove(weakReference);
            }
        }
    }

    public void Q(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(t());
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((l) item.getSubMenu()).Q(bundle);
            }
        }
        int i11 = bundle.getInt("android:menu:expandedactionview");
        if (i11 <= 0 || (menuItemFindItem = findItem(i11)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    public void R(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((l) item.getSubMenu()).R(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(t(), sparseArray);
        }
    }

    public void S(a aVar) {
        this.f21565e = aVar;
    }

    public e T(int i10) {
        this.f21572l = i10;
        return this;
    }

    public void U(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f21566f.size();
        e0();
        for (int i10 = 0; i10 < size; i10++) {
            g gVar = (g) this.f21566f.get(i10);
            if (gVar.getGroupId() == groupId && gVar.m() && gVar.isCheckable()) {
                gVar.s(gVar == menuItem);
            }
        }
        d0();
    }

    public e V(int i10) {
        X(0, null, i10, null, null);
        return this;
    }

    public e W(Drawable drawable) {
        X(0, null, 0, drawable, null);
        return this;
    }

    public final void X(int i10, CharSequence charSequence, int i11, Drawable drawable, View view) {
        Resources resourcesC = C();
        if (view != null) {
            this.f21576p = view;
            this.f21574n = null;
            this.f21575o = null;
        } else {
            if (i10 > 0) {
                this.f21574n = resourcesC.getText(i10);
            } else if (charSequence != null) {
                this.f21574n = charSequence;
            }
            if (i11 > 0) {
                this.f21575o = L0.a.f(u(), i11);
            } else if (drawable != null) {
                this.f21575o = drawable;
            }
            this.f21576p = null;
        }
        L(false);
    }

    public e Y(int i10) {
        X(i10, null, 0, null, null);
        return this;
    }

    public e Z(CharSequence charSequence) {
        X(0, charSequence, 0, null, null);
        return this;
    }

    public MenuItem a(int i10, int i11, int i12, CharSequence charSequence) {
        int iB = B(i12);
        g gVarG = g(i10, i11, i12, iB, charSequence, this.f21572l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f21573m;
        if (contextMenuInfo != null) {
            gVarG.v(contextMenuInfo);
        }
        ArrayList arrayList = this.f21566f;
        arrayList.add(n(arrayList, iB), gVarG);
        L(true);
        return gVarG;
    }

    public e a0(View view) {
        X(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        int i14;
        PackageManager packageManager = this.f21561a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i13 & 1) == 0) {
            removeGroup(i10);
        }
        for (int i15 = 0; i15 < size; i15++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i15);
            int i16 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i16 < 0 ? intent : intentArr[i16]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i10, i11, i12, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i14 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i14] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void b(i iVar) {
        c(iVar, this.f21561a);
    }

    public void b0(boolean z10) {
        this.f21586z = z10;
    }

    public void c(i iVar, Context context) {
        this.f21583w.add(new WeakReference(iVar));
        iVar.i(context, this);
        this.f21571k = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c0(boolean r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L1c
            android.content.res.Resources r3 = r2.f21562b
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.keyboard
            r0 = 1
            if (r3 == r0) goto L1c
            android.content.Context r3 = r2.f21561a
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r3)
            android.content.Context r1 = r2.f21561a
            boolean r3 = Y0.H.j(r3, r1)
            if (r3 == 0) goto L1c
            goto L1d
        L1c:
            r0 = 0
        L1d:
            r2.f21564d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.e.c0(boolean):void");
    }

    @Override // android.view.Menu
    public void clear() {
        g gVar = this.f21584x;
        if (gVar != null) {
            f(gVar);
        }
        this.f21566f.clear();
        L(true);
    }

    public void clearHeader() {
        this.f21575o = null;
        this.f21574n = null;
        this.f21576p = null;
        L(false);
    }

    @Override // android.view.Menu
    public void close() {
        e(true);
    }

    public void d() {
        a aVar = this.f21565e;
        if (aVar != null) {
            aVar.b(this);
        }
    }

    public void d0() {
        this.f21577q = false;
        if (this.f21578r) {
            this.f21578r = false;
            L(this.f21579s);
        }
    }

    public final void e(boolean z10) {
        if (this.f21581u) {
            return;
        }
        this.f21581u = true;
        for (WeakReference weakReference : this.f21583w) {
            i iVar = (i) weakReference.get();
            if (iVar == null) {
                this.f21583w.remove(weakReference);
            } else {
                iVar.b(this, z10);
            }
        }
        this.f21581u = false;
    }

    public void e0() {
        if (this.f21577q) {
            return;
        }
        this.f21577q = true;
        this.f21578r = false;
        this.f21579s = false;
    }

    public boolean f(g gVar) {
        boolean zH = false;
        if (!this.f21583w.isEmpty() && this.f21584x == gVar) {
            e0();
            for (WeakReference weakReference : this.f21583w) {
                i iVar = (i) weakReference.get();
                if (iVar != null) {
                    zH = iVar.h(this, gVar);
                    if (zH) {
                        break;
                    }
                } else {
                    this.f21583w.remove(weakReference);
                }
            }
            d0();
            if (zH) {
                this.f21584x = null;
            }
        }
        return zH;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i10) {
        MenuItem menuItemFindItem;
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = (g) this.f21566f.get(i11);
            if (gVar.getItemId() == i10) {
                return gVar;
            }
            if (gVar.hasSubMenu() && (menuItemFindItem = gVar.getSubMenu().findItem(i10)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public final g g(int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        return new g(this, i10, i11, i12, i13, charSequence, i14);
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i10) {
        return (MenuItem) this.f21566f.get(i10);
    }

    public boolean h(e eVar, MenuItem menuItem) {
        a aVar = this.f21565e;
        return aVar != null && aVar.a(eVar, menuItem);
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.f21586z) {
            return true;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((g) this.f21566f.get(i10)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i(boolean z10) {
        if (this.f21583w.isEmpty()) {
            return;
        }
        e0();
        for (WeakReference weakReference : this.f21583w) {
            i iVar = (i) weakReference.get();
            if (iVar == null) {
                this.f21583w.remove(weakReference);
            } else {
                iVar.f(z10);
            }
        }
        d0();
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return p(i10, keyEvent) != null;
    }

    public final boolean j(l lVar, i iVar) {
        if (this.f21583w.isEmpty()) {
            return false;
        }
        boolean zE = iVar != null ? iVar.e(lVar) : false;
        for (WeakReference weakReference : this.f21583w) {
            i iVar2 = (i) weakReference.get();
            if (iVar2 == null) {
                this.f21583w.remove(weakReference);
            } else if (!zE) {
                zE = iVar2.e(lVar);
            }
        }
        return zE;
    }

    public boolean k(g gVar) {
        boolean zC = false;
        if (this.f21583w.isEmpty()) {
            return false;
        }
        e0();
        for (WeakReference weakReference : this.f21583w) {
            i iVar = (i) weakReference.get();
            if (iVar != null) {
                zC = iVar.c(this, gVar);
                if (zC) {
                    break;
                }
            } else {
                this.f21583w.remove(weakReference);
            }
        }
        d0();
        if (zC) {
            this.f21584x = gVar;
        }
        return zC;
    }

    public int l(int i10) {
        return m(i10, 0);
    }

    public int m(int i10, int i11) {
        int size = size();
        if (i11 < 0) {
            i11 = 0;
        }
        while (i11 < size) {
            if (((g) this.f21566f.get(i11)).getGroupId() == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public int o(int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            if (((g) this.f21566f.get(i11)).getItemId() == i10) {
                return i11;
            }
        }
        return -1;
    }

    public g p(int i10, KeyEvent keyEvent) {
        ArrayList arrayList = this.f21582v;
        arrayList.clear();
        q(arrayList, i10, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (g) arrayList.get(0);
        }
        boolean zH = H();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = (g) arrayList.get(i11);
            char alphabeticShortcut = zH ? gVar.getAlphabeticShortcut() : gVar.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (zH && alphabeticShortcut == '\b' && i10 == 67))) {
                return gVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i10, int i11) {
        return M(findItem(i10), i11);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        g gVarP = p(i10, keyEvent);
        boolean zM = gVarP != null ? M(gVarP, i11) : false;
        if ((i11 & 2) != 0) {
            e(true);
        }
        return zM;
    }

    public void q(List list, int i10, KeyEvent keyEvent) {
        boolean zH = H();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i10 == 67) {
            int size = this.f21566f.size();
            for (int i11 = 0; i11 < size; i11++) {
                g gVar = (g) this.f21566f.get(i11);
                if (gVar.hasSubMenu()) {
                    ((e) gVar.getSubMenu()).q(list, i10, keyEvent);
                }
                char alphabeticShortcut = zH ? gVar.getAlphabeticShortcut() : gVar.getNumericShortcut();
                if ((modifiers & 69647) == ((zH ? gVar.getAlphabeticModifiers() : gVar.getNumericModifiers()) & 69647) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (zH && alphabeticShortcut == '\b' && i10 == 67)) && gVar.isEnabled()) {
                        list.add(gVar);
                    }
                }
            }
        }
    }

    public void r() {
        ArrayList arrayListE = E();
        if (this.f21571k) {
            boolean zG = false;
            for (WeakReference weakReference : this.f21583w) {
                i iVar = (i) weakReference.get();
                if (iVar == null) {
                    this.f21583w.remove(weakReference);
                } else {
                    zG |= iVar.g();
                }
            }
            if (zG) {
                this.f21569i.clear();
                this.f21570j.clear();
                int size = arrayListE.size();
                for (int i10 = 0; i10 < size; i10++) {
                    g gVar = (g) arrayListE.get(i10);
                    if (gVar.l()) {
                        this.f21569i.add(gVar);
                    } else {
                        this.f21570j.add(gVar);
                    }
                }
            } else {
                this.f21569i.clear();
                this.f21570j.clear();
                this.f21570j.addAll(E());
            }
            this.f21571k = false;
        }
    }

    @Override // android.view.Menu
    public void removeGroup(int i10) {
        int iL = l(i10);
        if (iL >= 0) {
            int size = this.f21566f.size() - iL;
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                if (i11 >= size || ((g) this.f21566f.get(iL)).getGroupId() != i10) {
                    break;
                }
                O(iL, false);
                i11 = i12;
            }
            L(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i10) {
        O(o(i10), true);
    }

    public ArrayList s() {
        r();
        return this.f21569i;
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i10, boolean z10, boolean z11) {
        int size = this.f21566f.size();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = (g) this.f21566f.get(i11);
            if (gVar.getGroupId() == i10) {
                gVar.t(z11);
                gVar.setCheckable(z10);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z10) {
        this.f21585y = z10;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i10, boolean z10) {
        int size = this.f21566f.size();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = (g) this.f21566f.get(i11);
            if (gVar.getGroupId() == i10) {
                gVar.setEnabled(z10);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i10, boolean z10) {
        int size = this.f21566f.size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = (g) this.f21566f.get(i11);
            if (gVar.getGroupId() == i10 && gVar.y(z10)) {
                z11 = true;
            }
        }
        if (z11) {
            L(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z10) {
        this.f21563c = z10;
        L(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f21566f.size();
    }

    public String t() {
        return "android:menu:actionviewstates";
    }

    public Context u() {
        return this.f21561a;
    }

    public g v() {
        return this.f21584x;
    }

    public Drawable w() {
        return this.f21575o;
    }

    public CharSequence x() {
        return this.f21574n;
    }

    public View y() {
        return this.f21576p;
    }

    public ArrayList z() {
        r();
        return this.f21570j;
    }

    @Override // android.view.Menu
    public MenuItem add(int i10) {
        return a(0, 0, 0, this.f21562b.getString(i10));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10) {
        return addSubMenu(0, 0, 0, this.f21562b.getString(i10));
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return a(i10, i11, i12, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        g gVar = (g) a(i10, i11, i12, charSequence);
        l lVar = new l(this.f21561a, this, gVar);
        gVar.x(lVar);
        return lVar;
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, int i13) {
        return a(i10, i11, i12, this.f21562b.getString(i13));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return addSubMenu(i10, i11, i12, this.f21562b.getString(i13));
    }

    public e D() {
        return this;
    }
}
