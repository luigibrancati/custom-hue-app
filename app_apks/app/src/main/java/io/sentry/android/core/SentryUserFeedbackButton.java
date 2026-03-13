package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import io.sentry.android.core.SentryUserFeedbackDialog;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class SentryUserFeedbackButton extends Button {
    private View.OnClickListener delegate;

    public SentryUserFeedbackButton(Context context) {
        super(context);
        init(context, null, 0, 0);
    }

    public static /* synthetic */ void a(SentryUserFeedbackButton sentryUserFeedbackButton, View view) {
        new SentryUserFeedbackDialog.Builder(sentryUserFeedbackButton.getContext()).create().show();
        View.OnClickListener onClickListener = sentryUserFeedbackButton.delegate;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    @SuppressLint({"SetTextI18n"})
    private void init(Context context, AttributeSet attributeSet, int i10, int i11) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.SentryUserFeedbackButton, i10, i11);
        try {
            float f10 = context.getResources().getDisplayMetrics().density;
            float dimension = typedArrayObtainStyledAttributes.getDimension(R.styleable.SentryUserFeedbackButton_android_drawablePadding, -1.0f);
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.SentryUserFeedbackButton_android_drawableStart, -1);
            boolean z10 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SentryUserFeedbackButton_android_textAllCaps, false);
            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.SentryUserFeedbackButton_android_background, -1);
            float dimension2 = typedArrayObtainStyledAttributes.getDimension(R.styleable.SentryUserFeedbackButton_android_padding, -1.0f);
            int color = typedArrayObtainStyledAttributes.getColor(R.styleable.SentryUserFeedbackButton_android_textColor, -1);
            String string = typedArrayObtainStyledAttributes.getString(R.styleable.SentryUserFeedbackButton_android_text);
            if (dimension == -1.0f) {
                setCompoundDrawablePadding((int) (4.0f * f10));
            }
            if (resourceId == -1) {
                setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.sentry_user_feedback_button_logo_24, 0, 0, 0);
            }
            setAllCaps(z10);
            if (resourceId2 == -1) {
                setBackgroundResource(R.drawable.sentry_oval_button_ripple_background);
            }
            if (dimension2 == -1.0f) {
                int i12 = (int) (f10 * 12.0f);
                setPadding(i12, i12, i12, i12);
            }
            if (color == -1) {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorForeground, typedValue, true);
                setTextColor(context.getResources().getColor(typedValue.resourceId, context.getTheme()));
            }
            if (string == null) {
                setText("Report a Bug");
            }
            typedArrayObtainStyledAttributes.close();
            setOnClickListener(this.delegate);
        } catch (Throwable th) {
            if (typedArrayObtainStyledAttributes != null) {
                try {
                    typedArrayObtainStyledAttributes.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.delegate = onClickListener;
        super.setOnClickListener(new View.OnClickListener() { // from class: io.sentry.android.core.h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SentryUserFeedbackButton.a(this.f38532a, view);
            }
        });
    }

    public SentryUserFeedbackButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet, 0, 0);
    }

    public SentryUserFeedbackButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        init(context, attributeSet, i10, 0);
    }

    public SentryUserFeedbackButton(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        init(context, attributeSet, i10, i11);
    }
}
