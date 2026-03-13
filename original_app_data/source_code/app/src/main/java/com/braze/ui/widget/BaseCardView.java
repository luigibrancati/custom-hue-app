package com.braze.ui.widget;

import Od.F;
import android.R;
import android.content.Context;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.braze.Braze;
import com.braze.BrazeInternal;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.BrazeViewBounds;
import com.braze.images.IBrazeImageLoader;
import com.braze.models.cards.Card;
import com.braze.support.BrazeLogger;
import com.braze.ui.BrazeDeeplinkHandler;
import com.braze.ui.R$string;
import com.braze.ui.actions.IAction;
import com.braze.ui.actions.UriAction;
import com.braze.ui.widget.BaseCardView;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 )*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001)B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0001¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H$¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00048\u0004X\u0085\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0017\u0010 \u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0016\u0010%\u001a\u00020$8\u0004@\u0004X\u0085\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0011\u0010'\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lcom/braze/ui/widget/BaseCardView;", "Lcom/braze/models/cards/Card;", "T", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/widget/TextView;", "view", "", "text", "Lfc/H;", "setOptionalTextView", "(Landroid/widget/TextView;Ljava/lang/String;)V", "Landroid/widget/ImageView;", "imageView", "imageUrl", "", "placeholderAspectRatio", "card", "setImageViewToUrl", "(Landroid/widget/ImageView;Ljava/lang/String;FLcom/braze/models/cards/Card;)V", "Lcom/braze/ui/actions/IAction;", "cardAction", "handleCardClick", "(Landroid/content/Context;Lcom/braze/models/cards/Card;Lcom/braze/ui/actions/IAction;)V", "", "isClickHandled", "(Landroid/content/Context;Lcom/braze/models/cards/Card;Lcom/braze/ui/actions/IAction;)Z", "applicationContext", "Landroid/content/Context;", "classLogTag", "Ljava/lang/String;", "getClassLogTag", "()Ljava/lang/String;", "Lcom/braze/configuration/BrazeConfigurationProvider;", "configurationProvider", "Lcom/braze/configuration/BrazeConfigurationProvider;", "isUnreadIndicatorEnabled", "()Z", "Companion", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BaseCardView<T extends Card> extends RelativeLayout {
    protected final Context applicationContext;
    private final String classLogTag;
    protected BrazeConfigurationProvider configurationProvider;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseCardView(Context context) {
        super(context);
        AbstractC4862t.e(context, "context");
        Context applicationContext = context.getApplicationContext();
        AbstractC4862t.d(applicationContext, "getApplicationContext(...)");
        this.applicationContext = applicationContext;
        this.classLogTag = BrazeLogger.getBrazeLogTag(getClass());
        this.configurationProvider = BrazeInternal.INSTANCE.getConfigurationProvider(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleCardClick$lambda$0(Card card) {
        return "Handling card click for card: " + card;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleCardClick$lambda$1(Card card) {
        return "Card action is non-null. Attempting to perform action on card: " + card.getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleCardClick$lambda$2(Card card) {
        return "Executing non uri action for click on card: " + card.getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleCardClick$lambda$3(Card card) {
        return "Card action is null. Not performing any click action on card: " + card.getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleCardClick$lambda$4(Card card) {
        return "Card click was handled by custom listener on card: " + card.getId();
    }

    public final String getClassLogTag() {
        return this.classLogTag;
    }

    public final void handleCardClick(Context context, final Card card, IAction cardAction) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(card, "card");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.f28627V;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new InterfaceC6082a() { // from class: P5.a
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return BaseCardView.handleCardClick$lambda$0(card);
            }
        }, 6, (Object) null);
        card.setIndicatorHighlighted(true);
        if (isClickHandled(context, card, cardAction)) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: P5.e
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BaseCardView.handleCardClick$lambda$4(card);
                }
            }, 7, (Object) null);
            card.logClick();
        } else {
            if (cardAction == null) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new InterfaceC6082a() { // from class: P5.d
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BaseCardView.handleCardClick$lambda$3(card);
                    }
                }, 6, (Object) null);
                return;
            }
            card.logClick();
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new InterfaceC6082a() { // from class: P5.b
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BaseCardView.handleCardClick$lambda$1(card);
                }
            }, 6, (Object) null);
            if (cardAction instanceof UriAction) {
                BrazeDeeplinkHandler.INSTANCE.getInstance().gotoUri(context, (UriAction) cardAction);
            } else {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: P5.c
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BaseCardView.handleCardClick$lambda$2(card);
                    }
                }, 7, (Object) null);
                cardAction.execute(context);
            }
        }
    }

    public abstract boolean isClickHandled(Context context, Card card, IAction cardAction);

    public final boolean isUnreadIndicatorEnabled() {
        return this.configurationProvider.isContentCardsUnreadVisualIndicatorEnabled();
    }

    public final void setImageViewToUrl(final ImageView imageView, String imageUrl, final float placeholderAspectRatio, Card card) {
        AbstractC4862t.e(imageView, "imageView");
        AbstractC4862t.e(imageUrl, "imageUrl");
        AbstractC4862t.e(card, "card");
        if (AbstractC4862t.a(imageUrl, imageView.getTag(R$string.com_braze_image_resize_tag_key))) {
            return;
        }
        if (placeholderAspectRatio != 0.0f) {
            ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.braze.ui.widget.BaseCardView.setImageViewToUrl.1
                    @Override // android.view.ViewTreeObserver.OnPreDrawListener
                    public boolean onPreDraw() {
                        imageView.getViewTreeObserver().removeOnPreDrawListener(this);
                        int width = imageView.getWidth();
                        imageView.setLayoutParams(new RelativeLayout.LayoutParams(width, (int) (width / placeholderAspectRatio)));
                        return true;
                    }
                });
            }
        }
        imageView.setImageResource(R.color.transparent);
        Braze.Companion companion = Braze.INSTANCE;
        Context context = getContext();
        AbstractC4862t.d(context, "getContext(...)");
        IBrazeImageLoader imageLoader = companion.getInstance(context).getImageLoader();
        Context context2 = getContext();
        AbstractC4862t.d(context2, "getContext(...)");
        imageLoader.renderUrlIntoCardView(context2, card, imageUrl, imageView, BrazeViewBounds.BASE_CARD_VIEW);
        imageView.setTag(R$string.com_braze_image_resize_tag_key, imageUrl);
    }

    public final void setOptionalTextView(TextView view, String text) {
        AbstractC4862t.e(view, "view");
        if (text == null || F.k0(text)) {
            view.setText("");
            view.setVisibility(8);
        } else {
            view.setText(text);
            view.setVisibility(0);
        }
    }
}
