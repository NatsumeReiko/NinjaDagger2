package fun4.nj.dagger2

import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [
            AndroidSupportInjectionModule::class,
            NinjaApplicationModule::class,
            MoreInfoModule::class])
interface NinjaApplicationComponent : AndroidInjector<NinjaApplication> {
    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<NinjaApplication>()
}