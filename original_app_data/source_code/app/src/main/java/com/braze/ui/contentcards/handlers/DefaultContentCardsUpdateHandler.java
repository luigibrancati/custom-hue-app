package com.braze.ui.contentcards.handlers;

import android.os.Parcel;
import android.os.Parcelable;
import com.braze.events.ContentCardsUpdatedEvent;
import com.braze.models.cards.Card;
import com.braze.ui.contentcards.BrazeContentCardUtils;
import io.sentry.protocol.FeatureFlags;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/braze/ui/contentcards/handlers/DefaultContentCardsUpdateHandler;", "Lcom/braze/ui/contentcards/handlers/IContentCardsUpdateHandler;", "<init>", "()V", "Lcom/braze/events/ContentCardsUpdatedEvent;", "event", "", "Lcom/braze/models/cards/Card;", "handleCardUpdate", "(Lcom/braze/events/ContentCardsUpdatedEvent;)Ljava/util/List;", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", FeatureFlags.TYPE, "Lfc/H;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Companion", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class DefaultContentCardsUpdateHandler implements IContentCardsUpdateHandler {
    public static final Parcelable.Creator<DefaultContentCardsUpdateHandler> CREATOR = new Parcelable.Creator<DefaultContentCardsUpdateHandler>() { // from class: com.braze.ui.contentcards.handlers.DefaultContentCardsUpdateHandler$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DefaultContentCardsUpdateHandler createFromParcel(Parcel source) {
            AbstractC4862t.e(source, "source");
            return new DefaultContentCardsUpdateHandler();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DefaultContentCardsUpdateHandler[] newArray(int size) {
            return new DefaultContentCardsUpdateHandler[size];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.braze.ui.contentcards.handlers.IContentCardsUpdateHandler
    public List<Card> handleCardUpdate(ContentCardsUpdatedEvent event) {
        AbstractC4862t.e(event, "event");
        return BrazeContentCardUtils.INSTANCE.defaultCardHandling(event.getAllCards());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        AbstractC4862t.e(dest, "dest");
    }
}
