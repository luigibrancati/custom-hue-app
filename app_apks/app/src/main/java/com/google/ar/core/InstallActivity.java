package com.google.ar.core;

import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.ar.core.ArCoreApk;
import com.google.ar.core.annotations.UsedByReflection;
import com.google.ar.core.exceptions.FatalException;
import com.google.ar.core.exceptions.UnavailableDeviceNotCompatibleException;
import com.google.ar.core.exceptions.UnavailableUserDeclinedInstallationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@TargetApi(24)
@UsedByReflection("AndroidManifest.xml")
public class InstallActivity extends Activity {
    private static final int BOX_SIZE_DP = 280;
    private static final int INSTALLING_TEXT_BOTTOM_MARGIN_DP = 30;
    static final String INSTALL_BEHAVIOR_KEY = "behavior";
    static final String MESSAGE_TYPE_KEY = "message";
    private static final String TAG = "ARCore-InstallActivity";
    private boolean finished;
    private ArCoreApk.InstallBehavior installBehavior;
    private boolean installStarted;
    private ArCoreApk.UserMessageType messageType;
    private boolean waitingForCompletion;
    private final ContextThemeWrapper themeWrapper = new ContextThemeWrapper(this, android.R.style.Theme.Material.Light.Dialog.Alert);
    private w lastEvent = w.CANCELLED;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: animateToSpinner, reason: merged with bridge method [inline-methods] */
    public void b() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        float f10 = displayMetrics.density * 280.0f;
        int width = getWindow().getDecorView().getWidth();
        int height = getWindow().getDecorView().getHeight();
        setContentView(new RelativeLayout(this));
        int i10 = (int) f10;
        getWindow().getDecorView().setMinimumWidth(i10);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.addUpdateListener(new t(this, width, i10, height));
        valueAnimatorOfFloat.addListener(new u(this));
        valueAnimatorOfFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: closeInstaller, reason: merged with bridge method [inline-methods] */
    public void e() {
        startActivity(new Intent(this, (Class<?>) InstallActivity.class).setFlags(67108864));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: finishWithFailure, reason: merged with bridge method [inline-methods] */
    public void c(Exception exc) {
        k.a().f31195a = exc;
        k.a().c();
        this.finished = true;
        super.finish();
    }

    private boolean isOptional() {
        return this.installBehavior == ArCoreApk.InstallBehavior.OPTIONAL;
    }

    private void showEducationDialog() {
        setContentView(R.layout.__arcore_education);
        findViewById(R.id.__arcore_cancelButton).setOnClickListener(new s(this, 1, null));
        if (!isOptional()) {
            findViewById(R.id.__arcore_cancelButton).setVisibility(8);
        }
        findViewById(R.id.__arcore_continueButton).setOnClickListener(new s(this, 0));
        TextView textView = (TextView) findViewById(R.id.__arcore_messageText);
        ArCoreApk.UserMessageType userMessageType = ArCoreApk.UserMessageType.APPLICATION;
        ArCoreApk.Availability availability = ArCoreApk.Availability.UNKNOWN_ERROR;
        if (this.messageType.ordinal() != 1) {
            textView.setText(R.string.__arcore_install_app);
        } else {
            textView.setText(R.string.__arcore_install_feature);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1095)
    	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1049)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:130)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
     */
    /* JADX INFO: renamed from: showSpinner, reason: merged with bridge method [inline-methods] */
    public void a() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i10 = (int) (displayMetrics.density * 280.0f);
        getWindow().setLayout(i10, i10);
        RelativeLayout relativeLayout = new RelativeLayout(this.themeWrapper);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        ProgressBar progressBar = new ProgressBar(this.themeWrapper);
        progressBar.setIndeterminate(true);
        progressBar.setLayoutParams(layoutParams);
        relativeLayout.addView(progressBar);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(14);
        layoutParams2.addRule(12);
        layoutParams2.bottomMargin = (int) (displayMetrics.density * 30.0f);
        TextView textView = new TextView(this.themeWrapper);
        textView.setText(R.string.__arcore_installing);
        textView.setLayoutParams(layoutParams2);
        relativeLayout.addView(textView);
        setContentView(relativeLayout);
        getWindow().setLayout(i10, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: startInstaller, reason: merged with bridge method [inline-methods] */
    public void d() {
        this.installStarted = true;
        this.lastEvent = w.CANCELLED;
        k.a().b(this).h(this, new v(this));
    }

    public final /* synthetic */ void f(w wVar) {
        this.lastEvent = wVar;
    }

    @Override // android.app.Activity
    public void finish() {
        c(new UnavailableUserDeclinedInstallationException());
    }

    public final /* synthetic */ boolean g() {
        return this.waitingForCompletion;
    }

    @Override // android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 16);
        sb2.append("activityResult: ");
        sb2.append(i11);
        Log.i(TAG, sb2.toString());
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            if (bundle != null) {
                c(new FatalException("Install activity was suspended and recreated."));
                return;
            }
            this.messageType = (ArCoreApk.UserMessageType) getIntent().getSerializableExtra("message");
            ArCoreApk.InstallBehavior installBehavior = (ArCoreApk.InstallBehavior) getIntent().getSerializableExtra(INSTALL_BEHAVIOR_KEY);
            this.installBehavior = installBehavior;
            if (this.messageType == null || installBehavior == null) {
                Log.e(TAG, "missing intent data.");
                c(new FatalException("Install activity launched without config data."));
                return;
            }
            setTheme(android.R.style.Theme.Material.Light.Dialog.Alert);
            getWindow().requestFeature(1);
            setFinishOnTouchOutside(isOptional());
            if (this.messageType == ArCoreApk.UserMessageType.USER_ALREADY_INFORMED) {
                a();
                return;
            }
            AtomicReference atomicReference = new AtomicReference(ArCoreApk.Availability.UNKNOWN_CHECKING);
            k.a().b(this).c(this, new C3653r(this, atomicReference));
            int iOrdinal = ((ArCoreApk.Availability) atomicReference.get()).ordinal();
            if (iOrdinal == 0) {
                Log.w(TAG, "Preliminary compatibility check failed.");
            } else if (iOrdinal == 3) {
                c(new UnavailableDeviceNotCompatibleException());
                return;
            }
            showEducationDialog();
        } catch (RuntimeException e10) {
            c(new FatalException("Exception starting install flow", e10));
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        if (!this.finished) {
            k.a().c();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        if (!this.installStarted) {
            if (this.messageType == ArCoreApk.UserMessageType.USER_ALREADY_INFORMED) {
                d();
            }
        } else {
            if (this.finished) {
                return;
            }
            synchronized (this) {
                try {
                    w wVar = this.lastEvent;
                    if (wVar == w.CANCELLED) {
                        finish();
                    } else if (wVar == w.ACCEPTED) {
                        this.waitingForCompletion = true;
                    } else {
                        c(k.a().f31195a);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("didResume", true);
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
    }
}
