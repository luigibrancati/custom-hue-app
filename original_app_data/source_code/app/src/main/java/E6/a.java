package E6;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.GoogleApiAvailability;
import java.util.LinkedList;
import v6.AbstractC6065u;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f3322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Bundle f3323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LinkedList f3324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f3325d = new d(this);

    public static void j(FrameLayout frameLayout) {
        GoogleApiAvailability googleApiAvailabilityM = GoogleApiAvailability.m();
        Context context = frameLayout.getContext();
        int iG = googleApiAvailabilityM.g(context);
        String strC = AbstractC6065u.c(context, iG);
        String strE = AbstractC6065u.e(context, iG);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        TextView textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(strC);
        linearLayout.addView(textView);
        Intent intentB = googleApiAvailabilityM.b(context, iG, null);
        if (intentB != null) {
            Button button = new Button(context);
            button.setId(R.id.button1);
            button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button.setText(strE);
            linearLayout.addView(button);
            button.setOnClickListener(new f(context, intentB));
        }
    }

    public abstract void a(c cVar);

    public b b() {
        return this.f3322a;
    }

    public void c(Bundle bundle) {
        p(bundle, new e(this, bundle));
    }

    public void d() {
        b bVar = this.f3322a;
        if (bVar != null) {
            bVar.A();
        } else {
            o(1);
        }
    }

    public void e() {
        b bVar = this.f3322a;
        if (bVar != null) {
            bVar.S();
        } else {
            o(5);
        }
    }

    public void f() {
        p(null, new h(this));
    }

    public void g(Bundle bundle) {
        b bVar = this.f3322a;
        if (bVar != null) {
            bVar.onSaveInstanceState(bundle);
            return;
        }
        Bundle bundle2 = this.f3323b;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
    }

    public void h() {
        p(null, new g(this));
    }

    public void i() {
        b bVar = this.f3322a;
        if (bVar != null) {
            bVar.Y();
        } else {
            o(4);
        }
    }

    public final /* synthetic */ b k() {
        return this.f3322a;
    }

    public final /* synthetic */ void l(b bVar) {
        this.f3322a = bVar;
    }

    public final /* synthetic */ void m(Bundle bundle) {
        this.f3323b = null;
    }

    public final /* synthetic */ LinkedList n() {
        return this.f3324c;
    }

    public final void o(int i10) {
        while (!this.f3324c.isEmpty() && ((i) this.f3324c.getLast()).a() >= i10) {
            this.f3324c.removeLast();
        }
    }

    public final void p(Bundle bundle, i iVar) {
        b bVar = this.f3322a;
        if (bVar != null) {
            iVar.b(bVar);
            return;
        }
        if (this.f3324c == null) {
            this.f3324c = new LinkedList();
        }
        this.f3324c.add(iVar);
        if (bundle != null) {
            Bundle bundle2 = this.f3323b;
            if (bundle2 == null) {
                this.f3323b = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        a(this.f3325d);
    }
}
