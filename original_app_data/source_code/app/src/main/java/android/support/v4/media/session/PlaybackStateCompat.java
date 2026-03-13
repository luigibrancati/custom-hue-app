package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f21334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f21335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f21336d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f21337e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f21338f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CharSequence f21339g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f21340h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List f21341i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f21342j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Bundle f21343k;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f21344a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CharSequence f21345b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f21346c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Bundle f21347d;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public CustomAction[] newArray(int i10) {
                return new CustomAction[i10];
            }
        }

        public CustomAction(Parcel parcel) {
            this.f21344a = parcel.readString();
            this.f21345b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f21346c = parcel.readInt();
            this.f21347d = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + ((Object) this.f21345b) + ", mIcon=" + this.f21346c + ", mExtras=" + this.f21347d;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f21344a);
            TextUtils.writeToParcel(this.f21345b, parcel, i10);
            parcel.writeInt(this.f21346c);
            parcel.writeBundle(this.f21347d);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public PlaybackStateCompat[] newArray(int i10) {
            return new PlaybackStateCompat[i10];
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f21333a = parcel.readInt();
        this.f21334b = parcel.readLong();
        this.f21336d = parcel.readFloat();
        this.f21340h = parcel.readLong();
        this.f21335c = parcel.readLong();
        this.f21337e = parcel.readLong();
        this.f21339g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f21341i = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f21342j = parcel.readLong();
        this.f21343k = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f21338f = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PlaybackState {state=" + this.f21333a + ", position=" + this.f21334b + ", buffered position=" + this.f21335c + ", speed=" + this.f21336d + ", updated=" + this.f21340h + ", actions=" + this.f21337e + ", error code=" + this.f21338f + ", error message=" + this.f21339g + ", custom actions=" + this.f21341i + ", active item id=" + this.f21342j + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f21333a);
        parcel.writeLong(this.f21334b);
        parcel.writeFloat(this.f21336d);
        parcel.writeLong(this.f21340h);
        parcel.writeLong(this.f21335c);
        parcel.writeLong(this.f21337e);
        TextUtils.writeToParcel(this.f21339g, parcel, i10);
        parcel.writeTypedList(this.f21341i);
        parcel.writeLong(this.f21342j);
        parcel.writeBundle(this.f21343k);
        parcel.writeInt(this.f21338f);
    }
}
