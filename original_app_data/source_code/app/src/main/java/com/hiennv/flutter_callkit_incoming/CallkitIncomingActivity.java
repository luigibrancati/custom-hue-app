package com.hiennv.flutter_callkit_incoming;

import Od.C;
import android.app.Activity;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.hiennv.flutter_callkit_incoming.Utils;
import com.hiennv.flutter_callkit_incoming.widgets.RippleRelativeLayout;
import de.hdodenhof.circleimageview.CircleImageView;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.S;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 A2\u00020\u0001:\u0002ABB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u001f\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0016\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0003J\u000f\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u0003J\u000f\u0010\u001a\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u0003J\u000f\u0010\u001b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001b\u0010\u0003J\u000f\u0010\u001c\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u0003J\u000f\u0010\u001d\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001d\u0010\u0003J\u000f\u0010\u001e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001e\u0010\u0003J\u0019\u0010 \u001a\u00020\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u0014H\u0014¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\"\u0010\u0003J!\u0010&\u001a\u00020\f2\u0006\u0010#\u001a\u00020\n2\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0006H\u0016¢\u0006\u0004\b(\u0010\u0003R\u001a\u0010*\u001a\u00060)R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010-\u001a\u00020,8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00100\u001a\u00020/8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00103\u001a\u0002028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b5\u00104R\u0016\u00106\u001a\u00020,8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b6\u0010.R\u0016\u00108\u001a\u0002078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010;\u001a\u00020:8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010=\u001a\u00020,8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b=\u0010.R\u0016\u0010>\u001a\u0002028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b>\u00104R\u0016\u0010?\u001a\u00020,8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b?\u0010.R\u0016\u0010@\u001a\u0002028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b@\u00104¨\u0006C"}, d2 = {"Lcom/hiennv/flutter_callkit_incoming/CallkitIncomingActivity;", "Landroid/app/Activity;", "<init>", "()V", "", "duration", "Lfc/H;", "wakeLockRequest", "(J)V", "transparentStatusAndNavigation", "", "bits", "", "on", "setWindowFlag", "(IZ)V", "Landroid/content/Intent;", "intent", "incomingData", "(Landroid/content/Intent;)V", "Landroid/os/Bundle;", "data", "finishTimeout", "(Landroid/os/Bundle;J)V", "initView", "animateAcceptCall", "onAcceptClick", "dismissKeyguard", "onDeclineClick", "finishDelayed", "finishTask", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onDestroy", "keyCode", "Landroid/view/KeyEvent;", "event", "onKeyDown", "(ILandroid/view/KeyEvent;)Z", "onBackPressed", "Lcom/hiennv/flutter_callkit_incoming/CallkitIncomingActivity$EndedCallkitIncomingBroadcastReceiver;", "endedCallkitIncomingBroadcastReceiver", "Lcom/hiennv/flutter_callkit_incoming/CallkitIncomingActivity$EndedCallkitIncomingBroadcastReceiver;", "Landroid/widget/ImageView;", "ivBackground", "Landroid/widget/ImageView;", "Lcom/hiennv/flutter_callkit_incoming/widgets/RippleRelativeLayout;", "llBackgroundAnimation", "Lcom/hiennv/flutter_callkit_incoming/widgets/RippleRelativeLayout;", "Landroid/widget/TextView;", "tvNameCaller", "Landroid/widget/TextView;", "tvNumber", "ivLogo", "Lde/hdodenhof/circleimageview/CircleImageView;", "ivAvatar", "Lde/hdodenhof/circleimageview/CircleImageView;", "Landroid/widget/LinearLayout;", "llAction", "Landroid/widget/LinearLayout;", "ivAcceptCall", "tvAccept", "ivDeclineCall", "tvDecline", "Companion", "EndedCallkitIncomingBroadcastReceiver", "flutter_callkit_incoming_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CallkitIncomingActivity extends Activity {
    private static final String ACTION_ENDED_CALL_INCOMING = "com.hiennv.flutter_callkit_incoming.ACTION_ENDED_CALL_INCOMING";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private EndedCallkitIncomingBroadcastReceiver endedCallkitIncomingBroadcastReceiver = new EndedCallkitIncomingBroadcastReceiver();
    private ImageView ivAcceptCall;
    private CircleImageView ivAvatar;
    private ImageView ivBackground;
    private ImageView ivDeclineCall;
    private ImageView ivLogo;
    private LinearLayout llAction;
    private RippleRelativeLayout llBackgroundAnimation;
    private TextView tvAccept;
    private TextView tvDecline;
    private TextView tvNameCaller;
    private TextView tvNumber;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/hiennv/flutter_callkit_incoming/CallkitIncomingActivity$Companion;", "", "<init>", "()V", "ACTION_ENDED_CALL_INCOMING", "", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "data", "Landroid/os/Bundle;", "getIntentEnded", "isAccepted", "", "flutter_callkit_incoming_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4854k abstractC4854k) {
            this();
        }

        public final Intent getIntent(Context context, Bundle data) {
            AbstractC4862t.e(context, "context");
            AbstractC4862t.e(data, "data");
            Intent intent = new Intent(CallkitConstants.ACTION_CALL_INCOMING);
            intent.setAction(context.getPackageName() + ".com.hiennv.flutter_callkit_incoming.ACTION_CALL_INCOMING");
            intent.putExtra(CallkitConstants.EXTRA_CALLKIT_INCOMING_DATA, data);
            intent.setFlags(268435456);
            return intent;
        }

        public final Intent getIntentEnded(Context context, boolean isAccepted) {
            AbstractC4862t.e(context, "context");
            Intent intent = new Intent(context.getPackageName() + ".com.hiennv.flutter_callkit_incoming.ACTION_ENDED_CALL_INCOMING");
            intent.putExtra("ACCEPTED", isAccepted);
            return intent;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/hiennv/flutter_callkit_incoming/CallkitIncomingActivity$EndedCallkitIncomingBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "(Lcom/hiennv/flutter_callkit_incoming/CallkitIncomingActivity;)V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Lfc/H;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "flutter_callkit_incoming_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class EndedCallkitIncomingBroadcastReceiver extends BroadcastReceiver {
        public EndedCallkitIncomingBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            AbstractC4862t.e(context, "context");
            AbstractC4862t.e(intent, "intent");
            if (CallkitIncomingActivity.this.isFinishing()) {
                return;
            }
            if (intent.getBooleanExtra("ACCEPTED", false)) {
                CallkitIncomingActivity.this.finishDelayed();
            } else {
                CallkitIncomingActivity.this.finishTask();
            }
        }
    }

    private final void animateAcceptCall() {
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(this, R.anim.shake_anim);
        ImageView imageView = this.ivAcceptCall;
        if (imageView == null) {
            AbstractC4862t.p("ivAcceptCall");
            imageView = null;
        }
        imageView.setAnimation(animationLoadAnimation);
    }

    private final void dismissKeyguard() {
        Object systemService = getSystemService("keyguard");
        AbstractC4862t.c(systemService, "null cannot be cast to non-null type android.app.KeyguardManager");
        ((KeyguardManager) systemService).requestDismissKeyguard(this, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishDelayed() {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.hiennv.flutter_callkit_incoming.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f32373a.finishTask();
            }
        }, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishTask() {
        finishAndRemoveTask();
    }

    private final void finishTimeout(Bundle data, long duration) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.hiennv.flutter_callkit_incoming.b
            @Override // java.lang.Runnable
            public final void run() {
                CallkitIncomingActivity.finishTimeout$lambda$0(this.f32374a);
            }
        }, duration - Math.abs(jCurrentTimeMillis - (data != null ? data.getLong(CallkitNotificationManager.EXTRA_TIME_START_CALL, jCurrentTimeMillis) : jCurrentTimeMillis)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void finishTimeout$lambda$0(CallkitIncomingActivity callkitIncomingActivity) {
        if (callkitIncomingActivity.isFinishing()) {
            return;
        }
        callkitIncomingActivity.finishTask();
    }

    private final void incomingData(Intent intent) {
        String str;
        String str2;
        String str3;
        String str4;
        boolean z10;
        int i10;
        CircleImageView circleImageView;
        ImageView imageView;
        Bundle extras = intent.getExtras();
        Bundle bundle = extras != null ? extras.getBundle(CallkitConstants.EXTRA_CALLKIT_INCOMING_DATA) : null;
        if (bundle == null) {
            finish();
        }
        Boolean boolValueOf = bundle != null ? Boolean.valueOf(bundle.getBoolean(CallkitConstants.EXTRA_CALLKIT_IS_SHOW_FULL_LOCKED_SCREEN, true)) : null;
        Boolean bool = Boolean.TRUE;
        if (AbstractC4862t.a(boolValueOf, bool)) {
            setShowWhenLocked(true);
        }
        String string = bundle != null ? bundle.getString(CallkitConstants.EXTRA_CALLKIT_TEXT_COLOR, "#ffffff") : null;
        Boolean boolValueOf2 = bundle != null ? Boolean.valueOf(bundle.getBoolean(CallkitConstants.EXTRA_CALLKIT_IS_SHOW_CALL_ID, false)) : null;
        TextView textView = this.tvNameCaller;
        if (textView == null) {
            AbstractC4862t.p("tvNameCaller");
            textView = null;
        }
        textView.setText(bundle != null ? bundle.getString(CallkitConstants.EXTRA_CALLKIT_NAME_CALLER, "") : null);
        TextView textView2 = this.tvNumber;
        if (textView2 == null) {
            AbstractC4862t.p("tvNumber");
            textView2 = null;
        }
        textView2.setText(bundle != null ? bundle.getString(CallkitConstants.EXTRA_CALLKIT_HANDLE, "") : null);
        TextView textView3 = this.tvNumber;
        if (textView3 == null) {
            AbstractC4862t.p("tvNumber");
            textView3 = null;
        }
        textView3.setVisibility(AbstractC4862t.a(boolValueOf2, bool) ? 0 : 4);
        try {
            TextView textView4 = this.tvNameCaller;
            if (textView4 == null) {
                AbstractC4862t.p("tvNameCaller");
                textView4 = null;
            }
            textView4.setTextColor(Color.parseColor(string));
            TextView textView5 = this.tvNumber;
            if (textView5 == null) {
                AbstractC4862t.p("tvNumber");
                textView5 = null;
            }
            textView5.setTextColor(Color.parseColor(string));
        } catch (Exception unused) {
        }
        Boolean boolValueOf3 = bundle != null ? Boolean.valueOf(bundle.getBoolean(CallkitConstants.EXTRA_CALLKIT_IS_SHOW_LOGO, false)) : null;
        ImageView imageView2 = this.ivLogo;
        if (imageView2 == null) {
            AbstractC4862t.p("ivLogo");
            imageView2 = null;
        }
        imageView2.setVisibility(AbstractC4862t.a(boolValueOf3, Boolean.TRUE) ? 0 : 4);
        String string2 = bundle != null ? bundle.getString(CallkitConstants.EXTRA_CALLKIT_LOGO_URL, "") : null;
        if (string2 == null || string2.length() == 0) {
            str = "file:///android_asset/flutter_assets/%s";
            str2 = "https://";
            str3 = "http://";
        } else {
            if (!C.N(string2, "http://", true) && !C.N(string2, "https://", true)) {
                S s10 = S.f39781a;
                string2 = String.format("file:///android_asset/flutter_assets/%s", Arrays.copyOf(new Object[]{string2}, 1));
                AbstractC4862t.d(string2, "format(...)");
            }
            Serializable serializable = bundle != null ? bundle.getSerializable(CallkitConstants.EXTRA_CALLKIT_HEADERS) : null;
            AbstractC4862t.c(serializable, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.Any?>");
            HashMap<String, Object> map = (HashMap) serializable;
            String str5 = string2;
            ImageLoaderProvider imageLoaderProvider = ImageLoaderProvider.INSTANCE;
            int i11 = R.drawable.transparent;
            ImageView imageView3 = this.ivLogo;
            if (imageView3 == null) {
                AbstractC4862t.p("ivLogo");
                str3 = "http://";
                imageView = null;
            } else {
                str3 = "http://";
                imageView = imageView3;
            }
            str2 = "https://";
            str = "file:///android_asset/flutter_assets/%s";
            imageLoaderProvider.loadImage(this, str5, map, i11, imageView);
        }
        String string3 = bundle != null ? bundle.getString(CallkitConstants.EXTRA_CALLKIT_AVATAR, "") : null;
        if (string3 == null || string3.length() == 0) {
            str4 = str3;
        } else {
            CircleImageView circleImageView2 = this.ivAvatar;
            if (circleImageView2 == null) {
                AbstractC4862t.p("ivAvatar");
                circleImageView2 = null;
            }
            circleImageView2.setVisibility(0);
            String str6 = str3;
            if (!C.N(string3, str6, true) && !C.N(string3, str2, true)) {
                S s11 = S.f39781a;
                string3 = String.format(str, Arrays.copyOf(new Object[]{string3}, 1));
                AbstractC4862t.d(string3, "format(...)");
            }
            Serializable serializable2 = bundle != null ? bundle.getSerializable(CallkitConstants.EXTRA_CALLKIT_HEADERS) : null;
            AbstractC4862t.c(serializable2, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.Any?>");
            HashMap<String, Object> map2 = (HashMap) serializable2;
            String str7 = string3;
            ImageLoaderProvider imageLoaderProvider2 = ImageLoaderProvider.INSTANCE;
            int i12 = R.drawable.ic_default_avatar;
            CircleImageView circleImageView3 = this.ivAvatar;
            if (circleImageView3 == null) {
                AbstractC4862t.p("ivAvatar");
                circleImageView = null;
            } else {
                circleImageView = circleImageView3;
            }
            str4 = str6;
            imageLoaderProvider2.loadImage(this, str7, map2, i12, circleImageView);
        }
        if (bundle != null) {
            z10 = false;
            i10 = bundle.getInt(CallkitConstants.EXTRA_CALLKIT_TYPE, 0);
        } else {
            z10 = false;
            i10 = 0;
        }
        if (i10 > 0) {
            ImageView imageView4 = this.ivAcceptCall;
            if (imageView4 == null) {
                AbstractC4862t.p("ivAcceptCall");
                imageView4 = null;
            }
            imageView4.setImageResource(R.drawable.ic_video);
        }
        long j10 = bundle != null ? bundle.getLong(CallkitConstants.EXTRA_CALLKIT_DURATION, 0L) : 0L;
        wakeLockRequest(j10);
        finishTimeout(bundle, j10);
        String string4 = bundle != null ? bundle.getString(CallkitConstants.EXTRA_CALLKIT_TEXT_ACCEPT, "") : null;
        TextView textView6 = this.tvAccept;
        if (textView6 == null) {
            AbstractC4862t.p("tvAccept");
            textView6 = null;
        }
        if (TextUtils.isEmpty(string4)) {
            string4 = getString(R.string.text_accept);
        }
        textView6.setText(string4);
        String string5 = bundle != null ? bundle.getString(CallkitConstants.EXTRA_CALLKIT_TEXT_DECLINE, "") : null;
        TextView textView7 = this.tvDecline;
        if (textView7 == null) {
            AbstractC4862t.p("tvDecline");
            textView7 = null;
        }
        if (TextUtils.isEmpty(string5)) {
            string5 = getString(R.string.text_decline);
        }
        textView7.setText(string5);
        try {
            TextView textView8 = this.tvAccept;
            if (textView8 == null) {
                AbstractC4862t.p("tvAccept");
                textView8 = null;
            }
            textView8.setTextColor(Color.parseColor(string));
            TextView textView9 = this.tvDecline;
            if (textView9 == null) {
                AbstractC4862t.p("tvDecline");
                textView9 = null;
            }
            textView9.setTextColor(Color.parseColor(string));
        } catch (Exception unused2) {
        }
        String string6 = bundle != null ? bundle.getString(CallkitConstants.EXTRA_CALLKIT_BACKGROUND_COLOR, "#0955fa") : null;
        try {
            ImageView imageView5 = this.ivBackground;
            if (imageView5 == null) {
                AbstractC4862t.p("ivBackground");
                imageView5 = null;
            }
            imageView5.setBackgroundColor(Color.parseColor(string6));
        } catch (Exception unused3) {
        }
        String string7 = bundle != null ? bundle.getString(CallkitConstants.EXTRA_CALLKIT_BACKGROUND_URL, "") : null;
        if (string7 == null || string7.length() == 0) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        if (!C.N(string7, str4, true) && !C.N(string7, str2, true)) {
            S s12 = S.f39781a;
            string7 = String.format(str, Arrays.copyOf(new Object[]{string7}, 1));
            AbstractC4862t.d(string7, "format(...)");
        }
        String str8 = string7;
        Serializable serializable3 = bundle != null ? bundle.getSerializable(CallkitConstants.EXTRA_CALLKIT_HEADERS) : null;
        AbstractC4862t.c(serializable3, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.Any?>");
        HashMap<String, Object> map3 = (HashMap) serializable3;
        ImageLoaderProvider imageLoaderProvider3 = ImageLoaderProvider.INSTANCE;
        int i13 = R.drawable.transparent;
        ImageView imageView6 = this.ivBackground;
        if (imageView6 == null) {
            AbstractC4862t.p("ivBackground");
            imageView6 = null;
        }
        imageLoaderProvider3.loadImage(this, str8, map3, i13, imageView6);
    }

    private final void initView() {
        View viewFindViewById = findViewById(R.id.ivBackground);
        AbstractC4862t.d(viewFindViewById, "findViewById(...)");
        this.ivBackground = (ImageView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.llBackgroundAnimation);
        AbstractC4862t.d(viewFindViewById2, "findViewById(...)");
        RippleRelativeLayout rippleRelativeLayout = (RippleRelativeLayout) viewFindViewById2;
        this.llBackgroundAnimation = rippleRelativeLayout;
        ImageView imageView = null;
        if (rippleRelativeLayout == null) {
            AbstractC4862t.p("llBackgroundAnimation");
            rippleRelativeLayout = null;
        }
        ViewGroup.LayoutParams layoutParams = rippleRelativeLayout.getLayoutParams();
        Utils.Companion companion = Utils.INSTANCE;
        layoutParams.height = companion.getScreenWidth() + companion.getStatusBarHeight(this);
        RippleRelativeLayout rippleRelativeLayout2 = this.llBackgroundAnimation;
        if (rippleRelativeLayout2 == null) {
            AbstractC4862t.p("llBackgroundAnimation");
            rippleRelativeLayout2 = null;
        }
        rippleRelativeLayout2.startRippleAnimation();
        View viewFindViewById3 = findViewById(R.id.tvNameCaller);
        AbstractC4862t.d(viewFindViewById3, "findViewById(...)");
        this.tvNameCaller = (TextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.tvNumber);
        AbstractC4862t.d(viewFindViewById4, "findViewById(...)");
        this.tvNumber = (TextView) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.ivLogo);
        AbstractC4862t.d(viewFindViewById5, "findViewById(...)");
        this.ivLogo = (ImageView) viewFindViewById5;
        View viewFindViewById6 = findViewById(R.id.ivAvatar);
        AbstractC4862t.d(viewFindViewById6, "findViewById(...)");
        this.ivAvatar = (CircleImageView) viewFindViewById6;
        View viewFindViewById7 = findViewById(R.id.llAction);
        AbstractC4862t.d(viewFindViewById7, "findViewById(...)");
        LinearLayout linearLayout = (LinearLayout) viewFindViewById7;
        this.llAction = linearLayout;
        if (linearLayout == null) {
            AbstractC4862t.p("llAction");
            linearLayout = null;
        }
        ViewGroup.LayoutParams layoutParams2 = linearLayout.getLayoutParams();
        AbstractC4862t.c(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams.setMargins(0, 0, 0, companion.getNavigationBarHeight(this));
        LinearLayout linearLayout2 = this.llAction;
        if (linearLayout2 == null) {
            AbstractC4862t.p("llAction");
            linearLayout2 = null;
        }
        linearLayout2.setLayoutParams(marginLayoutParams);
        View viewFindViewById8 = findViewById(R.id.ivAcceptCall);
        AbstractC4862t.d(viewFindViewById8, "findViewById(...)");
        this.ivAcceptCall = (ImageView) viewFindViewById8;
        View viewFindViewById9 = findViewById(R.id.tvAccept);
        AbstractC4862t.d(viewFindViewById9, "findViewById(...)");
        this.tvAccept = (TextView) viewFindViewById9;
        View viewFindViewById10 = findViewById(R.id.ivDeclineCall);
        AbstractC4862t.d(viewFindViewById10, "findViewById(...)");
        this.ivDeclineCall = (ImageView) viewFindViewById10;
        View viewFindViewById11 = findViewById(R.id.tvDecline);
        AbstractC4862t.d(viewFindViewById11, "findViewById(...)");
        this.tvDecline = (TextView) viewFindViewById11;
        animateAcceptCall();
        ImageView imageView2 = this.ivAcceptCall;
        if (imageView2 == null) {
            AbstractC4862t.p("ivAcceptCall");
            imageView2 = null;
        }
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.hiennv.flutter_callkit_incoming.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f32375a.onAcceptClick();
            }
        });
        ImageView imageView3 = this.ivDeclineCall;
        if (imageView3 == null) {
            AbstractC4862t.p("ivDeclineCall");
        } else {
            imageView = imageView3;
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.hiennv.flutter_callkit_incoming.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f32376a.onDeclineClick();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAcceptClick() {
        Bundle extras = getIntent().getExtras();
        Bundle bundle = extras != null ? extras.getBundle(CallkitConstants.EXTRA_CALLKIT_INCOMING_DATA) : null;
        CallkitNotificationService.INSTANCE.startServiceWithAction(this, CallkitConstants.ACTION_CALL_ACCEPT, bundle);
        startActivity(TransparentActivity.INSTANCE.getIntent(this, CallkitConstants.ACTION_CALL_ACCEPT, bundle));
        dismissKeyguard();
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onDeclineClick() {
        Bundle extras = getIntent().getExtras();
        sendBroadcast(CallkitIncomingBroadcastReceiver.INSTANCE.getIntentDecline(this, extras != null ? extras.getBundle(CallkitConstants.EXTRA_CALLKIT_INCOMING_DATA) : null));
        finishTask();
    }

    private final void setWindowFlag(int bits, boolean on) {
        Window window = getWindow();
        AbstractC4862t.d(window, "getWindow(...)");
        WindowManager.LayoutParams attributes = window.getAttributes();
        AbstractC4862t.d(attributes, "getAttributes(...)");
        if (on) {
            attributes.flags = bits | attributes.flags;
        } else {
            attributes.flags = (~bits) & attributes.flags;
        }
        window.setAttributes(attributes);
    }

    private final void transparentStatusAndNavigation() {
        getWindow().getDecorView().setSystemUiVisibility(1792);
        setWindowFlag(201326592, false);
        getWindow().setStatusBarColor(0);
        getWindow().setNavigationBarColor(0);
    }

    private final void wakeLockRequest(long duration) {
        Object systemService = getApplicationContext().getSystemService("power");
        AbstractC4862t.c(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        ((PowerManager) systemService).newWakeLock(268435482, "Callkit:PowerManager").acquire(duration);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(!Utils.INSTANCE.isTablet(this) ? 1 : -1);
        int i10 = Build.VERSION.SDK_INT;
        getWindow().addFlags(128);
        setTurnScreenOn(true);
        setShowWhenLocked(true);
        transparentStatusAndNavigation();
        setContentView(R.layout.activity_callkit_incoming);
        initView();
        Intent intent = getIntent();
        AbstractC4862t.d(intent, "getIntent(...)");
        incomingData(intent);
        if (i10 >= 33) {
            registerReceiver(this.endedCallkitIncomingBroadcastReceiver, new IntentFilter(getPackageName() + ".com.hiennv.flutter_callkit_incoming.ACTION_ENDED_CALL_INCOMING"), 2);
            return;
        }
        registerReceiver(this.endedCallkitIncomingBroadcastReceiver, new IntentFilter(getPackageName() + ".com.hiennv.flutter_callkit_incoming.ACTION_ENDED_CALL_INCOMING"));
    }

    @Override // android.app.Activity
    public void onDestroy() {
        unregisterReceiver(this.endedCallkitIncomingBroadcastReceiver);
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == 25) {
            FlutterCallkitIncomingPlugin companion = FlutterCallkitIncomingPlugin.INSTANCE.getInstance();
            CallkitSoundPlayerManager callkitSoundPlayerManager = companion != null ? companion.getCallkitSoundPlayerManager() : null;
            if (callkitSoundPlayerManager != null && callkitSoundPlayerManager.getIsPlaying()) {
                callkitSoundPlayerManager.stop();
                return true;
            }
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
    }
}
