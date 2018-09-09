package fun4.nj.dagger2

import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector

@Component(modules = [NinjaApplicationModule::class, MoreInfoModule::class, AndroidInjectionModule::class])
interface NinjaApplicationComponent : AndroidInjector<NinjaApplication> {
}