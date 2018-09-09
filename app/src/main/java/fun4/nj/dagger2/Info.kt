package fun4.nj.dagger2

import javax.inject.Inject

class Info @Inject constructor(square: Int) {
    @Inject
    constructor(h: Int, w: Int) : this(h * w)

    val text = "square is $square"

}
