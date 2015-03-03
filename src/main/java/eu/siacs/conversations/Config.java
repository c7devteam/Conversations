package eu.siacs.conversations;

import android.graphics.Bitmap;

import com.bonofa.api.messenger7.Messenger7Config;

public final class Config implements Messenger7Config {
    public static enum SHAPE {CIRCLE, SQUARE}

    ;
    public static SHAPE AVATAR_SHAPE = SHAPE.CIRCLE;

    public static final boolean IS_MESSENGER7 = true;
    public static final boolean IS_RELEASE = false;
    public static final String HOST_DEFAULT = IS_MESSENGER7 ? (IS_RELEASE ? HOST_MESSENGER7_XMPP_RELEASE : HOST_MESSENGER7_XMPP_DEBUG) : null;

    public static final int AVATAR_SIZE_SMALL = 24;
    public static final int AVATAR_SIZE_MIDDLE = 32;
    public static final int AVATAR_SIZE_LARGE = 48;
    public static final String LOGTAG = "conversations";

    public static final int PING_MAX_INTERVAL = 300;
    public static final int PING_MIN_INTERVAL = 30;
    public static final int PING_TIMEOUT = 10;
    public static final int CONNECT_TIMEOUT = 90;
    public static final int CARBON_GRACE_PERIOD = 60;
    public static final int MINI_GRACE_PERIOD = 750;

    public static final int AVATAR_SIZE = 192;
    public static final Bitmap.CompressFormat AVATAR_FORMAT = Bitmap.CompressFormat.JPEG;

    public static final int MESSAGE_MERGE_WINDOW = 20;

    public static final int PAGE_SIZE = 50;
    public static final int MAX_NUM_PAGES = 3;

    public static final int PROGRESS_UI_UPDATE_INTERVAL = 750;

    public static final boolean NO_PROXY_LOOKUP = false; //useful to debug ibb

    public static final long MILLISECONDS_IN_DAY = 24 * 60 * 60 * 1000;
    public static final long MAM_MAX_CATCHUP = MILLISECONDS_IN_DAY / 2;
    public static final int MAM_MAX_MESSAGES = 500;

    public static final String ENABLED_CIPHERS[] = {
            "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256",
            "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA384",
            "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA256",
            "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384",
            "TLS_ECDHE_RSA_AES_128_SHA",
            "TLS_ECDHE_RSA_AES_256_SHA",

            "TLS_DHE_RSA_WITH_AES_128_GCM_SHA256",
            "TLS_DHE_RSA_WITH_AES_128_GCM_SHA384",
            "TLS_DHE_RSA_WITH_AES_256_GCM_SHA256",
            "TLS_DHE_RSA_WITH_AES_256_GCM_SHA384",

            "TLS_DHE_RSA_WITH_CAMELLIA_256_SHA",

            // Fallback.
            "TLS_RSA_WITH_AES_128_GCM_SHA256",
            "TLS_RSA_WITH_AES_128_GCM_SHA384",
            "TLS_RSA_WITH_AES_256_GCM_SHA256",
            "TLS_RSA_WITH_AES_256_GCM_SHA384",
            "TLS_RSA_WITH_AES_128_CBC_SHA256",
            "TLS_RSA_WITH_AES_128_CBC_SHA384",
            "TLS_RSA_WITH_AES_256_CBC_SHA256",
            "TLS_RSA_WITH_AES_256_CBC_SHA384"
    };

    private Config() {

    }
}
