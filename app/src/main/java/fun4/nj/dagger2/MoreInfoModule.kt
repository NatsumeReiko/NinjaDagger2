package fun4.nj.dagger2

import dagger.Module
import dagger.Provides

@Module
class MoreInfoModule {

    @Provides
    fun providesInfo(square: Int) = Info(square)
}