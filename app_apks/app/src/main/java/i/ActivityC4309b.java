package i;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.y;
import androidx.fragment.app.ActivityC2740v;
import e.InterfaceC3920b;
import i3.C4345f;
import n.AbstractC5057b;
import p.b0;

/* JADX INFO: renamed from: i.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class ActivityC4309b extends ActivityC2740v implements InterfaceC4310c, y.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AbstractC4312e f36621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Resources f36622b;

    /* JADX INFO: renamed from: i.b$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements C4345f.b {
        public a() {
        }

        @Override // i3.C4345f.b
        public Bundle a() {
            Bundle bundle = new Bundle();
            ActivityC4309b.this.P().A(bundle);
            return bundle;
        }
    }

    /* JADX INFO: renamed from: i.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class C0478b implements InterfaceC3920b {
        public C0478b() {
        }

        @Override // e.InterfaceC3920b
        public void a(Context context) {
            AbstractC4312e abstractC4312eP = ActivityC4309b.this.P();
            abstractC4312eP.s();
            abstractC4312eP.w(ActivityC4309b.this.getSavedStateRegistry().a("androidx:appcompat"));
        }
    }

    public ActivityC4309b() {
        R();
    }

    public AbstractC4312e P() {
        if (this.f36621a == null) {
            this.f36621a = AbstractC4312e.h(this, this);
        }
        return this.f36621a;
    }

    public AbstractC4308a Q() {
        return P().r();
    }

    public final void R() {
        getSavedStateRegistry().c("androidx:appcompat", new a());
        addOnContextAvailableListener(new C0478b());
    }

    public void S(y yVar) {
        yVar.d(this);
    }

    public boolean X() {
        Intent intentA = a();
        if (intentA == null) {
            return false;
        }
        if (!a0(intentA)) {
            Z(intentA);
            return true;
        }
        y yVarF = y.f(this);
        S(yVarF);
        V(yVarF);
        yVarF.h();
        try {
            androidx.core.app.a.r(this);
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    public final boolean Y(KeyEvent keyEvent) {
        return false;
    }

    public void Z(Intent intent) {
        androidx.core.app.i.e(this, intent);
    }

    @Override // androidx.core.app.y.a
    public Intent a() {
        return androidx.core.app.i.a(this);
    }

    public boolean a0(Intent intent) {
        return androidx.core.app.i.f(this, intent);
    }

    @Override // d.p, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        P().e(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(P().g(context));
    }

    @Override // i.InterfaceC4310c
    public AbstractC5057b b(AbstractC5057b.a aVar) {
        return null;
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        AbstractC4308a abstractC4308aQ = Q();
        if (getWindow().hasFeature(0)) {
            if (abstractC4308aQ == null || !abstractC4308aQ.f()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // androidx.core.app.g, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        AbstractC4308a abstractC4308aQ = Q();
        if (keyCode == 82 && abstractC4308aQ != null && abstractC4308aQ.o(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public View findViewById(int i10) {
        return P().j(i10);
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return P().p();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.f36622b == null && b0.c()) {
            this.f36622b = new b0(this, super.getResources());
        }
        Resources resources = this.f36622b;
        return resources == null ? super.getResources() : resources;
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        P().t();
    }

    @Override // d.p, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        P().v(configuration);
        if (this.f36622b != null) {
            this.f36622b.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        W();
    }

    @Override // androidx.fragment.app.ActivityC2740v, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        P().x();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (Y(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // androidx.fragment.app.ActivityC2740v, d.p, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        AbstractC4308a abstractC4308aQ = Q();
        if (menuItem.getItemId() != 16908332 || abstractC4308aQ == null || (abstractC4308aQ.i() & 4) == 0) {
            return false;
        }
        return X();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i10, Menu menu) {
        return super.onMenuOpened(i10, menu);
    }

    @Override // d.p, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        P().y(bundle);
    }

    @Override // androidx.fragment.app.ActivityC2740v, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        P().z();
    }

    @Override // androidx.fragment.app.ActivityC2740v, android.app.Activity
    public void onStart() {
        super.onStart();
        P().B();
    }

    @Override // androidx.fragment.app.ActivityC2740v, android.app.Activity
    public void onStop() {
        super.onStop();
        P().C();
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i10) {
        super.onTitleChanged(charSequence, i10);
        P().L(charSequence);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        AbstractC4308a abstractC4308aQ = Q();
        if (getWindow().hasFeature(0)) {
            if (abstractC4308aQ == null || !abstractC4308aQ.p()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // d.p, android.app.Activity
    public void setContentView(int i10) {
        initializeViewTreeOwners();
        P().G(i10);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        super.setTheme(i10);
        P().K(i10);
    }

    @Override // androidx.fragment.app.ActivityC2740v
    public void supportInvalidateOptionsMenu() {
        P().t();
    }

    @Override // d.p, android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        P().H(view);
    }

    @Override // d.p, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        P().I(view, layoutParams);
    }

    public void W() {
    }

    public void T(U0.h hVar) {
    }

    public void U(int i10) {
    }

    public void V(y yVar) {
    }

    @Override // i.InterfaceC4310c
    public void c(AbstractC5057b abstractC5057b) {
    }

    @Override // i.InterfaceC4310c
    public void d(AbstractC5057b abstractC5057b) {
    }
}
