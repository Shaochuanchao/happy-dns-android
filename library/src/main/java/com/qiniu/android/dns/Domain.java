package com.qiniu.android.dns;

/**
 * Created by bailong on 15/6/17.
 */
public final class Domain {
    public final String domain;
    public final boolean hasCname;
    public final int type;

    public Domain(String domain, boolean hasCname, int type) {
        this.domain = domain;
        this.hasCname = hasCname;
        this.type = type;
    }

    public Domain(String domain, boolean hasCname) {
        this(domain, hasCname, 0);
    }

    public Domain(String domain) {
        this(domain, false, 0);
    }
}