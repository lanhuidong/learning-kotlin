package obj

import java.io.Serializable

/**
 * @author lanhuidong
 * @since 2018-10-10
 */
interface State : Serializable

interface View {

    fun getCurrentState(): State

    fun restoreState(state: State)

}

class TextArea : View {
    override fun getCurrentState(): State = TextAreaState()

    override fun restoreState(state: State) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    class TextAreaState : State {

    }

}

class Outer {
    inner class Inner {
        fun getOuterReference(): Outer = this@Outer
    }
}
