package com.signify.geofence;

import Od.F;
import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.signify.geofence.TestActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import za.r;
import za.s;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u0003J\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/signify/geofence/TestActivity;", "Landroid/app/Activity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lfc/H;", "onCreate", "(Landroid/os/Bundle;)V", "k", "j", "i", "h", "r", "u", "", "transitionType", "t", "(I)V", "s", "Landroid/content/Intent;", "g", "(I)Landroid/content/Intent;", "a", "geofence_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TestActivity extends Activity {
    public static final void l(TestActivity testActivity, View view) {
        testActivity.j();
    }

    public static final void m(TestActivity testActivity, View view) {
        testActivity.k();
    }

    public static final void n(TestActivity testActivity, View view) {
        testActivity.h();
    }

    public static final void o(TestActivity testActivity, View view) {
        testActivity.i();
    }

    public static final void p(TestActivity testActivity, View view) {
        testActivity.r();
    }

    public static final void q(TestActivity testActivity, View view) {
        testActivity.u();
    }

    public final Intent g(int transitionType) {
        EditText editText = (EditText) findViewById(r.f48866a);
        Editable text = editText.getText();
        AbstractC4862t.d(text, "getText(...)");
        String string = (F.k0(text) ? editText.getHint() : editText.getText()).toString();
        Intent intent = new Intent(this, (Class<?>) GeofenceTransitionsIntentService.class);
        intent.putExtra("fake", true);
        intent.putExtra("regionId", string);
        intent.putExtra("transitionType", transitionType);
        return intent;
    }

    public final void h() {
        t(1);
    }

    public final void i() {
        t(2);
    }

    public final void j() {
        s(1);
    }

    public final void k() {
        s(2);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(s.f48873a);
        ((Button) findViewById(r.f48869d)).setOnClickListener(new View.OnClickListener() { // from class: za.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TestActivity.l(this.f48878a, view);
            }
        });
        ((Button) findViewById(r.f48870e)).setOnClickListener(new View.OnClickListener() { // from class: za.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TestActivity.m(this.f48879a, view);
            }
        });
        ((Button) findViewById(r.f48867b)).setOnClickListener(new View.OnClickListener() { // from class: za.w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TestActivity.n(this.f48880a, view);
            }
        });
        ((Button) findViewById(r.f48868c)).setOnClickListener(new View.OnClickListener() { // from class: za.x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TestActivity.o(this.f48881a, view);
            }
        });
        ((Button) findViewById(r.f48872g)).setOnClickListener(new View.OnClickListener() { // from class: za.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TestActivity.p(this.f48882a, view);
            }
        });
        ((Button) findViewById(r.f48871f)).setOnClickListener(new View.OnClickListener() { // from class: za.z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TestActivity.q(this.f48883a, view);
            }
        });
        EditText editText = (EditText) findViewById(r.f48866a);
        if (editText != null) {
            SharedPreferences sharedPreferences = getSharedPreferences("com.signify.geofence.GEOFENCE_TEST_SHARED_PREFERENCES_KEY", 0);
            String string = sharedPreferences.getString("BRIDGE_ID_KEY", "");
            editText.setText(string);
            if ((string == null || string.length() == 0) && getIntent().hasExtra("active_bridge_id")) {
                editText.setText(getIntent().getStringExtra("active_bridge_id"));
            }
            editText.addTextChangedListener(new b(sharedPreferences));
        }
    }

    public final void r() {
        s(1);
        s(2);
        s(1);
    }

    public final void s(int transitionType) {
        startService(g(transitionType));
    }

    public final void t(int transitionType) {
        Object systemService = getSystemService("alarm");
        AbstractC4862t.c(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
        PendingIntent service = PendingIntent.getService(this, transitionType, g(transitionType), 67108864);
        AbstractC4862t.d(service, "let(...)");
        ((AlarmManager) systemService).set(2, SystemClock.elapsedRealtime() + ((long) 15000), service);
    }

    public final void u() {
        Intent intent = new Intent(this, (Class<?>) GeofenceTransitionsIntentService.class);
        intent.putExtra("fake", true);
        intent.putExtra("error", "Test error.");
        startService(intent);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements TextWatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ SharedPreferences f32458a;

        public b(SharedPreferences sharedPreferences) {
            this.f32458a = sharedPreferences;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (editable != null) {
                this.f32458a.edit().putString("BRIDGE_ID_KEY", editable.toString()).apply();
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }
}
