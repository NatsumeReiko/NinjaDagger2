package fun4.nj.dagger2

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class NinjaApplication : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerNinjaApplicationComponent.builder().create(this)
    }


}