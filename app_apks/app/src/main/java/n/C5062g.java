package n;

import Y0.AbstractC2548b;
import Y0.AbstractC2562p;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import com.google.android.libraries.barhopper.RecognitionOptions;
import h.j;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import o.MenuItemC5180c;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p.AbstractC5329H;
import p.W;

/* JADX INFO: renamed from: n.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C5062g extends MenuInflater {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Class[] f40425e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Class[] f40426f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f40427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f40428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f40429c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f40430d;

    /* JADX INFO: renamed from: n.g$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Class[] f40431c = {MenuItem.class};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f40432a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Method f40433b;

        public a(Object obj, String str) {
            this.f40432a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f40433b = cls.getMethod(str, f40431c);
            } catch (Exception e10) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e10);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f40433b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f40433b.invoke(this.f40432a, menuItem)).booleanValue();
                }
                this.f40433b.invoke(this.f40432a, menuItem);
                return true;
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* JADX INFO: renamed from: n.g$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public AbstractC2548b f40434A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public CharSequence f40435B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public CharSequence f40436C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public ColorStateList f40437D = null;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public PorterDuff.Mode f40438E = null;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Menu f40440a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f40441b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f40442c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f40443d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f40444e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f40445f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f40446g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f40447h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f40448i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f40449j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public CharSequence f40450k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public CharSequence f40451l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f40452m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public char f40453n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f40454o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public char f40455p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f40456q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f40457r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public boolean f40458s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public boolean f40459t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public boolean f40460u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f40461v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f40462w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public String f40463x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public String f40464y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public String f40465z;

        public b(Menu menu) {
            this.f40440a = menu;
            h();
        }

        public void a() {
            this.f40447h = true;
            i(this.f40440a.add(this.f40441b, this.f40448i, this.f40449j, this.f40450k));
        }

        public SubMenu b() {
            this.f40447h = true;
            SubMenu subMenuAddSubMenu = this.f40440a.addSubMenu(this.f40441b, this.f40448i, this.f40449j, this.f40450k);
            i(subMenuAddSubMenu.getItem());
            return subMenuAddSubMenu;
        }

        public final char c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        public boolean d() {
            return this.f40447h;
        }

        public final Object e(String str, Class[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, C5062g.this.f40429c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e10) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e10);
                return null;
            }
        }

        public void f(AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = C5062g.this.f40429c.obtainStyledAttributes(attributeSet, j.f36118o1);
            this.f40441b = typedArrayObtainStyledAttributes.getResourceId(j.f36128q1, 0);
            this.f40442c = typedArrayObtainStyledAttributes.getInt(j.f36138s1, 0);
            this.f40443d = typedArrayObtainStyledAttributes.getInt(j.f36143t1, 0);
            this.f40444e = typedArrayObtainStyledAttributes.getInt(j.f36148u1, 0);
            this.f40445f = typedArrayObtainStyledAttributes.getBoolean(j.f36133r1, true);
            this.f40446g = typedArrayObtainStyledAttributes.getBoolean(j.f36123p1, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        public void g(AttributeSet attributeSet) {
            W wU = W.u(C5062g.this.f40429c, attributeSet, j.f36153v1);
            this.f40448i = wU.n(j.f36168y1, 0);
            this.f40449j = (wU.k(j.f35948B1, this.f40442c) & (-65536)) | (wU.k(j.f35952C1, this.f40443d) & 65535);
            this.f40450k = wU.p(j.f35956D1);
            this.f40451l = wU.p(j.f35960E1);
            this.f40452m = wU.n(j.f36158w1, 0);
            this.f40453n = c(wU.o(j.f35964F1));
            this.f40454o = wU.k(j.f35992M1, RecognitionOptions.AZTEC);
            this.f40455p = c(wU.o(j.f35968G1));
            this.f40456q = wU.k(j.f36008Q1, RecognitionOptions.AZTEC);
            if (wU.s(j.f35972H1)) {
                this.f40457r = wU.a(j.f35972H1, false) ? 1 : 0;
            } else {
                this.f40457r = this.f40444e;
            }
            this.f40458s = wU.a(j.f36173z1, false);
            this.f40459t = wU.a(j.f35943A1, this.f40445f);
            this.f40460u = wU.a(j.f36163x1, this.f40446g);
            this.f40461v = wU.k(j.f36012R1, -1);
            this.f40465z = wU.o(j.f35976I1);
            this.f40462w = wU.n(j.f35980J1, 0);
            this.f40463x = wU.o(j.f35988L1);
            String strO = wU.o(j.f35984K1);
            this.f40464y = strO;
            boolean z10 = strO != null;
            if (z10 && this.f40462w == 0 && this.f40463x == null) {
                this.f40434A = (AbstractC2548b) e(strO, C5062g.f40426f, C5062g.this.f40428b);
            } else {
                if (z10) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f40434A = null;
            }
            this.f40435B = wU.p(j.f35996N1);
            this.f40436C = wU.p(j.f36016S1);
            if (wU.s(j.f36004P1)) {
                this.f40438E = AbstractC5329H.d(wU.k(j.f36004P1, -1), this.f40438E);
            } else {
                this.f40438E = null;
            }
            if (wU.s(j.f36000O1)) {
                this.f40437D = wU.c(j.f36000O1);
            } else {
                this.f40437D = null;
            }
            wU.x();
            this.f40447h = false;
        }

        public void h() {
            this.f40441b = 0;
            this.f40442c = 0;
            this.f40443d = 0;
            this.f40444e = 0;
            this.f40445f = true;
            this.f40446g = true;
        }

        public final void i(MenuItem menuItem) {
            boolean z10 = false;
            menuItem.setChecked(this.f40458s).setVisible(this.f40459t).setEnabled(this.f40460u).setCheckable(this.f40457r >= 1).setTitleCondensed(this.f40451l).setIcon(this.f40452m);
            int i10 = this.f40461v;
            if (i10 >= 0) {
                menuItem.setShowAsAction(i10);
            }
            if (this.f40465z != null) {
                if (C5062g.this.f40429c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new a(C5062g.this.b(), this.f40465z));
            }
            if (this.f40457r >= 2) {
                if (menuItem instanceof androidx.appcompat.view.menu.g) {
                    ((androidx.appcompat.view.menu.g) menuItem).t(true);
                } else if (menuItem instanceof MenuItemC5180c) {
                    ((MenuItemC5180c) menuItem).h(true);
                }
            }
            String str = this.f40463x;
            if (str != null) {
                menuItem.setActionView((View) e(str, C5062g.f40425e, C5062g.this.f40427a));
                z10 = true;
            }
            int i11 = this.f40462w;
            if (i11 > 0) {
                if (z10) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i11);
                }
            }
            AbstractC2548b abstractC2548b = this.f40434A;
            if (abstractC2548b != null) {
                AbstractC2562p.a(menuItem, abstractC2548b);
            }
            AbstractC2562p.c(menuItem, this.f40435B);
            AbstractC2562p.g(menuItem, this.f40436C);
            AbstractC2562p.b(menuItem, this.f40453n, this.f40454o);
            AbstractC2562p.f(menuItem, this.f40455p, this.f40456q);
            PorterDuff.Mode mode = this.f40438E;
            if (mode != null) {
                AbstractC2562p.e(menuItem, mode);
            }
            ColorStateList colorStateList = this.f40437D;
            if (colorStateList != null) {
                AbstractC2562p.d(menuItem, colorStateList);
            }
        }
    }

    static {
        Class[] clsArr = {Context.class};
        f40425e = clsArr;
        f40426f = clsArr;
    }

    public C5062g(Context context) {
        super(context);
        this.f40429c = context;
        Object[] objArr = {context};
        this.f40427a = objArr;
        this.f40428b = objArr;
    }

    public final Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public Object b() {
        if (this.f40430d == null) {
            this.f40430d = a(this.f40429c);
        }
        return this.f40430d;
    }

    public final void c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got " + name);
                }
                eventType = xmlPullParser.next();
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z10 = false;
        boolean z11 = false;
        String str = null;
        while (!z10) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != 2) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z11 && name2.equals(str)) {
                        z11 = false;
                        str = null;
                    } else if (name2.equals("group")) {
                        bVar.h();
                    } else if (name2.equals("item")) {
                        if (!bVar.d()) {
                            AbstractC2548b abstractC2548b = bVar.f40434A;
                            if (abstractC2548b == null || !abstractC2548b.a()) {
                                bVar.a();
                            } else {
                                bVar.b();
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z10 = true;
                    }
                }
            } else if (!z11) {
                String name3 = xmlPullParser.getName();
                if (name3.equals("group")) {
                    bVar.f(attributeSet);
                } else if (name3.equals("item")) {
                    bVar.g(attributeSet);
                } else if (name3.equals("menu")) {
                    c(xmlPullParser, attributeSet, bVar.b());
                } else {
                    str = name3;
                    z11 = true;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    @Override // android.view.MenuInflater
    public void inflate(int i10, Menu menu) {
        if (!(menu instanceof Q0.a)) {
            super.inflate(i10, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z10 = false;
        try {
            try {
                layout = this.f40429c.getResources().getLayout(i10);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof androidx.appcompat.view.menu.e) {
                    androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) menu;
                    if (eVar.F()) {
                        eVar.e0();
                        z10 = true;
                    }
                }
                c(layout, attributeSetAsAttributeSet, menu);
                if (z10) {
                    ((androidx.appcompat.view.menu.e) menu).d0();
                }
                if (layout != null) {
                    layout.close();
                }
            } catch (IOException e10) {
                throw new InflateException("Error inflating menu XML", e10);
            } catch (XmlPullParserException e11) {
                throw new InflateException("Error inflating menu XML", e11);
            }
        } catch (Throwable th) {
            if (z10) {
                ((androidx.appcompat.view.menu.e) menu).d0();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
