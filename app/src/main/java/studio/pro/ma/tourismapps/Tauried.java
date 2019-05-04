package studio.pro.ma.tourismapps;

import android.app.Application;
import io.realm.Realm;
import io.realm.RealmConfiguration;

public class Tauried extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
    }


}
