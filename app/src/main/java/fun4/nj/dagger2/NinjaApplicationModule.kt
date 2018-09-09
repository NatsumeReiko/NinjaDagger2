package fun4.nj.dagger2

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class NinjaApplicationModule {
    @ContributesAndroidInjector
    internal abstract fun contributeActivityInjector(): MainActivity

}